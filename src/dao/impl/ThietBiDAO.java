<<<<<<< HEAD
package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
                        rs.getInt("MaPhongThucHanh")
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
            String query = "INSERT INTO thietbi (TenThietBi, LoaiThietBi, NgaySuDung, MoTa, TinhTrang, MaPhongThucHanh) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, thietBi.getTenThietBi());
            stm.setString(2, thietBi.getLoaiThietBi());
            stm.setString(3, thietBi.getNgaySuDung());
            stm.setString(4, thietBi.getMoTa());
            stm.setString(5, thietBi.getTinhTrang());
            stm.setInt(6, thietBi.getMaPhongThucHanh());
            rs = stm.executeUpdate();
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
            String query = "UPDATE thietbi SET TenThietBi = ?, LoaiThietBi = ?, NgaySuDung = ?, MoTa = ?, TinhTrang = ?, MaPhongThucHanh = ? WHERE MaThietBi = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, thietBi.getTenThietBi());
            stm.setString(2, thietBi.getLoaiThietBi());
            stm.setString(3, thietBi.getNgaySuDung());
            stm.setString(4, thietBi.getMoTa());
            stm.setString(5, thietBi.getTinhTrang());
            stm.setInt(6, thietBi.getMaPhongThucHanh());
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
                        rs.getInt("MaPhongThucHanh")
                );
                dsThietBi.add(thietBi);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsThietBi;
    }
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

/**
 *
 * @author ducanh
 */
public class ThietBiDAO {
    
>>>>>>> 0aa074a242da4227ca0b9a2b59f3a7f57aeb88ef
}
