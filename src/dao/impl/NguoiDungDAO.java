package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import models.NguoiDung;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                        rs.getString("LoaiNguoiDung"),
                        rs.getString("CoSo")
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
            stm.setString(1, TenDangNhap);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                nguoiDung = new NguoiDung(
                        rs.getInt("MaNguoiDung"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("Email"),
                        rs.getString("LoaiNguoiDung"),
                        rs.getString("CoSo")
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
            String query = "INSERT INTO nguoidung (TenDangNhap,MatKhau,Email,LoaiNguoiDung,CoSo) VALUES(?,?,?,?,?)";
        PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, nguoiDung.getTenDangNhap());
            stm.setString(2, nguoiDung.getMatKhau());
            stm.setString(3, nguoiDung.getEmail());
            stm.setString(4, nguoiDung.getLoaiNguoiDung());
            stm.setString(5, nguoiDung.getCoSo());
            rs = stm.executeUpdate();
              if (rs != -1) {
            ResultSet generatedKeys = stm.getGeneratedKeys();
            if (generatedKeys.next()) {
                nguoiDung.setMaNguoiDung(generatedKeys.getInt(1));
            }
        }
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
            String query = "UPDATE nguoidung SET MaNguoiDung = ?, TenDangNhap = ?, MatKhau = ?, Email = ?, LoaiNguoiDung = ?, CoSo=? WHERE MaNguoiDung = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, nguoiDung.getMaNguoiDung());
            stm.setString(2, nguoiDung.getTenDangNhap());
            stm.setString(3, nguoiDung.getMatKhau());
            stm.setString(4, nguoiDung.getEmail());
            stm.setString(5, nguoiDung.getLoaiNguoiDung());
            stm.setString(6, nguoiDung.getCoSo());
            stm.setInt(7, id);
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
                        rs.getString("LoaiNguoiDung"),
                        rs.getString("CoSo")
                );
                dsNguoiDung.add(nguoiDung);
            }
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNguoiDung;
    }
    public List<NguoiDung> findAllByField(String fieldName, String value) {
        List<NguoiDung> danhSachNguoiDung = new ArrayList<>();
        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM nguoidung WHERE LOWER(" + fieldName + ") LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%"+value+"%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                NguoiDung nguoiDung = new NguoiDung(
                        rs.getInt("MaNguoiDung"),
                        rs.getString("TenDangNhap"),
                        rs.getString("MatKhau"),
                        rs.getString("Email"),
                        rs.getString("LoaiNguoiDung"),
                        rs.getString("CoSo")
                );
                danhSachNguoiDung.add(nguoiDung);
            }
            Jdbc.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhSachNguoiDung;
    }
    
   public int countNonAdminUsers() {
    int count = 0;

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT COUNT(*) FROM nguoidung WHERE LoaiNguoiDung != ?";
        PreparedStatement stm = c.prepareStatement(query);
        stm.setString(1, "Admin");

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


}
