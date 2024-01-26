package services;

import dao.impl.NguoiDungDAO;
import dao.impl.PhongThucHanhDAO;
import java.util.List;
import models.OperationResult;
import models.PhongThucHanh;

public class PhongThucHanhService {

    public OperationResult createPhongThucHanh(String tenPhong, String loaiPhong, String diaDiem, int sucChua, String tinhTrang, String Toa) {
        // Kiểm tra trống
        if (tenPhong.isBlank() || loaiPhong.isBlank() || diaDiem.isBlank()) {
            return OperationResult.ADD_FAILURE;
        } else {
            PhongThucHanh phongThucHanh = new PhongThucHanh(null, tenPhong, loaiPhong, diaDiem, sucChua, tinhTrang, Toa);
            int result = PhongThucHanhDAO.getIns().create(phongThucHanh);
            return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
        }
    }

   public OperationResult updatePhongThucHanh(int maPhongThucHanh, String tenPhong, String loaiPhong, String diaDiem, int sucChua, String tinhTrang, String Toa) {
    // Kiểm tra trống
    if (tenPhong.isBlank() || loaiPhong.isBlank() || diaDiem.isBlank()) {
        return OperationResult.EDIT_FAILURE;
        }
        else if (PhongThucHanhDAO.getIns().findOne(maPhongThucHanh) == null) 
        return OperationResult.EDIT_FAILURE;
        else {
        PhongThucHanh phongThucHanh = new PhongThucHanh(maPhongThucHanh, tenPhong, loaiPhong, diaDiem, sucChua, tinhTrang, Toa);
        int result = PhongThucHanhDAO.getIns().update(phongThucHanh, maPhongThucHanh);
        return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
    }
}


    public OperationResult deletePhongThucHanh(int maPhongThucHanh) {
        int result = PhongThucHanhDAO.getIns().delete(maPhongThucHanh);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    
    public List<PhongThucHanh>  getAll(){
            return PhongThucHanhDAO.getIns().findALl();
        }
    
     public List<PhongThucHanh>  get(String fieldName, String value){
            return PhongThucHanhDAO.getIns().findAllByField(fieldName, value);
    }
}
