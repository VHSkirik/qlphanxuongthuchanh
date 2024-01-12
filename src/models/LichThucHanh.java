package models;

/**
 *
 * @author @VHSkirik
 */
public class LichThucHanh {

    private Integer MaLichThucHanh;
    private Integer MaNguoiDung;
    private Integer MaPhongThucHanh;
    private String ThoiGianBatDau;
    private String ThoiGianKetThuc;
    private String NoiDungThucHanh;

    public LichThucHanh() {
    }

    public LichThucHanh(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh, String ThoiGianBatDau, String ThoiGianKetThuc, String NoiDungThucHanh) {
        this.MaLichThucHanh = MaLichThucHanh;
        this.MaNguoiDung = MaNguoiDung;
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.ThoiGianBatDau = ThoiGianBatDau;
        this.ThoiGianKetThuc = ThoiGianKetThuc;
        this.NoiDungThucHanh = NoiDungThucHanh;
    }

    public Integer getMaLichThucHanh() {
        return MaLichThucHanh;
    }

    public void setMaLichThucHanh(Integer MaLichThucHanh) {
        this.MaLichThucHanh = MaLichThucHanh;
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

    public String getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(String ThoiGianBatDau) {
        this.ThoiGianBatDau = ThoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String ThoiGianKetThuc) {
        this.ThoiGianKetThuc = ThoiGianKetThuc;
    }

    public String getNoiDungThucHanh() {
        return NoiDungThucHanh;
    }

    public void setNoiDungThucHanh(String NoiDungThucHanh) {
        this.NoiDungThucHanh = NoiDungThucHanh;
    }

}
