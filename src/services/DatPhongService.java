package services;

import dao.impl.DatPhongDAO;
import dao.impl.NguoiDungDAO;
import dao.impl.PhongThucHanhDAO;
import java.util.List;
import models.DatPhong;
import models.OperationResult;

public class DatPhongService {

    public OperationResult createDatPhong(Integer MaYeuCau, Integer MaNguoiDung, Integer MaPhongThucHanh, String ThoiGianDat, String MucDichSuDUng, String TrangThai, String NgayTao) {
        // Kiểm tra trống
        if (ThoiGianDat.isBlank() || MucDichSuDUng.isBlank() || TrangThai.isBlank() || NgayTao.isBlank()) {
            return OperationResult.ADD_FAILURE;
        } else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) != null) {
                return OperationResult.ADD_FAILURE;
                
        }
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) != null) {
                return OperationResult.ADD_FAILURE;
        } else {
                DatPhong datPhong = new DatPhong(MaYeuCau, MaNguoiDung, MaPhongThucHanh, ThoiGianDat, MucDichSuDUng, TrangThai, NgayTao);
                int result = DatPhongDAO.getIns().create(datPhong);
                return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
            }
}
      

    public OperationResult updateDatPhong(Integer MaYeuCau, Integer MaNguoiDung, Integer MaPhongThucHanh, String ThoiGianDat, String MucDichSuDUng, String TrangThai, String NgayTao) {
        // Kiểm tra trống
        if (ThoiGianDat.isBlank() || MucDichSuDUng.isBlank() || TrangThai.isBlank() || NgayTao.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } 
        else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) != null) {
                return OperationResult.EDIT_FAILURE;
                
        }
        else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) != null) {
                return OperationResult.EDIT_FAILURE;
        }else {
            if (DatPhongDAO.getIns().findOne(MaYeuCau) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                DatPhong datPhong = new DatPhong(MaYeuCau, MaNguoiDung, MaPhongThucHanh, ThoiGianDat, MucDichSuDUng, TrangThai, NgayTao);
                int result = DatPhongDAO.getIns().update(datPhong, MaYeuCau);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deleteDatPhong(int ma) {
        int result = DatPhongDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    
     public List<DatPhong>  getAll(){
            return DatPhongDAO.getIns().findALl();
        }
     
       public List<DatPhong>  get(String fieldName, String value){
            return DatPhongDAO.getIns().findAllByField(fieldName, value);
    }
}
