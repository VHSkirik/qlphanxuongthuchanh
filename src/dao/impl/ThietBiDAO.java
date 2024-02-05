package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.ThietBi;

public class ThietBiDAO implements DAOInterface<ThietBi> {

    private static final ThietBiDAO tbDAO = new ThietBiDAO();

    public ThietBiDAO() {
    }

    public static ThietBiDAO getIns() {
        return tbDAO;
    }

    public ThietBi findOne(int id) {
        ThietBi thietBi = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thietbi WHERE MaThietBi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                thietBi = new ThietBi(
                        rs.getInt("MaThietBi"),
                        rs.getString("TenThietBi"),
                        rs.getString("LoaiThietBi"),
                        rs.getString("NgaySuDung"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getInt("SoMay")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return thietBi;
    }

    public int create(ThietBi thietBi) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO thietbi (TenThietBi, LoaiThietBi, NgaySuDung, MoTa, TinhTrang, MaPhongThucHanh, SoMay) VALUES (?, ?, ?, ?, ?, ?,?)";
            PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, thietBi.getTenThietBi());
            stm.setString(2, thietBi.getLoaiThietBi());
            stm.setString(3, thietBi.getNgaySuDung());
            stm.setString(4, thietBi.getMoTa());
            stm.setString(5, thietBi.getTinhTrang());
            stm.setInt(6, thietBi.getMaPhongThucHanh());
            stm.setInt(7, thietBi.getSoMay());
            rs = stm.executeUpdate();
            if (rs != -1) {
                ResultSet generatedKeys = stm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    thietBi.setMaThietBi(generatedKeys.getInt(1));
                }
            }
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(ThietBi thietBi, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE thietbi SET TenThietBi = ?, LoaiThietBi = ?, NgaySuDung = ?, MoTa = ?, TinhTrang = ?, MaPhongThucHanh = ?, SoMay =? WHERE MaThietBi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, thietBi.getTenThietBi());
            stm.setString(2, thietBi.getLoaiThietBi());
            stm.setString(3, thietBi.getNgaySuDung());
            stm.setString(4, thietBi.getMoTa());
            stm.setString(5, thietBi.getTinhTrang());
            stm.setInt(6, thietBi.getMaPhongThucHanh());
            stm.setInt(7, thietBi.getSoMay());
            stm.setInt(8, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return rs;
    }
    
