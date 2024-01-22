package services;

import dao.impl.BaoCaoThietBiDAO;
import dao.impl.ThietBiDAO;
import models.BaoCaoThietBi;
import models.OperationResult;

public class BaoCaoThietBiService {

    public OperationResult createBaoCaoThietBi(Integer MaBaoCao, Integer MaThietBi, String NgayBaoCao, String NoiDungBaoCao) {
        // Kiểm tra trống
        if (NgayBaoCao.isBlank() || NoiDungBaoCao.isBlank()) {
            return OperationResult.ADD_FAILURE;
        } 
        else if (ThietBiDAO.getIns().findOne(MaThietBi) != null) {
                return OperationResult.ADD_FAILURE;
            }
        else if (BaoCaoThietBiDAO.getIns().findOne(MaBaoCao) != null) {
                return OperationResult.ADD_FAILURE;
            } else {
                BaoCaoThietBi baoCaoThietBi = new BaoCaoThietBi(MaBaoCao, MaThietBi, NgayBaoCao, NoiDungBaoCao);
                int result = BaoCaoThietBiDAO.getIns().create(baoCaoThietBi);
                return (result == -1) ? OperationResult.ADD_FAILURE : OperationResult.ADD_SUCCESS;
            }
        
    }

    public OperationResult updateBaoCaoThietBi(Integer MaBaoCao, Integer MaThietBi, String NgayBaoCao, String NoiDungBaoCao) {
        // Kiểm tra trống
        if (NgayBaoCao.isBlank() || NoiDungBaoCao.isBlank()) {
            return OperationResult.EDIT_FAILURE;
        } else {
            if (BaoCaoThietBiDAO.getIns().findOne(MaBaoCao) == null) {
                return OperationResult.EDIT_FAILURE;
            } else {
                BaoCaoThietBi baoCaoThietBi = new BaoCaoThietBi(MaBaoCao, MaThietBi, NgayBaoCao, NoiDungBaoCao);
                int result = BaoCaoThietBiDAO.getIns().update(baoCaoThietBi, MaBaoCao);
                return (result == -1) ? OperationResult.EDIT_FAILURE : OperationResult.EDIT_SUCCESS;
            }
        }
    }

    public OperationResult deleteBaoCaoThietBi(int ma) {
        int result = BaoCaoThietBiDAO.getIns().delete(ma);
        return (result == -1) ? OperationResult.DELETE_FAILURE : OperationResult.DELETE_SUCCESS;
    }
}
