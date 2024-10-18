### 6. 메인 스레드에서 3초 후 MovieThread 의 interrupt() 메소드를 호출해서 MovieThread 를 안전하게 종료하고 싶습니다. 비어있는 부분에 적당한 코드를 작성해보세요.

```
public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
```
```
public class MovieThread extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("동영상을 재생합니다.");
           (             빈칸            )
        }
    }
}
```
나의 답:

     if (currentThread().isInterrupted()) {
                break;
    }

다른 답:
```
if (this.isInteruppted()) {
    break;
}
```