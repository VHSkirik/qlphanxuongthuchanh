package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.DatPhong;
import models.YeuCauTheoCoSo;

public class DatPhongDAO implements DAOInterface<DatPhong> {

    private static final DatPhongDAO dpDAO = new DatPhongDAO();

    public DatPhongDAO() {
    }

    public static DatPhongDAO getIns() {
        return dpDAO;
    }

    public DatPhong findOne(int id) {
        DatPhong datPhong = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("MonHoc"),
                        rs.getString("TrangThai"),
                        rs.getString("NgayTao")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return datPhong;
    }

    public int create(DatPhong datPhong) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO datphong (MaNguoiDung, MaPhongThucHanh, NgayThucHanh,TietBatDau, TietKetThuc, MonHoc, TrangThai, NgayTao) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, datPhong.getMaNguoiDung());
            stm.setInt(2, datPhong.getMaPhongThucHanh());
            stm.setString(3, datPhong.getNgayThucHanh());
            stm.setInt(4, datPhong.getTietBatDau());
            stm.setInt(5, datPhong.getTietKetThuc());
            stm.setString(6, datPhong.getMonHoc());
            stm.setString(7, datPhong.getTrangThai());

            // Lấy thời gian hiện tại
            LocalDateTime now = LocalDateTime.now();
            // Chuyển đổi thành kiểu java.sql.Date
            Date currentDate = Date.valueOf(now.toLocalDate());

            stm.setDate(8, currentDate);
            rs = stm.executeUpdate();

            if (rs != -1) {
                ResultSet generatedKeys = stm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    datPhong.setMaYeuCau(generatedKeys.getInt(1));
                }
            }
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(DatPhong datPhong, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE datphong SET MaNguoiDung = ?, MaPhongThucHanh = ?, NgayThucHanh = ?,TietBatDau = ?, TietKetThuc = ?,  MonHoc = ?, TrangThai = ?, NgayTao = ? WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, datPhong.getMaNguoiDung());
            stm.setInt(2, datPhong.getMaPhongThucHanh());
            stm.setString(3, datPhong.getNgayThucHanh());
            stm.setInt(4, datPhong.getTietBatDau());
            stm.setInt(5, datPhong.getTietKetThuc());
            stm.setString(6, datPhong.getMonHoc());
            stm.setString(7, datPhong.getTrangThai());
            stm.setString(8, datPhong.getNgayTao());
            stm.setInt(9, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return rs;
    }

    public int delete(int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "DELETE FROM datphong WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<DatPhong> findALl() {
        List<DatPhong> dsDatPhong = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                DatPhong datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("MonHoc"),
                        rs.getString("TrangThai"),
                        rs.getString("NgayTao")
                );
                dsDatPhong.add(datPhong);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsDatPhong;
    }

    //in ra số phòng có trạng thái mình cần tìm
    public int countDatPhongWithStatus(String status) {
        int count = 0;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT COUNT(*) FROM datphong WHERE TrangThai = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, status);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                count = rs.getInt(1);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    //in ra danh sach ngay tao gan nhat limit = số bản ghi
    public List<DatPhong> getLatestDatPhong(int limit) {//in ra danh sach ngay tao gan nhat limit = số bản ghi
        List<DatPhong> latestDatPhongList = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong ORDER BY NgayTao ASC LIMIT ? ";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, limit);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                DatPhong datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("MonHoc"),
                        rs.getString("TrangThai"),
                        rs.getString("NgayTao")
                );
                latestDatPhongList.add(datPhong);
            }

            Collections.reverse(latestDatPhongList); // Đảo ngược danh sách để có thứ tự mới nhất đầu tiên
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return latestDatPhongList;
    }

    public List<DatPhong> findAllByField(String fieldName, String value) {
        List<DatPhong> dsDatPhong = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong WHERE " + fieldName + " = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, value);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                DatPhong datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("MonHoc"),
                        rs.getString("TrangThai"),
                        rs.getString("NgayTao")
                );
                dsDatPhong.add(datPhong);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsDatPhong;
    }
    
    public List<YeuCauTheoCoSo> findAllYeuCauTheoCoSo() {
    List<YeuCauTheoCoSo> dsYeuCauTheoCoSo = new ArrayList<>();

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT * FROM YeuCauTheoCoSo";
        PreparedStatement stm = c.prepareStatement(query);
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            YeuCauTheoCoSo yeuCauTheoCoSo = new YeuCauTheoCoSo(
                    rs.getString("Thang"),
                    rs.getInt("LinhNam"),
                    rs.getInt("MyXa"),
                    rs.getInt("MinhKhai")
            );
            dsYeuCauTheoCoSo.add(yeuCauTheoCoSo);
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var7) {
        var7.printStackTrace();
    }

    return dsYeuCauTheoCoSo;
}

}
