
package views.panel.admin;

import java.awt.Color;
import javax.swing.JOptionPane;

public class PhongDialog extends javax.swing.JDialog {

    public PhongDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setUndecorated(true);
        setBackground(new Color(255,255,255,0));
        initComponents();
        pnMain.setDrawBorder(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new views.panel.PanelBorder();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btHuy = new javax.swing.JButton();
        btThem = new javax.swing.JButton();
        panelBorderHalf1 = new views.panel.PanelBorderHalf();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setForeground(new java.awt.Color(102, 102, 102));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Mã phòng thực hành");
        pnMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 200, 20));

        jTextField2.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 330, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Tên phòng");
        pnMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 20));

        jTextField3.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 330, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Loại phòng");
        pnMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Tình trạng");
        pnMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 140, 20));

        jComboBox1.setFont(new java.awt.Font("JetBrains Mono NL Light", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SanSang", "DangSuaChua", "DaDuocSuDung" }));
        pnMain.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 330, 40));

        btHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuy.setForeground(new java.awt.Color(255, 0, 0));
        btHuy.setText("HỦY");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        pnMain.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 150, 40));

        btThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(25, 118, 211));
        btThem.setText("SUBMIT");
        btThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btThem.setIconTextGap(1);
        pnMain.add(btThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 150, 40));

        panelBorderHalf1.setBackground(new java.awt.Color(25, 118, 211));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM PHÒNG THỰC HÀNH");

        javax.swing.GroupLayout panelBorderHalf1Layout = new javax.swing.GroupLayout(panelBorderHalf1);
        panelBorderHalf1.setLayout(panelBorderHalf1Layout);
        panelBorderHalf1Layout.setHorizontalGroup(
            panelBorderHalf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorderHalf1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBorderHalf1Layout.setVerticalGroup(
            panelBorderHalf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorderHalf1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnMain.add(panelBorderHalf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Địa điểm");
        pnMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 140, 20));

        jTextField4.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Địa điểm");
        pnMain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 20));

        jTextField5.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        pnMain.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 330, 40));

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
        int rs = JOptionPane.showConfirmDialog(this, "Hủy bản ghi hiện tại?","Hủy",JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
        this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btThem;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private views.panel.PanelBorderHalf panelBorderHalf1;
    private views.panel.PanelBorder pnMain;
    // End of variables declaration//GEN-END:variables
}
