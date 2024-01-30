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
            txtCoSo.setText(nguoiDung.getCoSo());
            txtVaiTro.setText(nguoiDung.getLoaiNguoiDung());
        }

        if (thongTinNguoiDung != null) {
            txtHoTen.setText(thongTinNguoiDung.getHoten());
            txtNgaySinh.setText(thongTinNguoiDung.getNgaySinh());
            cbGioiTinh.setSelectedItem(thongTinNguoiDung.getGioiTinh());
            txtSoDienThoai.setText(thongTinNguoiDung.getSoDienThoai());
            txtChuyenMon.setText(thongTinNguoiDung.getChuyenMon());
            txtDiaChi.setText(thongTinNguoiDung.getDiaChi());
        }
    }

    private void setState(Boolean state) {
        cbGioiTinh.setEnabled(state);
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
        txtCoSo = new javax.swing.JTextField();
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
        txtVaiTro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        panelBorder1.setBackground(new java.awt.Color(234, 234, 234));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(51, 51, 51));
        lbTitle.setText("Thông Tin Người Dùng");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Thông tin đăng nhập");

        txtTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        txtTaiKhoan.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtTaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        txtTaiKhoan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTaiKhoan.setEnabled(false);

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtEmail.setEnabled(false);

        txtMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        txtMatKhau.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtMatKhau.setForeground(new java.awt.Color(0, 0, 0));
        txtMatKhau.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMatKhau.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Tài Khoản");

        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Mật Khẩu");

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Cơ Sở");

        txtCoSo.setBackground(new java.awt.Color(255, 255, 255));
        txtCoSo.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtCoSo.setForeground(new java.awt.Color(0, 0, 0));
        txtCoSo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtCoSo.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Thông tin cá nhân");

        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Họ Tên");

        txtHoTen.setBackground(new java.awt.Color(255, 255, 255));
        txtHoTen.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtHoTen.setForeground(new java.awt.Color(0, 0, 0));
        txtHoTen.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHoTen.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Giới Tính");

        jLabel9.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Ngày Sinh (dd/MM/yyyy)");

        txtNgaySinh.setBackground(new java.awt.Color(255, 255, 255));
        txtNgaySinh.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtNgaySinh.setForeground(new java.awt.Color(0, 0, 0));
        txtNgaySinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgaySinh.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Số Điện Thoại");

        txtSoDienThoai.setBackground(new java.awt.Color(255, 255, 255));
        txtSoDienThoai.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtSoDienThoai.setForeground(new java.awt.Color(0, 0, 0));
        txtSoDienThoai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSoDienThoai.setEnabled(false);

        cbGioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        cbGioiTinh.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        cbGioiTinh.setForeground(new java.awt.Color(0, 0, 0));
        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbGioiTinh.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Chuyên Môn");

        txtChuyenMon.setBackground(new java.awt.Color(255, 255, 255));
        txtChuyenMon.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtChuyenMon.setForeground(new java.awt.Color(0, 0, 0));
        txtChuyenMon.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtChuyenMon.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Địa Chỉ");

        txtDiaChi.setBackground(new java.awt.Color(255, 255, 255));
        txtDiaChi.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtDiaChi.setForeground(new java.awt.Color(0, 0, 0));
        txtDiaChi.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDiaChi.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtDiaChi.setEnabled(false);

        btCapNhat.setText("Cập Nhật");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        btHuy.setText("Hủy");
        btHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHuyActionPerformed(evt);
            }
        });

        txtVaiTro.setBackground(new java.awt.Color(255, 255, 255));
        txtVaiTro.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        txtVaiTro.setForeground(new java.awt.Color(0, 0, 0));
        txtVaiTro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtVaiTro.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel13.setText("Email");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtVaiTro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtChuyenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(btCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addComponent(txtTaiKhoan))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(txtMatKhau))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(txtEmail))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(txtCoSo)
                    .addComponent(txtVaiTro))
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(txtHoTen))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(cbGioiTinh))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(txtNgaySinh))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addComponent(txtSoDienThoai))
                .addGap(15, 15, 15)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addComponent(txtChuyenMon))
                .addGap(5, 5, 5)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addComponent(txtDiaChi))
                .addGap(15, 15, 15)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

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
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        String matKhau = txtMatKhau.getText();
        String email = txtEmail.getText();
        String HoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        String gioiTinh = cbGioiTinh.getSelectedItem().toString();
        String soDienThoai = txtSoDienThoai.getText();
        String chuyenMon = txtChuyenMon.getText();
        String diaChi = txtDiaChi.getText();

        if (btCapNhat.getText().equals("Xác Nhận")) {
            if (matKhau.isBlank() || email.isBlank() || HoTen.isBlank() || ngaySinh.isBlank() || soDienThoai.isBlank() || chuyenMon.isBlank() || diaChi.isBlank()) {
                JOptionPane.showMessageDialog(this, "Chưa Nhập Đủ Thông Tin.");
                return;
            }

            int rs = JOptionPane.showConfirmDialog(this, "Xác Nhận Thay Đổi?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
            if (rs == JOptionPane.YES_OPTION) {
                NguoiDungService nguoiDungService = new NguoiDungService();
                ThongTinNguoiDungService thongTinNguoiDungService = new ThongTinNguoiDungService();

                OperationResult os1 = nguoiDungService.updateNguoiDung(nguoiDung.getMaNguoiDung(), txtTaiKhoan.getText(), matKhau, email, txtVaiTro.getText(), txtCoSo.getText());
                OperationResult os2 = thongTinNguoiDungService.updateThongTinNguoiDung(thongTinNguoiDung.getMaThongTin(), thongTinNguoiDung.getMaNguoiDung(), HoTen, gioiTinh, ngaySinh, soDienThoai, chuyenMon, diaChi);

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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbTitle;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JTextField txtChuyenMon;
    private javax.swing.JTextField txtCoSo;
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
