package Chapter17.Exercise.Problem07;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
                .filter(mem -> mem.getJob().equals("개발자"))
                .toList();

        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
