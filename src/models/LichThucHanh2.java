package models;

/**
 *
 * @author @VHSkirik
 */
public class LichThucHanh2 {

    private Integer MaLichThucHanh;
    private Integer MaNguoiDung;
    private Integer MaPhongThucHanh;
    private String TietBatDau;
    private String TietKetTHuc;
    private String Mon;

    public LichThucHanh2() {
    }

    public LichThucHanh2(Integer MaLichThucHanh, Integer MaNguoiDung, Integer MaPhongThucHanh, String TietBatDau, String TietKetTHuc, String Mon) {
        this.MaLichThucHanh = MaLichThucHanh;
        this.MaNguoiDung = MaNguoiDung;
        this.MaPhongThucHanh = MaPhongThucHanh;
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

    public String getTietBatDau() {
        return TietBatDau;
    }

    public void setTietBatDau(String TietBatDau) {
        this.TietBatDau = TietBatDau;
    }

    public String getTietKetTHuc() {
        return TietKetTHuc;
    }

    public void setTietKetTHuc(String TietKetTHuc) {
        this.TietKetTHuc = TietKetTHuc;
    }

    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }

    

}
