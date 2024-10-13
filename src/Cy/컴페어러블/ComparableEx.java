package Cy.컴페어러블;

// Comparable과 Comparator는 자바에서 객체를 정렬하는데 사용하는 인터페이스
// Comparable : 나와 다른 객체를 비교하는 방식 (1인칭 시점)
// Comparator : 두개의 다른 객체를 비교해줌 (3인칭 시점)

import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<Car> treeSet = new TreeSet<>();
        treeSet.add(new Car("Santafe", 2023, "white"));
        treeSet.add(new Car("Sorento", 2005, "Gray"));
        treeSet.add(new Car("Grandeur",2018,"Black"));
        treeSet.add(new Car("Morning", 2023,"Red"));
        treeSet.add(new Car("Morning", 2023,"Gray"));

        for (Car e : treeSet) {
            System.out.println("이름 : " + e.getName() + " : " + e.getYear() + " : " + e.getColor());
        }
    }
}
