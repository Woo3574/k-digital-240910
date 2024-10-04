package Cf.스트링버퍼;

// 기본적으로 문자열 처리는 String 클래스를 사용 하는 것이 일반적임
// String 클래스로 문자열을 처리하는 경우 매번 새로운 문자열이 만들어짐
// StringBuffer, StringBuilder 는 객체를 생성해 할당된 메모리에 계속 추가해나가는 방식
// StringBuffer, StringBuilder 사용 방법이 완전 동일
// StringBuffer : 멀티 쓰레드 환경을 지원, StringBuilder는 지원하지않음 기본적으로는 StringBuilder 사용

public class StringBufferEx {
    public static void main(String[] args) {
//        String rst = ""; // 값이 빈문자열
//        rst += "안녕하세요";
//        rst += " ";
//        rst += "자바";
//        rst += "공부합시다.";
//        System.out.println(rst);

        StringBuffer sb = new StringBuffer(); // 추가해 나가는 방식
        sb.append("안녕하세요");
        sb.append(" ");
        sb.append("파이썬");
        sb.append("공부합니다.");
        sb.insert(0,"Hi~~~~~~");
        sb.delete(0,5);
        System.out.println(sb);
        System.out.println(sb.substring(0,5)); // 문자열에서 해당하는 범위의 문자열을 잘라냄


    }
}