    public int updateTT(String tinhTrang, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE thietbi SET TinhTrang = ? WHERE MaThietBi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, tinhTrang);
            stm.setInt(2, id);
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
            String query = "DELETE FROM thietbi WHERE MaThietBi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<ThietBi> findALl() {
        List<ThietBi> dsThietBi = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thietbi";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                ThietBi thietBi = new ThietBi(
                        rs.getInt("MaThietBi"),
                        rs.getString("TenThietBi"),
                        rs.getString("LoaiThietBi"),
                        rs.getString("NgaySuDung"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getInt("SoMay")
                );
                dsThietBi.add(thietBi);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsThietBi;
    }

    public List<ThietBi> findAllByField(String fieldName, String value) {
        List<ThietBi> dsThietBi = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thietbi WHERE LOWER(" + fieldName + ") LIKE LOWER(?) ORDER BY SoMay";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%" + value + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                ThietBi thietBi = new ThietBi(
                        rs.getInt("MaThietBi"),
                        rs.getString("TenThietBi"),
                        rs.getString("LoaiThietBi"),
                        rs.getString("NgaySuDung"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getInt("SoMay")
                );
                dsThietBi.add(thietBi);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsThietBi;
    }

    public ThietBi findOneBySoMayAndPhong(int SoMay, int MaPhongThucHanh) {
        ThietBi thietBi = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thietbi WHERE SoMay = ? AND MaPhongThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, SoMay);
            stm.setInt(2, MaPhongThucHanh);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                thietBi = new ThietBi(
                        rs.getInt("MaThietBi"),
                        rs.getString("TenThietBi"),
                        rs.getString("LoaiThietBi"),
                        rs.getString("NgaySuDung"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getInt("SoMay")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return thietBi;
    }

    public List<ThietBi> findAllByTenPhongThucHanh(String tenPhongThucHanh) {
        List<ThietBi> dsThietBi = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM thietbi WHERE MaPhongThucHanh IN (SELECT MaPhongThucHanh FROM phongthuchanh WHERE LOWER(TenPhong) LIKE LOWER(?))";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%" + tenPhongThucHanh + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                ThietBi thietBi = new ThietBi(
                        rs.getInt("MaThietBi"),
                        rs.getString("TenThietBi"),
                        rs.getString("LoaiThietBi"),
                        rs.getString("NgaySuDung"),
                        rs.getString("MoTa"),
                        rs.getString("TinhTrang"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getInt("SoMay")
                );
                dsThietBi.add(thietBi);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsThietBi;
    }

    public int countNonHong() {
        int count = 0;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT COUNT(*) FROM thietbi WHERE TinhTrang != ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "Hong");

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

    public int countNonHongPhong(int phong) {
        int count = 0;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT COUNT(*) FROM thietbi WHERE MaPhongThucHanh = ? and TinhTrang != ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, phong);
            stm.setString(2, "Hong");

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
    
    public List<String> findLoaiThietBiByTenCoSo(String tenCoSo) {
    List<String> dsLoaiThietBi = new ArrayList<>();

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT DISTINCT tb.LoaiThietBi " +
                       "FROM thietbi tb " +
                       "JOIN phongthuchanh pt ON tb.MaPhongThucHanh = pt.MaPhongThucHanh " +
                       "WHERE LOWER(pt.DiaDiem) LIKE LOWER(?)";
        PreparedStatement stm = c.prepareStatement(query);
        stm.setString(1, "%" + tenCoSo + "%");
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            String loaiThietBi = rs.getString("LoaiThietBi");
            dsLoaiThietBi.add(loaiThietBi);
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var7) {
        var7.printStackTrace();
    }

    return dsLoaiThietBi;
}
    public int findTongSoThietBiByCoSo(String tenCoSo) {
    int tongSoThietBi = 0;

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT COUNT(tb.MaThietBi) AS TongSoThietBi " +
                       "FROM phongthuchanh pt " +
                       "JOIN thietbi tb ON pt.MaPhongThucHanh = tb.MaPhongThucHanh " +
                       "WHERE LOWER(pt.DiaDiem) LIKE LOWER(?)";
        PreparedStatement stm = c.prepareStatement(query);
        stm.setString(1, "%" + tenCoSo + "%");
        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
            tongSoThietBi = rs.getInt("TongSoThietBi");
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var7) {
        var7.printStackTrace();
    }

    return tongSoThietBi;
}

    public int getSoLuongThietBiTheoYeuCau(String diaDiem, String loaiThietBi, String tinhTrang) {
    int soLuong = 0;

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT COUNT(*) AS SoLuong FROM thietbi "
                     + "INNER JOIN phongthuchanh ON thietbi.MaPhongThucHanh = phongthuchanh.MaPhongThucHanh "
                     + "WHERE LOWER(phongthuchanh.DiaDiem) LIKE LOWER(?) "
                     + "AND LOWER(thietbi.LoaiThietBi) LIKE LOWER(?) "
                     + "AND LOWER(thietbi.TinhTrang) LIKE LOWER(?)";
        PreparedStatement stm = c.prepareStatement(query);
        stm.setString(1, "%" + diaDiem + "%");
        stm.setString(2, "%" + loaiThietBi + "%");
        stm.setString(3, "%" + tinhTrang + "%");
        ResultSet rs = stm.executeQuery();

        if (rs.next()) {
            soLuong = rs.getInt("SoLuong");
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var7) {
        var7.printStackTrace();
    }

    return soLuong;
}


}
