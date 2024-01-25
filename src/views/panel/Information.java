
package views.panel;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import models.NguoiDung;

public class Information extends PanelBorderHalf {

    private NguoiDung nguoiDung;
    
    public Information() {
        initComponents();
        lbUserIcon.setIcon(new FlatSVGIcon("./views/icon/svg/admin.svg",63,63));
    }
    
    private void setUserData(){
        if (nguoiDung == null)
            return;
        lbUserName.setText(nguoiDung.getTenDangNhap());
        lbRole.setText(nguoiDung.getLoaiNguoiDung());
    }
    
    public void setNguoiDung(NguoiDung nguoiDung){
        this.nguoiDung = nguoiDung;
        setUserData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUserIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setOpaque(true);

        lbUserName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(51, 51, 51));
        lbUserName.setText("User Name ");

        lbRole.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbRole.setForeground(new java.awt.Color(102, 102, 102));
        lbRole.setText("Admin");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(477, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUserIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserIcon;
    private javax.swing.JLabel lbUserName;
    // End of variables declaration//GEN-END:variables
}
