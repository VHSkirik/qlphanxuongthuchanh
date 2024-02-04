package views.panel;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.time.LocalTime;
import javax.swing.JButton;
import javax.swing.Timer;
import models.NguoiDung;
import models.ThongTinNguoiDung;
import services.ThongKeService;
import services.ThongTinNguoiDungService;

public class Information extends PanelBorderHalf {

    private NguoiDung nguoiDung;
    private ThongTinNguoiDung thongTinNguoiDung;
    private Timer timer;
    private int check = 3;
    private ThongKeService thongKeService;

    public Information() {
        initComponents();
        thongKeService = new ThongKeService();
        lbUserIcon.setIcon(new FlatSVGIcon("./views/icon/svg/admin_2.svg", 63, 63));
        timer = new Timer(1000, (e) -> {
            LocalTime currentTime = LocalTime.now();
            String time = String.format("%02d:%02d:%02d", currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
            txtTime.setText(time);
            if (check >= 3) {
                int rs = thongKeService.getSoYeuCauDangCho();
                String soLuong = (rs == 0) ? "" : rs + "";
                btThongBao.setText(soLuong);
                check = 0;
            } else {
                check++;
            }
        });
        timer.start();
    }

    private void setUserData() {
        if (nguoiDung == null) {
            return;
        }
        lbUserName.setText(nguoiDung.getTenDangNhap());
        lbRole.setText(nguoiDung.getLoaiNguoiDung());
        if (thongTinNguoiDung == null) {
            return;
        }
        lbHoTen.setText(thongTinNguoiDung.getHoten());
        lbEmail.setText(nguoiDung.getEmail());
    }

    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
        this.thongTinNguoiDung = new ThongTinNguoiDungService().get("MaNguoiDung", this.nguoiDung.getMaNguoiDung() + "").get(0);
        setUserData();
    }

    public JButton getButtonThongBao() {
        return this.btThongBao;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUserIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        btThongBao = new views.label.ThongBaoButton();
        jLabel2 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setOpaque(true);

        lbUserName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(51, 51, 51));
        lbUserName.setText("User Name ");

        lbRole.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        lbRole.setForeground(new java.awt.Color(102, 102, 102));
        lbRole.setText("Admin");

        lbEmail.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setText("Email");

        lbHoTen.setFont(new java.awt.Font("JetBrains Mono Light", 0, 14)); // NOI18N
        lbHoTen.setForeground(new java.awt.Color(0, 0, 0));
        lbHoTen.setText("Họ Tên");

        btThongBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/icon/notification.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setOpaque(true);

        txtTime.setFont(new java.awt.Font("JetBrains Mono", 0, 14)); // NOI18N
        txtTime.setForeground(new java.awt.Color(0, 0, 0));
        txtTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTime.setText("00:00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbUserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRole)
                    .addComponent(lbUserName))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(lbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUserIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btThongBao, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.label.ThongBaoButton btThongBao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserIcon;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables
}
