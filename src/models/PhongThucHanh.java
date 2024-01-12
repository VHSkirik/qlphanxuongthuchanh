package models;

public class PhongThucHanh {

    private Integer MaPhongThucHanh;
    private String TenPhong;
    private String LoaiPhong;
    private String DiaDiem;
    private Integer SucChua;
    private String TinhTrang;

    public PhongThucHanh() {
    }

    public PhongThucHanh(Integer MaPhongThucHanh, String TenPhong, String LoaiPhong, String DiaDiem, Integer SucChua, String TinhTrang) {
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.TenPhong = TenPhong;
        this.LoaiPhong = LoaiPhong;
        this.DiaDiem = DiaDiem;
        this.SucChua = SucChua;
        this.TinhTrang = TinhTrang;
    }

    public Integer getMaPhongThucHanh() {
        return MaPhongThucHanh;
    }

    public void setMaPhongThucHanh(Integer MaPhongThucHanh) {
        this.MaPhongThucHanh = MaPhongThucHanh;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String TenPhong) {
        this.TenPhong = TenPhong;
    }

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
    }

    public String getDiaDiem() {
        return DiaDiem;
    }

    public void setDiaDiem(String DiaDiem) {
        this.DiaDiem = DiaDiem;
    }

    public Integer getSucChua() {
        return SucChua;
    }

    public void setSucChua(Integer SucChua) {
        this.SucChua = SucChua;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

}
