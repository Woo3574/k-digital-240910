package Cz.학생성적정렬;

public class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int mat;

    @Override
    public int compareTo(Student o) {
//        if (this.getTotalScore() < o.getTotalScore()) return 1; // 내림 차순 정렬
//        else if (this.getTotalScore() == o.getTotalScore()){
//            return this.name.compareTo(o.name); // 총점이 같으면 이름 순 정렬
//        } else {
//            return -1;
//        } // 위,아래방법 둘다 가능
        if (this.getTotalScore() != o.getTotalScore()) {
            return o.getTotalScore() - this.getTotalScore(); // 뒤에값이 큰 경우가 양수가 됨, 값을 뺀값이 양수일경우 정렬
        }
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() { // 객체의 정보의 결과를 출력할때 toString
        return name + " : " + getTotalScore();
    }

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public int getTotalScore() {
        return kor + eng + mat;
    }
}
