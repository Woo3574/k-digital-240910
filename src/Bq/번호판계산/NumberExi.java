package Bq.번호판계산;

import java.util.Scanner;

public class NumberExi {
    private int[] number = new int[100];
    private final Scanner sc = new Scanner(System.in);
    public NumberExi() {}

    public void setInput() {
        System.out.println("호수판 숫자 입력 : ");
        String temporay = sc.next();
        int[] lakeBoard = new int[temporay.length()];  // 150
        for (int i = 0; i < number.length ; i++) {
            number[i] = lakeBoard[i] - '0' ;

        }
    }

}
