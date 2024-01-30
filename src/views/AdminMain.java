package views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import models.NguoiDung;
import views.models.CurrentUser;
import views.models.EventMenuSelected;
import views.panel.admin.AdminDashBroad;
import views.panel.admin.AdminPhong;
import views.panel.admin.AdminThietBi;
import views.panel.admin.AdminYeuCau;
import views.panel.admin.AdminNguoiDung;
import views.panel.admin.FormTaiKhoan;

public class AdminMain extends javax.swing.JFrame {

    public AdminMain(NguoiDung user) {
        CurrentUser.setNguoiDung(user);
        initComponents();
        pnUserTitle.setNguoiDung(user);
        myInit();
    }

    private void myInit() {
        setBackground(new Color(0, 0, 0, 0));
        JButton button = pnUserTitle.getButtonThongBao();
        button.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                setMainPanel(new AdminYeuCau());
            }          
        });
        menu.initMoving(AdminMain.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                switch (index) {
                    case 1:
                        setMainPanel(new AdminDashBroad());
                        break;
                    case 2:
                        setMainPanel(new AdminPhong());
                        break;
                    case 3:
                        setMainPanel(new AdminThietBi());
                        break;
                    case 4:
                        setMainPanel(new AdminNguoiDung());
                        break;
                    case 5:
                        setMainPanel(new AdminYeuCau());
                        break;
                    case 10:
                        setMainPanel(new FormTaiKhoan());
                        break;
                    case 11:
                        int checkLogout = JOptionPane.showConfirmDialog(AdminMain.this, "Đăng xuất tài khoản hiện tại?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
                        if (checkLogout == JOptionPane.YES_OPTION) {
                            AdminMain.this.dispose();
                            new LoginForm().setVisible(true);
                        }
                        break;
                    case 14:
                        int checkExit = JOptionPane.showConfirmDialog(AdminMain.this, "Thoát ứng dụng?", "Thoát", JOptionPane.YES_NO_OPTION);
                        if (checkExit == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                        break;
                }
            }
        });
        setMainPanel(new AdminDashBroad());
    }

    private void setMainPanel(JComponent component) {
        mainPanel.removeAll();
        mainPanel.add(component);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        menu = new views.panel.AdminMenu();
        mainPanel = new javax.swing.JPanel();
        pnUserTitle = new views.panel.Information();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        pnUserTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(pnUserTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnUserTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    private views.panel.Information pnUserTitle;
    // End of variables declaration//GEN-END:variables
}
