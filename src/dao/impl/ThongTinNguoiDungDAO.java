package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.ThongTinNguoiDung;
import java.sql.Statement;

public class ThongTinNguoiDungDAO implements DAOInterface<ThongTinNguoiDung> {
    private static final ThongTinNguoiDungDAO ttndDAO = new ThongTinNguoiDungDAO();

    public ThongTinNguoiDungDAO() {
    }

    public static ThongTinNguoiDungDAO getIns() {
        return ttndDAO;
    }

    public ThongTinNguoiDung findOne(int id) {
        ThongTinNguoiDung thongTinNguoiDung = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thongtinnguoidung WHERE MaThongTin = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                thongTinNguoiDung = new ThongTinNguoiDung(
                        rs.getInt("MaThongTin"),
                        rs.getInt("MaNguoiDung"),
                        rs.getString("Hoten"),
                        rs.getString("SoDienThoai"),
                        rs.getString("ChuyenMon"),
                        rs.getString("DiaChi")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return thongTinNguoiDung;
    }

    public int create(ThongTinNguoiDung thongTinNguoiDung) {
    int rs = -1;

    try {
        Connection c = Jdbc.getConnection();
        String query = "INSERT INTO thongtinnguoidung (MaNguoiDung, Hoten, SoDienThoai, ChuyenMon, DiaChi) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        stm.setInt(1, thongTinNguoiDung.getMaNguoiDung());
        stm.setString(2, thongTinNguoiDung.getHoten());
        stm.setString(3, thongTinNguoiDung.getSoDienThoai());
        stm.setString(4, thongTinNguoiDung.getChuyenMon());
        stm.setString(5, thongTinNguoiDung.getDiaChi());
        rs = stm.executeUpdate();

        if (rs != -1) {
            ResultSet generatedKeys = stm.getGeneratedKeys();
            if (generatedKeys.next()) {
                thongTinNguoiDung.setMaThongTin(generatedKeys.getInt(1));
            }
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var6) {
        var6.printStackTrace();
    }

    return rs;
}


    public int update(ThongTinNguoiDung thongTinNguoiDung, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE thongtinnguoidung SET MaNguoiDung = ?, Hoten = ?, SoDienThoai = ?, ChuyenMon = ?, DiaChi = ? WHERE MaThongTin = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, thongTinNguoiDung.getMaNguoiDung());
            stm.setString(2, thongTinNguoiDung.getHoten());
            stm.setString(3, thongTinNguoiDung.getSoDienThoai());
            stm.setString(4, thongTinNguoiDung.getChuyenMon());
            stm.setString(5, thongTinNguoiDung.getDiaChi());
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
            String query = "DELETE FROM thongtinnguoidung WHERE MaThongTin = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<ThongTinNguoiDung> findALl() {
        List<ThongTinNguoiDung> dsThongTinNguoiDung = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thongtinnguoidung";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                ThongTinNguoiDung thongTinNguoiDung = new ThongTinNguoiDung(
                        rs.getInt("MaThongTin"),
                        rs.getInt("MaNguoiDung"),
                        rs.getString("Hoten"),
                        rs.getString("SoDienThoai"),
                        rs.getString("ChuyenMon"),
                        rs.getString("DiaChi")
                );
                dsThongTinNguoiDung.add(thongTinNguoiDung);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsThongTinNguoiDung;
    }
    
    public List<ThongTinNguoiDung> findAllByField(String fieldName, String value){
        List<ThongTinNguoiDung> dsThongTinNguoiDung = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thongtinnguoidung WHERE LOWER(" + fieldName + ") LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%"+value+"%");
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                ThongTinNguoiDung thongTinNguoiDung = new ThongTinNguoiDung(
                        rs.getInt("MaThongTin"),
                        rs.getInt("MaNguoiDung"),
                        rs.getString("Hoten"),
                        rs.getString("SoDienThoai"),
                        rs.getString("ChuyenMon"),
                        rs.getString("DiaChi")
                );
                dsThongTinNguoiDung.add(thongTinNguoiDung);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsThongTinNguoiDung;
    }
}