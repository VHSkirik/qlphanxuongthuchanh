package services;

import dao.impl.LichThucHanhDAO;
import dao.impl.NguoiDungDAO;
import dao.impl.PhongThucHanhDAO;
import java.util.List;
import models.LichThucHanh;
import models.OperationResult;

public class LichThucHanhService {

    public OperationResult createLichThucHanh(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh, String ThoiGianBatDau, String ThoiGianKetThuc, String NoiDungThucHanh) {
        // Kiểm tra trống
        if (ThoiGianBatDau.isBlank() || ThoiGianKetThuc.isBlank() || NoiDungThucHanh.isBlank()) {
            return OperationResult.ADD_FAILURE;
        } 
         else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
                    return OperationResult.ADD_FAILURE; }
          else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) {
                    return OperationResult.EDIT_FAILURE;
          }
         else {
            if (LichThucHanhDAO.getIns().findOne(MaLichThucHanh) != null) {
                return OperationResult.ADD_FAILURE;
            } else {
                LichThucHanh lichThucHanh = new LichThucHanh(MaLichThucHanh, MaNguoiDung, MaPhongThucHanh, ThoiGianBatDau, ThoiGianKetThuc, NoiDungThucHanh);
                int result = LichThucHanhDAO.getIns().create(lichThucHanh);
                return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
            }
        }
    }

    public OperationResult updateLichThucHanh(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh, String ThoiGianBatDau, String ThoiGianKetThuc, String NoiDungThucHanh) {
        // Kiểm tra trống
        if (ThoiGianBatDau.isBlank() || ThoiGianKetThuc.isBlank() || NoiDungThucHanh.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
                    return OperationResult.ADD_FAILURE; }
        else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) {
                    return OperationResult.EDIT_FAILURE;
        }
        else {
            if (LichThucHanhDAO.getIns().findOne(MaLichThucHanh) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                LichThucHanh lichThucHanh = new LichThucHanh(MaLichThucHanh, MaNguoiDung, MaPhongThucHanh, ThoiGianBatDau, ThoiGianKetThuc, NoiDungThucHanh);
                int result = LichThucHanhDAO.getIns().update(lichThucHanh, MaLichThucHanh);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deleteLichThucHanh(int ma) {
        int result = LichThucHanhDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    
     public List<LichThucHanh>  getAll(){
            return LichThucHanhDAO.getIns().findALl();
        }
     
      public List<LichThucHanh>  get(String fieldName, String value){
            return LichThucHanhDAO.getIns().findAllByField(fieldName, value);
    }
}

