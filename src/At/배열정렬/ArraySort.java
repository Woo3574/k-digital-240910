package At.배열정렬;
//정렬 알고리즘 구현해보기 : 버블 정렬 0(n2), 삽입정렬 0(n2), 병합정렬 0(nlogn), 퀵정렬 0(nlogn)

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {9, 4, 3, 10, 5, 8, 7, 6};
        int tmp = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        for(int e : arr) System.out.println(e + " ");
    }
}
