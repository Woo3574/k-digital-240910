package Cj.시간과날짜;

// Date 클래스 : 자바 초기 버전 부터 제공되는 클래스
// java.util 패키지에 포함되어 있음
// Date 객체는 UTC(협정 시계시)를 기준으로 1970년 1월 1일 자정부터 경과 시간 계산(밀리초 단위)

import java.util.Date;

public class DateClassMain {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }
}
