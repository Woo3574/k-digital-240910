package Cy.컴페어러블;

// Comparable은 나와 다른 객체를 비교할때 사용
public class Car implements Comparable<Car> { // 제네릭에 Car를 집어넣으면 Car타입만 들어올수있음, 타입 제한을 걸어버림
    private String name; // 모델 이름
    private int year; // 연식
    private String color; // 색상

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    @Override
    public int compareTo(Car o) {
        if (this.year == o.year) { // 연식이 같으면
            int rst = this.name.compareTo(o.name); // 모델 이름을 사전순 정렬
            if(rst == 0) { // 비교 조건에 대한 반환값이 0이면 중복제거가 됨, Set은 중복을 허용하지않아서
                return this.color.compareTo(o.color);
            } else return rst;
        } else if (this.year > o.year) { // 오른차순 정렬 (즉, 연식이 오래된 것부터 정렬)
            return 1;
        } return -1;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
