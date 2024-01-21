package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Graphics;

public class AdminNguoiDung extends javax.swing.JPanel {

    public AdminNguoiDung() {
        initComponents();
        myInit();
    }
    
    private void myInit(){
        btThem.setIcon(new FlatSVGIcon("./views/icon/svg/add.svg",45, 45));
        btSua.setIcon(new FlatSVGIcon("./views/icon/svg/edit.svg",45, 45));
        btXoa.setIcon(new FlatSVGIcon("./views/icon/svg/delete.svg",45, 45));
        btExcel.setIcon(new FlatSVGIcon("./views/icon/svg/excel.svg",45, 45));
        lbTitleUser.setIcon(new FlatSVGIcon("./views/icon/svg/multiUser.svg",30, 30));
        lbTitleInfo.setIcon(new FlatSVGIcon("./views/icon/svg/infor_black.svg",30, 30));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNguoiDung = new javax.swing.JTable();
        lbTitleInfo = new javax.swing.JLabel();
        lbTitleUser = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbThongTinNguoiDung = new javax.swing.JTable();
        panelBorder2 = new views.panel.PanelBorder();
        jToolBar1 = new javax.swing.JToolBar();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btExcel = new javax.swing.JButton();
        header1 = new views.panel.Header();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        tbNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Đăng Nhập", "Mật Khẩu", "Loại Phòng", "Địa Điểm"
            }
        ));
        jScrollPane1.setViewportView(tbNguoiDung);

        lbTitleInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitleInfo.setForeground(new java.awt.Color(127, 127, 127));
        lbTitleInfo.setText("Thông tin chi tiết");

        lbTitleUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitleUser.setForeground(new java.awt.Color(127, 127, 127));
        lbTitleUser.setText("Danh sách người dùng");

        tbThongTinNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Tuổi", "Địa Chỉ", "Chuyên Môn", "Số Điện Thoại"
            }
        ));
        jScrollPane2.setViewportView(tbThongTinNguoiDung);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTitleUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitleInfo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitleUser)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(lbTitleInfo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chức năng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jToolBar1.setRollover(true);

        btThem.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btThem.setForeground(new java.awt.Color(0, 0, 0));
        btThem.setText("Thêm");
        btThem.setFocusable(false);
        btThem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btThem.setIconTextGap(0);
        btThem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btThem);

        btSua.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btSua.setForeground(new java.awt.Color(0, 0, 0));
        btSua.setText("Sửa");
        btSua.setFocusable(false);
        btSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSua.setIconTextGap(0);
        btSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btSua);

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btXoa.setForeground(new java.awt.Color(0, 0, 0));
        btXoa.setText("Xóa");
        btXoa.setFocusable(false);
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoa.setIconTextGap(0);
        btXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btXoa);
        jToolBar1.add(jSeparator1);

        btExcel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btExcel.setForeground(new java.awt.Color(0, 0, 0));
        btExcel.setText("Xuất Excel");
        btExcel.setFocusable(false);
        btExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcel.setIconTextGap(0);
        btExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btExcel);

        header1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcel;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private views.panel.Header header1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbTitleInfo;
    private javax.swing.JLabel lbTitleUser;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.PanelBorder panelBorder2;
    private javax.swing.JTable tbNguoiDung;
    private javax.swing.JTable tbThongTinNguoiDung;
    // End of variables declaration//GEN-END:variables
}
