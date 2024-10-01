package A0.연습장;
// 메서드 오버로딩이란?
// 같은 이름의 메서드를 중복하여 정의 하는 것 (정적 바인딩)
// 매개변수의 타입이나 개수로 구분 (오버로딩의 조건)
// 다형성을 구현하는 중요 요소
// 반환값이 접근제한자는 해당 사항 없음

public class H_MethodOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,50,300));
        System.out.println(sum(10,3.33,5.62));
        System.out.println(sum("SUM : ",50,12.3));
    }


    static int sum(int x ,int y) {
      return x + y;
    }

    static int sum(int x,int y,int z) {
        return x + y * z;
    }

    static double sum(int x,double y, double z){
        return x + y + z;
    }

    static  String sum(String x, int y, double z) {
        return x + y + z;
    }
}
