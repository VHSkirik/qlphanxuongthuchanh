package views.panel.giaovien;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.impl.PhongThucHanhDAO;
import dao.impl.ThietBiDAO;
import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import models.NguoiDung;
import models.PhongThucHanh;
import services.PhongThucHanhService;
import views.models.CurrentUser;

public class ChonPhongDiaLog extends javax.swing.JDialog {
    
    private GiaoVienYeuCau main;
    private NguoiDung nguoiDung;
    private HashMap<Integer, String> hmPhongThucHanh = new HashMap<>();
    private int idPhong = 0;
    
    public ChonPhongDiaLog(GiaoVienYeuCau main, java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.nguoiDung = CurrentUser.getNguoiDung();
        this.main = main;
        setUndecorated(true);
        initComponents();
        pnMain.setDrawBorder(true);
        myInit();
    }
    
    private void myInit() {
        btSubmit.setIcon(new FlatSVGIcon("./views/icon/svg/Checkmark.svg", 40, 40));
        btHuy.setIcon(new FlatSVGIcon("./views/icon/svg/Cancel_2.svg", 40, 40));
        
        cbToaNha.removeAllItems();
        cbToaNha.addItem(" ");
        cbToaNha.setSelectedIndex(0);
        List<String> dsToa = PhongThucHanhDAO.getIns().findToaByDiaDiem(nguoiDung.getCoSo() + "");
        for (String toa : dsToa) {
            cbToaNha.addItem(toa);
        }
    }
    
    private void initDataPhong() {
        cbPhong.removeAllItems();
        cbPhong.addItem(" ");
        cbPhong.setSelectedIndex(0);
        if (cbToaNha.getSelectedIndex() != 0 && cbToaNha.getSelectedItem() != null) {
            List<PhongThucHanh> dsPhong = new PhongThucHanhService().getByDiaDiemAndToa(nguoiDung.getCoSo(), cbToaNha.getSelectedItem().toString());
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new views.panel.PanelBorder();
        cbToaNha = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbPhong = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoaiPhong = new javax.swing.JTextField();
        txtSoMay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        btHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbToaNha.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbToaNha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbToaNha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbToaNhaActionPerformed(evt);
            }
        });
        pnMain.add(cbToaNha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 30));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tòa Nhà");
        pnMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 20));

        cbPhong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        cbPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPhongActionPerformed(evt);
            }
        });
        pnMain.add(cbPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 30));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Loại Phòng");
        pnMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));

        txtTinhTrang.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtTinhTrang.setEnabled(false);
        pnMain.add(txtTinhTrang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 180, 30));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Phòng");
        pnMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 20));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tình Trạng");
        pnMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 20));

        txtLoaiPhong.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtLoaiPhong.setEnabled(false);
        pnMain.add(txtLoaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 30));

        txtSoMay.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtSoMay.setEnabled(false);
        pnMain.add(txtSoMay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 30));

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Số Máy Khả Dụng");
        pnMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, 20));

        btSubmit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(25, 118, 211));
        btSubmit.setText("SUBMIT");
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.setIconTextGap(1);
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        pnMain.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 140, 40));

        btHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btHuy.setForeground(new java.awt.Color(255, 0, 0));
        btHuy.setText("HỦY");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        pnMain.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbToaNhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbToaNhaActionPerformed
        initDataPhong();
    }//GEN-LAST:event_cbToaNhaActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        if (txtTinhTrang.getText().equals("DangSuaChua")) {
            JOptionPane.showMessageDialog(this, "Không thể chọn phòng này.");
        } else {
            main.getTxtMaPhong().setText(idPhong + "");
            this.dispose();
        }
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        int rs = JOptionPane.showConfirmDialog(this, "Hủy bản ghi hiện tại?", "Hủy", JOptionPane.YES_NO_OPTION);
        if (rs == JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_btHuyActionPerformed

    private void cbPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPhongActionPerformed
        if (cbPhong.getSelectedItem() == null) {
            return;
        }
        if (cbPhong.getSelectedIndex() != 0) {
            idPhong = getIdPhong();
            PhongThucHanh phongThucHanh = PhongThucHanhDAO.getIns().findOne(idPhong);
            txtLoaiPhong.setText(phongThucHanh.getLoaiPhong());
            txtSoMay.setText(ThietBiDAO.getIns().countNonHongPhong(idPhong) + "");
            txtTinhTrang.setText(phongThucHanh.getTinhTrang());
            if (phongThucHanh.getTinhTrang().equals("DangSuaChua")) {
                txtTinhTrang.setForeground(Color.red);
            } else {
                txtTinhTrang.setForeground(Color.GREEN);
            }
        } else {
            
        }
    }//GEN-LAST:event_cbPhongActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btHuy;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbPhong;
    private javax.swing.JComboBox<String> cbToaNha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private views.panel.PanelBorder pnMain;
    private javax.swing.JTextField txtLoaiPhong;
    private javax.swing.JTextField txtSoMay;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
