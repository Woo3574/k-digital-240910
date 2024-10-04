package Bx.다운캐스팅;

// 다운캐스팅 : 상위클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것
// 인스턴스 instanceOf 클래스 : 형변환 가능 여부를 확인

import java.util.ArrayList;
import java.util.List;

public class DownCastingEx {
    // Animal타입의 요소로 이루어진 ArrayList 선언
       //제네릭타입 : 올수있는 타입은 객체 타입, int는 안됨
    //ArrayList<Animal> animals = new ArrayList<>();
    List<Animal> animals = new ArrayList<>(); // List는 ArrayList의 부모 , 리스트를 주로사용하자 호환성이좋음!
    public static void main(String[] args) {
        DownCastingEx dawnCast = new DownCastingEx();
        dawnCast.addcnimal();
    }
    public void addcnimal() {
        // Animal animal = new Animal(); 이걸 집어넣은거랑 마찬가지
        animals.add(new Animal()); // Animal 클래스로 객체 생성 , 힙에 할당받은 주소를 anmals 주소에 직업넣음
        //애니멀즈 리시트 안에 직업넣음 마지막 요소로 들어감(집어넣는 순서대로 마지막에 추가되서  들어감)(집어넣으면 마지막에서 추가)
        animals.add(new Tiger());
        animals.add(new Human());
        animals.add(new Eagle());
        for (Animal e : animals) e.move();
    }
    public void downCasting() {
        for (int i = 0; i < animals.size(); i++) {
            Animal ani = animals.get(i); // ArrayList에서 해당 인덱스의 값을 가져 옴
            if (ani instanceof Human) {
                Human h = (Human) ani; //다운 캐스팅은 명시적 형변환 필요
                h.readBook();
            }
        }

    }
}
