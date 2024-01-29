package views.models;

import models.NguoiDung;

public class CurrentUser {
    private static NguoiDung nguoiDung;
    
    public static NguoiDung getNguoiDung(){
        return CurrentUser.nguoiDung;
    }
    
    public static void setNguoiDung(NguoiDung nguoiDung){
        CurrentUser.nguoiDung = nguoiDung;
    }
}
