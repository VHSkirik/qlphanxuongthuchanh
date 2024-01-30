package services;

import dao.impl.DatPhongDAO;
import dao.impl.LichThucHanhDAO2;
import dao.impl.NguoiDungDAO;
import dao.impl.PhongThucHanhDAO;
import java.util.Date;
import java.util.List;
import models.DatPhong;
import models.LichThucHanh2;
import models.OperationResult;
import models.ResultReason;

public class DatPhongService {

    public OperationResult createDatPhong(Integer MaYeuCau, Integer MaNguoiDung, Integer MaPhongThucHanh, String NgayThucHanh, Integer TietBatDau, Integer TietKetThuc, String MonHoc, String TrangThai, String NgayTao) {
       
            DatPhong datPhong = new DatPhong(null, MaNguoiDung, MaPhongThucHanh, NgayThucHanh, TietBatDau, TietKetThuc, MonHoc, TrangThai, NgayTao);

            int result = DatPhongDAO.getIns().create(datPhong);
            return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
    }

    public OperationResult updateDatPhong(Integer MaYeuCau, Integer MaNguoiDung, Integer MaPhongThucHanh, String NgayThucHanh, Integer TietBatDau, Integer TietKetThuc, String MonHoc, String TrangThai, String NgayTao) {
        // Kiểm tra trống
        if (NgayThucHanh.isBlank() || MonHoc.isBlank() || TrangThai.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } else if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) {
            return OperationResult.EDIT_FAILURE;

        } else if (PhongThucHanhDAO.getIns().findOne(MaPhongThucHanh) == null) {
            return OperationResult.EDIT_FAILURE;
        } else {
            if (DatPhongDAO.getIns().findOne(MaYeuCau) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                DatPhong datPhong = new DatPhong(MaYeuCau, MaNguoiDung, MaPhongThucHanh, NgayThucHanh, TietBatDau, TietKetThuc, MonHoc, TrangThai, NgayTao);
                int result = DatPhongDAO.getIns().update(datPhong, MaYeuCau);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deleteDatPhong(int ma) {
        int result = DatPhongDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }

    public List<DatPhong> getAll() {
        return DatPhongDAO.getIns().findALl();
    }

    public List<DatPhong> get(String fieldName, String value) {
        return DatPhongDAO.getIns().findAllByField(fieldName, value);
    }

    public ResultReason acceptDatPhong(DatPhong datPhong) {
        // Kiểm tra trùng lịch
        List<LichThucHanh2> lichThucHanhList = LichThucHanhDAO2.getIns().getOverlappingLichThucHanh(datPhong);
        if (!lichThucHanhList.isEmpty()) {
            // Có trùng lịch, không thêm và trả về lỗi
            return new ResultReason(OperationResult.ADD_FAILURE, "Trùng lịch thực hành.");
        }

        // Không có trùng lịch, thêm vào bảng Lịch Thực Hành
        LichThucHanh2 lichThucHanh = new LichThucHanh2(null, datPhong.getMaNguoiDung(), datPhong.getMaPhongThucHanh(), datPhong.getNgayThucHanh(), datPhong.getTietBatDau(), datPhong.getTietKetThuc(), datPhong.getMonHoc());
        int result = LichThucHanhDAO2.getIns().create(lichThucHanh);

        return (result == -1) ? new ResultReason(OperationResult.ADD_FAILURE, "Không thể thêm vào lịch thực hành.")
                : new ResultReason(OperationResult.ADD_SUCCESS, "");
    }
}
