package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.impl.LichThucHanhDAO2;
import dao.impl.PhongThucHanhDAO;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.NguoiDung;
import models.PhanHoi;
import models.PhongThucHanh;
import services.PhanHoiService;
import views.models.CurrentUser;

public class AdminPhanHoi extends javax.swing.JPanel {

    private List<PhanHoi> dsPhanHoi;
    private DefaultTableModel dtm;
    private PhanHoiService phanHoiService;
    private JTextField txtTimKiem;
    private JComboBox<String> cbTuyChon;

    public AdminPhanHoi() {
        initComponents();
        dtm = (DefaultTableModel) tbPhanHoi.getModel();
        phanHoiService = new PhanHoiService();
        txtTimKiem = pnTimKiem.getTextFieldTK();
        cbTuyChon = pnTimKiem.getCbTuyChonTK();
        myInit();
    }

    private void myInit() {
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/feedback_black.svg", 45, 45));
        initTable();
        initTimKiem();
    }

    private void initTable() {
        dsPhanHoi = phanHoiService.getAll();
        NguoiDung nguoiDung = CurrentUser.getNguoiDung();
        String coSo = nguoiDung.getCoSo();
        if (!nguoiDung.getLoaiNguoiDung().equals("Admin")){
            List<PhanHoi> dsPhanHoiMoi = new ArrayList<>();
            for (PhanHoi phanHoi : dsPhanHoi){
                int maLich = phanHoi.getMaLichThucHanh();
                int maPhong = LichThucHanhDAO2.getIns().findOne(maLich).getMaPhongThucHanh();
                PhongThucHanh phongThucHanh = PhongThucHanhDAO.getIns().findOne(maPhong);
                if (phongThucHanh.getDiaDiem().equals(coSo)){
                    dsPhanHoiMoi.add(phanHoi);
                }
            }
            dsPhanHoi = dsPhanHoiMoi;
        }
        dtm.setRowCount(0);
        for (PhanHoi phanHoi : dsPhanHoi) {
            dtm.addRow(new Object[]{
                phanHoi.getMaPhanHoi(),
                phanHoi.getMaLichThucHanh(),
                phanHoi.getNoiDung(),
                phanHoi.getDiemDanhGia()
            });
        }
    }

    private void initTimKiem() {
        cbTuyChon.addItem("Mã Phản Hồi");
        cbTuyChon.addActionListener((e) -> {
            txtTimKiem.setText("");
            initTable();
        });
        txtTimKiem.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String value = txtTimKiem.getText();
                if (!value.isBlank()) {
                    dtm.setRowCount(0);
                    for (PhanHoi phanHoi : dsPhanHoi) {
                        if ((phanHoi.getMaPhanHoi() + "").contains(value)) {
                            dtm.addRow(new Object[]{
                                phanHoi.getMaPhanHoi(),
                                phanHoi.getMaLichThucHanh(),
                                phanHoi.getNoiDung(),
                                phanHoi.getDiemDanhGia()
                            });
                        }
                    }
                } else {
                    initTable();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        pnTimKiem = new views.panel.Header();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhanHoi = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        pnTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbPhanHoi.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tbPhanHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phản Hồi", "Mã Lịch", "Nội Dung", "Điểm"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPhanHoi);
        if (tbPhanHoi.getColumnModel().getColumnCount() > 0) {
            tbPhanHoi.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbPhanHoi.getColumnModel().getColumn(1).setPreferredWidth(5);
            tbPhanHoi.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbPhanHoi.getColumnModel().getColumn(3).setPreferredWidth(5);
        }

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(127, 127, 127));
        lbTitle.setText("Danh sách phản hồi");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addGap(41, 41, 41))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.Header pnTimKiem;
    private javax.swing.JTable tbPhanHoi;
    // End of variables declaration//GEN-END:variables
}
