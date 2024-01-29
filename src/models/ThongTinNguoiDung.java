package models;

public class ThongTinNguoiDung {

    private Integer MaThongTin;
    private Integer MaNguoiDung;
    private String Hoten;
    //gioi tinh
    private String GioiTinh;
    private String NgaySinh;
    //ngay sinh
    private String SoDienThoai;
    private String ChuyenMon;
    private String DiaChi;

    public ThongTinNguoiDung() {
    }

    public ThongTinNguoiDung(Integer MaThongTin, Integer MaNguoiDung, String Hoten, String GioiTinh, String NgaySinh, String SoDienThoai, String ChuyenMon, String DiaChi) {
        this.MaThongTin = MaThongTin;
        this.MaNguoiDung = MaNguoiDung;
        this.Hoten = Hoten;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
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

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
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
