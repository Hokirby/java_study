### 6. List 에 저장되어 있는 Member 의 평균 나이를 출력하려고 합니다. 빈칸에 알맞은 코드를 작성해보세요.

```
public class Member {
    private String name;
    private  int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
```
```
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("김자바", 26)
        );
        double avg = list.stream()
        // 여기에 코드 작성
        
        System.out.println("평균 나이: " + avg);
    }
}
```
나의 답:
```
double avg = list.stream()
    .mapToInt(mem -> mem.getAge())
    .average()
    .getAsDouble();
```