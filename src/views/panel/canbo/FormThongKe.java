package views.panel.canbo;

import javax.swing.JComponent;

public class FormThongKe extends javax.swing.JPanel {
    
    public FormThongKe() {
        initComponents();
        rbBieuDo.setSelected(true);
    }
    
    private void setMainPanel(JComponent component) {
        mainPanel.removeAll();
        mainPanel.add(component);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void changeState() {
        if (rbTable.isSelected()) {
            setMainPanel(new ThongKeBang());
        } else if (rbBieuDo.isSelected()) {
            setMainPanel(new ThongKeBieuDo());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        rbTable = new javax.swing.JRadioButton();
        rbBieuDo = new javax.swing.JRadioButton();

        mainPanel.setLayout(new java.awt.BorderLayout());

        buttonGroup1.add(rbTable);
        rbTable.setText("Bảng");
        rbTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTableActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbBieuDo);
        rbBieuDo.setText("Biểu Đồ");
        rbBieuDo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbBieuDoStateChanged(evt);
            }
        });
        rbBieuDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBieuDoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(rbTable, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbBieuDo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(719, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTable)
                    .addComponent(rbBieuDo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTableActionPerformed
        changeState();
    }//GEN-LAST:event_rbTableActionPerformed

    private void rbBieuDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBieuDoActionPerformed
       
    }//GEN-LAST:event_rbBieuDoActionPerformed

    private void rbBieuDoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbBieuDoStateChanged
        changeState();
    }//GEN-LAST:event_rbBieuDoStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rbBieuDo;
    private javax.swing.JRadioButton rbTable;
    // End of variables declaration//GEN-END:variables
}
