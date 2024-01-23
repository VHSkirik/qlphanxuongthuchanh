
package views.panel.admin;

import javax.swing.JOptionPane;

public class ThietBiDialog extends javax.swing.JDialog {

    public ThietBiDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new views.panel.PanelBorder();
        lbMaThietBi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbTenThietBi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbLoaiThietBi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTinhTrang = new javax.swing.JComboBox<>();
        btHuy = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        panelBorderHalf1 = new views.panel.PanelBorderHalf();
        lbTitle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbNgaySuDung = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbTenPhong = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbMoTa = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        cbTenPhong1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setForeground(new java.awt.Color(102, 102, 102));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMaThietBi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbMaThietBi.setEnabled(false);
        pnMain.add(lbMaThietBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Mã thiết bị");
        pnMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 20));

        lbTenThietBi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbTenThietBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tên thiết bị");
        pnMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        lbLoaiThietBi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbLoaiThietBi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Loại thiết bị");
        pnMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tình trạng");
        pnMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 140, 20));

        cbTinhTrang.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cu", "Moi", "Hong" }));
        pnMain.add(cbTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 330, 40));

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
        pnMain.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 140, 40));

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
        jLabel6.setText("Ngày sử dụng (mm/dd/yyyy)");
        pnMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 240, 20));

        lbNgaySuDung.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbNgaySuDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 330, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Mô tả");
        pnMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 140, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tên Phòng");
        pnMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 20));

        cbTenPhong.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        pnMain.add(cbTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 330, 40));

        lbMoTa.setColumns(20);
        lbMoTa.setRows(5);
        jScrollPane1.setViewportView(lbMoTa);

        pnMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 330, 110));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Cơ sở");
        pnMain.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 20));

        cbTenPhong1.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        cbTenPhong1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lĩnh Nam", "Mỹ Xá", "Minh Khai" }));
        pnMain.add(cbTenPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        int rs = JOptionPane.showConfirmDialog(this, "Hủy bản ghi hiện tại?", "Hủy", JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
        this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        try {
            String tenPhong = lbTenThietBi.getText();
            String loaiPhong = lbLoaiThietBi.getText();
            String diaDiem = lbNgaySuDung.getText();
            String sucChua = lbMoTa.getText();
            String tinhTrang = cbTinhTrang.getSelectedItem().toString();

            if (tenPhong.isBlank() || loaiPhong.isBlank() || diaDiem.isBlank() || tinhTrang.isBlank() || sucChua.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin.");
                return;
            }

//            PhongThucHanhService phongThucHanhService = new PhongThucHanhService();
//
//            if (function == 0){
//                //create
//                OperationResult os = phongThucHanhService.createPhongThucHanh(tenPhong, loaiPhong, diaDiem, Integer.parseInt(sucChua), tinhTrang);
//                if (os.isSuccess()){
//                    JOptionPane.showMessageDialog(this, "Thêm thành công.");
//                    mainForm.initTable();
//                    this.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Thêm thất bại.");
//                }
//            } else {
//                //edit
//                OperationResult os = phongThucHanhService.updatePhongThucHanh(phongThucHanh.getMaPhongThucHanh(), tenPhong, loaiPhong, diaDiem, Integer.parseInt(sucChua), tinhTrang);
//                if (os.isSuccess()){
//                    JOptionPane.showMessageDialog(this, "Sửa thành công.");
//                    mainForm.initTable();
//                    this.dispose();
//                } else {
//                    JOptionPane.showMessageDialog(this, "Sửa thất bại.");
//                }
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thông tin không hợp lệ.");
        }
    }//GEN-LAST:event_btSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbTenPhong;
    private javax.swing.JComboBox<String> cbTenPhong1;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbLoaiThietBi;
    private javax.swing.JTextField lbMaThietBi;
    private javax.swing.JTextArea lbMoTa;
    private javax.swing.JTextField lbNgaySuDung;
    private javax.swing.JTextField lbTenThietBi;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorderHalf panelBorderHalf1;
    private views.panel.PanelBorder pnMain;
    // End of variables declaration//GEN-END:variables
}
