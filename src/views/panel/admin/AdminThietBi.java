package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.impl.PhongThucHanhDAO;
import dao.impl.ThietBiDAO;
import java.util.HashMap;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.NguoiDung;
import models.OperationResult;
import models.PhongThucHanh;
import models.ThietBi;
import services.PhongThucHanhService;
import services.ThietBiService;
import views.UserFormInterface;
import views.models.CurrentUser;

public class AdminThietBi extends javax.swing.JPanel implements UserFormInterface {

    private List<ThietBi> dsThietBi, dsHienTai;
    private DefaultTableModel dtm;
    private ThietBiService thietBiService;
    private NguoiDung nguoiDung;
    private HashMap<Integer, String> hmPhongThucHanh;

    public AdminThietBi() {
        this.nguoiDung = CurrentUser.getNguoiDung();
        hmPhongThucHanh = new HashMap<>();
        initComponents();
        dtm = (DefaultTableModel) tbThietBi.getModel();
        tbThietBi.setAutoCreateRowSorter(true);
        thietBiService = new ThietBiService();
        myInit();
        if (!CurrentUser.getNguoiDung().getLoaiNguoiDung().equals("Admin")) {
            cbDiaDiem.setEnabled(false);
            cbDiaDiem.setSelectedItem(CurrentUser.getNguoiDung().getCoSo());
        }
    }

    private void myInit() {
        initImage();
        initTableStart();
        initComboBox();
        initEvent();
    }

    private void initImage() {
        btThem.setIcon(new FlatSVGIcon("./views/icon/svg/add.svg", 45, 45));
        btSua.setIcon(new FlatSVGIcon("./views/icon/svg/edit.svg", 45, 45));
        btXoa.setIcon(new FlatSVGIcon("./views/icon/svg/delete.svg", 45, 45));
        btBaoCao.setIcon(new FlatSVGIcon("./views/icon/svg/report.svg", 45, 45));
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/devices_black.svg", 40, 40));
    }

    public void initTableStart() {
        dsThietBi = thietBiService.getAll();
        dsHienTai = dsThietBi;
        initDataThietBi(dsThietBi);
    }

    @Override
    public void initTable() {
        dsThietBi = thietBiService.getAll();
        cbPhongEvent();
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

    private void initComboBox() {
        cbDiaDiem.addItem("Lĩnh Nam");
        cbDiaDiem.addItem("Minh Khai");
        cbDiaDiem.addItem("Mỹ Xá");
        if (!nguoiDung.getLoaiNguoiDung().equals("Admin")) {
            cbDiaDiem.setEnabled(false);
        }
    }

    private void initEvent() {

    }

    private void initDataToaNha() {
        cbToaNha.removeAllItems();
        cbToaNha.addItem("Tất Cả");
        cbToaNha.setSelectedIndex(0);
        if (cbDiaDiem.getSelectedIndex() != 0) {
            List<String> dsToa = PhongThucHanhDAO.getIns().findToaByDiaDiem(cbDiaDiem.getSelectedItem() + "");
            for (String toa : dsToa) {
                cbToaNha.addItem(toa);
            }
        }
    }

    private void initDataPhong() {
        cbPhong.removeAllItems();
        cbPhong.addItem("Tất Cả");
        cbPhong.setSelectedIndex(0);
        if (cbToaNha.getSelectedIndex() != 0 && cbToaNha.getSelectedItem() != null) {
            List<PhongThucHanh> dsPhong = new PhongThucHanhService().getByDiaDiemAndToa(cbDiaDiem.getSelectedItem().toString(), cbToaNha.getSelectedItem().toString());
            for (PhongThucHanh pth : dsPhong) {
                hmPhongThucHanh.put(pth.getMaPhongThucHanh(), pth.getTenPhong());
                cbPhong.addItem(pth.getTenPhong());
            }
        }
    }

    private int getIdPhong() {
        int id = -1;
        for (int key : hmPhongThucHanh.keySet()) {
            if (hmPhongThucHanh.get(key).equals(cbPhong.getSelectedItem().toString())) {
                id = key;
                break;
            }
        }
        return id;
    }

    private void cbPhongEvent() {
        if (cbPhong.getSelectedItem() == null) {
            return;
        }
        if (cbPhong.getSelectedIndex() != 0) {
            int id = getIdPhong();
            dsHienTai = thietBiService.get("MaPhongThucHanh", id + "");
            initDataThietBi(dsHienTai);
        } else {
            initDataThietBi(dsThietBi);
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
        cbDiaDiem = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        cbToaNha = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        cbPhong = new javax.swing.JComboBox<>();
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
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        jToolBar1.add(btThem);

        btSua.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btSua.setForeground(new java.awt.Color(0, 0, 0));
        btSua.setText("Cập Nhật");
        btSua.setFocusable(false);
        btSua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSua.setIconTextGap(0);
        btSua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });
        jToolBar1.add(btSua);

        btXoa.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btXoa.setForeground(new java.awt.Color(0, 0, 0));
        btXoa.setText("Xóa");
        btXoa.setFocusable(false);
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoa.setIconTextGap(0);
        btXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
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

        cbDiaDiem.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbDiaDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cbDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaDiemActionPerformed(evt);
            }
        });
        jToolBar2.add(cbDiaDiem);
        jToolBar2.add(jSeparator2);

        cbToaNha.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbToaNha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cbToaNha.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbToaNhaItemStateChanged(evt);
            }
        });
        jToolBar2.add(cbToaNha);
        jToolBar2.add(jSeparator3);

        cbPhong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cbPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPhongActionPerformed(evt);
            }
        });
        jToolBar2.add(cbPhong);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Vị trí:");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        if (cbPhong.getSelectedIndex() != 0) {
            int id = getIdPhong();
            new ThietBiDialog(this, new JFrame(), true, id).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Chọn Phòng Cần Thêm trước.");
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void cbDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaDiemActionPerformed
        initDataToaNha();
    }//GEN-LAST:event_cbDiaDiemActionPerformed

    private void cbToaNhaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbToaNhaItemStateChanged
        if (cbDiaDiem.getSelectedItem() != null)
            initDataPhong();
    }//GEN-LAST:event_cbToaNhaItemStateChanged

    private void cbPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPhongActionPerformed
        cbPhongEvent();
    }//GEN-LAST:event_cbPhongActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int currentRow = tbThietBi.getSelectedRow();
        if (currentRow != -1) {
            if (cbPhong.getSelectedIndex() == 0 && !CurrentUser.getNguoiDung().getLoaiNguoiDung().equals("Admin")) {
                JOptionPane.showMessageDialog(this, "Hãy Chọn Phòng Trước.");
            } else {
                int MaThietBi = Integer.parseInt(tbThietBi.getValueAt(currentRow, 0).toString());
                ThietBi thietBi = ThietBiDAO.getIns().findOne(MaThietBi);
                new ThietBiDialog(this, new JFrame(), true, thietBi).setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn thiết bị cần cập nhật.");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int currentRow = tbThietBi.getSelectedRow();
        if (currentRow != -1) {
            int MaThietBi = Integer.parseInt(tbThietBi.getValueAt(currentRow, 0).toString());
            OperationResult os = thietBiService.deleteThietBi(MaThietBi);
            if (os.isSuccess()) {
                JOptionPane.showMessageDialog(this, "Xóa Thành Công.");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa Thất Bại");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn thiết bị cần xóa.");
        }
    }//GEN-LAST:event_btXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBaoCao;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbDiaDiem;
    private javax.swing.JComboBox<String> cbPhong;
    private javax.swing.JComboBox<String> cbToaNha;
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
