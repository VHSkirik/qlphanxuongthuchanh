package models;

public class ThongTinNguoiDung {

    private Integer MaThongTin;
    private Integer MaNguoiDung;
    private String Hoten;
    //gioi tinh
    //ngay sinh
    private String SoDienThoai;
    private String ChuyenMon;
    private String DiaChi;

    public ThongTinNguoiDung() {
    }

    public ThongTinNguoiDung(Integer MaThongTin, Integer MaNguoiDung, String Hoten, String SoDienThoai, String ChuyenMon, String DiaChi) {
        this.MaThongTin = MaThongTin;
        this.MaNguoiDung = MaNguoiDung;
        this.Hoten = Hoten;
        this.SoDienThoai = SoDienThoai;
        this.ChuyenMon = ChuyenMon;
        this.DiaChi = DiaChi;
    }

    public Integer getMaThongTin() {
        return MaThongTin;
    }

    public void setMaThongTin(Integer MaThongTin) {
        this.MaThongTin = MaThongTin;
    }

    public Integer getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(Integer MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public String getChuyenMon() {
        return ChuyenMon;
    }

    public void setChuyenMon(String ChuyenMon) {
        this.ChuyenMon = ChuyenMon;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

}
