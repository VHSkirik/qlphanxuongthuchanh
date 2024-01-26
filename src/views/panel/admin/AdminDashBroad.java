package views.panel.admin;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.impl.DatPhongDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import models.DatPhong;
import views.models.Model_Card;
import views.table.StatusType;

public class AdminDashBroad extends javax.swing.JPanel {

    private List<DatPhong> dsDatPhong;

    public AdminDashBroad() {
        initComponents();
        spTable.getViewport().setBackground(Color.WHITE);
        myInit();
    }

    private void myInit() {
        Model_Card data1 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg", 39, 39), "Tiêu đề", "Giá trị", "Mô tả");
        Model_Card data2 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg", 39, 39), "Tiêu đề", "Giá trị", "Mô tả");
        Model_Card data3 = new Model_Card(new FlatSVGIcon("./views/icon/svg/coins.svg", 39, 39), "Tiêu đề", "Giá trị", "Mô tả");
        card1.SetData(data1);
        card2.SetData(data2);
        card3.SetData(data3);
        //add row table
        initDataTable();

    }

    private void initDataTable() {
        dsDatPhong = DatPhongDAO.getIns().getLatestDatPhong(4);
        
        for (DatPhong datPhong : dsDatPhong){
            StatusType status;
            String trangThai = datPhong.getTrangThai();
            
            if (trangThai.equals("DangCho")){
                status = StatusType.PENDING;
            } else if (trangThai.equals("DaPheDuyet")){
                status = StatusType.APPROVED;
            } else {
                status = StatusType.REJECT;
            }
            
            table.addRow(new Object[]{
                datPhong.getMaYeuCau(),
                datPhong.getMaNguoiDung(),
                datPhong.getMaPhongThucHanh(),
                datPhong.getThoiGianDat(),
                status
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelConstainCard = new javax.swing.JLayeredPane();
        card1 = new views.models.Card();
        card2 = new views.models.Card();
        card3 = new views.models.Card();
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
        jLabel1.setText("Các yêu cầu sử dụng phòng gần đây");

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
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addGap(17, 17, 17))))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(30, 30, 30)
                .addComponent(panelConstainCard, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
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
    private javax.swing.JLabel jLabel1;
    private views.panel.PanelBorder panelBorder1;
    private javax.swing.JLayeredPane panelConstainCard;
    private javax.swing.JScrollPane spTable;
    private views.table.Table table;
    // End of variables declaration//GEN-END:variables
}
