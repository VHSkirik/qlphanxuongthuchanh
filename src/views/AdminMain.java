package views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import models.NguoiDung;
import views.models.EventMenuSelected;
import views.panel.admin.AdminDashBroad;
import views.panel.admin.AdminPhong;
import views.panel.admin.AdminThietBi;
import views.panel.admin.AdminYeuCau;
import views.panel.admin.AdminNguoiDung;
import views.panel.admin.AdminTaiKhoan;

public class AdminMain extends javax.swing.JFrame {

    private static NguoiDung user;
    private final AdminDashBroad dashBroad;
    private final AdminPhong adminPhong;
    private final AdminThietBi adminThietBi;
    private final AdminYeuCau adminYeuCau;
    private final AdminNguoiDung adminNguoiDung;
    private final AdminTaiKhoan adminTaiKhoan;

    public AdminMain(NguoiDung user) {
        AdminMain.user = user;
        initComponents();
        dashBroad = new AdminDashBroad();
        adminPhong = new AdminPhong();
        adminThietBi = new AdminThietBi();
        adminYeuCau = new AdminYeuCau();
        adminNguoiDung = new AdminNguoiDung();
        adminTaiKhoan = new AdminTaiKhoan();
        myInit();
    }

    private void myInit() {
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(AdminMain.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.println("Selected: " + index);
                switch (index) {
                    case 1:
                        setMainPanel(dashBroad);
                        break;
                    case 2:
                        setMainPanel(adminPhong);
                        break;
                    case 3:
                        setMainPanel(adminThietBi);
                        break;
                    case 4:
                        setMainPanel(adminNguoiDung);
                        break;
                    case 5:
                        setMainPanel(adminYeuCau);
                        break;
                    case 9:
                        setMainPanel(adminTaiKhoan);
                        break;
                    case 10:
                        int checkLogout = JOptionPane.showConfirmDialog(AdminMain.this, "Đăng xuất tài khoản hiện tại?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
                        if (checkLogout == JOptionPane.YES_OPTION) {
                            AdminMain.this.dispose();
                            new LoginForm().setVisible(true);
                        }
                        break;
                    case 13:
                        int checkExit = JOptionPane.showConfirmDialog(AdminMain.this, "Thoát ứng dụng?", "Thoát", JOptionPane.YES_NO_OPTION);
                        if (checkExit == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                        break;
                }
            }
        });
        setMainPanel(dashBroad);
    }

    private void setMainPanel(JComponent component) {
        mainPanel.removeAll();
        mainPanel.add(component);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public static NguoiDung getUser() {
        return AdminMain.user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        menu = new views.panel.AdminMenu();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMain(new NguoiDung()).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private views.panel.AdminMenu menu;
    private views.panel.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
