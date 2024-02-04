package views.panel.canbo;

import javax.swing.JComponent;

public class FormThongKe extends javax.swing.JPanel {
    
    public FormThongKe() {
        initComponents();
    }
    
    private void setMainPanel(JComponent component) {
        mainPanel.removeAll();
        mainPanel.add(component);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void changeState() {
        if (rbTable.isSelected()) {
            
        } else if (rbBieuDo.isSelected()) {
            setMainPanel(new ThongKeBieuDo());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        rbTable = new javax.swing.JRadioButton();
        rbBieuDo = new javax.swing.JRadioButton();

        mainPanel.setLayout(new java.awt.BorderLayout());

        rbTable.setSelected(true);
        rbTable.setText("jRadioButton1");
        rbTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTableActionPerformed(evt);
            }
        });

        rbBieuDo.setText("jRadioButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbTable)
                .addGap(60, 60, 60)
                .addComponent(rbBieuDo)
                .addContainerGap(629, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTable)
                    .addComponent(rbBieuDo))
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTableActionPerformed
        changeState();
    }//GEN-LAST:event_rbTableActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton rbBieuDo;
    private javax.swing.JRadioButton rbTable;
    // End of variables declaration//GEN-END:variables
}
