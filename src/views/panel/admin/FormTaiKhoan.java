package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JOptionPane;
import models.NguoiDung;
import models.OperationResult;
import models.ThongTinNguoiDung;
import services.NguoiDungService;
import services.ThongTinNguoiDungService;
import views.models.CurrentUser;

public class FormTaiKhoan extends javax.swing.JPanel {

    private NguoiDung nguoiDung;
    private ThongTinNguoiDung thongTinNguoiDung;

    public FormTaiKhoan() {
        initComponents();
        myInit();
    }

    private void myInit() {
        this.nguoiDung = CurrentUser.getNguoiDung();
        this.thongTinNguoiDung = new ThongTinNguoiDungService().get("MaNguoiDung", nguoiDung.getMaNguoiDung() + "").get(0);
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/infor_black.svg", 35, 35));
        btHuy.setVisible(false);
        initData();
    }

    private void initData() {
        if (nguoiDung != null) {
            txtTaiKhoan.setText(nguoiDung.getTenDangNhap());
            txtMatKhau.setText(nguoiDung.getMatKhau());
            txtEmail.setText(nguoiDung.getEmail());
            txtVaiTro.setText(nguoiDung.getLoaiNguoiDung());
        }

        if (thongTinNguoiDung != null) {
            txtHoTen.setText(thongTinNguoiDung.getHoten());
            txtNgaySinh.setText("");
            txtSoDienThoai.setText(thongTinNguoiDung.getSoDienThoai());
            txtChuyenMon.setText(thongTinNguoiDung.getChuyenMon());
            txtDiaChi.setText(thongTinNguoiDung.getDiaChi());
        }
    }

