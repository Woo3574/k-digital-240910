package Ad.시스템입출력;
// 자바 표준 입출력 클래스 :
// System.out.in(표준 입력) : 프로그램내에서 사용자의 입력을 받음 (콘솔 입력)
// System.out(표준 출력) : 프로그램내의 결과를 콘솔에 출력 (리다이렉션 가능)
// System.err(표준 오류) : 오류를 출력 하기 위해서 사용 (리다이렉션 안됨), 대체제가 있음(sl4f)
// print(메서드 오버로딩), println(메서드 오버로딩), printf(서식지정자)
// 서식지정자 : %d(decimal), %ld(long decimal), %f(float), %.2f, %5d(5칸의 공간을 잡고 오른쪽 정렬)
// %5d(5칸의 공간을 잡고 오른쪽 정렬), %-5d(왼쪽 정렬), %s(string), %c(character)
// %%(%기호를 출력)
// 이스케이프 시퀀스 : \n(줄바꿈), \r(커서를 맨앞으로 이동), \t(탭), \b(백), \\(백슬레시 기호를 출력)

// 파이썬은 함수가 클래스 외부에있을수있고 외부에있는 클래스 내로 들어오면 메서드가되지만 자바에서는 함수가클래스안에만 존재할수있다.

public class SystemInOutEx {
    public static void main(String[] args) {
        String name = "김태우";
        String addr = "경기도 광명시 하안동";
        char gender = 'M';
        int age = 30;
        int kor = 89;
        int eng = 88;
        int math = 56;
        // println(), print() : 메서드 오버로딩
        System.out.println("===== Java Style 출력 ");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
        System.out.println("총점 : " + (kor + eng + math));
        System.out.println("평균 : " + (double)(kor + eng + math) / 3); //형변환할때 ()가로를 붙여서 지정해줘야함 , 나눠서 소수점 발생하니 실수형 double을 넣어준다.
        // 명시적 형변환과 묵시적 형변환이 {일어남 명시적형변환은 개발자가 묵시적형변환은 컴파일러
        System.out.println(String.format("평균 : %.2f", (double)(kor + eng + math) / 3));

        // 서식 : 지정자 스타일
        System.out.printf("======== C Style 출력 ========\n");
        System.out.printf("이름 : %s\n", name); // %s는 문자열에 대한 서식
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("총점 : %d\n", kor + eng + math);
        System.out.printf("평균 : %.2f\n", (double)(kor + eng + math) / 3);

        //앞에 대문자가 들어가면 정적필드(클래스),정적 메서드로 구분할수있다.


    }
}
