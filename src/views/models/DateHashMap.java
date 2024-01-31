package views.models;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class DateHashMap {

    public static HashMap<String, String> getCurrentWeekDays() {
        HashMap<String, String> weekDayMap = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        for (int i = Calendar.SUNDAY; i <= Calendar.SATURDAY; i++) {
            calendar.set(Calendar.DAY_OF_WEEK, i);
            
            String ngay = sdf.format(calendar.getTime());
            String thu = getDayOfWeek(i);

            weekDayMap.put(thu, ngay);
        }

        return weekDayMap;
    }

    public static String getDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "Chủ Nhật";
            case Calendar.MONDAY:
                return "Thứ Hai";
            case Calendar.TUESDAY:
                return "Thứ Ba";
            case Calendar.WEDNESDAY:
                return "Thứ Tư";
            case Calendar.THURSDAY:
                return "Thứ Năm";
            case Calendar.FRIDAY:
                return "Thứ Sáu";
            case Calendar.SATURDAY:
                return "Thứ Bảy";
            default:
                return "";
        }
    }
}