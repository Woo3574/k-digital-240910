package Br.에어컨만들기;

import java.util.Scanner;

public class AirConMain {
    public static void main(String[] args) {
        AirCon lgAirCon = new AirCon();
        Scanner sc = new Scanner(System.in);
        int elapsedTime = 0; // 경과 시간 계산
        boolean isSetTemp = false; // 온도가 변경 될 상황인지 확인하는 조건
        System.out.println("에어컨을 켜시겠습니까? (yes / no) : ");
        String isOn = sc.next();
        if (isOn.equalsIgnoreCase("yes")) {
    }
}
