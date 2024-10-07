package A0.연습장;

public class ZC_EnumClassTwo {
    public static void main(String[] args) {
        Developer developer = new Developer("민지", DevType.BACKEND, Career.SENIOR, Gender.MALE);
        developer.devinfo();
    }
}

enum DevType {
    MOBILE, FRONT, BACKEND, DBA, ANALYSIS
}

enum Career {
    JUNIOR, SENIOR
}

enum Gender {
    MALE, FEMALE
}

class Developer {
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

    public void devinfo() {
        System.out.println("이름 : " + name);
        System.out.println("업무 : " + type);
        System.out.println("경력 : " + career);
        System.out.println("성별 : " + gender);

    }
}
