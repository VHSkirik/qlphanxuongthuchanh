package views.panel.giaovien;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.DatPhong;
import services.DatPhongService;
import views.models.CurrentUser;

public class GiaoVienYeuCau extends javax.swing.JPanel {

    private final DatPhongService datPhongService = new DatPhongService();
    private DefaultTableModel dtm;

    public GiaoVienYeuCau() {
        initComponents();
        dtm = (DefaultTableModel) tbDatPhong.getModel();
        myInit();
    }

    private void myInit() {
        lbMaGiaoVien.setText(CurrentUser.getNguoiDung().getMaNguoiDung() + "");
        initImage();
        initDataTable();
    }

    private void initImage() {
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/request_black.svg", 40, 40));
        btGui.setIcon(new FlatSVGIcon("./views/icon/svg/Checkmark.svg", 50, 50));
        btReSet.setIcon(new FlatSVGIcon("./views/icon/svg/reset.svg", 50, 50));
    }

    private void initDataTable() {
        List<DatPhong> dsDatPhong = datPhongService.get("MaNguoiDung", CurrentUser.getNguoiDung().getMaNguoiDung() + "");
        for (DatPhong datPhong : dsDatPhong) {
            dtm.addRow(new Object[]{
                datPhong.getMaYeuCau(),
                datPhong.getNgayThucHanh(),
                datPhong.getTrangThai()
            });
        }
    }

    public JTextField getTxtMaPhong() {
        return this.lbMaPhong;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatPhong = new javax.swing.JTable();
        pnChiTiet = new views.panel.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        lbMaYeuCau = new javax.swing.JTextField();
        lbMaGiaoVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbMaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbThoiGian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbMucDich = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbTietBatDau = new javax.swing.JTextField();
        lbTietKetThuc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btChonPhong = new javax.swing.JButton();
        btGui = new javax.swing.JButton();
        btReSet = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        tbDatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Ngày", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbDatPhong);

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Mã Yêu Cầu");

        lbMaYeuCau.setBackground(new java.awt.Color(255, 255, 255));
        lbMaYeuCau.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbMaYeuCau.setForeground(new java.awt.Color(0, 0, 0));
        lbMaYeuCau.setEnabled(false);

        lbMaGiaoVien.setBackground(new java.awt.Color(255, 255, 255));
        lbMaGiaoVien.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbMaGiaoVien.setForeground(new java.awt.Color(0, 0, 0));
        lbMaGiaoVien.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Mã Phòng");

        lbMaPhong.setBackground(new java.awt.Color(255, 255, 255));
        lbMaPhong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbMaPhong.setForeground(new java.awt.Color(0, 0, 0));
        lbMaPhong.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Thời Gian(y/M/d)");

        lbThoiGian.setBackground(new java.awt.Color(255, 255, 255));
        lbThoiGian.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbThoiGian.setForeground(new java.awt.Color(0, 0, 0));
        lbThoiGian.setText("____/__/__");

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Mã Giáo Viên");

        lbMucDich.setBackground(new java.awt.Color(255, 255, 255));
        lbMucDich.setColumns(20);
        lbMucDich.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbMucDich.setForeground(new java.awt.Color(0, 0, 0));
        lbMucDich.setRows(5);
        jScrollPane2.setViewportView(lbMucDich);

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Môn Học");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Chi Tiết Yêu Cầu");

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Tiết");

        lbTietBatDau.setBackground(new java.awt.Color(255, 255, 255));
        lbTietBatDau.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbTietBatDau.setForeground(new java.awt.Color(0, 0, 0));

        lbTietKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        lbTietKetThuc.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbTietKetThuc.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Đến");

        btChonPhong.setText("Chọn");
        btChonPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonPhongActionPerformed(evt);
            }
        });

        btGui.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btGui.setText("GỬI");
        btGui.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btGui.setIconTextGap(0);
        btGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuiActionPerformed(evt);
            }
        });

        btReSet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btReSet.setText("RESET");
        btReSet.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btReSet.setIconTextGap(0);
        btReSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReSetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnChiTietLayout = new javax.swing.GroupLayout(pnChiTiet);
        pnChiTiet.setLayout(pnChiTietLayout);
        pnChiTietLayout.setHorizontalGroup(
            pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChiTietLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChiTietLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChiTietLayout.createSequentialGroup()
                        .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnChiTietLayout.createSequentialGroup()
                                .addComponent(btGui, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btReSet, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbMaGiaoVien, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaYeuCau, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnChiTietLayout.createSequentialGroup()
                                .addComponent(lbTietBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbTietKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbThoiGian, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnChiTietLayout.createSequentialGroup()
                                .addComponent(lbMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btChonPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(48, 48, 48))))
        );
        pnChiTietLayout.setVerticalGroup(
            pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChiTietLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaYeuCau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChonPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTietBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTietKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btReSet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btGui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(102, 102, 102));
        lbTitle.setText("Danh Sách Yêu Cầu");
        lbTitle.setIconTextGap(1);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(pnChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(pnChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(0, 31, Short.MAX_VALUE)
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
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

    private void btReSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReSetActionPerformed

        lbMaPhong.setText("");
        lbThoiGian.setText("____/__/__");
        lbTietBatDau.setText("");
        lbTietKetThuc.setText("");
        lbMucDich.setText("");
    }//GEN-LAST:event_btReSetActionPerformed

    private void btChonPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonPhongActionPerformed
        new ChonPhongDiaLog(this, new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btChonPhongActionPerformed

    private void btGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuiActionPerformed
        try {
            int maPhong = Integer.parseInt(lbMaPhong.getText());
            int maGiaoVien = Integer.parseInt(lbMaGiaoVien.getText());
            String thoiGian = lbThoiGian.getText();
            int tietBatDau = Integer.parseInt(lbTietBatDau.getText());
            int tietKetThuc = Integer.parseInt(lbTietKetThuc.getText());
            String monHoc = lbMucDich.getText();

            if (thoiGian.isBlank() || monHoc.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin.");
                return;
            }
            
            int rs = JOptionPane.showConfirmDialog(this, "Xác nhận yêu cầu?","Xác Nhận",JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION){
                
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Dữ liệu không hợp lệ.");
        }
    }//GEN-LAST:event_btGuiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChonPhong;
    private javax.swing.JButton btGui;
    private javax.swing.JButton btReSet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lbMaGiaoVien;
    private javax.swing.JTextField lbMaPhong;
    private javax.swing.JTextField lbMaYeuCau;
    private javax.swing.JTextArea lbMucDich;
    private javax.swing.JTextField lbThoiGian;
    private javax.swing.JTextField lbTietBatDau;
    private javax.swing.JTextField lbTietKetThuc;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.PanelBorder pnChiTiet;
    private javax.swing.JTable tbDatPhong;
    // End of variables declaration//GEN-END:variables
}
