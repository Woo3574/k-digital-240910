package Cz.학생성적정렬;


public class Score implements Comparable<Score> {
    private String name;
    int kor;
    int eng;
    int math;
    int score;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        score = kor + eng + math;
    }

    @Override
    public int compareTo(Score o) {
        if (score == o.score) {
          int rst = this.name.compareTo(o.name);
          if (rst == 0) {
              return this.name.compareTo(o.name);
          } else return rst;
        } else if (score < o.score) return 1;
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }
}
