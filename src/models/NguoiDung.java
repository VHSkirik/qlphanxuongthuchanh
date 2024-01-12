package models;

public class NguoiDung {

    private Integer MaNguoiDung;
    private String TenDangNhap;
    private String MatKhau;
    private String Email;
    private String LoaiNguoiDung;

    public NguoiDung() {

    }

    public NguoiDung(Integer MaNguoiDung, String TenDangNhap, String MatKhau, String Email, String LoaiNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.Email = Email;
        this.LoaiNguoiDung = LoaiNguoiDung;
    }

    public Integer getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(Integer maNguoiDung) {
        MaNguoiDung = maNguoiDung;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        TenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLoaiNguoiDung() {
        return LoaiNguoiDung;
    }

    public void setLoaiNguoiDung(String loaiNguoiDung) {
        LoaiNguoiDung = loaiNguoiDung;
    }

}
