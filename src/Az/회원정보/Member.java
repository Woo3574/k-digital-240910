package Az.회원정보;
// 이름은 String
// 나이는 int, 0 ~ 199까지만 정상으로 간주, 이외의 값이 입력되면 재 입력 요구
// 만약, 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시(개별 진행 해도됨)
// 성별은 문자 타입으로 입력,남성은 'M'과'm', 여성은 'F', 'f'
// 성별에 대한 출력은 "남성", "여성"으로 출력
// 직업은 정수로 입력 (1 ~ 4)입력하고, 출력은 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 1 ~ 4 이외의 값은 재 입력 요구
// 모든 입력이 완료되면 결과는 한번에 출력

import java.util.Scanner;

public class Member {

    // 필드 추가 (필드는 클래스 내에 존재하는 변수를 지칭, 인스턴스 필드(객체가 가지는 변수), 정적 필드, 지역 필드
    // private : 접근제한자, 같은 클래스내에서만 접근 가능
    private String name; //인스턴트 필드
    private int age; //인스턴트 필드
    private char gender; // 인스턴트 필드
    private int job; // 인스턴트 필드
    private final Scanner sc = new Scanner(System.in);

    // 이게 생성자, 생성자의 이름은 클래스와동일하다, 반환타입이 없다, 반환타입이 없다는것, void가 없는것
    // 자바에서 생성자를 만들지 않으면 기본 생성자가 자동으로 만들어짐
    public void setName() {  // 인스턴스 메서드
        System.out.print("이름을 입력 : ");
        name = sc.nextLine();
    }
    // 회원의 이름확인 (getter의 사용법)(main class 맨아래에 있음)
    public String getName() {  // 인스턴스 메서드
        return name;
    }

    // void는 반환값을 요구하지않음
    // return 호출한쪽으로 값을 돌려보내주는것
    public void setAge() { // 인스턴스 메서드
        while (true) {
            System.out.print("나이를 입력 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200 ) return; // return을 만나면 함수 setAge로 돌려보내서 끝냄, break이면 블록스코프를 만나야 끝낼수있다.
            System.out.println("나이를 잘 못 입력 하셨습니다.");
        }
    }

    // continue 반복문의 조건식으로 돌아 감
    public void setGender() { // 인스턴스 메서드
        while (true) {
            System.out.print("성별을 입력 :");
            gender = sc.next().charAt(0); // 문자에 대한 입력은 문자열에 해당 인덱스의 문자를 추출(문자열에 하나를 추출)
            switch (gender) {
                case 'M':
                case 'm':
                case 'F':
                case 'f':
                    return; // 스위치 조건문이 참일경우 return을 만나서 참인값을 setGender로 값을 반환
                default:
                    System.out.println("성별을 잘 못 입력 하셨습니다.");
            }
        }
    }

    public int getGenderType() { // 반환 타입이 존재 함(int) ,인스턴스 메서드
        if (gender == 'M' || gender =='m') return 1;
        else return 2;
    }

    public void setJob() { // 인스턴스 메서드
        while (true) {
            System.out.print("직업을 입력 : ");
            job = sc.nextInt();
            if (job > 0 && job < 5) return;
            System.out.println("직업을 잘못 입력 하셨습니다.");
        }
    }

    public void getInfo() { // 인스턴스 메서드
        String[] genderStr = {"", "남성", "여성"}; // 입력된 값과 배열의 인덱스를 일치하기 위해서 첫번째를 비워 둠
        String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("======== 회원 정보 ========");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[job]);
    }
}
