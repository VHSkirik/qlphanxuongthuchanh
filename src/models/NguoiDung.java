package models;

public class NguoiDung {

    private Integer MaNguoiDung;
    private String TenDangNhap;
    private String MatKhau;
    private String Email;
    private String LoaiNguoiDung;
    private String CoSo;

    public NguoiDung() {

    }

    public NguoiDung(Integer MaNguoiDung, String TenDangNhap, String MatKhau, String Email, String LoaiNguoiDung, String CoSo) {
        this.MaNguoiDung = MaNguoiDung;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Email = Email;
        this.LoaiNguoiDung = LoaiNguoiDung;
        this.CoSo = CoSo;
    }

    public Integer getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(Integer MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getLoaiNguoiDung() {
        return LoaiNguoiDung;
    }

    public void setLoaiNguoiDung(String LoaiNguoiDung) {
        this.LoaiNguoiDung = LoaiNguoiDung;
    }

    public String getCoSo() {
        return CoSo;
    }

    public void setCoSo(String CoSo) {
        this.CoSo = CoSo;
    }

}
