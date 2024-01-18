package models;

public class DatPhong {

    private Integer MaYeuCau;
    private Integer MaNguoiDung;
    private Integer MaPhongThucHanh;
    private String ThoiGianDat;
    private String MucDichSuDUng;
    private String TrangThai;
    private String NgayTao;

    public DatPhong() {
    }

    public DatPhong(Integer MaYeuCau, Integer MaNguoiDung, Integer MaPhongThucHanh, String ThoiGianDat, String MucDichSuDUng, String TrangThai, String NgayTao) {
        this.MaYeuCau = MaYeuCau;
        this.MaNguoiDung = MaNguoiDung;
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.ThoiGianDat = ThoiGianDat;
        this.MucDichSuDUng = MucDichSuDUng;
        this.TrangThai = TrangThai;
        this.NgayTao = NgayTao;
    }

    public Integer getMaYeuCau() {
        return MaYeuCau;
    }

    public void setMaYeuCau(Integer MaYeuCau) {
        this.MaYeuCau = MaYeuCau;
    }

    public Integer getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(Integer MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public Integer getMaPhongThucHanh() {
        return MaPhongThucHanh;
    }

    public void setMaPhongThucHanh(Integer MaPhongThucHanh) {
        this.MaPhongThucHanh = MaPhongThucHanh;
    }

    public String getThoiGianDat() {
        return ThoiGianDat;
    }

    public void setThoiGianDat(String ThoiGianDat) {
        this.ThoiGianDat = ThoiGianDat;
    }

    public String getMucDichSuDUng() {
        return MucDichSuDUng;
    }

    public void setMucDichSuDUng(String MucDichSuDUng) {
        this.MucDichSuDUng = MucDichSuDUng;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
     public String getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(String NgayTao) {
        this.NgayTao = NgayTao;
    }

}
