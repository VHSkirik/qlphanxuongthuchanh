
package views.panel.giaovien;

public class DataLichHoc extends javax.swing.JPanel {

    public DataLichHoc() {
        initComponents();
        txtMonhoc.setLineWrap(true);
        txtMonhoc.setWrapStyleWord(true);
    }
    
    public void setMonHoc (String MonHoc){
        txtMonhoc.setText(MonHoc);
    }
    
    public void setTietHoc (String tietHoc){
        txtTietHoc.setText(tietHoc);
    }
    
    public void setPhongHoc (String phongHoc){
        txtPhongHoc.setText(phongHoc);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMonhoc = new javax.swing.JTextArea();
        txtTietHoc = new javax.swing.JLabel();
        txtPhongHoc = new javax.swing.JLabel();

        setBackground(new java.awt.Color(113, 203, 53));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        txtMonhoc.setColumns(20);
        txtMonhoc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMonhoc.setForeground(new java.awt.Color(21, 61, 95));
        txtMonhoc.setRows(5);
        txtMonhoc.setText("Thực tập cuối khóa ngành CNTT");
        txtMonhoc.setDisabledTextColor(new java.awt.Color(21, 61, 95));
        txtMonhoc.setEnabled(false);
        txtMonhoc.setOpaque(false);

        txtTietHoc.setForeground(new java.awt.Color(21, 61, 95));
        txtTietHoc.setText("Tiết: 7 - 12");

        txtPhongHoc.setForeground(new java.awt.Color(21, 61, 95));
        txtPhongHoc.setText("Phòng: HA9.501");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTietHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPhongHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtMonhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTietHoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhongHoc)
                .addContainerGap(9, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea txtMonhoc;
    private javax.swing.JLabel txtPhongHoc;
    private javax.swing.JLabel txtTietHoc;
    // End of variables declaration//GEN-END:variables
}
