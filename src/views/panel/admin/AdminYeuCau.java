package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.DatPhong;
import services.DatPhongService;

public class AdminYeuCau extends javax.swing.JPanel {

    private List<DatPhong> dsDatPhong;
    private DefaultTableModel dtmDatPhong;
    private DatPhongService datPhongService;

    public AdminYeuCau() {
        initComponents();
        dtmDatPhong = (DefaultTableModel) tbYeuCau.getModel();
        datPhongService = new DatPhongService();
        tbYeuCau.getColumnModel().getColumn(0).setPreferredWidth(5);
        tbYeuCau.setAutoCreateRowSorter(true);
        myInit();
    }

    private void myInit() {
        initImage();
        initData();
    }

    private void initImage() {
        btChapNhan.setIcon(new FlatSVGIcon("./views/icon/svg/Checkmark.svg", 45, 45));
        btTuChoi.setIcon(new FlatSVGIcon("./views/icon/svg/Cancel_2.svg", 45, 45));
    }

    private void initData() {
        initTable();
    }

    private void initTable() {
        dsDatPhong = datPhongService.getAll();
        initTableFromList(dsDatPhong);
    }

    private void initTableFromList(List<DatPhong> dsDatPhongHienTai) {
        dtmDatPhong.setRowCount(0);
        for (DatPhong datPhong : dsDatPhongHienTai) {
            dtmDatPhong.addRow(new Object[]{
                datPhong.getMaYeuCau(),
                datPhong.getMaNguoiDung(),
                datPhong.getMaPhongThucHanh(),
                datPhong.getTrangThai()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbYeuCau = new javax.swing.JTable();
        cbTuyChon = new javax.swing.JComboBox<>();
        pnChiTiet = new views.panel.PanelBorder();
        jLabel2 = new javax.swing.JLabel();
        lbMaYeuCau = new javax.swing.JTextField();
        lbMaGiaoVien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbMaPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbThoiGian = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbMucDich = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbTietBatDau = new javax.swing.JTextField();
        lbTietKetThuc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btChapNhan = new javax.swing.JButton();
        btTuChoi = new javax.swing.JButton();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tùy Chọn");

        jScrollPane2.setBorder(null);

        tbYeuCau.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tbYeuCau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã Giáo Viên", "Mã Phòng", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbYeuCau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbYeuCauMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbYeuCau);

        cbTuyChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Đang Chờ", "Đã Duyệt", "Từ Chối" }));
        cbTuyChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTuyChonActionPerformed(evt);
            }
        });

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
        jLabel4.setText("Thời Gian");

        lbThoiGian.setBackground(new java.awt.Color(255, 255, 255));
        lbThoiGian.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbThoiGian.setForeground(new java.awt.Color(0, 0, 0));
        lbThoiGian.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Mã Giáo Viên");

        lbMucDich.setBackground(new java.awt.Color(255, 255, 255));
        lbMucDich.setColumns(20);
        lbMucDich.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbMucDich.setForeground(new java.awt.Color(0, 0, 0));
        lbMucDich.setRows(5);
        lbMucDich.setEnabled(false);
        jScrollPane1.setViewportView(lbMucDich);

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Mục Đích");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Chi Tiết Yêu Cầu");

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Tiết");

        lbTietBatDau.setBackground(new java.awt.Color(255, 255, 255));
        lbTietBatDau.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbTietBatDau.setForeground(new java.awt.Color(0, 0, 0));
        lbTietBatDau.setEnabled(false);

        lbTietKetThuc.setBackground(new java.awt.Color(255, 255, 255));
        lbTietKetThuc.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbTietKetThuc.setForeground(new java.awt.Color(0, 0, 0));
        lbTietKetThuc.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Đến");

        javax.swing.GroupLayout pnChiTietLayout = new javax.swing.GroupLayout(pnChiTiet);
        pnChiTiet.setLayout(pnChiTietLayout);
        pnChiTietLayout.setHorizontalGroup(
            pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChiTietLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChiTietLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChiTietLayout.createSequentialGroup()
                        .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMaPhong)
                            .addComponent(lbMaGiaoVien)
                            .addComponent(lbMaYeuCau)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChiTietLayout.createSequentialGroup()
                                .addComponent(lbTietBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbTietKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbThoiGian))
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
                    .addComponent(lbMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        btChapNhan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btChapNhan.setForeground(new java.awt.Color(0, 0, 0));
        btChapNhan.setText("Chấp Nhận");
        btChapNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btChapNhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btChapNhan.setIconTextGap(0);
        btChapNhan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btTuChoi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btTuChoi.setForeground(new java.awt.Color(0, 0, 0));
        btTuChoi.setText("Từ Chối");
        btTuChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTuChoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTuChoi.setIconTextGap(0);
        btTuChoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTuyChon, 0, 263, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(btChapNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btTuChoi, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTuyChon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(pnChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btChapNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(btTuChoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
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
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbYeuCauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbYeuCauMouseClicked
        int currentRow = tbYeuCau.getSelectedRow();
        if (currentRow != -1) {
            DatPhong datPhong = datPhongService.get("MaYeuCau", tbYeuCau.getValueAt(currentRow, 0).toString()).get(0);
            if (datPhong != null) {
                lbMaYeuCau.setText(datPhong.getMaYeuCau() + "");
                lbMaGiaoVien.setText(datPhong.getMaNguoiDung() + "");
                lbMaPhong.setText(datPhong.getMaPhongThucHanh() + "");
                lbThoiGian.setText(datPhong.getNgayThucHanh());
                lbMucDich.setText(datPhong.getMonHoc());
                lbTietBatDau.setText(datPhong.getTietBatDau() + "");
                lbTietKetThuc.setText(datPhong.getTietKetThuc() + "");
            }
        }
    }//GEN-LAST:event_tbYeuCauMouseClicked

    private void cbTuyChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTuyChonActionPerformed
        if (cbTuyChon.getSelectedIndex() == 0) {
            initTableFromList(dsDatPhong);
        } else if (cbTuyChon.getSelectedIndex() == 1){
            initTableFromList(datPhongService.get("TrangThai", "DangCho"));
        }  else if (cbTuyChon.getSelectedIndex() == 2){
            initTableFromList(datPhongService.get("TrangThai", "DaPheDuyet"));
        }  else {
            initTableFromList(datPhongService.get("TrangThai", "TuCHoi"));
        }
    }//GEN-LAST:event_cbTuyChonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChapNhan;
    private javax.swing.JButton btTuChoi;
    private javax.swing.JComboBox<String> cbTuyChon;
    private javax.swing.JLabel jLabel1;
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
    private views.panel.PanelBorder panelBorder1;
    private views.panel.PanelBorder pnChiTiet;
    private javax.swing.JTable tbYeuCau;
    // End of variables declaration//GEN-END:variables
}
