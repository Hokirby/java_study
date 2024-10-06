### 18. 다음 예제 코드가 실행되면 "같은 ShopService 객체입니다."라는 메시지가 출력되도록 싱글톤 패턴을 사용해서 ShoipService 클래스를 작성해보세요.

```
ShopService obj1 = Shopservice.getInstance();
ShopService obj2 = ShopService.getInstance();

if (obj1 == obj2) {
    System.out.println("같은 ShopService 객체입니다.");
} else {
    System.out.println("다른 ShopService 객체입니다.");
}
```

나의 답:

```
public class ShopService {

    private static ShopService singleton = new ShopService();

    private ShopService(){
    }

    public static ShopService getInstance() {
        return singleton;
    }
}
```