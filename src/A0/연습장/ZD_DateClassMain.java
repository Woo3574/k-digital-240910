package A0.연습장;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ZD_DateClassMain {
    public static void main(String[] args) {
        DateFunc();
        CalendarFunc();
    }

    static void DateFunc() {
        Date date = new Date();
        System.out.println(date);
        // 원하는 포맷으로 날짜 정보 출력
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        SimpleDateFormat f1, f2, f3, f4, f5, f6;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        f4 = new SimpleDateFormat("yyyy년MM월d일");
        f5 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주,d번째 날 입니다");
        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
        System.out.println(f5.format(date));
        System.out.println(f6.format(date));
    }

    static void CalendarFunc() {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));
    }

}


