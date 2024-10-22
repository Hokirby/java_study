### 5. List 에 저장되어 있는 String 요소에서 대소문자와 상관업시 'java' 라는 단어가 포함된 문자열만 필터링해서 출력하려고 합니다. 빈칸에 알맞은 코드를 작성해보세요.

```
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
        //여기에 코드 작성
```
나의 답:
```
list.stream()
    .filter(str -> {
        if (str.contains("java") || str.contains("Java"))
            return true;
        else {
            return false;
            }
    })
    .forEach(str -> System.out.println(str));
```
다른 답:
```
list.stream()
    .filter(a -> a.toLowerCase().contains("java"))
    .forEach(a -> System.out.printnln(a));
```