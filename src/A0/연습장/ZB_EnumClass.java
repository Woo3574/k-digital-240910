package A0.연습장;

// enum 열거타입도 데이터 타입이므로 변수 선언해야함

import java.util.Calendar;

public class ZB_EnumClass {
    public static void main(String[] args) {
        Week today = null;
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK); // 주에 요일을 정수로 반환 1~ 7
        System.out.println(week);
        switch (week) {
            case 1 : today = Week.SUNDAY; break;
            case 2 : today = Week.MONDAY; break;
            case 3 : today = Week.TUESDAY; break;
            case 4 : today = Week.WEDNESDAY; break;
            case 5 : today = Week.THURSDAY; break;
            case 6 : today = Week.FRIDAY; break;
            case 7 : today = Week.SATURDAY; break;
        }
        System.out.println("오늘의 요일은 : " + today + "입니다");
    }
 }

 enum Week {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }

