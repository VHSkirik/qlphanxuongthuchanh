package views.panel.canbo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ThongKeBang extends javax.swing.JPanel {

    private DefaultTableModel myTableModel;

    public ThongKeBang() {
        initComponents();
        myInit();
    }

    private void myInit() {
        initComboBox();
        
        
    }
    
    private void initComboBox(){
        List<String> dsCoSo = Arrays.asList(new String[]{"Lĩnh Nam", "Minh Khai", "Mỹ Xá"});
        for (String coSo : dsCoSo){
            cbCoSo.addItem(coSo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();
        cbCoSo = new javax.swing.JComboBox<>();
        cbCoSo2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCoSo3 = new javax.swing.JComboBox<>();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        tbMain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbMain);

        cbCoSo.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N

        cbCoSo2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbCoSo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Phòng", "Thiết Bị" }));
        cbCoSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCoSo2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cơ Sở");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Đối tượng");

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tình Trạng");

        cbCoSo3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbCoSo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCoSo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(cbCoSo, 0, 157, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(cbCoSo2, 0, 157, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(cbCoSo3, 0, 157, Short.MAX_VALUE)
                        .addGap(336, 336, 336))
                    .addComponent(jScrollPane1))
                .addGap(25, 25, 25))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCoSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCoSo3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbCoSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCoSo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCoSo2ActionPerformed

    private void cbCoSo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCoSo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCoSo3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCoSo;
    private javax.swing.JComboBox<String> cbCoSo2;
    private javax.swing.JComboBox<String> cbCoSo3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTable tbMain;
    // End of variables declaration//GEN-END:variables
}
