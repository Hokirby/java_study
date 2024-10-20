### 4. 다음 코드의 실행 결과를 보고 빈 곳에 들어갈 람다식을 작성해보세요.

```
public class Example {
    public static void main(String[] args) {
        Thread thread = new Thread(
            ( 빈칸 ) 
        );
        thread.start();
    }
}
```
나의 답:
```
()-> {
    for (int i = 0; i < 3; i++) {
        System.out.println("작업 스레드가 실행됩니다.");
    }
```