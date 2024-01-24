package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.OperationResult;
import models.PhongThucHanh;
import services.PhongThucHanhService;
import views.FormInterface;

public class PhongDialog extends javax.swing.JDialog {
    
    private FormInterface mainForm;
    private PhongThucHanh phongThucHanh;
    private int function;
    
    public PhongDialog(FormInterface mainForm, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.mainForm = mainForm;
        function = 0;
        setUndecorated(true);
        initComponents();
        myInit();
    }
    
    public PhongDialog(FormInterface mainForm, java.awt.Frame parent, boolean modal, PhongThucHanh phongThucHanh) {
        super(parent, modal);
        this.mainForm = mainForm;
        this.phongThucHanh = phongThucHanh;
        function = 1;
        setUndecorated(true);
        initComponents();
        myInit();
    }
    
    private void myInit() {
        setBackground(new Color(255, 255, 255, 0));
        pnMain.setDrawBorder(true);
        initImage();
        if (function == 1) {
            lbTitle.setText("SỬA PHÒNG THỰC HÀNH");
            initData();
        }
    }
    
    private void initImage() {
        btSubmit.setIcon(new FlatSVGIcon("./views/icon/svg/Checkmark.svg", 40, 40));
        btHuy.setIcon(new FlatSVGIcon("./views/icon/svg/Cancel_2.svg", 40, 40));
    }
    
    private void initData() {
        try {
            lbMaPhong.setText(phongThucHanh.getMaPhongThucHanh() + "");
            lbTenPhong.setText(phongThucHanh.getTenPhong());
            lbLoaiPhong.setText(phongThucHanh.getLoaiPhong());
            lbDiaDiem.setText(phongThucHanh.getDiaDiem());
            lbSucChua.setText(phongThucHanh.getSucChua() + "");
            cbTinhTrang.setSelectedItem(phongThucHanh.getTinhTrang());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new views.panel.PanelBorder();
        lbMaPhong = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbTenPhong = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbLoaiPhong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTinhTrang = new javax.swing.JComboBox<>();
        btHuy = new javax.swing.JButton();
        btSubmit = new javax.swing.JButton();
        panelBorderHalf1 = new views.panel.PanelBorderHalf();
        lbTitle = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbDiaDiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lbSucChua = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setForeground(new java.awt.Color(102, 102, 102));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbMaPhong.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbMaPhong.setEnabled(false);
        pnMain.add(lbMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Mã phòng thực hành");
        pnMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 20));

        lbTenPhong.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tên phòng");
        pnMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        lbLoaiPhong.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Loại phòng");
        pnMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tình trạng");
        pnMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 20));

        cbTinhTrang.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        cbTinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SanSang", "DangSuaChua", "DaDuocSuDung" }));
        pnMain.add(cbTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 330, 40));

        btHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuy.setForeground(new java.awt.Color(255, 0, 0));
        btHuy.setText("HỦY");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        pnMain.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 150, 40));

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
        pnMain.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 150, 40));

        panelBorderHalf1.setBackground(new java.awt.Color(25, 118, 211));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("THÊM PHÒNG THỰC HÀNH");

        javax.swing.GroupLayout panelBorderHalf1Layout = new javax.swing.GroupLayout(panelBorderHalf1);
        panelBorderHalf1.setLayout(panelBorderHalf1Layout);
        panelBorderHalf1Layout.setHorizontalGroup(
            panelBorderHalf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderHalf1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorderHalf1Layout.setVerticalGroup(
            panelBorderHalf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderHalf1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnMain.add(panelBorderHalf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Địa điểm");
        pnMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 20));

        lbDiaDiem.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbDiaDiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Sức chứa");
        pnMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 20));

        lbSucChua.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbSucChua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
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
            String tenPhong = lbTenPhong.getText();
            String loaiPhong = lbLoaiPhong.getText();
            String diaDiem = lbDiaDiem.getText();
            String sucChua = lbSucChua.getText();
            String tinhTrang = cbTinhTrang.getSelectedItem().toString();
            
            if (tenPhong.isBlank() || loaiPhong.isBlank() || diaDiem.isBlank() || tinhTrang.isBlank() || sucChua.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin.");
                return;
            } 
            
            PhongThucHanhService phongThucHanhService = new PhongThucHanhService();
            
            if (function == 0){
                //create
                OperationResult os = phongThucHanhService.createPhongThucHanh(tenPhong, loaiPhong, diaDiem, Integer.parseInt(sucChua), tinhTrang);
                if (os.isSuccess()){
                    JOptionPane.showMessageDialog(this, "Thêm thành công.");
                    mainForm.initTable();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại.");
                }
            } else {
                //edit
                OperationResult os = phongThucHanhService.updatePhongThucHanh(phongThucHanh.getMaPhongThucHanh(), tenPhong, loaiPhong, diaDiem, Integer.parseInt(sucChua), tinhTrang);
                if (os.isSuccess()){
                    JOptionPane.showMessageDialog(this, "Sửa thành công.");
                    mainForm.initTable();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa thất bại.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thông tin không hợp lệ.");
        }
    }//GEN-LAST:event_btSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbTinhTrang;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lbDiaDiem;
    private javax.swing.JTextField lbLoaiPhong;
    private javax.swing.JTextField lbMaPhong;
    private javax.swing.JTextField lbSucChua;
    private javax.swing.JTextField lbTenPhong;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorderHalf panelBorderHalf1;
    private views.panel.PanelBorder pnMain;
    // End of variables declaration//GEN-END:variables
}
