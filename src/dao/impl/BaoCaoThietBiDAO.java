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
import models.BaoCaoThietBi;

public class BaoCaoThietBiDAO implements DAOInterface<BaoCaoThietBi> {
    private static final BaoCaoThietBiDAO bcDAO = new BaoCaoThietBiDAO();

    public BaoCaoThietBiDAO() {
    }

    public static BaoCaoThietBiDAO getIns() {
        return bcDAO;
    }

    public BaoCaoThietBi findOne(int id) {
        BaoCaoThietBi baoCaoThietBi = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM baocaothietbi WHERE MaBaoCao = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                baoCaoThietBi = new BaoCaoThietBi(
                        rs.getInt("MaBaoCao"),
                        rs.getInt("MaThietBi"),
                        rs.getString("NgayBaoCao"),
                        rs.getString("NoiDungBaoCao")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return baoCaoThietBi;
    }

    public int create(BaoCaoThietBi baoCaoThietBi) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO baocaothietbi (MaThietBi, NgayBaoCao, NoiDungBaoCao) VALUES (?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, baoCaoThietBi.getMaThietBi());
            stm.setString(2, baoCaoThietBi.getNgayBaoCao());
            stm.setString(3, baoCaoThietBi.getNoiDungBaoCao());
            rs = stm.executeUpdate();
            
        if (rs != -1) {
            ResultSet generatedKeys = stm.getGeneratedKeys();
            if (generatedKeys.next()) {
                baoCaoThietBi.setMaBaoCao(generatedKeys.getInt(1));
            }
        }
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(BaoCaoThietBi baoCaoThietBi, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE baocaothietbi SET MaThietBi = ?, NgayBaoCao = ?, NoiDungBaoCao = ? WHERE MaBaoCao = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, baoCaoThietBi.getMaThietBi());
            stm.setString(2, baoCaoThietBi.getNgayBaoCao());
            stm.setString(3, baoCaoThietBi.getNoiDungBaoCao());
            stm.setInt(4, id);
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
            String query = "DELETE FROM baocaothietbi WHERE MaBaoCao = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<BaoCaoThietBi> findALl() {
        List<BaoCaoThietBi> dsBaoCaoThietBi = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM baocaothietbi";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while(rs.next()) {
                BaoCaoThietBi baoCaoThietBi = new BaoCaoThietBi(
                        rs.getInt("MaBaoCao"),
                        rs.getInt("MaThietBi"),
                        rs.getString("NgayBaoCao"),
                        rs.getString("NoiDungBaoCao")
                );
                dsBaoCaoThietBi.add(baoCaoThietBi);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsBaoCaoThietBi;
    }

   public List<BaoCaoThietBi> findAllByField(String fieldName, String value) {
    List<BaoCaoThietBi> dsBaoCaoThietBi = new ArrayList<>();

    try {
        Connection c = Jdbc.getConnection();
        String query = "SELECT * FROM baocaothietbi WHERE " + fieldName + " = ?";
        PreparedStatement stm = c.prepareStatement(query);
        stm.setString(1, value);
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
            BaoCaoThietBi baoCaoThietBi = new BaoCaoThietBi(
                    rs.getInt("MaBaoCao"),
                    rs.getInt("MaThietBi"),
                    rs.getString("NgayBaoCao"),
                    rs.getString("NoiDungBaoCao")
            );
            dsBaoCaoThietBi.add(baoCaoThietBi);
        }

        Jdbc.closeConnection(c);
    } catch (SQLException var7) {
        var7.printStackTrace();
    }

    return dsBaoCaoThietBi;
}

}
