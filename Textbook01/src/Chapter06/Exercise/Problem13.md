### 13. 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로는 이름, 아이디, 패스워드. 나이가 있습니다. 이 데이터들을 가지는 Member 클래스를 선언해보세요.

데이터 이름| 필드 이름 | 타입
----|----|----|
이름|name|문자열
아이디|id|문자열
패스워드|password|문자열
나이|age|int

```
public class Member {

    String name;
    String id;
    String password;
    int age;
}

```