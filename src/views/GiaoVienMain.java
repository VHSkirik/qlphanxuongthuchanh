package views;

import java.awt.Color;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import models.NguoiDung;
import views.models.CurrentUser;
import views.models.EventMenuSelected;
import views.panel.admin.AdminDashBroad;
import views.panel.admin.FormTaiKhoan;
import views.panel.giaovien.FormLichTrinh;

public class GiaoVienMain extends javax.swing.JFrame {

    public GiaoVienMain(NguoiDung user) {
        CurrentUser.setNguoiDung(user);
        initComponents();
        pnInfor.setNguoiDung(user);
        myInit();
    }
    
    private void myInit(){
        setBackground(new Color(0, 0, 0, 0));
        pnInfor.getButtonThongBao().setVisible(false);
        menu.initMoving(this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int index) {
                System.out.println(index);
                switch (index) {
                    case 1:
                        setMainPanel(new FormLichTrinh());
                        break;
                    case 2:
                   
                        break;
                    case 3:
                 
                        break;
                    case 4:
                    
                        break;
                    case 5:
                     
                        break;
                    case 6:
                        setMainPanel(new FormTaiKhoan());
                        break;
                    case 7:
                        int checkLogout = JOptionPane.showConfirmDialog(GiaoVienMain.this, "Đăng xuất tài khoản hiện tại?", "Đăng xuất", JOptionPane.YES_NO_OPTION);
                        if (checkLogout == JOptionPane.YES_OPTION) {
                            GiaoVienMain.this.dispose();
                            new LoginForm().setVisible(true);
                        }
                        break;
                    case 10:
                        int checkExit = JOptionPane.showConfirmDialog(GiaoVienMain.this, "Thoát ứng dụng?", "Thoát", JOptionPane.YES_NO_OPTION);
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
        menu = new views.panel.GiaoVienMenu();
        pnInfor = new views.panel.Information();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnInfor, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnInfor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel mainPanel;
    private views.panel.GiaoVienMenu menu;
    private views.panel.PanelBorder panelBorder1;
    private views.panel.Information pnInfor;
    // End of variables declaration//GEN-END:variables
}
