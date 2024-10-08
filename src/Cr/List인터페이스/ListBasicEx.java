package Cr.List인터페이스;

// List 인터페이스는 ArrayList, Vector, Linked List에 상속을 주기 위한 인터페이스
// List는 배열과 비슷한 형태의 자료구조 (인덱스 기반), 동적으로 크기가 변함
// 요소의 저장 순서가 유지됨
// 같은 요소의 중복 저장을 허용
// 데이터 크기가 고정되어있지 않음
// 데이터를 다루기위한 다양한 메서드 제공
// List 인터페이스의 구현체인 ArrayList, Vector, Linked List 사용 방법이 동일

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBasicEx {
    public static void main(String[] args) {
        // list 인터페이스의 참조 변수로 ArrayList로 생성된 객체를 참조 함.
        List<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        List<String> fruits = new ArrayList<>();
        // 요소 추가, 리스트 맨뒤에 요소를 추가\
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

    }
}
