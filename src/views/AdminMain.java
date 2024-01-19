package views;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import models.NguoiDung;
import views.models.EventMenuSelected;

public class AdminMain extends javax.swing.JFrame {

    private static NguoiDung user;

    public AdminMain(NguoiDung user) {
        AdminMain.user = user;
        initComponents();
        myInit();
    }

    private void myInit() {
        setBackground(new Color(0, 0, 0, 0));
        menu.initMoving(AdminMain.this);
        menu.addEventMenuSelected(new EventMenuSelected() {
            @Override
            public void selected(int selectedIndex) {
                System.out.println("Selected: " + selectedIndex);
                switch (selectedIndex) {
                    case 11:
                        break;
                    case 14:
                        int rs = JOptionPane.showConfirmDialog(AdminMain.this, "Thoát ứng dụng?", "Thoát", JOptionPane.YES_NO_OPTION);
                        if (rs == JOptionPane.YES_OPTION) {
                            System.exit(0);
                        }
                        break;
                }
            }
        });
    }

    public static NguoiDung getUser() {
        return AdminMain.user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new views.panel.PanelBorder();
        menu = new views.panel.AdminMenu();
        sp = new javax.swing.JScrollPane();
        adminDashBroad1 = new views.panel.admin.AdminDashBroad();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        sp.setBorder(null);
        sp.setViewportView(adminDashBroad1);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp)
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
    private views.panel.admin.AdminDashBroad adminDashBroad1;
    private views.panel.AdminMenu menu;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
