package views.panel.canbo;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import services.ThongKeService;

public class ThongKeBang extends javax.swing.JPanel {

    private DefaultTableModel dtmThietBi;
    private DefaultTableModel dtmPhong;
    private ThongKeService thongKeService;

    public ThongKeBang() {
        initComponents();
        thongKeService = new ThongKeService();
        myInit();

    }

    private void myInit() {
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/Chart.svg", 45, 45));
        initComboBox();
        initTableModel();
        initDataTable();
        if (tbMain.getColumnModel().getColumnCount() > 0) {
            tbMain.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(4).setPreferredWidth(100);
        }
    }

    private void initComboBox() {
        List<String> dsCoSo = thongKeService.getDanhSachCoSo();
        for (String coSo : dsCoSo) {
            cbCoSo.addItem(coSo);
        }
    }

    private void initTableModel() {
        //
        dtmThietBi = new DefaultTableModel(
                new Object[][]{},
                new String[]{"", "Mới", "Cũ", "Hỏng", "Tổng"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }
        };

        //
        dtmPhong = new DefaultTableModel(
                new Object[][]{},
                new String[]{"", "Sẵn Sàng", "Đang Được Sử Dụng", "Bảo Trì", "Tổng"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }
        };
    }

    private void initDataTable() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();
        cbCoSo = new javax.swing.JComboBox<>();
        cbDoiTuong = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        tbMain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMain);

        cbCoSo.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbCoSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCoSoActionPerformed(evt);
            }
        });

        cbDoiTuong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbDoiTuong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Phòng", "Thiết Bị" }));
        cbDoiTuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDoiTuongActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cơ Sở");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Đối tượng");

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(127, 127, 127));
        lbTitle.setText("Thống Kê Chung");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(cbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(cbDoiTuong, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE))
                        .addGap(25, 25, 25))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDoiTuong, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbDoiTuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDoiTuongActionPerformed
        if (cbDoiTuong.getSelectedIndex() != 0 && cbCoSo.getSelectedItem() != null) {
            if (cbDoiTuong.getSelectedIndex() == 1) {

                String coSo = cbCoSo.getSelectedItem().toString();
                List<String> dsLoaiPhong = thongKeService.getLoaiPhongTheoCoSo(coSo);
                dtmPhong.setRowCount(0);
                for (String loai : dsLoaiPhong) {
                    int sanSang = thongKeService.getSoPhongTheoLoaiTinhTrang(coSo, loai, "SanSang");
                    int dangSuDung = thongKeService.getSoPhongTheoLoaiTinhTrang(coSo, loai, "DaDuocSuDung");
                    int baoTri = thongKeService.getSoThietBiTheoLoaiTinhTrang(coSo, loai, "DangSuaChua");
                    int tong = sanSang + dangSuDung + baoTri;
                    dtmPhong.addRow(new Object[]{
                        loai,
                        sanSang,
                        dangSuDung,
                        baoTri,
                        tong
                    });
                }
                dtmPhong.addRow(new Object[]{"", "", "", "", thongKeService.getTongPhongTheoCoSo(coSo)});
                tbMain.setModel(dtmPhong);

            } else {

                String coSo = cbCoSo.getSelectedItem().toString();
                List<String> dsLoaiThietBi = thongKeService.getLoaiThietBiTheoCoSo(coSo);
                dtmThietBi.setRowCount(0);
                for (String loai : dsLoaiThietBi) {
                    int moi = thongKeService.getSoThietBiTheoLoaiTinhTrang(coSo, loai, "Moi");
                    int cu = thongKeService.getSoThietBiTheoLoaiTinhTrang(coSo, loai, "Cu");
                    int hong = thongKeService.getSoThietBiTheoLoaiTinhTrang(coSo, loai, "Hon");
                    int tong = moi + cu + hong;
                    dtmThietBi.addRow(new Object[]{
                        loai,
                        moi,
                        cu,
                        hong,
                        tong
                    });
                }
                dtmThietBi.addRow(new Object[]{"", "", "", "", thongKeService.getTongThietBiTheoCoSo(coSo)});
                tbMain.setModel(dtmThietBi);
            }
        }
    }//GEN-LAST:event_cbDoiTuongActionPerformed

    private void cbCoSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCoSoActionPerformed
        cbDoiTuong.setSelectedIndex(0);
    }//GEN-LAST:event_cbCoSoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCoSo;
    private javax.swing.JComboBox<String> cbDoiTuong;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTable tbMain;
    // End of variables declaration//GEN-END:variables
}
