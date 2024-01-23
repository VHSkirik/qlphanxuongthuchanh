package services;

import dao.impl.PhongThucHanhDAO;
import dao.impl.ThietBiDAO;
import java.util.List;
import models.OperationResult;
import models.ThietBi;

public class ThietBiService {

    public OperationResult createThietBi(Integer MaThietBi, String TenThietBi, String LoaiThietBi, String NgaySuDung, String MoTa, String TinhTrang, Integer MaPhongThucHanh) {
        // Kiểm tra trống
        if (TenThietBi.isBlank() || LoaiThietBi.isBlank() || NgaySuDung.isBlank() || MoTa.isBlank() || TinhTrang.isBlank()) {
            return OperationResult.ADD_FAILURE;
        }
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) != null) {
                return OperationResult.ADD_FAILURE;
        }else {
            if (ThietBiDAO.getIns().findOne(MaThietBi) != null) {
                return OperationResult.ADD_FAILURE;
            } else {
                ThietBi thietBi = new ThietBi(MaThietBi, TenThietBi, LoaiThietBi, NgaySuDung, MoTa, TinhTrang, MaPhongThucHanh);
                int result = ThietBiDAO.getIns().create(thietBi);
                return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
            }
        }
    }

    public OperationResult updateThietBi(Integer MaThietBi, String TenThietBi, String LoaiThietBi, String NgaySuDung, String MoTa, String TinhTrang, Integer MaPhongThucHanh) {
        // Kiểm tra trống
        if (TenThietBi.isBlank() || LoaiThietBi.isBlank() || NgaySuDung.isBlank() || MoTa.isBlank() || TinhTrang.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) != null) {
                return OperationResult.EDIT_FAILURE;
        }else {
            if (ThietBiDAO.getIns().findOne(MaThietBi) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                ThietBi thietBi = new ThietBi(MaThietBi, TenThietBi, LoaiThietBi, NgaySuDung, MoTa, TinhTrang, MaPhongThucHanh);
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
