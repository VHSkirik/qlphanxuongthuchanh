package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import models.NguoiDung;
import models.ThongTinNguoiDung;
import services.ThongTinNguoiDungService;

public class FormTaiKhoan2 extends javax.swing.JPanel {

    private NguoiDung nguoiDung;
    private ThongTinNguoiDung thongTinNguoiDung;

    public FormTaiKhoan2(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
        this.thongTinNguoiDung = new ThongTinNguoiDungService().get("MaNguoiDung", nguoiDung.getMaNguoiDung() + "").get(0);
        initComponents();
        myInit();
    }

    private void myInit() {
        lbTitle.setIcon(new FlatSVGIcon("./views/icon/svg/infor_black.svg", 35, 35));
        btHuy.setVisible(false);
        initData();
    }

    private void initData() {
        if (nguoiDung != null) {
            lbTaiKhoan.setText(nguoiDung.getTenDangNhap());
            lbMatKhau.setText(nguoiDung.getMatKhau());
            lbEmail.setText(nguoiDung.getEmail());
            lbVaiTro.setText(nguoiDung.getLoaiNguoiDung());
        }

        if (thongTinNguoiDung != null) {
            lbHoTen.setText(thongTinNguoiDung.getHoten());
            lbNgaySinh.setText("");
            lbSoDienThoai.setText(thongTinNguoiDung.getSoDienThoai());
            lbChuyenMon.setText(thongTinNguoiDung.getChuyenMon());
            lbDiaChi.setText(thongTinNguoiDung.getDiaChi());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        lbTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbTaiKhoan = new javax.swing.JTextField();
        lbEmail = new javax.swing.JTextField();
        lbMatKhau = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbVaiTro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbSoDienThoai = new javax.swing.JTextField();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        lbChuyenMon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lbDiaChi = new javax.swing.JTextField();
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

        lbTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbTaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        lbTaiKhoan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbTaiKhoan.setEnabled(false);
        panelBorder1.add(lbTaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 296, 35));

        lbEmail.setBackground(new java.awt.Color(255, 255, 255));
        lbEmail.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbEmail.setEnabled(false);
        panelBorder1.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 296, 35));

        lbMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        lbMatKhau.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbMatKhau.setForeground(new java.awt.Color(0, 0, 0));
        lbMatKhau.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbMatKhau.setEnabled(false);
        panelBorder1.add(lbMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 296, 35));

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

        lbVaiTro.setBackground(new java.awt.Color(255, 255, 255));
        lbVaiTro.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbVaiTro.setForeground(new java.awt.Color(0, 0, 0));
        lbVaiTro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbVaiTro.setEnabled(false);
        panelBorder1.add(lbVaiTro, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 148, 35));
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

        lbHoTen.setBackground(new java.awt.Color(255, 255, 255));
        lbHoTen.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(0, 0, 0));
        lbHoTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbHoTen.setEnabled(false);
        panelBorder1.add(lbHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 296, 35));

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Giới Tính");
        panelBorder1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 123, -1));

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Ngày Sinh");
        panelBorder1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 123, -1));

        lbNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        lbNgaySinh.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbNgaySinh.setForeground(new java.awt.Color(0, 0, 0));
        lbNgaySinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbNgaySinh.setEnabled(false);
        panelBorder1.add(lbNgaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 296, 35));

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Số Điện Thoại");
        panelBorder1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 123, -1));

        lbSoDienThoai.setBackground(new java.awt.Color(255, 255, 255));
        lbSoDienThoai.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbSoDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        lbSoDienThoai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbSoDienThoai.setEnabled(false);
        panelBorder1.add(lbSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 296, 35));

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

        lbChuyenMon.setBackground(new java.awt.Color(255, 255, 255));
        lbChuyenMon.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbChuyenMon.setForeground(new java.awt.Color(0, 0, 0));
        lbChuyenMon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbChuyenMon.setEnabled(false);
        panelBorder1.add(lbChuyenMon, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 296, 35));

        jLabel12.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Địa Chỉ");
        panelBorder1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 123, -1));

        lbDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        lbDiaChi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbDiaChi.setForeground(new java.awt.Color(0, 0, 0));
        lbDiaChi.setCaretColor(new java.awt.Color(0, 0, 0));
        lbDiaChi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbDiaChi.setEnabled(false);
        panelBorder1.add(lbDiaChi, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 296, 35));

        btCapNhat.setText("Cập Nhật");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });
        panelBorder1.add(btCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 140, 35));

        btHuy.setText("Hủy");
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
        if (btCapNhat.getText().equals("Xác Nhận")) {
            
        } else {
            lbEmail.setEnabled(true);
            lbMatKhau.setEnabled(true);
            lbNgaySinh.setEnabled(true);
            lbSoDienThoai.setEnabled(true);
            lbDiaChi.setEnabled(true);
            lbChuyenMon.setEnabled(true);
            btCapNhat.setText("Xác Nhận");
            btHuy.setVisible(true);
        }
    }//GEN-LAST:event_btCapNhatActionPerformed


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
    private javax.swing.JTextField lbChuyenMon;
    private javax.swing.JTextField lbDiaChi;
    private javax.swing.JTextField lbEmail;
    private javax.swing.JTextField lbHoTen;
    private javax.swing.JTextField lbMatKhau;
    private javax.swing.JTextField lbNgaySinh;
    private javax.swing.JTextField lbSoDienThoai;
    private javax.swing.JTextField lbTaiKhoan;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField lbVaiTro;
    private views.panel.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
