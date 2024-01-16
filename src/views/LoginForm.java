package views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.UIManager;
import models.NguoiDung;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        myInit();
    }

    private void myInit() {
        setBackground(new Color(0, 0, 0, 0));
        svgShow.setVisible(false);
    }
    
    private void checkLogin(){
        this.dispose();
        new CanBoMain(new NguoiDung()).setVisible(true);
    }

    @Override
    public void paintAll(Graphics g) {
        svgUser.setSVGImage("./views/icon/svg/icons8_user.svg");
        svgLogin.setSVGImage("./views/icon/svg/login-image.svg");
        svgShow.setSVGImage("./views/icon/svg/icons8_eye.svg");
        svgHide.setSVGImage("./views/icon/svg/icons8_hide.svg");
        svgUneti.setSVGImage("./views/icon/svg/uneti.svg");
        super.paintAll(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        svgLogin = new views.label.SVGImage();
        svgUneti = new views.label.SVGImage();
        jPanel2 = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        svgHide = new views.label.SVGImage();
        svgUser = new views.label.SVGImage();
        svgShow = new views.label.SVGImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        svgLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(svgLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 500, 370));
        jPanel1.add(svgUneti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 520));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbExit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setText("X");
        lbExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        jPanel2.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 0, 36, 59));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 77, 540, 52));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Xin Chào! Hãy Bắt Đầu Nào");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 540, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 171, 370, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("________________________________________________________________________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 259, 370, -1));

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(199, 225, 255));
        jCheckBox1.setText("Nhớ mật khẩu");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 335, 119, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(199, 225, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Quên mật khẩu?");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 185, -1));

        btLogin.setBackground(new java.awt.Color(255, 255, 255));
        btLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLogin.setForeground(new java.awt.Color(25, 118, 211));
        btLogin.setText("ĐĂNG NHẬP");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 384, 430, 38));

        txtUsername.setBackground(new java.awt.Color(25, 118, 211));
        txtUsername.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 18)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel2.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 390, 40));

        txtPassword.setBackground(new java.awt.Color(25, 118, 211));
        txtPassword.setFont(new java.awt.Font("JetBrains Mono Light", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 390, 40));

        svgHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgHideMouseClicked(evt);
            }
        });
        jPanel2.add(svgHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 40, 40));
        jPanel2.add(svgUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 40, 40));

        svgShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                svgShowMouseClicked(evt);
            }
        });
        jPanel2.add(svgShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 540, 520));

        setSize(new java.awt.Dimension(1039, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        checkLogin();       
    }//GEN-LAST:event_btLoginActionPerformed

    private void svgHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgHideMouseClicked
        txtPassword.setEchoChar((char) 0);
        svgHide.setVisible(false);
        svgShow.setVisible(true);
    }//GEN-LAST:event_svgHideMouseClicked

    private void svgShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_svgShowMouseClicked
        txtPassword.setEchoChar('\u2022');
        svgShow.setVisible(false);
        svgHide.setVisible(true);
    }//GEN-LAST:event_svgShowMouseClicked

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            checkLogin();
    }//GEN-LAST:event_txtPasswordKeyPressed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbExit;
    private views.label.SVGImage svgHide;
    private views.label.SVGImage svgLogin;
    private views.label.SVGImage svgShow;
    private views.label.SVGImage svgUneti;
    private views.label.SVGImage svgUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
