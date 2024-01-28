package models;

public class ThietBi {

    private Integer MaThietBi;
    private String TenThietBi;
    private String LoaiThietBi;
    private String NgaySuDung;
    private String MoTa;
    private String TinhTrang;
    private Integer MaPhongThucHanh;
    private int SoMay;

    public ThietBi() {
    }

    public ThietBi(Integer MaThietBi, String TenThietBi, String LoaiThietBi, String NgaySuDung, String MoTa, String TinhTrang, Integer MaPhongThucHanh, int SoMay) {
        this.MaThietBi = MaThietBi;
        this.TenThietBi = TenThietBi;
        this.LoaiThietBi = LoaiThietBi;
        this.NgaySuDung = NgaySuDung;
        this.MoTa = MoTa;
        this.TinhTrang = TinhTrang;
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.SoMay = SoMay;
    }

    public Integer getMaThietBi() {
        return MaThietBi;
    }

    public void setMaThietBi(Integer MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public String getTenThietBi() {
        return TenThietBi;
    }

    public void setTenThietBi(String TenThietBi) {
        this.TenThietBi = TenThietBi;
    }

    public String getLoaiThietBi() {
        return LoaiThietBi;
    }

    public void setLoaiThietBi(String LoaiThietBi) {
        this.LoaiThietBi = LoaiThietBi;
    }

    public String getNgaySuDung() {
        return NgaySuDung;
    }

    public void setNgaySuDung(String NgaySuDung) {
        this.NgaySuDung = NgaySuDung;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public Integer getMaPhongThucHanh() {
        return MaPhongThucHanh;
    }

    public void setMaPhongThucHanh(Integer MaPhongThucHanh) {
        this.MaPhongThucHanh = MaPhongThucHanh;
    }

    public int getSoMay() {
        return SoMay;
    }

    public void setSoMay(int SoMay) {
        this.SoMay = SoMay;
    }

  

}
