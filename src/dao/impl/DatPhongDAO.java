<<<<<<< HEAD
package dao.impl;

=======
>>>>>>> 0aa074a242da4227ca0b9a2b59f3a7f57aeb88ef
import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.DatPhong;

public class DatPhongDAO implements DAOInterface<DatPhong> {
    private static final DatPhongDAO dpDAO = new DatPhongDAO();

    public DatPhongDAO() {
    }

    public static DatPhongDAO getIns() {
        return dpDAO;
    }

    public DatPhong findOne(int id) {
        DatPhong datPhong = null;

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("ThoiGianDat"),
                        rs.getString("MucDichSuDUng"),
                        rs.getString("TrangThai")
                );
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return datPhong;
    }

    public int create(DatPhong datPhong) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "INSERT INTO datphong (MaNguoiDung, MaPhongThucHanh, ThoiGianDat, MucDichSuDUng, TrangThai) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, datPhong.getMaNguoiDung());
            stm.setInt(2, datPhong.getMaPhongThucHanh());
            stm.setString(3, datPhong.getThoiGianDat());
            stm.setString(4, datPhong.getMucDichSuDUng());
            stm.setString(5, datPhong.getTrangThai());
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public int update(DatPhong datPhong, int id) {
        int rs = -1;

        try {
            Connection c = Jdbc.getConnection();
            String query = "UPDATE datphong SET MaNguoiDung = ?, MaPhongThucHanh = ?, ThoiGianDat = ?, MucDichSuDUng = ?, TrangThai = ? WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, datPhong.getMaNguoiDung());
            stm.setInt(2, datPhong.getMaPhongThucHanh());
            stm.setString(3, datPhong.getThoiGianDat());
            stm.setString(4, datPhong.getMucDichSuDUng());
            stm.setString(5, datPhong.getTrangThai());
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
            String query = "DELETE FROM datphong WHERE MaYeuCau = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setInt(1, id);
            rs = stm.executeUpdate();
            Jdbc.closeConnection(c);
        } catch (SQLException var6) {
            var6.printStackTrace();
        }

        return rs;
    }

    public List<DatPhong> findALl() {
        List<DatPhong> dsDatPhong = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM datphong";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                DatPhong datPhong = new DatPhong(
                        rs.getInt("MaYeuCau"),
                        rs.getInt("MaNguoiDung"),
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("ThoiGianDat"),
                        rs.getString("MucDichSuDUng"),
                        rs.getString("TrangThai")
                );
                dsDatPhong.add(datPhong);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsDatPhong;
    }
}
