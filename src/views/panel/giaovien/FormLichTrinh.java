package views.panel.giaovien;

import java.util.HashMap;
import views.models.DateHashMap;

public class FormLichTrinh extends javax.swing.JPanel {

    public FormLichTrinh() {
        initComponents();
        myInit();
    }
    
    private void myInit(){
        initNgay();
        initLich();
    }
    
    private void initNgay(){
        HashMap<String, String> dsNgay = DateHashMap.getCurrentWeekDays();
        pnThu2.setNgay(dsNgay.get("Thứ Hai"));
        pnThu3.setNgay(dsNgay.get("Thứ Ba"));
        pnThu4.setNgay(dsNgay.get("Thứ Tư"));
        pnThu5.setNgay(dsNgay.get("Thứ Năm"));
        pnThu6.setNgay(dsNgay.get("Thứ Sáu"));
        pnThu7.setNgay(dsNgay.get("Thứ Bảy"));
        pnChuNhat.setNgay(dsNgay.get("Chủ Nhật"));
    }
    
    private void initLich(){
        for (int i = 0 ; i < 7 ; i++){
            pnLichHoc.add(new LichHocTheoNgay());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnThu2 = new views.panel.giaovien.NgayLichTrinh();
        pnThu3 = new views.panel.giaovien.NgayLichTrinh();
        pnThu4 = new views.panel.giaovien.NgayLichTrinh();
        pnThu5 = new views.panel.giaovien.NgayLichTrinh();
        pnThu6 = new views.panel.giaovien.NgayLichTrinh();
        pnThu7 = new views.panel.giaovien.NgayLichTrinh();
        pnChuNhat = new views.panel.giaovien.NgayLichTrinh();
        pnLichHoc = new javax.swing.JLayeredPane();

        setBackground(new java.awt.Color(255, 255, 255));

        jLayeredPane1.setLayout(new java.awt.GridLayout(1, 0));

        pnThu2.setNgay(" ");
        pnThu2.setThu("Thứ 2");
        jLayeredPane1.add(pnThu2);

        pnThu3.setNgay(" ");
        pnThu3.setThu("Thứ 3");
        jLayeredPane1.add(pnThu3);

        pnThu4.setNgay(" ");
        pnThu4.setThu("Thứ 4");
        jLayeredPane1.add(pnThu4);

        pnThu5.setNgay(" ");
        pnThu5.setThu("Thứ 5");
        jLayeredPane1.add(pnThu5);

        pnThu6.setNgay(" ");
        pnThu6.setThu("Thứ 6");
        jLayeredPane1.add(pnThu6);

        pnThu7.setNgay(" ");
        pnThu7.setThu("Thứ 7");
        jLayeredPane1.add(pnThu7);

        pnChuNhat.setNgay(" ");
        pnChuNhat.setThu("Chủ Nhật");
        jLayeredPane1.add(pnChuNhat);

        pnLichHoc.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
            .addComponent(pnLichHoc)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnLichHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private views.panel.giaovien.NgayLichTrinh pnChuNhat;
    private javax.swing.JLayeredPane pnLichHoc;
    private views.panel.giaovien.NgayLichTrinh pnThu2;
    private views.panel.giaovien.NgayLichTrinh pnThu3;
    private views.panel.giaovien.NgayLichTrinh pnThu4;
    private views.panel.giaovien.NgayLichTrinh pnThu5;
    private views.panel.giaovien.NgayLichTrinh pnThu6;
    private views.panel.giaovien.NgayLichTrinh pnThu7;
    // End of variables declaration//GEN-END:variables
}
