package views.panel;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import models.NguoiDung;
import models.ThongTinNguoiDung;
import services.ThongTinNguoiDungService;

public class Information extends PanelBorderHalf {

    private NguoiDung nguoiDung;
    private ThongTinNguoiDung thongTinNguoiDung;

    public Information() {
        initComponents();
        lbUserIcon.setIcon(new FlatSVGIcon("./views/icon/svg/admin_2.svg", 63, 63));
    }

    private void setUserData() {
        if (nguoiDung == null) {
            return;
        }
        lbUserName.setText(nguoiDung.getTenDangNhap());
        lbRole.setText(nguoiDung.getLoaiNguoiDung());
        if (thongTinNguoiDung == null) {
            return;
        }
        lbHoTen.setText(thongTinNguoiDung.getHoten());
        lbEmail.setText(nguoiDung.getEmail());
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
        this.thongTinNguoiDung = new ThongTinNguoiDungService().get("MaNguoiDung", this.nguoiDung.getMaNguoiDung() + "").get(0);
        setUserData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUserIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setOpaque(true);

        lbUserName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(51, 51, 51));
        lbUserName.setText("User Name ");

        lbRole.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbRole.setForeground(new java.awt.Color(102, 102, 102));
        lbRole.setText("Admin");

        lbEmail.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("Email");

        lbHoTen.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(0, 0, 0));
        lbHoTen.setText("Họ Tên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRole)
                    .addComponent(lbUserName))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUserIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserIcon;
    private javax.swing.JLabel lbUserName;
    // End of variables declaration//GEN-END:variables
}
