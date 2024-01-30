package views.panel.giaovien;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.sun.source.tree.BreakTree;
import dao.impl.PhongThucHanhDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.LichThucHanh2;
import models.PhanHoi;
import services.LichThucHanhService;
import services.PhanHoiService;
import views.models.CurrentUser;

public class GiaoVienPhanHoi extends javax.swing.JPanel {

    private LichThucHanhService lichThucHanhService;
    private PhanHoiService phanHoiService;
    private DefaultTableModel dtm;

    public GiaoVienPhanHoi() {
        initComponents();
        lichThucHanhService = new LichThucHanhService();
        phanHoiService = new PhanHoiService();
        dtm = (DefaultTableModel) tbLich.getModel();
        myInit();
    }

    private void myInit() {
        initImage();
        initData();
    }

    private void initImage() {
        lbChiTiet.setIcon(new FlatSVGIcon("./views/icon/svg/infor_black.svg", 30, 30));
        lbLich.setIcon(new FlatSVGIcon("./views/icon/svg/date_black.svg", 40, 40));
        btCapNhat.setIcon(new FlatSVGIcon("./views/icon/svg/Checkmark.svg", 50, 50));
        btReset.setIcon(new FlatSVGIcon("./views/icon/svg/reset.svg", 50, 50));
    }

    private void initData() {
        initTable();
    }

    private void initTable() {
        List<LichThucHanh2> dsLich = lichThucHanhService.get("MaNguoiDung", CurrentUser.getNguoiDung().getMaNguoiDung() + "");
        dtm.setRowCount(0);
        for (LichThucHanh2 lth : dsLich) {
            dtm.addRow(new Object[]{
                lth.getMaLichThucHanh(),
                PhongThucHanhDAO.getIns().findOne(lth.getMaPhongThucHanh()).getTenPhong(),
                lth.getNgayThucHanh(),
                lth.getTietBatDau(),
                lth.getTietKetTHuc(),
                lth.getMon()
            });
        }
    }
    
    private void changeState(boolean state){
        txtNoiDung.setEnabled(state);
        txtDiem.setEnabled(state);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLich = new javax.swing.JTable();
        lbLich = new javax.swing.JLabel();
        lbChiTiet = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhanHoi = new javax.swing.JTextField();
        txtMaLich = new javax.swing.JTextField();
        txtDiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNoiDung = new javax.swing.JTextArea();
        btReset = new javax.swing.JButton();
        btCapNhat = new javax.swing.JButton();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        tbLich.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tbLich.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Lịch", "Phòng", "Ngày", "Tiết BD", "Tiết KT", "Môn Học"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLichMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbLichMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbLich);
        if (tbLich.getColumnModel().getColumnCount() > 0) {
            tbLich.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbLich.getColumnModel().getColumn(1).setPreferredWidth(20);
            tbLich.getColumnModel().getColumn(2).setPreferredWidth(20);
            tbLich.getColumnModel().getColumn(3).setPreferredWidth(1);
            tbLich.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        lbLich.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbLich.setForeground(new java.awt.Color(127, 127, 127));
        lbLich.setText("Lịch thực hành");

        lbChiTiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbChiTiet.setForeground(new java.awt.Color(127, 127, 127));
        lbChiTiet.setText("Chi tiết phản hồi");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Mã Phản Hồi");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nội Dung");

        txtMaPhanHoi.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtMaPhanHoi.setEnabled(false);

        txtMaLich.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtMaLich.setEnabled(false);

        txtDiem.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtDiem.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Điểm");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mã Lịch");

        txtNoiDung.setColumns(20);
        txtNoiDung.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtNoiDung.setRows(5);
        txtNoiDung.setEnabled(false);
        jScrollPane2.setViewportView(txtNoiDung);

        btReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btReset.setText("Làm Mới");
        btReset.setIconTextGap(0);

        btCapNhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCapNhat.setText("Cập Nhật");
        btCapNhat.setIconTextGap(0);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1)
                .addGap(6, 6, 6))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbLich, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(txtMaLich, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelBorder1Layout.createSequentialGroup()
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(5, 5, 5)
                                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMaPhanHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lbChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(txtMaPhanHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMaLich, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbLich, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbLichMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLichMouseClicked
        int currentRow = tbLich.getSelectedRow();
        if (currentRow != -1){
            int maLich = Integer.parseInt(tbLich.getValueAt(currentRow, 0).toString());
            txtMaLich.setText(maLich+"");
            PhanHoi phanHoi = phanHoiService.get("MaLichThucHanh", maLich+"").get(0);
            if (phanHoi != null) {
                txtMaPhanHoi.setText("");
                txtDiem.setText("");
                txtNoiDung.setText("");
                changeState(true);
            } else {
                txtMaPhanHoi.setText(phanHoi.getMaPhanHoi()+"");
                txtMaLich.setText(phanHoi.getMaLichThucHanh()+"");
            }
        }
    }//GEN-LAST:event_tbLichMouseClicked

    private void tbLichMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLichMousePressed
        tbLichMouseClicked(evt);
    }//GEN-LAST:event_tbLichMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbChiTiet;
    private javax.swing.JLabel lbLich;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTable tbLich;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtMaLich;
    private javax.swing.JTextField txtMaPhanHoi;
    private javax.swing.JTextArea txtNoiDung;
    // End of variables declaration//GEN-END:variables
}
