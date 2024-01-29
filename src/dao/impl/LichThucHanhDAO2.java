package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import models.LichThucHanh2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.DatPhong;

public class LichThucHanhDAO2 implements DAOInterface<LichThucHanh2> {
    private static final LichThucHanhDAO2 lthDAO = new LichThucHanhDAO2();

    public LichThucHanhDAO2() {
    }

    public static LichThucHanhDAO2 getIns() {
        return lthDAO;
    }

    public LichThucHanh2 findOne(int id) {
        LichThucHanh2 lichThucHanh = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh2 WHERE MaLichThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                lichThucHanh = new LichThucHanh2(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetTHuc"),
                        rs.getString("Mon")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return lichThucHanh;
    }

    public int create(LichThucHanh2 lichThucHanh) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO lichthuchanh2 (MaNguoiDung, MaPhongThucHanh,NgayThucHanh, TietBatDau, TietKetTHuc, Mon) VALUES (?,?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, lichThucHanh.getMaNguoiDung());
            stm.setInt(2, lichThucHanh.getMaPhongThucHanh());
            stm.setString(3, lichThucHanh.getNgayThucHanh());
            stm.setInt(3, lichThucHanh.getTietBatDau());
            stm.setInt(4, lichThucHanh.getTietKetTHuc());
            stm.setString(5, lichThucHanh.getMon());
            rs = stm.executeUpdate();
            if (rs != -1) {
                ResultSet generatedKeys = stm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    lichThucHanh.setMaLichThucHanh(generatedKeys.getInt(1));
                }
            }
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(LichThucHanh2 lichThucHanh, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE lichthuchanh2 SET MaNguoiDung = ?, MaPhongThucHanh = ?,NgayThucHanh = ?, TietBatDau = ?, TietKetTHuc = ?, Mon = ? WHERE MaLichThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, lichThucHanh.getMaNguoiDung());
            stm.setInt(2, lichThucHanh.getMaPhongThucHanh());
            stm.setString(3, lichThucHanh.getNgayThucHanh());
            stm.setInt(4, lichThucHanh.getTietBatDau());
            stm.setInt(5, lichThucHanh.getTietKetTHuc());
            stm.setString(6, lichThucHanh.getMon());
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
            String query = "DELETE FROM lichthuchanh2 WHERE MaLichThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<LichThucHanh2> findALl() {
        List<LichThucHanh2> dsLichThucHanh = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh2";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                LichThucHanh2 lichThucHanh = new LichThucHanh2(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("Mon")
                );
                dsLichThucHanh.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsLichThucHanh;
    }

    public List<LichThucHanh2> findAllByField(String fieldName, String value) {
        List<LichThucHanh2> dsLichThucHanh = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh2 WHERE LOWER(" + fieldName + ") LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%" + value + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                LichThucHanh2 lichThucHanh = new LichThucHanh2(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("Mon")
                );
                dsLichThucHanh.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsLichThucHanh;
    }
    
    public List<LichThucHanh2> getOverlappingLichThucHanh(DatPhong datPhong) {
        List<LichThucHanh2> overlappingLichThucHanhList = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh2 lth " +
                           "JOIN datphong dp ON lth.MaPhongThucHanh = dp.MaPhongThucHanh " +
                           "AND lth.NgayThucHanh = dp.NgayThucHanh " +
                           "AND lth.TietBatDau <= dp.TietKetThuc " +
                           "AND lth.TietKetThuc >= dp.TietBatDau " +
                           "WHERE dp.MaYeuCau = ?";
            
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, datPhong.getMaYeuCau());
            
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                LichThucHanh2 lichThucHanh = new LichThucHanh2(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("Mon")
                );
                overlappingLichThucHanhList.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return overlappingLichThucHanhList;
    }

}
