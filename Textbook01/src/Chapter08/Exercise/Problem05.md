### 5. TV 클래스를 실행했을 댸 "TV를 켰습니다."라고 출력되도록 밑줄과 박스에 들어갈 코드를 작성해보세요.

```
public interface Remocon {
    public void powerOn();
}
```
```
public class TV ( 밑줄 ) {
    (     빈칸    )
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn(); 
    }
}
```

나의 답: 

밑줄: implements Remocon

빈칸:
```
@Override
public void powerOn() {
    System.out.println("TV를 켰습니다.");
}
```