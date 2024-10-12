### 7. login 메소드에서 존재하지 않는 ID를 입력하면 NotExistIDException 을 발생시키고, 잘못된 패스워드를 입력하면 WrongPasswordException 을 발생시키려고 합니다. 다음 LoginExample  의 실핻 결과를 보고 빈칸을 채워보세요.

```
public clads NoExistIDException extends Exception {
    public NotExistException() {}
    public NotExistException(String message) {
        (                빈칸1                 )
    }
}
```
```
public class WrongpasswordException extends Exception {
    public WrongPasswordException() {}
    public WrongPasswordException() {
        (                   빈칸2                    )
    }
}
```
```
public class LoginExample {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (exception e) (
            System.out.println(e.getMessage());
        )
        
        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void login(STring id, String pasword) (        빈칸3          ) {
        //id가 blue가 아니라면 NotExistException을 발생시킨
        if (!id.equals("blue")) {
            (               빈칸3                )
        }
        //password가 12345가 아니라면 WrongPasswordException을 발생시킴
        if(!password.equals("12345")) {
            (                빈칸4                )
        }
    }

}
```
    실행 결과
    아이디가 존재하지 않습니다.

    실행결과
    패스워드가 틀립니다.

나의 답:

빈칸1:

System.out.println("아이디가 존재하지 않습니다.");

빈칸2:

System.out.println("패스워드가 틀립니다.");

빈칸3:

extends NotExistIDException, WrongPasswordException

빈칸4:

NotExistIDException(e);

빈칸5:

WrongPasswordException(e);

정답:

빈칸1:

super(message);

빈칸2:

super(message);

빈칸3:

throws NotExistIDException, WrongPasswordException

빈칸4:

throws NotExistIDException("아이디가 존재하지 않습니다.");

빈칸5:

throws WrongPasswordException("패스워드가 틀립니다.");