package models;

import java.util.Date;

public class DatPhong {

    private Integer MaYeuCau;
    private Integer MaNguoiDung;
    private Integer MaPhongThucHanh;
    private String NgayThucHanh;
    private Integer TietBatDau;
    private Integer TietKetThuc;
    private String MonHoc;
    private String TrangThai;
    private String NgayTao;

    public DatPhong() {
    }

    public DatPhong(Integer MaYeuCau, Integer MaNguoiDung, Integer MaPhongThucHanh, String NgayThucHanh,Integer TietBatDau, Integer TietKetThuc, String MonHoc, String TrangThai, String NgayTao) {
        this.MaYeuCau = MaYeuCau;
        this.MaNguoiDung = MaNguoiDung;
        this.MaPhongThucHanh = MaPhongThucHanh;
        this.NgayThucHanh = NgayThucHanh;
        this.TietBatDau = TietBatDau;
        this.TietKetThuc = TietKetThuc;
        this.MonHoc = MonHoc;
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

    public Integer getTietKetThuc() {
        return TietKetThuc;
    }

    public void setTietKetThuc(Integer TietKetThuc) {
        this.TietKetThuc = TietKetThuc;
    }

    public String getMonHoc() {
        return MonHoc;
    }

    public void setMonHoc(String MonHoc) {
        this.MonHoc = MonHoc;
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
