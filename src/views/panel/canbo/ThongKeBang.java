package views.panel.canbo;

import com.formdev.flatlaf.extras.FlatSVGIcon;
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
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/Chart.svg", 45, 45));
        initComboBox();
        initTableModel();
        initDataTable();
        if (tbMain.getColumnModel().getColumnCount() > 0) {
            tbMain.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbMain.getColumnModel().getColumn(3).setPreferredWidth(100);
        }
    }

    private void initComboBox() {
        List<String> dsCoSo = Arrays.asList(new String[]{" ", "Lĩnh Nam", "Minh Khai", "Mỹ Xá"});
        for (String coSo : dsCoSo) {
            cbCoSo.addItem(coSo);
        }
    }

    private void initTableModel() {
        myTableModel = new DefaultTableModel(
                new Object[][]{},
                new String[]{"", "Mới", "Cũ", "Hỏng", "Tổng"}
        ) {
            boolean[] canEdit = new boolean[]{false, false, false, false, false};

            public boolean isCellEditable(int row, int column) {
                return canEdit[column];
            }
        };
        
        tbMain.setModel(myTableModel);
    }
    
    private void initDataTable(){
        
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
        lbTitle = new javax.swing.JLabel();

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

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(127, 127, 127));
        lbTitle.setText("Thống Kê Chung");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addComponent(cbCoSo, 0, 157, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(cbCoSo2, 0, 157, Short.MAX_VALUE)
                                .addGap(506, 506, 506))
                            .addComponent(jScrollPane1))
                        .addGap(25, 25, 25))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCoSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCoSo;
    private javax.swing.JComboBox<String> cbCoSo2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTable tbMain;
    // End of variables declaration//GEN-END:variables
}
