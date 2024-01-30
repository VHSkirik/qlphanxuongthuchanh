package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.impl.PhongThucHanhDAO;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.OperationResult;
import models.PhongThucHanh;
import services.PhongThucHanhService;
import views.UserFormInterface;
import views.models.CurrentUser;

public class AdminPhong extends javax.swing.JPanel implements UserFormInterface {

    private List<PhongThucHanh> dsPhong, dsHienTai;
    private DefaultTableModel dtmPhong;
    private JTextField txtTimKiem;
    private JComboBox<String> cbTuyChon;
    private PhongThucHanhService phongThucHanhService;

    public AdminPhong() {
        phongThucHanhService = new PhongThucHanhService();
        initComponents();
        dtmPhong = (DefaultTableModel) tbPhong.getModel();
        tbPhong.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbPhong.getColumnModel().getColumn(1).setPreferredWidth(100);
        tbPhong.getColumnModel().getColumn(2).setPreferredWidth(250);
        tbPhong.getColumnModel().getColumn(4).setPreferredWidth(5);
        tbPhong.getColumnModel().getColumn(5).setPreferredWidth(5);
        tbPhong.setRowHeight(35);
        txtTimKiem = header1.getTextFieldTK();
        cbTuyChon = header1.getCbTuyChonTK();
        myInit();
        if (!CurrentUser.getNguoiDung().getLoaiNguoiDung().equals("Admin")){
            cbDiaDiem.setEnabled(false);
            cbDiaDiem.setSelectedItem(CurrentUser.getNguoiDung().getCoSo());
        }
    }

    private void myInit() {
        initImage();
        initTable();
        initComboBox();
        initTimKiem();
        initEvent();
    }

    private void initImage() {
        btThem.setIcon(new FlatSVGIcon("./views/icon/svg/add.svg", 45, 45));
        btSua.setIcon(new FlatSVGIcon("./views/icon/svg/edit.svg", 45, 45));
        btXoa.setIcon(new FlatSVGIcon("./views/icon/svg/delete.svg", 45, 45));
        btExcel.setIcon(new FlatSVGIcon("./views/icon/svg/excel.svg", 45, 45));
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/classroom.svg", 40, 40));
    }

    @Override
    public void initTable() {
        dsPhong = phongThucHanhService.getAll();
        dsHienTai = dsPhong;
        initDataPhongThucHanh(dsPhong);
    }

    private void initComboBox() {
        initDataDiaDiem();
    }

