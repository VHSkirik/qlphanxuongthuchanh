package services;

import dao.impl.NguoiDungDAO;
import javax.swing.JOptionPane;
import models.NguoiDung;
import models.OperationResult;
import views.AdminMain;
import views.CanBoMain;
import views.GiaoVienMain;

/**
 *
 * @author ducanh
 */
public class LoginService {

    public static OperationResult checkLogin(String username, String password) {
        NguoiDung nv = NguoiDungDAO.getIns().findUserName(username);
        if (nv == null) {
            JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
        } else {
            if (!nv.getMatKhau().equals(password)) {
                JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác!", "Cảnh Báo", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Đăng nhập thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                openMainForm(nv);
                return OperationResult.LOGIN_SUCCESS;
            }
        }
        return OperationResult.LOGIN_FAILURE;
    }

    private static void openMainForm(NguoiDung nv) {
        String lnd = nv.getLoaiNguoiDung();
        if (lnd.equals("Admin")) {
            AdminMain admin = new AdminMain(nv);
            admin.setVisible(true);
        } else if (lnd.equals("CanBoKiemKe")) {
            CanBoMain cb = new CanBoMain(nv);
            cb.setVisible(true);
        } else if (lnd.equals("GiaoVien")) {
            GiaoVienMain gv = new GiaoVienMain(nv);
            gv.setVisible(true);
        }

    }

}
