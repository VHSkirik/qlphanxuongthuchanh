package services;

import dao.impl.DatPhongDAO;
import dao.impl.NguoiDungDAO;
import dao.impl.PhanHoiDAO;
import dao.impl.ThietBiDAO;

public class ThongKeService {
    
    public int getSoNguoiDung(){
        //trả về tổng số người dùng trên hệ thống trừ admin
        
        return NguoiDungDAO.getIns().countNonAdminUsers();
    }
    
    public int getSoThietBi(){
        // trả tổng số thiết bị đang hoạt động được
        return ThietBiDAO.getIns().countNonHong();
    }
    
    public double getDiemTrungBinh(){
        // trả về tổng số điểm trung bình của đánh giá
        return PhanHoiDAO.getIns().calculateAverageRating();
    }
    
    public int getSoYeuCauDangCho(){
        return DatPhongDAO.getIns().getSoYeuCauDangCho();
    }
    
}
