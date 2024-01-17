/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import dao.impl.NguoiDungDAO;
import javax.swing.JOptionPane;
import models.NguoiDung;
import views.CanBoMain;
import views.GiaoVienMain;

/**
 *
 * @author ducanh
 */
public class LoginService {
     public static void checkLogin(String username, String password) {
        if (username.isBlank() || password.isBlank()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            NguoiDung ngd = NguoiDungDAO.getIns().findUserName(username);
            handleLoginResult(ngd, password);
        }
    }

    private static void handleLoginResult(NguoiDung nv, String password) {
        if (nv == null) {
            JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            if (!nv.getMatKhau().equals(password)) {
                JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                openMainForm(nv);
            }
        }
    }
    
      private static void openMainForm(NguoiDung nv) {
        String lnd = nv.getLoaiNguoiDung();
//        if(lnd.equals("Admin")){
//            AdminMain admin = new AdminMain(nv);
//            admin.setVisible(true);
//        } else
            if(lnd.equals("CanBoKiemKe")){
            CanBoMain cb = new CanBoMain(nv);
            cb.setVisible(true);
        } else if(lnd.equals("GiaoVien")){
          GiaoVienMain gv = new GiaoVienMain(nv);
      }
        
    }

    
}
