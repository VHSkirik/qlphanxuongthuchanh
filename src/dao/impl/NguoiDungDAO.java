package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import models.NguoiDung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO implements DAOInterface<NguoiDung> {

    private static final NguoiDungDAO ndDAO = new NguoiDungDAO();

    public static NguoiDungDAO getIns() {
        return ndDAO;
    }

    @Override
    public NguoiDung findOne(int id) {
        NguoiDung nguoiDung = null;
        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM nguoidung WHERE MaNguoiDung = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                nguoiDung = new NguoiDung(
                        rs.getInt("MaNguoiDung"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("Email"),
                        rs.getString("LoaiNguoiDung")
                );
            }
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nguoiDung;
    }
    
    public NguoiDung findUserName(String TenDangNhap) {
        NguoiDung nguoiDung = null;
        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM nguoidung WHERE TenDangNhap = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(2, TenDangNhap);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                nguoiDung = new NguoiDung(
                        rs.getInt("MaNguoiDung"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("Email"),
                        rs.getString("LoaiNguoiDung")
                );
            }
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nguoiDung;
    }

    @Override
    public int create(NguoiDung nguoiDung) {
        int rs = -1;
        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO nguoidung (TenDangNhap,MatKhau,Email,LoaiNguoiDung) VALUES(?,?,?,?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, nguoiDung.getTenDangNhap());
            stm.setString(2, nguoiDung.getMatKhau());
            stm.setString(3, nguoiDung.getEmail());
            stm.setString(4, nguoiDung.getLoaiNguoiDung());
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int update(NguoiDung nguoiDung, int id) {
        int rs = -1;
        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE nguoidung SET MaNguoiDung = ?, TenDangNhap = ?, MatKhau = ?, Email = ?, LoaiNguoiDung = ? WHERE MaNguoiDung = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, nguoiDung.getMaNguoiDung());
            stm.setString(2, nguoiDung.getTenDangNhap());
            stm.setString(3, nguoiDung.getMatKhau());
            stm.setString(4, nguoiDung.getEmail());
            stm.setString(5, nguoiDung.getLoaiNguoiDung());
            stm.setInt(6, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int delete(int id) {
        int rs = -1;
        try {
            Connection c = Jdbc.getConnection();
            String query = "DELETE FROM nguoidung WHERE MaNguoiDung = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<NguoiDung> findALl() {
        List<NguoiDung> dsNguoiDung = new ArrayList<>();
        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM nguoidung";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                NguoiDung nguoiDung = new NguoiDung(
                        rs.getInt("MaNguoiDung"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("Email"),
                        rs.getString("LoaiNguoiDung")
                );
                dsNguoiDung.add(nguoiDung);
            }
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNguoiDung;
    }
}
