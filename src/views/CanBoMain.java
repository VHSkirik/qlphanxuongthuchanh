package views;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import models.NguoiDung;
import views.models.CurrentUser;
import views.panel.admin.AdminPhong;
import views.models.EventMenuSelected;
import views.panel.admin.AdminThietBi;
import views.panel.admin.FormTaiKhoan;
import views.panel.canbo.FormThongKe;

public class CanBoMain extends javax.swing.JFrame {

    public CanBoMain(NguoiDung user) {
        CurrentUser.setNguoiDung(user);
        initComponents();
        myInit();
    }

    private void myInit() {
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(CanBoMain.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.println(index);
                switch (index) {
                    case 1:
                        setMainPanel(new AdminPhong());
                        break;
                    case 2:
                        setMainPanel(new AdminThietBi());
                        break;
                    case 3:

                        break;
                    case 5:
                        setMainPanel(new FormThongKe());
                        break;
                    case 8:
                        setMainPanel(new FormTaiKhoan());
                        break;
                    case 9:
                        int checkLogout = JOptionPane.showConfirmDialog(CanBoMain.this, "Đăng xuất tài khoản hiện tại?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
                        if (checkLogout == JOptionPane.YES_OPTION) {
                            CanBoMain.this.dispose();
                            new LoginForm().setVisible(true);
                        }
                        break;
                    case 12:
                        int checkExit = JOptionPane.showConfirmDialog(CanBoMain.this, "Thoát ứng dụng?", "Thoát", JOptionPane.YES_NO_OPTION);
                        if (checkExit == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                        break;
                }
            }
        });
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
        menu = new views.panel.CanBoMenu();
        information1 = new views.panel.Information();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        information1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(information1, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(information1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.panel.Information information1;
    private javax.swing.JPanel mainPanel;
    private views.panel.CanBoMenu menu;
    private views.panel.PanelBorder panelBorder1;
    // End of variables declaration//GEN-END:variables
}
