package models;

public class PhanHoi {

    private Integer MaPhanHoi;
    private Integer MaNguoiDung;
    private Integer MaPhongThucHanh;
    private String NoiDung;
    private Integer DiemDanhGia;

    public PhanHoi() {
    }

    public PhanHoi(Integer MaPhanHoi, Integer MaNguoiDung, Integer MaPhongThucHanh, String NoiDung, Integer DiemDanhGia) {
        this.MaPhanHoi = MaPhanHoi;
        this.MaNguoiDung = MaNguoiDung;
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.NoiDung = NoiDung;
        this.DiemDanhGia = DiemDanhGia;
    }

    public Integer getMaPhanHoi() {
        return MaPhanHoi;
    }

    public void setMaPhanHoi(Integer MaPhanHoi) {
        this.MaPhanHoi = MaPhanHoi;
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

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public Integer getDiemDanhGia() {
        return DiemDanhGia;
    }

    public void setDiemDanhGia(Integer DiemDanhGia) {
        this.DiemDanhGia = DiemDanhGia;
    }

}
