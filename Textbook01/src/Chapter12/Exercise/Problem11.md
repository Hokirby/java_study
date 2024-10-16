### 11. 다음 문자열에서 쉼표(,)로 구분되어 있는 문자열을 StringTokenizer 를 이용해서 분리시키고 출력해 보세요.

    아이디,이름,패스워드

나의 답:

```
import java.util.StringTokenizer;

public class Test {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("아이디,이름,패스워드", ",");
        while (st.hasMoreTokens()) {
            String str = st.nextToken();
            System.out.println(str);
        }
    }
}

```