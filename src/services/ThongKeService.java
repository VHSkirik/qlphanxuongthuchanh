package services;

import dao.impl.DatPhongDAO;
import dao.impl.NguoiDungDAO;
import dao.impl.PhanHoiDAO;
import dao.impl.ThietBiDAO;
import java.util.List;

public class ThongKeService {

    public int getSoNguoiDung() {
        //trả về tổng số người dùng trên hệ thống trừ admin

        return NguoiDungDAO.getIns().countNonAdminUsers();
    }

    public int getSoThietBi() {
        // trả tổng số thiết bị đang hoạt động được
        return ThietBiDAO.getIns().countNonHong();
    }

    public double getDiemTrungBinh() {
        // trả về tổng số điểm trung bình của đánh giá
        return PhanHoiDAO.getIns().calculateAverageRating();
    }

    public int getSoYeuCauDangCho() {
        return DatPhongDAO.getIns().getSoYeuCauDangCho();
    }

    public List<String> getDanhSachCoSo() {
        //trả về danh sách tên các cơ sở
        return null;
    }

    //Thiet Bi
    public List<String> getLoaiThietBiTheoCoSo(String coSo) {
        //trả về danh sách tên các loại thiết bị theo cơ sở coSo
        return null;
    }

    public int getTongThietBiTheoCoSo(String CoSo) {
        //trả về tổng số thiết bị của 1 cơ sở, tính tất cả.
        return 0;
    }

    public int getSoThietBiTheoLoaiTinhTrang(String coSo, String loaiThietBi, String tinhTrang) {
        //trả về số lượng các thiết bị của loại loaiThietBi có tình trạng tinhTrang tại cơ sở coSo
        //vd: Số thiết bị loại Desktop có tình trạng Mới tại Lĩnh Nam
        return 0;
    }

    //Phong
    public List<String> getLoaiPhongTheoCoSo(String coSo) {
        //trả về danh sách tên loại phòng theo cơ sở coSo
        return null;
    }
    
    public int getTongPhongTheoCoSo(String CoSo) {
        //trả về tổng số phòng của 1 cơ sở, tính tất cả.
        return 0;
    }

    public int getSoPhongTheoLoaiTinhTrang(String coSo, String loaiPhong, String tinhTrang) {
        //trả về số lượng các phòng của loại loaiPhòng có tình trạng tinhTrang tại cơ sở coSo
        //vd: Số lượng loại Phòng Draytek có tình trạng DaDuocSuDung tại Lĩnh Nam
        return 0;
    }

}
