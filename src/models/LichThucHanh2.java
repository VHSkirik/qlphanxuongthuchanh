package models;

/**
 *
 * @author @VHSkirik
 */
public class LichThucHanh2 {

    private Integer MaLichThucHanh;
    private Integer MaNguoiDung;
    private Integer MaPhongThucHanh;
    private String NgayThucHanh;
    private Integer TietBatDau;
    private Integer TietKetTHuc;
    private String Mon;

    public LichThucHanh2() {
    }

    public LichThucHanh2(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh, String NgayThucHanh, Integer TietBatDau, Integer TietKetTHuc, String Mon) {
        this.MaLichThucHanh = MaLichThucHanh;
        this.MaNguoiDung = MaNguoiDung;
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.NgayThucHanh = NgayThucHanh;
        this.TietBatDau = TietBatDau;
        this.TietKetTHuc = TietKetTHuc;
        this.Mon = Mon;
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

    public String getNgayThucHanh() {
        return NgayThucHanh;
    }

    public void setNgayThucHanh(String NgayThucHanh) {
        this.NgayThucHanh = NgayThucHanh;
    }

    public Integer getTietBatDau() {
        return TietBatDau;
    }

    public void setTietBatDau(Integer TietBatDau) {
        this.TietBatDau = TietBatDau;
    }

    public Integer getTietKetTHuc() {
        return TietKetTHuc;
    }

    public void setTietKetTHuc(Integer TietKetTHuc) {
        this.TietKetTHuc = TietKetTHuc;
    }

    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }


}
