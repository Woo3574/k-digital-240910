package As.커맨드입력;

import static java.lang.System.exit;

public class CommandInput {
    public static void main(String[] args) {
        if(args.length != 2) { //디버그 옆에 액션더보기에 매개변수 추가하고 적용할수있음 프로그램인수에 값
            System.out.println("인자값이 2개가 필요 합니다.");
            exit(0);
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("결과 : " + (num1 + num2));
    }
}
