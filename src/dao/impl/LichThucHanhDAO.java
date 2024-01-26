package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.LichThucHanh;

public class LichThucHanhDAO implements DAOInterface<LichThucHanh> {
    private static final LichThucHanhDAO lthDAO = new LichThucHanhDAO();

    public LichThucHanhDAO() {
    }

    public static LichThucHanhDAO getIns() {
        return lthDAO;
    }

    public LichThucHanh findOne(int id) {
        LichThucHanh lichThucHanh = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh WHERE MaLichThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                lichThucHanh = new LichThucHanh(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("ThoiGianBatDau"),
                        rs.getString("ThoiGianKetThuc"),
                        rs.getString("NoiDungThucHanh")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return lichThucHanh;
    }

    public int create(LichThucHanh lichThucHanh) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO lichthuchanh (MaNguoiDung, MaPhongThucHanh, ThoiGianBatDau, ThoiGianKetThuc, NoiDungThucHanh) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, lichThucHanh.getMaNguoiDung());
            stm.setInt(2, lichThucHanh.getMaPhongThucHanh());
            stm.setString(3, lichThucHanh.getThoiGianBatDau());
            stm.setString(4, lichThucHanh.getThoiGianKetThuc());
            stm.setString(5, lichThucHanh.getNoiDungThucHanh());
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

    public int update(LichThucHanh lichThucHanh, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE lichthuchanh SET MaNguoiDung = ?, MaPhongThucHanh = ?, ThoiGianBatDau = ?, ThoiGianKetThuc = ?, NoiDungThucHanh = ? WHERE MaLichThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, lichThucHanh.getMaNguoiDung());
            stm.setInt(2, lichThucHanh.getMaPhongThucHanh());
            stm.setString(3, lichThucHanh.getThoiGianBatDau());
            stm.setString(4, lichThucHanh.getThoiGianKetThuc());
            stm.setString(5, lichThucHanh.getNoiDungThucHanh());
            stm.setInt(6, id);
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

    public List<LichThucHanh> findALl() {
        List<LichThucHanh> dsLichThucHanh = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                LichThucHanh lichThucHanh = new LichThucHanh(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("ThoiGianBatDau"),
                        rs.getString("ThoiGianKetThuc"),
                        rs.getString("NoiDungThucHanh")
                );
                dsLichThucHanh.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsLichThucHanh;
    }
    public List<LichThucHanh> findAllByField(String fieldName, String value) {
        List<LichThucHanh> dsLichThucHanh = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM lichthuchanh WHERE LOWER(" + fieldName + ") LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%"+value+"%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                LichThucHanh lichThucHanh = new LichThucHanh(
                        rs.getInt("MaLichThucHanh"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("ThoiGianBatDau"),
                        rs.getString("ThoiGianKetThuc"),
                        rs.getString("NoiDungThucHanh")
                );
                dsLichThucHanh.add(lichThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsLichThucHanh;
    }
}
