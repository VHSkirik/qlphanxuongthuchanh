package views.panel.giaovien;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import models.LichThucHanh;

public class LichHocTheoNgay extends JPanel {

    private List<LichThucHanh> lichThucHanhs;
    
    public LichHocTheoNgay() {
        setBackground(new Color(255,255,255));
        GridLayout layout = new GridLayout(4, 1);
        this.setLayout(layout);
        myInit();
    }

    private void myInit() {
        DataLichHoc dt1 = new DataLichHoc();
        DataLichHoc dt2 = new DataLichHoc();
        this.add(dt1, 0, 0);
        this.add(dt2, 1, 0);
    }
}
