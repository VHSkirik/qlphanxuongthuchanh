package dao.impl;


import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import models.DatPhong;

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
                        rs.getString("ThoiGianDat"),
                        rs.getString("MucDichSuDUng"),
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
            String query = "INSERT INTO datphong (MaNguoiDung, MaPhongThucHanh, ThoiGianDat, MucDichSuDUng, TrangThai, NgayTao) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, datPhong.getMaNguoiDung());
            stm.setInt(2, datPhong.getMaPhongThucHanh());
            stm.setString(3, datPhong.getThoiGianDat());
            stm.setString(4, datPhong.getMucDichSuDUng());
            stm.setString(5, datPhong.getTrangThai());
            stm.setString(6, datPhong.getNgayTao());
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
            String query = "UPDATE datphong SET MaNguoiDung = ?, MaPhongThucHanh = ?, ThoiGianDat = ?, MucDichSuDUng = ?, TrangThai = ?, NgayTao = ? WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, datPhong.getMaNguoiDung());
            stm.setInt(2, datPhong.getMaPhongThucHanh());
            stm.setString(3, datPhong.getThoiGianDat());
            stm.setString(4, datPhong.getMucDichSuDUng());
            stm.setString(5, datPhong.getTrangThai());
            stm.setString(6, datPhong.getNgayTao());
            stm.setInt(7, id);
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
                        rs.getString("ThoiGianDat"),
                        rs.getString("MucDichSuDUng"),
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
     public List<DatPhong> getLatestDatPhong(int limit) {
        List<DatPhong> latestDatPhongList = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong ORDER BY NgayTao DESC LIMIT ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, limit);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                DatPhong datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("ThoiGianDat"),
                        rs.getString("MucDichSuDUng"),
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
}
