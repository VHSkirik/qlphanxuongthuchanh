package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Graphics;
import views.models.Model_Card;
import views.table.StatusType;

public class AdminDashBroad extends javax.swing.JPanel {

    public AdminDashBroad() {
        initComponents();
        setData();
    }

    private void setData() {
        Model_Card data1 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg", 39, 39), "Tiêu đề", "Giá trị", "Mô tả");
        Model_Card data2 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg", 39, 39), "Tiêu đề", "Giá trị", "Mô tả");
        Model_Card data3 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg", 39, 39), "Tiêu đề", "Giá trị", "Mô tả");
        card1.SetData(data1);
        card2.SetData(data2);
        card3.SetData(data3);
        //add row table
        spTable.getViewport().setBackground(Color.WHITE);
        table.addRow(new Object[]{"1", "2", "1", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"2", "3", "1", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"3", "4", "2", "25 Apr,2018", StatusType.REJECT});
        table.addRow(new Object[]{"4", "2", "1", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"5", "3", "1", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"6", "4", "2", "25 Apr,2018", StatusType.REJECT});
        table.addRow(new Object[]{"7", "2", "1", "25 Apr,2018", StatusType.PENDING});
        table.addRow(new Object[]{"8", "3", "1", "25 Apr,2018", StatusType.APPROVED});
        table.addRow(new Object[]{"9", "4", "2", "25 Apr,2018", StatusType.REJECT});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConstainCard = new javax.swing.JLayeredPane();
        card1 = new views.models.Card();
        card2 = new views.models.Card();
        card3 = new views.models.Card();
        header1 = new views.panel.Header();
        panelBorder1 = new views.panel.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new views.table.Table();

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

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Các yêu cầu sử dụng phòng gần nhất");

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Đặt Phòng", "Mã Giáo Viên", "Mã Phòng", "Thời Gian", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable)
                    .addComponent(jLabel1))
                .addGap(17, 17, 17))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConstainCard, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelConstainCard, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JLayeredPane panelConstainCard;
    private javax.swing.JScrollPane spTable;
    private views.table.Table table;
    // End of variables declaration//GEN-END:variables
}
