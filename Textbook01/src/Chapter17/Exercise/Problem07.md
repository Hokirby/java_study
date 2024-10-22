### 7. List 에 저장되어 있는 Memeber 중에서 직업이 개발자인 사람만 별도의 List 에 수집하려고 합니다. 빈칸에 알맞은 코드를 작성해보세요.

```
public class Member {
    private String name;
    private String job;

    public Member(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }
    public String getJob() {
        return job;
    }
}
```

```
public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", "개발자"),
                new Member("김나리", "디자이너"),
                new Member("신용권", "개발자")
        );

        List<Member> developers = list.stream()
        //여기에 코드 작성
        
        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));
    }
}
```
나의 답:
```
List<Member> developers = list.stream()
    .filter(mem -> mem.getJob().equals("개발자"))
    .toList();
```