    private void initDataDiaDiem() {
        List<String> dsDiaDiem = PhongThucHanhDAO.getIns().findListDiaDiem();
        cbDiaDiem.removeAllItems();
        cbDiaDiem.addItem("Tất Cả");
        for (String diaDiem : dsDiaDiem) {
            cbDiaDiem.addItem(diaDiem);
        }
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

    private void initDataPhongThucHanh(List<PhongThucHanh> currentDsPhong) {
        dtmPhong.setRowCount(0);
        for (PhongThucHanh phong : currentDsPhong) {
            dtmPhong.addRow(new Object[]{
                phong.getMaPhongThucHanh(),
                phong.getTenPhong(),
                phong.getLoaiPhong(),
                phong.getDiaDiem(),
                phong.getToa(),
                phong.getSucChua(),
                phong.getTinhTrang()
            });
        }
    }

    private void initTimKiem() {
        cbTuyChon.addItem("Tên Phòng");
        cbTuyChon.addActionListener((e) -> {
            txtTimKiem.setText("");
            initDataPhongThucHanh(dsHienTai);
        });
        txtTimKiem.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String value = txtTimKiem.getText().trim();
                if (!value.isBlank()) {
                    dtmPhong.setRowCount(0);
                    for (PhongThucHanh phong : dsHienTai) {
                        if (phong.getTenPhong().toLowerCase().contains(value.toLowerCase())) {
                            dtmPhong.addRow(new Object[]{
                                phong.getMaPhongThucHanh(),
                                phong.getTenPhong(),
                                phong.getLoaiPhong(),
                                phong.getDiaDiem(),
                                phong.getToa(),
                                phong.getSucChua(),
                                phong.getTinhTrang()});
                        }
                    }
                } else {
                    initDataPhongThucHanh(dsHienTai);
                }
            }
        }
        );
    }

    private void initEvent() {
        cbToaNha.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cbDiaDiem.getSelectedItem() != null && cbToaNha.getSelectedItem() != null) {
                    if (cbDiaDiem.getSelectedIndex() == 0) {
                        dsHienTai = dsPhong;
                    } else {
                        if (cbToaNha.getSelectedIndex() == 0) {
                            dsHienTai = phongThucHanhService.getByDiaDiemAndToa(cbDiaDiem.getSelectedItem().toString(), "");
                        } else {
                            dsHienTai = phongThucHanhService.getByDiaDiemAndToa(cbDiaDiem.getSelectedItem().toString(), cbToaNha.getSelectedItem().toString());
                        }
                    }
                    initDataPhongThucHanh(dsHienTai);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhong = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        panelBorder2 = new views.panel.PanelBorder();
        jToolBar1 = new javax.swing.JToolBar();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btExcel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbDiaDiem = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbToaNha = new javax.swing.JComboBox<>();
        header1 = new views.panel.Header();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(null);

        tbPhong.setFont(new java.awt.Font("JetBrains Mono Light", 0, 16)); // NOI18N
        tbPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tên Phòng", "Loại Phòng", "Địa Điểm", "Tòa", "Sức Chứa", "Tình Trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPhong);

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(127, 127, 127));
        lbTitle.setText("Danh sách phòng thực hành");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(32, 32, 32))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(18, 18, 18))
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
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        jToolBar1.add(btThem);

        btSua.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btSua.setForeground(new java.awt.Color(0, 0, 0));
        btSua.setText("Sửa");
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

        btExcel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btExcel.setForeground(new java.awt.Color(0, 0, 0));
        btExcel.setText("Xuất Excel");
        btExcel.setFocusable(false);
        btExcel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcel.setIconTextGap(0);
        btExcel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btExcel);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Địa điểm");

        cbDiaDiem.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        cbDiaDiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));
        cbDiaDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiaDiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Tòa Nhà");

        cbToaNha.setFont(new java.awt.Font("JetBrains Mono Medium", 0, 14)); // NOI18N
        cbToaNha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả" }));

        header1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbDiaDiem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbToaNha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbDiaDiem)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbToaNha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
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
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        new PhongDialog(this, new JFrame(), true).setVisible(true);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int currentRow = tbPhong.getSelectedRow();
        if (currentRow != -1) {
            PhongThucHanh phongThucHanh = dsPhong.get(currentRow);
            new PhongDialog(this, new JFrame(), true, phongThucHanh).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn bản ghi cần sửa.");
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int currentRow = tbPhong.getSelectedRow();
        if (currentRow != -1) {
            int maPhong = Integer.parseInt(dtmPhong.getValueAt(currentRow, 0).toString());
            int rs = JOptionPane.showConfirmDialog(this, "Xóa bản ghi có mã " + maPhong + "?", "Xóa", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                OperationResult os = new PhongThucHanhService().deletePhongThucHanh(maPhong);
                if (os.isSuccess()) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công.");
                    this.initTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa thất bại.\nHãy kiểm tra lại.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chưa chọn bản ghi cần xóa.");
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void cbDiaDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiaDiemActionPerformed
        initDataToaNha();
    }//GEN-LAST:event_cbDiaDiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcel;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> cbDiaDiem;
    private javax.swing.JComboBox<String> cbToaNha;
    private views.panel.Header header1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.PanelBorder panelBorder2;
    private javax.swing.JTable tbPhong;
    // End of variables declaration//GEN-END:variables
}
