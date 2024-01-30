package views.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import views.models.EventMenuSelected;
import views.models.ListMenu;
import views.models.Model_Menu;

public class AdminMenu extends javax.swing.JPanel {

    private int x;
    private int y;
    private EventMenuSelected event;

    public AdminMenu() {
        initComponents();
        setOpaque(false);
        listMenu.setOpaque(false);
        listMenu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        myInit();
    }

    private void myInit() {
        listMenu.addItem(new Model_Menu("", "Admin", Model_Menu.MenuType.TITLE));
        listMenu.addItem(new Model_Menu("1", "DashBroad", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("2", "Phòng", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("3", "Thiết Bị", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("multi_user", "Người Dùng", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("gv3", "Yêu Cầu", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("error", "Báo Cáo Lỗi", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("feedback", "Phản Hồi", Model_Menu.MenuType.MENU));
                listMenu.addItem(new Model_Menu("5", "Thống Kê", Model_Menu.MenuType.MENU));

        listMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu.addItem(new Model_Menu("", "Cá Nhân", Model_Menu.MenuType.TITLE));

        listMenu.addItem(new Model_Menu("20", "Tài Khoản", Model_Menu.MenuType.MENU));
        listMenu.addItem(new Model_Menu("22", "Đăng Xuất", Model_Menu.MenuType.MENU));

        listMenu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        listMenu.addItem(new Model_Menu("", "Khác", Model_Menu.MenuType.TITLE));
        listMenu.addItem(new Model_Menu("exit", "Thoát", Model_Menu.MenuType.MENU));

    }

    public ListMenu<String> getListMenu() {
        return this.listMenu;
    }

    public void initMoving(JFrame frame) {
        panelMoving.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

        });

        panelMoving.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                frame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }

        });

    }

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu.addEventMenuSelected(event);
    }

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0, 0, Color.decode("#ee0979"), 0, getHeight(), Color.decode("#ff6a00"));
        g2.setPaint(gp);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(g);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        sVGImage1.setSVGImage("./views/icon/svg/uneti_2.svg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        sVGImage1 = new views.label.SVGImage();
        jLabel1 = new javax.swing.JLabel();
        listMenu = new views.models.ListMenu<>();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        panelMoving.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Application");

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sVGImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMovingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMovingLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private views.models.ListMenu<String> listMenu;
    private javax.swing.JPanel panelMoving;
    private views.label.SVGImage sVGImage1;
    // End of variables declaration//GEN-END:variables
}
