package Am.상근이알람;
//내가 풀어본 문제

import java.util.Scanner;

public class AlarmEx {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        // 시간 입력 :
        // 분 입력 :
        // 시간과 분을 분으로 환산
        // 계산된 분이 45 미만이면 하루의 시간을 더해주고
        // 계산된 시간에서 45를 빼줌
        // 다시 시간과 분으로 환산해서 결과 출력

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if ((hour < 0 || hour > 25) || (min < 0 || min > 60)) {
            System.out.println("시간을 잘못 입력하셨습니다.");
        }else { int avg_time = (hour*60 + min);
            if(avg_time < 45) {
                int avg_time2 = (1440 + min) - 45;
                hour = avg_time2 / 60;
                min = avg_time2 % 60;
                System.out.printf("예정된 알람시간은 %d시 %d 분 입니다.", hour, min);
            } else { int avg_time2 = (hour*60 + min) - 45;
                hour = avg_time2 / 60;
                min = avg_time2 % 60;
                System.out.printf("예정된 알람시간은 %d시 %d분 입니다.", hour, min);
            }
        }
    }
}
