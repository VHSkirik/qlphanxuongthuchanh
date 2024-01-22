package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;

public class AdminYeuCau extends javax.swing.JPanel {

    public AdminYeuCau() {
        initComponents();
        myInit();
    }
    
    private void myInit(){
        btChapNhan.setIcon(new FlatSVGIcon("./views/icon/svg/accept.svg",45,45));
        btTuChoi.setIcon(new FlatSVGIcon("./views/icon/svg/reject.svg",45,45));
        btXoa.setIcon(new FlatSVGIcon("./views/icon/svg/delete.svg",45,45));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatPhong = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        header3 = new views.panel.Header();
        jToolBar3 = new javax.swing.JToolBar();
        btChapNhan = new javax.swing.JButton();
        btTuChoi = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sắp xếp ");

        jScrollPane2.setBorder(null);

        tbDatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(tbDatPhong);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định" }));

        header3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToolBar3.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar3.setRollover(true);

        btChapNhan.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btChapNhan.setForeground(new java.awt.Color(0, 0, 0));
        btChapNhan.setText("Chấp Nhận");
        btChapNhan.setFocusable(false);
        btChapNhan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btChapNhan.setIconTextGap(0);
        btChapNhan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btChapNhan);

        btTuChoi.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btTuChoi.setForeground(new java.awt.Color(0, 0, 0));
        btTuChoi.setText("Từ Chối");
        btTuChoi.setFocusable(false);
        btTuChoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTuChoi.setIconTextGap(0);
        btTuChoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btTuChoi);

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btXoa.setForeground(new java.awt.Color(0, 0, 0));
        btXoa.setText("Xóa Yêu Cầu");
        btXoa.setFocusable(false);
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoa.setIconTextGap(0);
        btXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar3.add(btXoa);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(header3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jScrollPane1))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE))
                        .addGap(12, 12, 12)))
                .addGap(15, 15, 15))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)))
                .addGap(30, 30, 30)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btChapNhan;
    private javax.swing.JButton btTuChoi;
    private javax.swing.JButton btXoa;
    private views.panel.Header header3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar3;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTable tbDatPhong;
    // End of variables declaration//GEN-END:variables
}
