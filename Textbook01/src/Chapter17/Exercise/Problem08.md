### 8. List 에 저장되어 있는 Member 를 작업별로 그룹핑해서 Map<String.List<Member>> 객체로 생성하려고 합니다. 키는 Member 의 직업이고, 값은 해당 직업을 갖는 Member 들을 저장하고 있는 List 입니다. 실행결과를 보고 빈칸에 알맞은 코드를 작성해보세요.

```
public class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName () {
        return name;
    }
    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "[name:" + name + ", job:" + job + "}";
    }
}
```
```
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );
        Map<String, List<Member>> groupingMap = list.stream()
        //여기에 코드 작성

        System.out.println("[개발자]");
        //여기에 코드 작성

        System.out.println();

        System.out.println("[디자이너]");
        //여기에 코드 작성
    }
```
나의 답:
```
Map<String, List<Member>> groupingMap = list.stream()
    .collect(
        Collectors.groupingBy(m -> m.getJob())
    );
```
```
List<Member> programmer = groupingMap.get("개발자");
programmer.stream()
    .forEach(m -> System.out.println(m.toString())
);
```
```
List<Member> designer = groupingMap.get("디자이너");
designer.stream()
    .forEach(m -> System.out.println(m.toString())
);
```