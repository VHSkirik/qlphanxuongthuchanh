    package services;

    import dao.impl.NguoiDungDAO;
    import models.NguoiDung;
    import models.OperationResult;

    public class NguoiDungService {

        public OperationResult createNguoiDung(Integer MaNguoiDung, String TenDangNhap, String MatKhau, String Email, String LoaiNguoiDung) {
            // Kiểm tra trống
            if (TenDangNhap.isBlank() || MatKhau.isBlank() || Email.isBlank() || LoaiNguoiDung.isBlank()) {
                return OperationResult.ADD_FAILURE;
            } else {
                if (NguoiDungDAO.getIns().findOne(MaNguoiDung) != null) {
                    return OperationResult.ADD_FAILURE;
                } else {
                    NguoiDung nguoiDung = new NguoiDung(MaNguoiDung, TenDangNhap, MatKhau, Email, LoaiNguoiDung);
                    int result = NguoiDungDAO.getIns().create(nguoiDung);
                    return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
                }
            }
        }

        public OperationResult updateNguoiDung(Integer MaNguoiDung, String TenDangNhap, String MatKhau, String Email, String LoaiNguoiDung) {
            // Kiểm tra trống
            if (TenDangNhap.isBlank() || MatKhau.isBlank() || Email.isBlank() || LoaiNguoiDung.isBlank()) {
                return OperationResult.EDIT_FAILURE;
            } else {
                if (NguoiDungDAO.getIns().findOne(MaNguoiDung) == null) {
                    return OperationResult.EDIT_FAILURE;
                } else {
                    NguoiDung nguoiDung = new NguoiDung(MaNguoiDung, TenDangNhap, MatKhau, Email, LoaiNguoiDung);
                    int result = NguoiDungDAO.getIns().update(nguoiDung, MaNguoiDung);
                    return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
                }
            }
        }

        public OperationResult deleteNguoiDung(int ma) {
            int result = NguoiDungDAO.getIns().delete(ma);
            return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
        }
    }
