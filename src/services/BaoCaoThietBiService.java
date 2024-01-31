package services;

import dao.impl.BaoCaoThietBiDAO;
import dao.impl.ThietBiDAO;
import java.util.List;
import models.BaoCaoThietBi;
import models.OperationResult;
import models.ResultReason;

public class BaoCaoThietBiService {

   public ResultReason createBaoCaoThietBi(Integer MaThietBi, String NgayBaoCao, String NoiDungBaoCao) {
    // Kiểm tra trống
    if (ThietBiDAO.getIns().findOne(MaThietBi) == null) {
        return new ResultReason(OperationResult.ADD_FAILURE, "ThietBi not found");
    } else {
        BaoCaoThietBi baoCaoThietBi = new BaoCaoThietBi(null, MaThietBi, NgayBaoCao, NoiDungBaoCao);
        int result = BaoCaoThietBiDAO.getIns().create(baoCaoThietBi);

        if (result == -1) {
            return new ResultReason(OperationResult.ADD_FAILURE, "Failed to create BaoCaoThietBi");
        } else {
            ThietBiDAO.getIns().updateTT("Hong", MaThietBi);
            return new ResultReason(OperationResult.ADD_SUCCESS, "BaoCaoThietBi created successfully");
        }
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
    
    public List<BaoCaoThietBi>  getAll(){
            return BaoCaoThietBiDAO.getIns().findALl();
    }
    
    public List<BaoCaoThietBi>  get(String fieldName, String value){
            return BaoCaoThietBiDAO.getIns().findAllByField(fieldName, value);
    }
}
