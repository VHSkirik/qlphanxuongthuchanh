package services;

import dao.impl.PhongThucHanhDAO;
import dao.impl.ThietBiDAO;
import java.util.List;
import models.OperationResult;
import static models.OperationResult.ADD_SUCCESS;
import models.ThietBi;
import models.ResultReason;

public class ThietBiService {

    public ResultReason createThietBi(Integer MaThietBi, String TenThietBi, String LoaiThietBi, String NgaySuDung, String MoTa, String TinhTrang, Integer MaPhongThucHanh, int SoMay) {
        // Kiểm tra trống
        if (TenThietBi.isBlank() || LoaiThietBi.isBlank() || NgaySuDung.isBlank() || MoTa.isBlank() || TinhTrang.isBlank()) {
            return new ResultReason(OperationResult.ADD_FAILURE, "Thông tin thiết bị không được để trống");
        } else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
            return new ResultReason(OperationResult.ADD_FAILURE, "Phòng thực hành không tồn tại");
        } else {
            if (ThietBiDAO.getIns().findOne(MaThietBi) != null) {
                return new ResultReason(OperationResult.ADD_FAILURE, "Thiết bị đã tồn tại");
            } else if (ThietBiDAO.getIns().findOneBySoMay(MaThietBi) != null) {
                return new ResultReason(OperationResult.ADD_FAILURE, "Số máy thiết bị đã tồn tại");
            } else {
                ThietBi thietBi = new ThietBi(MaThietBi, TenThietBi, LoaiThietBi, NgaySuDung, MoTa, TinhTrang, MaPhongThucHanh, SoMay);
                int result = ThietBiDAO.getIns().create(thietBi);
                return (result == -1) ?
                        new ResultReason(OperationResult.ADD_FAILURE, "Lỗi khi tạo thiết bị") :
                        new ResultReason(OperationResult.ADD_SUCCESS, "");
            }
        }
    }


    public OperationResult updateThietBi(Integer MaThietBi, String TenThietBi, String LoaiThietBi, String NgaySuDung, String MoTa, String TinhTrang, Integer MaPhongThucHanh, int SoMay) {
        // Kiểm tra trống
        if (TenThietBi.isBlank() || LoaiThietBi.isBlank() || NgaySuDung.isBlank() || MoTa.isBlank() || TinhTrang.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) != null) {
                return OperationResult.EDIT_FAILURE;
        }else {
            if (ThietBiDAO.getIns().findOne(MaThietBi) == null) {
                return OperationResult.EDIT_FAILURE;
            } 
            else if(ThietBiDAO.getIns().findOneBySoMay(MaThietBi) != null) {
                return OperationResult.EDIT_FAILURE;
            }
            else {
                ThietBi thietBi = new ThietBi(MaThietBi, TenThietBi, LoaiThietBi, NgaySuDung, MoTa, TinhTrang, MaPhongThucHanh,SoMay);
                int result = ThietBiDAO.getIns().update(thietBi, MaThietBi);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deleteThietBi(int ma) {
        int result = ThietBiDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    
     public List<ThietBi>  getAll(){
            return ThietBiDAO.getIns().findALl();
    }
     
     public List<ThietBi>  get(String fieldName, String value){
            return ThietBiDAO.getIns().findAllByField(fieldName, value);
    }
}
