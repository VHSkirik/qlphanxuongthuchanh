package views.panel.giaovien;

import dao.impl.PhongThucHanhDAO;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JPanel;
import models.LichThucHanh2;
import models.PhongThucHanh;
import services.LichThucHanhService;
import views.models.CurrentUser;

public class LichHocTheoNgay extends JPanel {

    private List<LichThucHanh2> dsLichThucHanh;
    private final LichThucHanhService lichThucHanhService = new LichThucHanhService();

    public LichHocTheoNgay(String ngay) {
        dsLichThucHanh = lichThucHanhService.getLichThucHanh(CurrentUser.getNguoiDung().getMaNguoiDung(), ngay);
        setBackground(new Color(255, 255, 255));
        GridLayout layout = new GridLayout(6, 1);
        if (dsLichThucHanh.size() > 6) {
            layout = new GridLayout(dsLichThucHanh.size(), 1);
        }
        this.setLayout(layout);
        myInit();
    }

    private void myInit() {
        for (LichThucHanh2 lichThucHanh : dsLichThucHanh) {
            DataLichHoc dataLichHoc = new DataLichHoc();
            dataLichHoc.setMonHoc(lichThucHanh.getMon());
            dataLichHoc.setTietHoc("Tiết: " + lichThucHanh.getTietBatDau() + " - " + lichThucHanh.getTietKetTHuc());
            String tenPhongThucHanh = new PhongThucHanhDAO().findOne(lichThucHanh.getMaPhongThucHanh()).getTenPhong();
            dataLichHoc.setPhongHoc("Phòng: " + tenPhongThucHanh);
            this.add(dataLichHoc);
        }
    }
}
