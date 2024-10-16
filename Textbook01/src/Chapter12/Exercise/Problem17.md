### 17. 정규 표현식을 이용해 첫 번쨰는 알파벳으로 시작하고 두 번쨰부터 숫자와 알파벳으로 구성된 8~12자 사이의 ID 값인지 검사하고 싶습니다. 알파벳은 대소문자를 모두 허용한다고 할  때, 다음 밑줄에 들어갈 코드를 작성해보세요.

```
import java.util.regex.Pattern;

public class PatternMatcherExample {
    public static void main(String[] args) {
        String id = "5Angel1004";
        String regExp = (             밑줄          );
        boolean isMatch = (               밑줄           );
        if (isMatch) {
            System.out.prtintln("ID 로 사용할 수 있습니다.";
        } else {
            System.out.println("ID로 사용할 수 없습니다.");
        }
    }
}
```
나의 답:

빈칸1:

"[a-zA-Z]{1}/w{7,11}"

빈칸2:

Pattern.matches(regExp, id)

정답:

빈칸1:

"[a-zA-Z][a-zA-Z0-9]{7,11}"

빈칸:

Pattern.matches(regExp, id)