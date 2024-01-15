package views.panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import views.models.Model_Menu;

public class MenuItem extends javax.swing.JPanel {

    private boolean selected;

    public MenuItem(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getMenuType() == Model_Menu.MenuType.MENU) {
            lbIcon.setIcon(data.toIcon());
            lbMenuName.setText(data.getName());
        } else if (data.getMenuType() == Model_Menu.MenuType.TITLE) {
            lbIcon.setText(data.getName());
            lbMenuName.setFont(new Font("JetBrains Mono", 1, 12));
            lbMenuName.setVisible(false);
        } else {
            lbMenuName.setText(" ");
        }
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIcon = new javax.swing.JLabel();
        lbMenuName = new javax.swing.JLabel();

        lbIcon.setFont(new java.awt.Font("JetBrains Mono Light", 1, 16)); // NOI18N
        lbIcon.setForeground(new java.awt.Color(255, 255, 255));

        lbMenuName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMenuName.setForeground(new java.awt.Color(255, 255, 255));
        lbMenuName.setText("Menu name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbIcon)
                .addGap(18, 18, 18)
                .addComponent(lbMenuName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbMenuName, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        if (selected) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(255, 255, 255, 80));
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 10, 10);
        }
        super.paintComponent(g);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbMenuName;
    // End of variables declaration//GEN-END:variables
}
