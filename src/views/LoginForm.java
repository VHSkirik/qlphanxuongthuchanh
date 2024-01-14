
package views;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        myInit();
    }
    
    private void myInit(){
        lbShow.setVisible(false);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        iconUneti = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbShow = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lbHide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/bg-login.png"))); // NOI18N
        jPanel1.add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 500, 290));

        iconUneti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUneti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/uneti-icon.png"))); // NOI18N
        jPanel1.add(iconUneti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 130));

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

        lbShow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/icons8_eye_30px.png"))); // NOI18N
        lbShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbShowMouseClicked(evt);
            }
        });
        jPanel2.add(lbShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 51, 50));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("________________________________________________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 259, 370, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/icons8_user_30px.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 51, 47));

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
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 185, -1));

        btLogin.setBackground(new java.awt.Color(255, 255, 255));
        btLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btLogin.setForeground(new java.awt.Color(25, 118, 211));
        btLogin.setText("ĐĂNG NHẬP");
        jPanel2.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 384, 413, 38));

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
        jPanel2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 390, 40));

        lbHide.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/icons8_hide_30px.png"))); // NOI18N
        lbHide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHideMouseClicked(evt);
            }
        });
        jPanel2.add(lbHide, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 51, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 540, 520));

        setSize(new java.awt.Dimension(1039, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbHideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHideMouseClicked
        txtPassword.setEchoChar((char) 0);
        lbHide.setVisible(false);
        lbShow.setVisible(true);
    }//GEN-LAST:event_lbHideMouseClicked

    private void lbShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbShowMouseClicked
        txtPassword.setEchoChar('\u2022');
        lbShow.setVisible(false);
        lbHide.setVisible(true);
    }//GEN-LAST:event_lbShowMouseClicked

    public static void main(String args[]) {
        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex){
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
    private javax.swing.JLabel iconUneti;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbHide;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbShow;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
