package services;

import dao.impl.LichThucHanhDAO;
import dao.impl.LichThucHanhDAO2;
import dao.impl.NguoiDungDAO;
import dao.impl.PhongThucHanhDAO;
import java.util.List;
import models.LichThucHanh;
import models.LichThucHanh2;
import models.OperationResult;

public class LichThucHanhService {

    public OperationResult createLichThucHanh(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh,String NgayThucHanh, Integer ThoiGianBatDau, Integer ThoiGianKetThuc, String NoiDungThucHanh) {
        // Kiểm tra trống
        if (NoiDungThucHanh.isBlank()) {
            return OperationResult.ADD_FAILURE;
        } 
         else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
                    return OperationResult.ADD_FAILURE; }
          else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) {
                    return OperationResult.EDIT_FAILURE;
          }
         else {
            if (LichThucHanhDAO2.getIns().findOne(MaLichThucHanh) != null) {
                return OperationResult.ADD_FAILURE;
            } else {
                LichThucHanh2 lichThucHanh = new LichThucHanh2(MaLichThucHanh, MaNguoiDung, MaPhongThucHanh,NgayThucHanh, ThoiGianBatDau, ThoiGianKetThuc, NoiDungThucHanh);
                int result = LichThucHanhDAO2.getIns().create(lichThucHanh);
                return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
            }
        }
    }

    public OperationResult updateLichThucHanh(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh,String NgayThucHanh, Integer ThoiGianBatDau, Integer ThoiGianKetThuc, String NoiDungThucHanh) {
        // Kiểm tra trống
        if (NoiDungThucHanh.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
                    return OperationResult.ADD_FAILURE; }
        else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) {
                    return OperationResult.EDIT_FAILURE;
        }
        else {
            if (LichThucHanhDAO2.getIns().findOne(MaLichThucHanh) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                LichThucHanh2 lichThucHanh = new LichThucHanh2(MaLichThucHanh, MaNguoiDung, MaPhongThucHanh,NgayThucHanh, ThoiGianBatDau, ThoiGianKetThuc, NoiDungThucHanh);
                int result = LichThucHanhDAO2.getIns().update(lichThucHanh, MaLichThucHanh);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deleteLichThucHanh(int ma) {
        int result = LichThucHanhDAO2.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    
     public List<LichThucHanh2>  getAll(){
            return LichThucHanhDAO2.getIns().findALl();
        }
     
      public List<LichThucHanh2>  get(String fieldName, String value){
            return LichThucHanhDAO2.getIns().findAllByField(fieldName, value);
    }
}

