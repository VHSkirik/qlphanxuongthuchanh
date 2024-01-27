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
        myInit();
    }
    
    private void myInit(){
        initImage();
        initData();
    }
    
    private void initImage(){
        btChapNhan.setIcon(new FlatSVGIcon("./views/icon/svg/accept.svg",45,45));
        btTuChoi.setIcon(new FlatSVGIcon("./views/icon/svg/reject.svg",45,45));
        btXoa.setIcon(new FlatSVGIcon("./views/icon/svg/delete.svg",45,45));
    }
    
    private void initData(){
        initTable();
    }
    
    private void initTable(){
        dsDatPhong = datPhongService.getAll();
        dtmDatPhong.setRowCount(0);
        for (DatPhong datPhong : dsDatPhong){
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
        jComboBox1 = new javax.swing.JComboBox<>();
        header3 = new views.panel.Header();
        jToolBar3 = new javax.swing.JToolBar();
        btChapNhan = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btTuChoi = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btXoa = new javax.swing.JButton();
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

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sắp xếp ");

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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định" }));

        header3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar3.setRollover(true);

        btChapNhan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btChapNhan.setForeground(new java.awt.Color(0, 0, 0));
        btChapNhan.setText("Chấp Nhận");
        btChapNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btChapNhan.setFocusable(false);
        btChapNhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btChapNhan.setIconTextGap(0);
        btChapNhan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btChapNhan);
        jToolBar3.add(jSeparator1);

        btTuChoi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btTuChoi.setForeground(new java.awt.Color(0, 0, 0));
        btTuChoi.setText("Từ Chối");
        btTuChoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTuChoi.setFocusable(false);
        btTuChoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTuChoi.setIconTextGap(0);
        btTuChoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btTuChoi);
        jToolBar3.add(jSeparator2);

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btXoa.setForeground(new java.awt.Color(0, 0, 0));
        btXoa.setText("Xóa Yêu Cầu");
        btXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btXoa.setFocusable(false);
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoa.setIconTextGap(0);
        btXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btXoa);

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
                .addContainerGap(34, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pnChiTietLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

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
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(header3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addComponent(pnChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(pnChiTiet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(header3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
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
        if (currentRow != -1){
            DatPhong datPhong = datPhongService.get("MaYeuCau", tbYeuCau.getValueAt(currentRow, 0).toString()).get(0);
            if (datPhong != null){
                lbMaYeuCau.setText(datPhong.getMaYeuCau()+"");
                lbMaGiaoVien.setText(datPhong.getMaNguoiDung()+"");
                lbMaPhong.setText(datPhong.getMaPhongThucHanh()+"");
                lbThoiGian.setText(datPhong.getNgayThucHanh());
                lbMucDich.setText(datPhong.getMonHoc());
                lbTietBatDau.setText(datPhong.getTietBatDau()+"");
                lbTietKetThuc.setText(datPhong.getTietKetThuc()+"");
            }
        }
    }//GEN-LAST:event_tbYeuCauMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChapNhan;
    private javax.swing.JButton btTuChoi;
    private javax.swing.JButton btXoa;
    private views.panel.Header header3;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar3;
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
