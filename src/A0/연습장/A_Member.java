package A0.연습장;
// 이름은 String
// 나이는 int, 0 ~ 199까지만 정상으로 간주, 이외의 값이 입력되면 재 입력 요구
// 만약, 숫자가 아닌 다른 값이 오는 경우에 대한 처리는 일단 무시(개별 진행 해도됨)
// 성별은 문자 타입으로 입력,남성은 'M'과'm', 여성은 'F', 'f'
// 성별에 대한 출력은 "남성", "여성"으로 출력
// 직업은 정수로 입력 (1 ~ 4)입력하고, 출력은 1은 "학생", 2는 "회사원", 3은 "주부", 4는 "무직"
// 1 ~ 4 이외의 값은 재 입력 요구
// 모든 입력이 완료되면 결과는 한번에 출력

//기본타입은 값을 힙영역에 바로넣지만
//        참조타입은 힙영역에 값을 넣지않고 정수값을 가진 주소가 들어간다 랩핑
//
//        싱크로나이즈 : 크리티컬 섹션,임계영역, 락킹을거는 문법을 제공
//        A 라는 인원이 작업하고있으면 B,C인원들이 동시작업을 진행하지못하게
//        잠금,락을걸어버림

//
//hash는 해쉬 펑션으로 자료를 저장하는것
//        List는 순서대로저장하는 것
//        set은 중복을허용하지않는다, 수학적 표현은 집합
//
//        List = Array,Link,vec
//        set = tree,hash
//        map = tree,hash
//
//        나열을 했을때 root 가 처음과 끝의 사이에 있으면 in-order
//        pre order = root 가 맨앞에
//        in order = root 가 중간에
//        post order = root 가 맨뒤에

import java.util.Scanner;

public class A_Member {
    private String name;
    private int age;
    private char gender;
    private int job;
    final private Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름 입력 : ");
        name = sc.next();
    }

    public String getName() {return name;}

    public void setAge() {
        while (true) {
            System.out.print("나이 입력 : ");
            age = sc.nextInt();
            if (age >= 0 && age < 200) return;
            else System.out.println("잘못된 나이를 입력을 하셨습니다.");
        }
    }

    public int getAge() { return age;}

    public void setGender() {
        while (true) {
            System.out.print("(성별 입력) 남성 'M' 또는 'm', 여성 'F' 또는 'f' : ");
            gender = sc.next().charAt(0);
            switch (gender) {
                case 'M' :
                    case 'm' : case 'F' : case 'f' : return ;
                    default: System.out.println("성별을 잘못입력하셨습니다");
            }
        }
    }

    public int getGenderType() {
        if(gender == 'M' || gender =='m') return 1;
        else return 2;
    }

    public String getGender() {
        if(gender == 'M' || gender =='m') return "남성";
        else return "여성";
    }

    public void setJob() {
        while (true) {
            System.out.print("직업 입력 [1]학생 [2]회사원 [3]주부 [4]무직 : ");
            job = sc.nextInt();
            if (job > 0 && job < 5) return;
            else System.out.println("입력을 잘못하셨습니다.");
        }
    }
    public String getJob() {
        if (job == 1) return "학생";
        else if (job == 2) return "회사원";
        else if (job == 3) return "주부";
        else return  "무직";
    }

    public void getInfo() {
        String[] genderStr = {"", "남성", "여성"};
        String[] jobStr = {"", "학생", "회사원", "주부", "무직"};
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + genderStr[getGenderType()]);
        System.out.println("직업 : " + jobStr[job]);
        System.out.println("======================================");
    }

}

