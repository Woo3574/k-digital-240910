package Au.이차원배열;

public class DoubleArrEx {
    public static void main(String[] args) {
        int[][] arr = new int[2][3]; // arr은 주소 stack영역, Heap영역에 저장된  값의 메모리 형태 2행 3열  arr[0][0] ==1행1열, arr[1][0]== [2행][1열]
        int cnt = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = cnt++;
            }
        }
        for(int[] ee : arr) { //행 ee위치는 요소 arr은 2행3열 전체
            for(int e : ee) { // 0 행에 한번 순회 , 1행 순회
                System.out.print(e + " ");
            }
            System.out.println();
        }

        String[] strArr = {"Java", "Python", "C++", "C", "kotlin"};
        for(String e : strArr) {
            System.out.print(e.charAt(0));
        }
    }
}
