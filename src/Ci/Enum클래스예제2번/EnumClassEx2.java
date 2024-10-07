package Ci.Enum클래스예제2번;

public class EnumClassEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("김태우", DevType.BACKEND, Career.JUNIOR, Gender.MALE);
        developer.devInfo();
    }
}

enum DevType {
    MOBILE, FRONTEND, BACKEND, DBA, ANALYSIS
}

enum Career {
    JUNIOR, SENIOR
}

enum Gender {
    MALE, FEMALE
}

class  Developer {
    private String name;
    private DevType type;
    private Career career;
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
    public void devInfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);
    }
}
