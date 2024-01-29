package dao.impl;

import dao.DAOInterface;
import dao.Jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
                        rs.getString("TinhTrang"),
                        rs.getString("Toa")
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
            String query = "INSERT INTO phongthuchanh (TenPhong, LoaiPhong, DiaDiem, SucChua, TinhTrang, Toa) VALUES (?, ?, ?, ?, ?,?)";
            PreparedStatement stm = c.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, phongThucHanh.getTenPhong());
            stm.setString(2, phongThucHanh.getLoaiPhong());
            stm.setString(3, phongThucHanh.getDiaDiem());
            stm.setInt(4, phongThucHanh.getSucChua());
            stm.setString(5, phongThucHanh.getTinhTrang());
            stm.setString(6, phongThucHanh.getToa());
            rs = stm.executeUpdate();
            if (rs != -1) {
                ResultSet generatedKeys = stm.getGeneratedKeys();
                if (generatedKeys.next()) {
                    phongThucHanh.setMaPhongThucHanh(generatedKeys.getInt(1));
                }
            }

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
            String query = "UPDATE phongthuchanh SET TenPhong = ?, LoaiPhong = ?, DiaDiem = ?, SucChua = ?, TinhTrang = ?, Toa =? WHERE MaPhongThucHanh = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, phongThucHanh.getTenPhong());
            stm.setString(2, phongThucHanh.getLoaiPhong());
            stm.setString(3, phongThucHanh.getDiaDiem());
            stm.setInt(4, phongThucHanh.getSucChua());
            stm.setString(5, phongThucHanh.getTinhTrang());
            stm.setString(6, phongThucHanh.getToa());
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
                        rs.getString("TinhTrang"),
                        rs.getString("Toa")
                );
                dsPhongThucHanh.add(phongThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsPhongThucHanh;
    }

    public List<PhongThucHanh> findAllByField(String fieldName, String value) {
        List<PhongThucHanh> dsPhongThucHanh = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phongthuchanh WHERE LOWER(" + fieldName + ") LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%" + value + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                PhongThucHanh phongThucHanh = new PhongThucHanh(
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("TenPhong"),
                        rs.getString("LoaiPhong"),
                        rs.getString("DiaDiem"),
                        rs.getInt("SucChua"),
                        rs.getString("TinhTrang"),
                        rs.getString("Toa")
                );
                dsPhongThucHanh.add(phongThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsPhongThucHanh;
    }

    public List<PhongThucHanh> findAllByDiaDiem(String diaDiem) {
        List<PhongThucHanh> dsPhongThucHanh = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phongthuchanh WHERE LOWER(DiaDiem) LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%" + diaDiem + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                PhongThucHanh phongThucHanh = new PhongThucHanh(
                        rs.getInt("MaPhongThucHanh"),
                        rs.getString("TenPhong"),
                        rs.getString("LoaiPhong"),
                        rs.getString("DiaDiem"),
                        rs.getInt("SucChua"),
                        rs.getString("TinhTrang"),
                        rs.getString("Toa")
                );
                dsPhongThucHanh.add(phongThucHanh);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }
        return dsPhongThucHanh;
    }

    public List<String> findToaByDiaDiem(String diaDiem) {
        List<String> dsToa = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT DISTINCT Toa FROM phongthuchanh WHERE DiaDiem = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, diaDiem);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                String toa = rs.getString("Toa");
                dsToa.add(toa);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }
        return dsToa;
    }

    public List<String> findListDiaDiem() {
        List<String> dsToa = new ArrayList<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT DISTINCT DiaDiem FROM phongthuchanh";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                String diaDiem = rs.getString("DiaDiem");
                dsToa.add(diaDiem);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }
        return dsToa;
    }

    public List<PhongThucHanh> findAllByDiaDiemAndToa(String diaDiem, String toa) {
        List<PhongThucHanh> dsPhongThucHanh = new ArrayList();

        try {
            Connection c = Jdbc.getConnection();
            StringBuilder queryBuilder = new StringBuilder("SELECT * FROM phongthuchanh ");

            if (!diaDiem.isBlank() || !toa.isBlank()) {
                queryBuilder.append(" Where ");
                if (!diaDiem.isBlank()) {
                    queryBuilder.append("LOWER(DiaDiem) LIKE LOWER(?)");
                }

                if (!toa.isBlank()) {
                    if (!diaDiem.isBlank()) {
                        queryBuilder.append(" AND ");
                    }
                    queryBuilder.append("LOWER(Toa) LIKE LOWER(?)");
                }

                PreparedStatement stm = c.prepareStatement(queryBuilder.toString());

                int parameterIndex = 1;

                if (!diaDiem.isBlank()) {
                    stm.setString(parameterIndex++, "%" + diaDiem + "%");
                }

                if (!toa.isBlank()) {
                    stm.setString(parameterIndex, "%" + toa + "%");
                }

                ResultSet rs = stm.executeQuery();

                while (rs.next()) {
                    PhongThucHanh phongThucHanh = new PhongThucHanh(
                            rs.getInt("MaPhongThucHanh"),
                            rs.getString("TenPhong"),
                            rs.getString("LoaiPhong"),
                            rs.getString("DiaDiem"),
                            rs.getInt("SucChua"),
                            rs.getString("TinhTrang"),
                            rs.getString("Toa")
                    );
                    dsPhongThucHanh.add(phongThucHanh);
                }
            } else {
                PreparedStatement stm = c.prepareStatement(queryBuilder.toString());
                ResultSet rs = stm.executeQuery();

                while (rs.next()) {
                    PhongThucHanh phongThucHanh = new PhongThucHanh(
                            rs.getInt("MaPhongThucHanh"),
                            rs.getString("TenPhong"),
                            rs.getString("LoaiPhong"),
                            rs.getString("DiaDiem"),
                            rs.getInt("SucChua"),
                            rs.getString("TinhTrang"),
                            rs.getString("Toa")
                    );
                    dsPhongThucHanh.add(phongThucHanh);
                }

            }
            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return dsPhongThucHanh;
    }
    
     public Map<Integer, String> findAllPhongByToa(String toa) {
        Map<Integer, String> phongMap = new LinkedHashMap<>();

        try {
            Connection c = Jdbc.getConnection();
            String query = "SELECT * FROM phongthuchanh WHERE LOWER(Toa) LIKE LOWER(?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, "%" + toa + "%");
            ResultSet rs = stm.executeQuery();

            while (rs.next()) {
                int idPhong = rs.getInt("MaPhongThucHanh");
                String tenPhong = rs.getString("TenPhong");
                phongMap.put(idPhong, tenPhong);
            }

            Jdbc.closeConnection(c);
        } catch (SQLException var7) {
            var7.printStackTrace();
        }

        return phongMap;
    }

}
