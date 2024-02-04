package views.panel.canbo;

import dao.impl.DatPhongDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import models.NguoiDung;
import models.YeuCauTheoCoSo;
import raven.chart.ModelChart;
import views.models.CurrentUser;

public class ThongKeBieuDo extends javax.swing.JPanel {

    private int userIndex;

    public ThongKeBieuDo() {
        initComponents();
        setTitle();
        setDataYeuCau();
    }

    private void setTitle() {
        chart.setTitle("Số Lượng");
        userIndex = 0;
        chart.addLegend("Lĩnh Nam", Color.decode("#7b4397"), Color.decode("#dc2430"));
        chart.addLegend("Mỹ Xá", Color.decode("#e65c00"), Color.decode("#F9D423"));
        chart.addLegend("Minh Khai", Color.decode("#0099F7"), Color.decode("#F11712"));
        chart.addLegend("Tất Cả", Color.decode("#0099F7"), Color.decode("#F9D423"));

    }

    private void setDataYeuCau() {
        List<YeuCauTheoCoSo> dsSoYeuCau = new ArrayList<>();
        dsSoYeuCau = DatPhongDAO.getIns().findAllYeuCauTheoCoSo();
        for (YeuCauTheoCoSo yc : dsSoYeuCau) {
            double[] value;
            value = new double[]{
                yc.LinhNam(),
                yc.MinhKhai(),
                yc.MyXa(),
                yc.LinhNam() + yc.MinhKhai() + yc.MyXa()};

            chart.addData(new ModelChart(yc.Thang(), value));
        }

        chart.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new raven.chart.PanelShadow();
        chart = new raven.chart.CurveLineChart();
        cbLuaChon = new javax.swing.JComboBox<>();

        panelShadow1.setBackground(new java.awt.Color(34, 59, 69));
        panelShadow1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panelShadow1.setColorGradient(new java.awt.Color(17, 38, 47));

        chart.setForeground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        cbLuaChon.setBackground(new java.awt.Color(34, 59, 69));
        cbLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbLuaChon.setForeground(new java.awt.Color(235, 235, 235));
        cbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng yêu cầu đặt phòng" }));
        cbLuaChon.setBorder(null);
        cbLuaChon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLuaChonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(cbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbLuaChonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLuaChonItemStateChanged
        if (cbLuaChon.getSelectedIndex() == 0) {
            setDataYeuCau();
        } else if (cbLuaChon.getSelectedIndex() == 1) {

        }
    }//GEN-LAST:event_cbLuaChonItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLuaChon;
    private raven.chart.CurveLineChart chart;
    private raven.chart.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
