package Du.스트림중간연산;

// 스트림 중개 연산 : 생성된 스트림을 중개연산 또는 다른 스트림을 변환
// 필터링 : filter() 조건에맞는걸 골라내는 것, distinct() 중복제거,
// 변환 : map() 10개의 데이터가 들어오면 10개의 데이터가 나가는것, flatMap()
// 제한 : limit(), skip()
// 정렬 : sorted()

import java.util.Arrays;
import java.util.Comparator;
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
        System.out.println();

        // 중개 연산 : 제한
        IntStream stream4 = IntStream.range(0, 10); // 0 ~ 10 미만
        IntStream stream5 = IntStream.range(0, 10);
        IntStream stream6 = IntStream.range(0, 10);

        // skip() : 전달된 개수만큼의 요소를 제외하고 스트림 반환
        stream4.skip(4).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // limit() : 전달된 개수만큼의 요소로 이루어진 새로운 스트림 반환
        stream5.limit(5).forEach(e -> System.out.print(e + " "));
        System.out.println();

        // sorted() : comparator를 이용해 정렬
        Stream<String> stream7 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream8 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        Stream<String> stream9 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS");
        // 오름차순
        stream7.sorted().forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 내림차순
        stream8.sorted(Comparator.reverseOrder()).forEach(e -> System.out.print(e + " "));
        System.out.println();
        // 길이 기준으로 정렬하고, 길이가 같으면 알파벳 정렬
        stream9.sorted(Comparator // 중개 연산안에 조건을 2개 사용
                .comparingInt(String::length)
                .thenComparing(String::toString))
                .forEach(e -> System.out.print(e + " "));
    }
}
