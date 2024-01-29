package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.NguoiDung;
import models.OperationResult;
import services.NguoiDungService;
import views.UserFormInterface;

public class NguoiDungDialog extends javax.swing.JDialog {

    private UserFormInterface mainForm;
    private NguoiDung nguoiDung;
    private String function;

    public NguoiDungDialog(UserFormInterface mainForm, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.mainForm = mainForm;
        function = "CREATE";
        setUndecorated(true);
        setBackground(new Color(255, 255, 255, 0));
        initComponents();
        pnMain.setDrawBorder(true);
        myInit();
    }

    //Constructer for edit 
    public NguoiDungDialog(UserFormInterface mainForm, java.awt.Frame parent, boolean modal, NguoiDung nguoiDung) {
        super(parent, modal);
        this.mainForm = mainForm;
        this.nguoiDung = nguoiDung;
        function = "EDIT";
        setUndecorated(true);
        setBackground(new Color(255, 255, 255, 0));
        initComponents();
        pnMain.setDrawBorder(true);
        myInit();
    }

    private void myInit() {
        initImage();
        if (function.equals("EDIT")) {
            initData();   
        }
    }

    private void initImage() {
        btThem.setIcon(new FlatSVGIcon("./views/icon/svg/Checkmark.svg", 40, 40));
        btHuy.setIcon(new FlatSVGIcon("./views/icon/svg/Cancel_2.svg", 40, 40));
    }
    
    private void initData(){
        lbTitle.setText("CẬP NHẬT TÀI KHOẢN NGƯỜI DÙNG");
        lbTenDangNhap.setText(nguoiDung.getTenDangNhap());
        lbMatKhau.setText(nguoiDung.getMatKhau());
        lbEmail.setText(nguoiDung.getEmail());
        cbLoaiND.setSelectedItem(nguoiDung.getLoaiNguoiDung());
        cbCoSo.setSelectedItem(nguoiDung.getCoSo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new views.panel.PanelBorder();
        pnTitle = new views.panel.PanelBorder();
        lbTitle = new javax.swing.JLabel();
        lbTenDangNhap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLoaiND = new javax.swing.JComboBox<>();
        btHuy = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbCoSo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnTitle.setBackground(new java.awt.Color(25, 118, 211));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("THÊM TÀI KHOẢN NGƯỜI DÙNG");

        javax.swing.GroupLayout pnTitleLayout = new javax.swing.GroupLayout(pnTitle);
        pnTitle.setLayout(pnTitleLayout);
        pnTitleLayout.setHorizontalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTitleLayout.setVerticalGroup(
            pnTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnMain.add(pnTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lbTenDangNhap.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbTenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Tên đăng nhập");
        pnMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, 140, 20));

        lbMatKhau.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mật khẩu");
        pnMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 140, 20));

        lbEmail.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 330, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Email");
        pnMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Loại người dùng");
        pnMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 140, 20));

        cbLoaiND.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        cbLoaiND.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "CanBoKiemKe", "GiaoVien" }));
        pnMain.add(cbLoaiND, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 330, 40));

        btHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuy.setForeground(new java.awt.Color(255, 0, 0));
        btHuy.setText("HỦY");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        pnMain.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 150, 40));

        btThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(25, 118, 211));
        btThem.setText("SUBMIT");
        btThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btThem.setIconTextGap(1);
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        pnMain.add(btThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 150, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cơ sở");
        pnMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 140, 20));

        cbCoSo.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        cbCoSo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minh Khai", "Lĩnh Nam", "Mỹ Xá" }));
        pnMain.add(cbCoSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 330, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        int rs = JOptionPane.showConfirmDialog(this, "Hủy bản ghi hiện tại?", "Hủy", JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed

            String tenDangNhap = lbTenDangNhap.getText().trim();
            String matKhau = lbMatKhau.getText().trim();
            String email = lbEmail.getText().trim();
            String loaiND = cbLoaiND.getSelectedItem().toString();
            String coSo = cbCoSo.getSelectedItem().toString();

            if (tenDangNhap.isBlank() || matKhau.isBlank() || email.isBlank() || loaiND.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa nhập đủ thông tin.");
                return;
            }

            NguoiDungService nguoiDungService = new NguoiDungService();

            if (function.equals("CREATE")) {
                OperationResult rs = nguoiDungService.createNguoiDung(-1, tenDangNhap, matKhau, email, loaiND, coSo);
                if (rs.isSuccess()) {
                    JOptionPane.showMessageDialog(this, "Thêm Thành Công.");
                    this.dispose();
                    mainForm.initTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm Thất Bại.");
                }
            } else {
                //edit
                OperationResult rs = nguoiDungService.updateNguoiDung(nguoiDung.getMaNguoiDung(), tenDangNhap, matKhau, email, loaiND, coSo);
                if (rs.isSuccess()) {
                    JOptionPane.showMessageDialog(this, "Sửa Thành Công.");
                    this.dispose();
                    mainForm.initTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa Thất Bại.");
                }
            }

    }//GEN-LAST:event_btThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btThem;
    private javax.swing.JComboBox<String> cbCoSo;
    private javax.swing.JComboBox<String> cbLoaiND;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lbEmail;
    private javax.swing.JTextField lbMatKhau;
    private javax.swing.JTextField lbTenDangNhap;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder pnMain;
    private views.panel.PanelBorder pnTitle;
    // End of variables declaration//GEN-END:variables
}
