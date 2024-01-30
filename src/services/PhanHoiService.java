package services;

import dao.impl.LichThucHanhDAO;
import dao.impl.LichThucHanhDAO2;
import dao.impl.NguoiDungDAO;
import dao.impl.PhanHoiDAO;
import dao.impl.PhongThucHanhDAO;
import java.util.List;
import models.PhanHoi;
import models.OperationResult;
import models.ResultReason;

public class PhanHoiService {
    
    public ResultReason createPhanHoi(Integer MaLichThucHanh, String NoiDung, Integer DiemDanhGia) {
        // Kiểm tra trống
        if (LichThucHanhDAO2.getIns().findOne(MaLichThucHanh) == null) {
            return new ResultReason(OperationResult.ADD_FAILURE, "LichThucHanh không tồn tại");
        } else if (LichThucHanhDAO2.getIns().findOneIfPast(MaLichThucHanh) == null) {
            return new ResultReason(OperationResult.ADD_FAILURE, "LichThucHanh đã qua ");
        } else {
            PhanHoi phanHoi = new PhanHoi(null, MaLichThucHanh, NoiDung, DiemDanhGia);
            int result = PhanHoiDAO.getIns().create(phanHoi);
            return (result == -1)
                    ? new ResultReason(OperationResult.ADD_FAILURE, "Không thể tạo mới PhanHoi")
                    : new ResultReason(OperationResult.ADD_SUCCESS, "Tạo mới PhanHoi thành công");
        }
    }


    public OperationResult updatePhanHoi(Integer MaPhanHoi, Integer MaLichThucHanh, String NoiDung, Integer DiemDanhGia) {
        // Kiểm tra trống
        if (NoiDung.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (LichThucHanhDAO.getIns().findOne(MaLichThucHanh) == null) {
                    return OperationResult.EDIT_FAILURE; }
          else {
            if (PhanHoiDAO.getIns().findOne(MaPhanHoi) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                PhanHoi phanHoi = new PhanHoi(MaPhanHoi, MaLichThucHanh, NoiDung, DiemDanhGia);
                int result = PhanHoiDAO.getIns().update(phanHoi, MaPhanHoi);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deletePhanHoi(int ma) {
        int result = PhanHoiDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    
    public List<PhanHoi>  getAll(){
            return PhanHoiDAO.getIns().findALl();
        }
    
     public List<PhanHoi>  get(String fieldName, String value){
            return PhanHoiDAO.getIns().findAllByField(fieldName, value);
    }
}
