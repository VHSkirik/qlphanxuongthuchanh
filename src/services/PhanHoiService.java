package services;

import dao.impl.NguoiDungDAO;
import dao.impl.PhanHoiDAO;
import dao.impl.PhongThucHanhDAO;
import models.PhanHoi;
import models.OperationResult;

public class PhanHoiService {

    public OperationResult createPhanHoi(Integer MaPhanHoi, Integer MaNguoiDung, Integer MaPhongThucHanh, String NoiDung, Integer DiemDanhGia) {
        // Kiểm tra trống
        if (NoiDung.isBlank()) {
            return OperationResult.ADD_FAILURE;
        }
         else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) 
                    return OperationResult.ADD_FAILURE;
          else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) 
                    return OperationResult.ADD_FAILURE;
         else {
            if (PhanHoiDAO.getIns().findOne(MaPhanHoi) != null) {
                return OperationResult.ADD_FAILURE;
            } else {
                PhanHoi phanHoi = new PhanHoi(MaPhanHoi, MaNguoiDung, MaPhongThucHanh, NoiDung, DiemDanhGia);
                int result = PhanHoiDAO.getIns().create(phanHoi);
                return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
            }
        }
    }

    public OperationResult updatePhanHoi(Integer MaPhanHoi, Integer MaNguoiDung, Integer MaPhongThucHanh, String NoiDung, Integer DiemDanhGia) {
        // Kiểm tra trống
        if (NoiDung.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
                    return OperationResult.EDIT_FAILURE; }
          else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) { 
                    return OperationResult.EDIT_FAILURE;
          }
          else {
            if (PhanHoiDAO.getIns().findOne(MaPhanHoi) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                PhanHoi phanHoi = new PhanHoi(MaPhanHoi, MaNguoiDung, MaPhongThucHanh, NoiDung, DiemDanhGia);
                int result = PhanHoiDAO.getIns().update(phanHoi, MaPhanHoi);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deletePhanHoi(int ma) {
        int result = PhanHoiDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
}
