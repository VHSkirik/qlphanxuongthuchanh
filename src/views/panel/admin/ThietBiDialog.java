package views.panel.admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import models.ResultReason;
import models.ThietBi;
import services.ThietBiService;
import views.UserFormInterface;

public class ThietBiDialog extends javax.swing.JDialog {

    private UserFormInterface main;
    private ThietBi thietBi;

    //create
    public ThietBiDialog(UserFormInterface main, java.awt.Frame parent, boolean modal, int idPhong) {
        super(parent, modal);
        this.main = main;
        initComponents();
        txtMaPhong.setText(idPhong + "");
        String today = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        txtNgaySuDung.setText(today);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new views.panel.PanelBorder();
        txtTenThietBi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLoaiThietBi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTinhTrang = new javax.swing.JComboBox<>();
        btHuy = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        panelBorderHalf1 = new views.panel.PanelBorderHalf();
        lbTitle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNgaySuDung = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        txtMaPhong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSoMay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setForeground(new java.awt.Color(102, 102, 102));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTenThietBi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(txtTenThietBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tên thiết bị");
        pnMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 20));

        txtLoaiThietBi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(txtLoaiThietBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Loại thiết bị");
        pnMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tình trạng");
        pnMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 140, 20));

        cbTinhTrang.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mới", "Cũ", "Hỏng" }));
        cbTinhTrang.setEnabled(false);
        pnMain.add(cbTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 330, 40));

        btHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuy.setForeground(new java.awt.Color(255, 0, 0));
        btHuy.setText("HỦY");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        pnMain.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 140, 40));

        btSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(25, 118, 211));
        btSubmit.setText("SUBMIT");
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.setIconTextGap(1);
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        pnMain.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 140, 40));

        panelBorderHalf1.setBackground(new java.awt.Color(25, 118, 211));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("THÊM THIẾT BỊ");

        javax.swing.GroupLayout panelBorderHalf1Layout = new javax.swing.GroupLayout(panelBorderHalf1);
        panelBorderHalf1.setLayout(panelBorderHalf1Layout);
        panelBorderHalf1Layout.setHorizontalGroup(
            panelBorderHalf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderHalf1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(193, 193, 193))
        );
        panelBorderHalf1Layout.setVerticalGroup(
            panelBorderHalf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderHalf1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnMain.add(panelBorderHalf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Ngày sử dụng (yyyy/MM/dd)");
        pnMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 20));

        txtNgaySuDung.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtNgaySuDung.setEnabled(false);
        pnMain.add(txtNgaySuDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 330, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Mô tả");
        pnMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, 20));

        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        jScrollPane1.setViewportView(txtMoTa);

        pnMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 330, 180));

        txtMaPhong.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtMaPhong.setEnabled(false);
        pnMain.add(txtMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Số Máy");
        pnMain.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 200, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Mã Phòng");
        pnMain.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 20));

        txtSoMay.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(txtSoMay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        int rs = JOptionPane.showConfirmDialog(this, "Hủy bản ghi hiện tại?", "Hủy", JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        try {
            String tenThietBi = txtTenThietBi.getText();
            String loaiThietBi = txtLoaiThietBi.getText();
            String maPhong = txtMaPhong.getText();
            String soMay = txtSoMay.getText();
            String ngaySuDung = txtNgaySuDung.getText();
            String moTa = txtMoTa.getText();
            String tinhTrang = cbTinhTrang.getSelectedItem().toString();

            if (tenThietBi.isBlank() || loaiThietBi.isBlank() || maPhong.isBlank() || soMay.isBlank() || tinhTrang.isBlank() || ngaySuDung.isBlank() || moTa.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin.");
                return;
            }

            ThietBiService thietBiService = new ThietBiService();

            if (thietBi == null) {
                //create
                ResultReason rr = thietBiService.createThietBi(tenThietBi, loaiThietBi, ngaySuDung, moTa, tinhTrang, Integer.parseInt(maPhong), Integer.parseInt(soMay));
                if (rr.ketQua().isSuccess()) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công.");
                    this.dispose();
                    main.initTable();
                } else {
                    JOptionPane.showMessageDialog(this, rr.lyDo());
                }
            } else {
                //update
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thông tin không hợp lệ.");
        }
    }//GEN-LAST:event_btSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorderHalf panelBorderHalf1;
    private views.panel.PanelBorder pnMain;
    private javax.swing.JTextField txtLoaiThietBi;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtNgaySuDung;
    private javax.swing.JTextField txtSoMay;
    private javax.swing.JTextField txtTenThietBi;
    // End of variables declaration//GEN-END:variables
}
