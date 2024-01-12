package models;

public class BaoCaoThietBi {

    private Integer MaBaoCao;
    private Integer MaThietBi;
    private String NgayBaoCao;
    private String NoiDungBaoCao;

    public BaoCaoThietBi() {
    }

    public BaoCaoThietBi(Integer MaBaoCao, Integer MaThietBi, String NgayBaoCao, String NoiDungBaoCao) {
        this.MaBaoCao = MaBaoCao;
        this.MaThietBi = MaThietBi;
        this.NgayBaoCao = NgayBaoCao;
        this.NoiDungBaoCao = NoiDungBaoCao;
    }

    public Integer getMaBaoCao() {
        return MaBaoCao;
    }

    public void setMaBaoCao(Integer MaBaoCao) {
        this.MaBaoCao = MaBaoCao;
    }

    public Integer getMaThietBi() {
        return MaThietBi;
    }

    public void setMaThietBi(Integer MaThietBi) {
        this.MaThietBi = MaThietBi;
    }

    public String getNgayBaoCao() {
        return NgayBaoCao;
    }

    public void setNgayBaoCao(String NgayBaoCao) {
        this.NgayBaoCao = NgayBaoCao;
    }

    public String getNoiDungBaoCao() {
        return NoiDungBaoCao;
    }

    public void setNoiDungBaoCao(String NoiDungBaoCao) {
        this.NoiDungBaoCao = NoiDungBaoCao;
    }

}
