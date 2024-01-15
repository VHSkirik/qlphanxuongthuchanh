package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.PhongThucHanh;

public class PhongThucHanhDAO implements DAOInterface<PhongThucHanh> {
    private static final PhongThucHanhDAO pthDAO = new PhongThucHanhDAO();

    public PhongThucHanhDAO() {
    }

    public static PhongThucHanhDAO getIns() {
        return pthDAO;
    }

    public PhongThucHanh findOne(int id) {
        PhongThucHanh phongThucHanh = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phongthuchanh WHERE MaPhongThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                phongThucHanh = new PhongThucHanh(
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("TenPhong"),
                        rs.getString("LoaiPhong"),
                        rs.getString("DiaDiem"),
                        rs.getInt("SucChua"),
                        rs.getString("TinhTrang")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return phongThucHanh;
    }

    public int create(PhongThucHanh phongThucHanh) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO phongthuchanh (TenPhong, LoaiPhong, DiaDiem, SucChua, TinhTrang) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, phongThucHanh.getTenPhong());
            stm.setString(2, phongThucHanh.getLoaiPhong());
            stm.setString(3, phongThucHanh.getDiaDiem());
            stm.setInt(4, phongThucHanh.getSucChua());
            stm.setString(5, phongThucHanh.getTinhTrang());
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(PhongThucHanh phongThucHanh, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE phongthuchanh SET TenPhong = ?, LoaiPhong = ?, DiaDiem = ?, SucChua = ?, TinhTrang = ? WHERE MaPhongThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, phongThucHanh.getTenPhong());
            stm.setString(2, phongThucHanh.getLoaiPhong());
            stm.setString(3, phongThucHanh.getDiaDiem());
            stm.setInt(4, phongThucHanh.getSucChua());
            stm.setString(5, phongThucHanh.getTinhTrang());
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
            String query = "DELETE FROM phongthuchanh WHERE MaPhongThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<PhongThucHanh> findALl() {
        List<PhongThucHanh> dsPhongThucHanh = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phongthuchanh";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                PhongThucHanh phongThucHanh = new PhongThucHanh(
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("TenPhong"),
                        rs.getString("LoaiPhong"),
                        rs.getString("DiaDiem"),
                        rs.getInt("SucChua"),
                        rs.getString("TinhTrang")
                );
                dsPhongThucHanh.add(phongThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsPhongThucHanh;
    }
}