    private void setState(Boolean state) {
        txtEmail.setEnabled(state);
        txtMatKhau.setEnabled(state);
        txtHoTen.setEnabled(state);
        txtNgaySinh.setEnabled(state);
        txtSoDienThoai.setEnabled(state);
        txtDiaChi.setEnabled(state);
        txtChuyenMon.setEnabled(state);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        lbTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtVaiTro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtChuyenMon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btCapNhat = new javax.swing.JButton();
        btHuy = new javax.swing.JButton();

        panelBorder1.setBackground(new java.awt.Color(234, 234, 234));
        panelBorder1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(51, 51, 51));
        lbTitle.setText("Thông Tin Người Dùng");
        panelBorder1.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 19, 254, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Thông tin đăng nhập");
        panelBorder1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 60, 174, 26));

        txtTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtTaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        txtTaiKhoan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTaiKhoan.setEnabled(false);
        panelBorder1.add(txtTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 296, 35));

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.setEnabled(false);
        panelBorder1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 296, 35));

        txtMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(0, 0, 0));
        txtMatKhau.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMatKhau.setEnabled(false);
        panelBorder1.add(txtMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 296, 35));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Tài Khoản");
        panelBorder1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 123, -1));

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Mật Khẩu");
        panelBorder1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 123, -1));

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Email");
        panelBorder1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 123, -1));

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Vai Trò");
        panelBorder1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 123, -1));

        txtVaiTro.setBackground(new java.awt.Color(255, 255, 255));
        txtVaiTro.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtVaiTro.setForeground(new java.awt.Color(0, 0, 0));
        txtVaiTro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtVaiTro.setEnabled(false);
        panelBorder1.add(txtVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 148, 35));
        panelBorder1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 270, 746, 8));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Thông tin cá nhân");
        panelBorder1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 284, 174, 26));

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Họ Tên");
        panelBorder1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 123, -1));

        txtHoTen.setBackground(new java.awt.Color(255, 255, 255));
        txtHoTen.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtHoTen.setForeground(new java.awt.Color(0, 0, 0));
        txtHoTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoTen.setEnabled(false);
        panelBorder1.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 296, 35));

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Giới Tính");
        panelBorder1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 123, -1));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Ngày Sinh (dd/MM/yyyy)");
        panelBorder1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 410, 210, -1));

        txtNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        txtNgaySinh.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtNgaySinh.setForeground(new java.awt.Color(0, 0, 0));
        txtNgaySinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgaySinh.setEnabled(false);
        panelBorder1.add(txtNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 296, 35));

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Số Điện Thoại");
        panelBorder1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 123, -1));

        txtSoDienThoai.setBackground(new java.awt.Color(255, 255, 255));
        txtSoDienThoai.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtSoDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        txtSoDienThoai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSoDienThoai.setEnabled(false);
        panelBorder1.add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 296, 35));

        cbGioiTinh.setBackground(new java.awt.Color(60, 63, 65));
        cbGioiTinh.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        cbGioiTinh.setForeground(new java.awt.Color(0, 0, 0));
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbGioiTinh.setEnabled(false);
        panelBorder1.add(cbGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 133, 35));

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Chuyên Môn");
        panelBorder1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, 123, -1));

        txtChuyenMon.setBackground(new java.awt.Color(255, 255, 255));
        txtChuyenMon.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtChuyenMon.setForeground(new java.awt.Color(0, 0, 0));
        txtChuyenMon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtChuyenMon.setEnabled(false);
        panelBorder1.add(txtChuyenMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 296, 35));

        jLabel12.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Địa Chỉ");
        panelBorder1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 123, -1));

        txtDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        txtDiaChi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(0, 0, 0));
        txtDiaChi.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDiaChi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDiaChi.setEnabled(false);
        panelBorder1.add(txtDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 296, 35));

        btCapNhat.setText("Cập Nhật");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });
        panelBorder1.add(btCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 140, 35));

        btHuy.setText("Hủy");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });
        panelBorder1.add(btHuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, 130, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        String matKhau = txtMatKhau.getText();
        String email = txtEmail.getText();
        String HoTen = txtHoTen.getText();
//        String ngaySinh = txtNgaySinh.getText();
        String soDienThoai = txtSoDienThoai.getText();
        String chuyenMon = txtChuyenMon.getText();
        String diaChi = txtDiaChi.getText();
        
        if (matKhau.isBlank() || email.isBlank() || HoTen.isBlank() || soDienThoai.isBlank() || chuyenMon.isBlank() || diaChi.isBlank()){
            JOptionPane.showMessageDialog(this, "Chưa Nhập Đủ Thông Tin.");
            return;
        }
        
        if (btCapNhat.getText().equals("Xác Nhận")) {
            int rs = JOptionPane.showConfirmDialog(this, "Xác Nhận Thay Đổi?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                NguoiDungService nguoiDungService = new NguoiDungService();
                ThongTinNguoiDungService thongTinNguoiDungService = new ThongTinNguoiDungService();
                
                OperationResult os1 = nguoiDungService.updateNguoiDung(nguoiDung.getMaNguoiDung(), txtTaiKhoan.getText(), matKhau, email, txtVaiTro.getText());
                OperationResult os2 = thongTinNguoiDungService.updateThongTinNguoiDung(thongTinNguoiDung.getMaThongTin(), thongTinNguoiDung.getMaNguoiDung(), HoTen, soDienThoai, chuyenMon, diaChi);
                
                if (os1.isSuccess() && os2.isSuccess()) {
                    JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công.");
                    CurrentUser.setNguoiDung(nguoiDungService.get("MaNguoiDung", nguoiDung.getMaNguoiDung() + "").get(0));
                    myInit();
                    btCapNhat.setText("Cập Nhật");
                } else {
                    JOptionPane.showMessageDialog(this, "Cập Nhật Thất Bại.\nHãy kiểm tra lại.");
                }
            }
        } else {
            setState(true);
            btHuy.setVisible(true);
            btCapNhat.setText("Xác Nhận");
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHuyActionPerformed
        btCapNhat.setText("Cập Nhật");
        btHuy.setVisible(false);
        setState(false);
        initData();
    }//GEN-LAST:event_btHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btHuy;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTextField txtChuyenMon;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtVaiTro;
    // End of variables declaration//GEN-END:variables
}
