### 15. login() 메소드를 호출할 떄는 매개값으로 id와 password 를 제공하고, logout() 메소드는 id만 매개값으로 제공하려고 합니다. 다음 조건과 예제 코드를 보고 login(). logout()메소드를 선언해보세요.

1. login() 메소드는 매개값 id 가 "hong", 매개값 password 가 "12345"일 경우에만 true 로 리턴
2. logout() 메소드는 id + "님이 로그아웃 되었습니다"가 출력되도록 할 것

리턴 타임 | 메소드 이름 | 매개변수(타입)
-------|-------|----------|
boolean|login|id(String), password(String)
void|logout|id(String)

```
MemberService memberService = new Memberservice();
boolean result = memberservice.login("hong", "12345");
if (result){
    System.out.prinln("로그인 되었습니다.");
    memberService.logout("hong");
} else {
    System.out.prtinln("id 또는 password가 올바르지 않습니다.");
}
```
나의 답:

```
public class MemberService {
    String id;
    String password;
    
    boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        }
        return false;
    }    
    
    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}
```