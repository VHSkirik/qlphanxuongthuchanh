package models;

public class PhanHoi {

    private Integer MaPhanHoi;
    private Integer MaLichThucHanh;
    private String NoiDung;
    private Integer DiemDanhGia;

    public PhanHoi() {
    }

    public PhanHoi(Integer MaPhanHoi, Integer MaLichThucHanh, String NoiDung, Integer DiemDanhGia) {
        this.MaPhanHoi = MaPhanHoi;
        this.MaLichThucHanh = MaLichThucHanh;
        this.NoiDung = NoiDung;
        this.DiemDanhGia = DiemDanhGia;
    }

    public Integer getMaPhanHoi() {
        return MaPhanHoi;
    }

    public void setMaPhanHoi(Integer MaPhanHoi) {
        this.MaPhanHoi = MaPhanHoi;
    }

    public Integer getMaLichThucHanh() {
        return MaLichThucHanh;
    }

    public void setMaLichThucHanh(Integer MaLichThucHanh) {
        this.MaLichThucHanh = MaLichThucHanh;
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