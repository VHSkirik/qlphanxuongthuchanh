
package views.panel.giaovien;

import javax.swing.JLabel;

public class NgayLichTrinh extends javax.swing.JPanel {

    public NgayLichTrinh() {
        initComponents();
    }

    public void setThu(String thu){
        this.lbThu.setText(thu);
    }
    
    public void setNgay(String ngay){
        this.lbNgay.setText(ngay);
    }
    
    public String getNgay(){
        return lbNgay.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbThu = new javax.swing.JLabel();
        lbNgay = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 243, 243));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lbThu.setBackground(new java.awt.Color(235, 235, 235));
        lbThu.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbThu.setForeground(new java.awt.Color(0, 204, 255));
        lbThu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbThu.setText("Thứ 2");

        lbNgay.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbNgay.setForeground(new java.awt.Color(0, 204, 255));
        lbNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNgay.setText("29/1/2024");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbNgay, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(lbNgay)
                .addGap(11, 11, 11))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbThu;
    // End of variables declaration//GEN-END:variables
}
