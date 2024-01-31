package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.BaoCaoThietBi;
import services.BaoCaoThietBiService;

public class AdminBaoCao extends javax.swing.JPanel {

    List<BaoCaoThietBi> dsBaoCaoThietBi;
    private BaoCaoThietBiService baoCaoThietBiService;
    private DefaultTableModel dtm;
    private JTextField txtTimKiem;
    private JComboBox<String> cbTuyChon;

    public AdminBaoCao() {
        initComponents();
        baoCaoThietBiService = new BaoCaoThietBiService();
        dtm = (DefaultTableModel) tbBaoCao.getModel();
        txtTimKiem = pnTimKiem.getTextFieldTK();
        cbTuyChon = pnTimKiem.getCbTuyChonTK();
        myInit();
    }

    private void myInit() {
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/error_black.svg", 35, 35));
        initData();
        initTimKiem();
    }

    private void initData() {
        dsBaoCaoThietBi = baoCaoThietBiService.getAll();
        initTable();
    }

    private void initTable() {
        dtm.setRowCount(0);
        for (BaoCaoThietBi baoCao : dsBaoCaoThietBi) {
            dtm.addRow(new Object[]{
                baoCao.getMaBaoCao(),
                baoCao.getMaBaoCao(),
                baoCao.getNgayBaoCao(),
                baoCao.getNoiDungBaoCao()
            });
        }
    }

    private void initTimKiem() {
        cbTuyChon.addItem("Mã Báo Cáo");
        cbTuyChon.addActionListener((e) -> {
            txtTimKiem.setText("");
            initTable();
        });
        txtTimKiem.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String value = txtTimKiem.getText();
                if (!value.isBlank()) {
                    dtm.setRowCount(0);
                    for (BaoCaoThietBi baoCao : dsBaoCaoThietBi) {
                        if ((baoCao.getMaBaoCao() + "").contains(value)) {
                            dtm.addRow(new Object[]{
                                baoCao.getMaBaoCao(),
                                baoCao.getMaBaoCao(),
                                baoCao.getNgayBaoCao(),
                                baoCao.getNoiDungBaoCao()
                            });
                        }
                    }
                } else {
                    initTable();
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBaoCao = new javax.swing.JTable();
        lbTitle = new javax.swing.JLabel();
        pnTimKiem = new views.panel.Header();

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        tbBaoCao.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        tbBaoCao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Báo Cáo", "Mã Thiết Bị", "Ngày Báo Cáo", "Nội Dung"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbBaoCao);
        if (tbBaoCao.getColumnModel().getColumnCount() > 0) {
            tbBaoCao.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbBaoCao.getColumnModel().getColumn(1).setPreferredWidth(5);
            tbBaoCao.getColumnModel().getColumn(2).setPreferredWidth(50);
            tbBaoCao.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(127, 127, 127));
        lbTitle.setText("Danh Sách Báo Cáo Lỗi");

        pnTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.Header pnTimKiem;
    private javax.swing.JTable tbBaoCao;
    // End of variables declaration//GEN-END:variables
}
