package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.ThietBi;
import services.ThietBiService;
import views.UserFormInterface;

public class AdminThietBi extends javax.swing.JPanel implements UserFormInterface {

    private List<ThietBi> dsThietBi, dsHieTai;
    private DefaultTableModel dtm;
    private ThietBiService thietBiService;

    public AdminThietBi() {
        initComponents();
        dtm = (DefaultTableModel) tbThietBi.getModel();
        thietBiService = new ThietBiService();
        myInit();
    }

    private void myInit() {
        initImage();
        initTable();
    }

    private void initImage() {
        btThem.setIcon(new FlatSVGIcon("./views/icon/svg/add.svg", 45, 45));
        btSua.setIcon(new FlatSVGIcon("./views/icon/svg/edit.svg", 45, 45));
        btXoa.setIcon(new FlatSVGIcon("./views/icon/svg/delete.svg", 45, 45));
        btBaoCao.setIcon(new FlatSVGIcon("./views/icon/svg/report.svg", 45, 45));
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/devices_black.svg", 40, 40));
    }

    @Override
    public void initTable() {
        dsThietBi = thietBiService.getAll();
        dsHieTai = dsThietBi;
        initDataThietBi(dsThietBi);
    }

    private void initDataThietBi(List<ThietBi> dsThietBiHienTai) {
        dtm.setRowCount(0);
        for (ThietBi thietBi : dsThietBiHienTai) {
            dtm.addRow(new Object[]{
                thietBi.getMaThietBi(),
                thietBi.getTenThietBi(),
                thietBi.getLoaiThietBi(),
                thietBi.getMaPhongThucHanh(),
                thietBi.getSoMay(),
                thietBi.getNgaySuDung(),
                thietBi.getMoTa(),
                thietBi.getTinhTrang()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        lbTitle = new javax.swing.JLabel();
        panelBorder2 = new views.panel.PanelBorder();
        jToolBar1 = new javax.swing.JToolBar();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btBaoCao = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbThietBi = new javax.swing.JTable();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(127, 127, 127));
        lbTitle.setText("Danh sách thiết bị");

        panelBorder2.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        btBaoCao.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btBaoCao.setForeground(new java.awt.Color(0, 0, 0));
        btBaoCao.setText("Báo Cáo");
        btBaoCao.setFocusable(false);
        btBaoCao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBaoCao.setIconTextGap(0);
        btBaoCao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btBaoCao);

        jToolBar2.setRollover(true);

        jComboBox1.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        jToolBar2.add(jComboBox1);
        jToolBar2.add(jSeparator2);

        jComboBox2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        jToolBar2.add(jComboBox2);
        jToolBar2.add(jSeparator3);

        jComboBox3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        jToolBar2.add(jComboBox3);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hiển Thị:");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tbThietBi.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tbThietBi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Loại", "Mã Phòng", "Số Máy", "Ngày Sử Dụng", "Mô Tả", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbThietBi);
        if (tbThietBi.getColumnModel().getColumnCount() > 0) {
            tbThietBi.getColumnModel().getColumn(0).setPreferredWidth(1);
            tbThietBi.getColumnModel().getColumn(3).setPreferredWidth(1);
            tbThietBi.getColumnModel().getColumn(4).setPreferredWidth(1);
        }

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                .addGap(31, 31, 31))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaoCao;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.PanelBorder panelBorder2;
    private javax.swing.JTable tbThietBi;
    // End of variables declaration//GEN-END:variables
}
