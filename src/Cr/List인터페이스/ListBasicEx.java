package Cr.List인터페이스;

// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스
// List는 배열과 비슷한 형태의 자료구조 (인덱스 기반), 동적으로 크기가 변함
// 요소의 저장 순서가 유지됨
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어있지 않음
// 데이터를 다루기위한 다양한 메서드 제공
// List 인터페이스의 구현체인 ArrayList, Vector, Linked List 사용 방법이 동일

import java.util.*;

public class ListBasicEx {
    public static void main(String[] args) {
        // list 인터페이스의 참조 변수로 ArrayList로 생성된 객체를 참조 함.

        //List<String> list = new ArrayList<>(Arrays.asList(fruitsArr));  // new ArrayList 자리에 벡터,링크리스트,어레이 리스트 등이 올수있다.
       // ArrayList<String> list2 = new ArrayList<>();

        // Arrays.asList() 배열을 리스트 변환하는 메서드
        String[] fruitsArr =  {"WaterMelon", "Peach", "Cherry"};
        List<String> fruits = new ArrayList<>(Arrays.asList(fruitsArr));
        // 요소 추가, 리스트 맨뒤에 요소를 추가 시간의 복잡도O(1)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 리스트 출력 , toString() 메서드가 오버라이딩 되어 있음
        System.out.println("과일 목록 : " + fruits.toString()); // 객체의 정보를 표시하기 위해서 toString ,생략가능

        //특정 인덱스에 요소 추가
        fruits.add(1,"Grape"); // 어레이리스트에 삽입을하면 시간의 복잡도 O(n)
        // 삽입,삭제 자주사용 을할땐 Array List보단 Linked List가 알맞다 , 검색을할땐 어레이 리스트 리스트는(List 전부 인덱스기반)
        System.out.println("과일 목록 : " + fruits.toString());

        // 요소 가져 오기 (인덱스로 접근하는방법)
        System.out.println("과일 요소 : " + fruits.get(2)); //Array List 출력할땐 .get(인덱스)

        // 요소 제거하기
        fruits.remove(2);
        System.out.println("과일 목록 : " + fruits.toString());

        // List 사이즈 확인
        System.out.println("과일 목록 사이즈 : " + fruits.size());

        // 요소 순회하기
        for (String e : fruits) {
            System.out.print(e + " ");
        }

        System.out.println();
        // 리스트 정렬하기
        fruits.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("과일 목록 : " + fruits.toString());

        fruits.sort(Comparator.reverseOrder()); //내림차순
        System.out.println("과일 목록 : " + fruits.toString());

        fruits.sort(new Comparator<String>() { // sort 가 정렬하고 사용자는 정렬 조건만 추가하면됨
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2);
                    }
                }
                return -1;
            }
        });
        System.out.println("과일 목록 : " + fruits.toString());
    }
}
