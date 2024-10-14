package Du.스트림중간연산;

// 스트림 중개 연산 : 생성된 스트림을 중개연산 또는 다른 스트림을 변환
// 필터링 : filter() 조건에맞는걸 골라내는 것, distinct() 중복제거,
// 변환 : map() 10개의 데이터가 들어오면 10개의 데이터가 나가는것, flatMap()
// 제한 : limit(), skip()
// 정렬 : sorted()

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMidEx {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 6);
        IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 4, 6);
        // 중복 제거 이후 결과 출력
        stream1.distinct().forEach(e -> System.out.print(e + " "));

        System.out.println();
        // 필터링이후 결과 출력
        stream2.filter(e -> e % 2 != 0).forEach(e-> System.out.print(e + " "));

        System.out.println();
        // 스트림 변환 : map(), flatMap()
        Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "REACT");
        stream.map(e -> e.length()).forEach(e -> System.out.print(e + " "));

        System.out.println();
        String[] arr = {"I study hard", "You Study JAVA", "I am hungry"};
        Stream<String> stream3 = Arrays.stream(arr);
        stream3.flatMap(s -> Stream.of(s.split(" "))).forEach(s -> System.out.print(s + "/"));
    }
}
