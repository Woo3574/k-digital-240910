package Av.얕은복사깊은복사;
//

public class CopyTypeEx {
    public static void main(String[] args) {
        int[] arr1 = new int[3];  // arr1변수가 가지고 있는건 주소 값은 heap영역
        int[] arr2 = arr1;  //arr1(주소를) -> arr2에 주소를 넘겨주는것임 heap영역에 같은 메모리의 값을 가지고있기때문에 결과 값아 천,2천,3처으로 찍힘 이게 얕은복사

        arr1[0] = 1;
        arr1[1] = 1;
        arr1[2] = 1;
        
        arr2[0] = 1000;
        arr2[1] = 2000;
        arr2[2] = 3000;

        for(int e : arr1 ) System.out.println(e + " "); // arr1을 값을 출력해도1 1 1 이 아닌 같은 주소를 가지고 마지막에 찍힌 arr2의 1천 2천 3천의 결과값이 나옴

    }
}
