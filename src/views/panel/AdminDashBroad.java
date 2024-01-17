
package views.panel;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Graphics;
import views.models.Model_Card;

public class AdminDashBroad extends javax.swing.JPanel {

    public AdminDashBroad() {
        initComponents();
        setData();
    }
    
    private void setData(){
        Model_Card data1 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg",39,39), "Tiêu đề", "Giá trị", "Mô tả");
        Model_Card data2 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg",39,39), "Tiêu đề", "Giá trị", "Mô tả");
        Model_Card data3 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg",39,39), "Tiêu đề", "Giá trị", "Mô tả");
        card1.SetData(data1);
        card2.SetData(data2);
        card3.SetData(data3);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConstainCard = new javax.swing.JLayeredPane();
        card1 = new views.models.Card();
        card2 = new views.models.Card();
        card3 = new views.models.Card();
        header1 = new views.panel.Header();

        setBackground(new java.awt.Color(242, 242, 242));

        panelConstainCard.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(142, 142, 250));
        card1.setColor2(new java.awt.Color(123, 123, 245));
        panelConstainCard.add(card1);

        card2.setColor1(new java.awt.Color(186, 123, 247));
        card2.setColor2(new java.awt.Color(167, 94, 236));
        panelConstainCard.add(card2);

        card3.setColor1(new java.awt.Color(241, 208, 62));
        card3.setColor2(new java.awt.Color(211, 184, 61));
        card3.setColor3(new java.awt.Color(255, 255, 255));
        panelConstainCard.add(card3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelConstainCard, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConstainCard, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(394, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.models.Card card1;
    private views.models.Card card2;
    private views.models.Card card3;
    private views.panel.Header header1;
    private javax.swing.JLayeredPane panelConstainCard;
    // End of variables declaration//GEN-END:variables
}
