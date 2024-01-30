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
import java.sql.Date;
import java.time.LocalDate;
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
            String query = "SELECT * FROM lichthuchanh WHERE MaLichThucHanh = ?";
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
                        rs.getString("MonHoc")
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
            String query = "INSERT INTO lichthuchanh (MaNguoiDung, MaPhongThucHanh,NgayThucHanh, TietBatDau, TietKetTHuc, MonHoc) VALUES (?,?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, lichThucHanh.getMaNguoiDung());
            stm.setInt(2, lichThucHanh.getMaPhongThucHanh());
            stm.setString(3, lichThucHanh.getNgayThucHanh());
            stm.setInt(4, lichThucHanh.getTietBatDau());
            stm.setInt(5, lichThucHanh.getTietKetTHuc());
            stm.setString(6, lichThucHanh.getMon());
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
            String query = "UPDATE lichthuchanh SET MaNguoiDung = ?, MaPhongThucHanh = ?,NgayThucHanh = ?, TietBatDau = ?, TietKetTHuc = ?, MonHoc = ? WHERE MaLichThucHanh = ?";
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
            String query = "DELETE FROM lichthuchanh WHERE MaLichThucHanh = ?";
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
            String query = "SELECT * FROM lichthuchanh";
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
                        rs.getString("MonHoc")
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
            String query = "SELECT * FROM lichthuchanh WHERE LOWER(" + fieldName + ") LIKE LOWER(?)";
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
                        rs.getString("MonHoc")
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
            String query = "SELECT * FROM lichthuchanh lth " +
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
                        rs.getString("MonHoc")
                );
                overlappingLichThucHanhList.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return overlappingLichThucHanhList;
    }

    public List<LichThucHanh2> getLichThucHanh(int MaNguoiDung, String NgayThucHanh){
         List<LichThucHanh2> dsLichThucHanh = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh WHERE MaNguoiDung = ? and NgayThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, MaNguoiDung );
            stm.setString(2, NgayThucHanh);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                LichThucHanh2 lichThucHanh = new LichThucHanh2(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NgayThucHanh"),
                        rs.getInt("TietBatDau"),
                        rs.getInt("TietKetThuc"),
                        rs.getString("MonHoc")
                );
                dsLichThucHanh.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsLichThucHanh;
    }
    
    public LichThucHanh2 findOneIfPast(int id) {
    LichThucHanh2 lichThucHanh = null;

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT * FROM lichthuchanh WHERE MaLichThucHanh = ? AND NgayThucHanh <= ?";
        PreparedStatement stm = c.prepareStatement(query);
        stm.setInt(1, id);
        stm.setDate(2, Date.valueOf(LocalDate.now())); // Ngày hiện tại
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            lichThucHanh = new LichThucHanh2(
                    rs.getInt("MaLichThucHanh"),
                    rs.getInt("MaNguoiDung"),
                    rs.getInt("MaPhongThucHanh"),
                    rs.getString("NgayThucHanh"),
                    rs.getInt("TietBatDau"),
                    rs.getInt("TietKetTHuc"),
                    rs.getString("MonHoc")
            );
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var7) {
        var7.printStackTrace();
    }

    return lichThucHanh;
}
}
