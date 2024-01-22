package services;

import dao.impl.NguoiDungDAO;
import dao.impl.ThongTinNguoiDungDAO;
import models.OperationResult;
import models.ThongTinNguoiDung;

public class ThongTinNguoiDungService {
    
    public OperationResult createThongTinNguoiDung(int maNguoiDung, String hoTen, String soDienThoai, String chuyenMon, String diaChi) {
    // Kiểm tra trống
    if (hoTen.isBlank() || soDienThoai.isBlank() || chuyenMon.isBlank() || diaChi.isBlank()) {
        return OperationResult.ADD_FAILURE;
    } else {
        if (NguoiDungDAO.getIns().findOne(maNguoiDung) == null) 
                    return OperationResult.ADD_FAILURE;
        else {
        ThongTinNguoiDung thongTinNguoiDung = new ThongTinNguoiDung(null, maNguoiDung, hoTen, soDienThoai, chuyenMon, diaChi);
        int result = ThongTinNguoiDungDAO.getIns().create(thongTinNguoiDung);

        return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
        }
    }
}


    public OperationResult updateThongTinNguoiDung(int maThongTin, int maNguoiDung, String hoTen, String soDienThoai, String chuyenMon, String diaChi) {
        // Kiểm tra trống
        if (hoTen.isBlank() || soDienThoai.isBlank() || chuyenMon.isBlank() || diaChi.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } else if (NguoiDungDAO.getIns().findOne(maNguoiDung) == null) 
                    return OperationResult.ADD_FAILURE;
            
        else if (ThongTinNguoiDungDAO.getIns().findOne(maThongTin) == null) 
                    return OperationResult.ADD_FAILURE;
            
        else {
            ThongTinNguoiDung thongTinNguoiDung = new ThongTinNguoiDung(maThongTin, maNguoiDung, hoTen, soDienThoai, chuyenMon, diaChi);
            int result = ThongTinNguoiDungDAO.getIns().update(thongTinNguoiDung, maThongTin);
            return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
        }
    }

    public OperationResult deleteThongTinNguoiDung(int maThongTin) {
        if (ThongTinNguoiDungDAO.getIns().findOne(maThongTin) == null) 
            return OperationResult.DELETE_FAILURE;
        else {
            int result = ThongTinNguoiDungDAO.getIns().delete(maThongTin);
            return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
    }
}
