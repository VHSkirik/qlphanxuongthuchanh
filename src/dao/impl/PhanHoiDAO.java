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
import models.PhanHoi;

public class PhanHoiDAO implements DAOInterface<PhanHoi> {
    private static final PhanHoiDAO phDAO = new PhanHoiDAO();

    public PhanHoiDAO() {
    }

    public static PhanHoiDAO getIns() {
        return phDAO;
    }

    public PhanHoi findOne(int id) {
        PhanHoi phanHoi = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phanhoi WHERE MaPhanHoi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                phanHoi = new PhanHoi(
                        rs.getInt("MaPhanHoi"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NoiDung"),
                        rs.getInt("DiemDanhGia")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return phanHoi;
    }

    public int create(PhanHoi phanHoi) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO phanhoi (MaNguoiDung, MaPhongThucHanh, NoiDung, DiemDanhGia) VALUES (?, ?, ?, ?)";
        PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, phanHoi.getMaNguoiDung());
            stm.setInt(2, phanHoi.getMaPhongThucHanh());
            stm.setString(3, phanHoi.getNoiDung());
            stm.setInt(4, phanHoi.getDiemDanhGia());
            rs = stm.executeUpdate();
               if (rs != -1) {
            ResultSet generatedKeys = stm.getGeneratedKeys();
            if (generatedKeys.next()) {
                phanHoi.setMaPhanHoi(generatedKeys.getInt(1));
            }
        }

            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(PhanHoi phanHoi, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE phanhoi SET MaNguoiDung = ?, MaPhongThucHanh = ?, NoiDung = ?, DiemDanhGia = ? WHERE MaPhanHoi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, phanHoi.getMaNguoiDung());
            stm.setInt(2, phanHoi.getMaPhongThucHanh());
            stm.setString(3, phanHoi.getNoiDung());
            stm.setInt(4, phanHoi.getDiemDanhGia());
            stm.setInt(5, id);
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
            String query = "DELETE FROM phanhoi WHERE MaPhanHoi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<PhanHoi> findALl() {
        List<PhanHoi> dsPhanHoi = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phanhoi";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                PhanHoi phanHoi = new PhanHoi(
                        rs.getInt("MaPhanHoi"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("NoiDung"),
                        rs.getInt("DiemDanhGia")
                );
                dsPhanHoi.add(phanHoi);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsPhanHoi;
    }
}
