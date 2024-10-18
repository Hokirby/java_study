### 8. 3초 뒤에 메인 스레드가 종료하면 MovieThread 도 같이 종료되게 만들고 싶습니다. 밑줄 친 부분에 적당한 코드를 넣어보세요.

```
public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        
        thread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
    }
}
```
```
public class MovieThread extends Thread {
    @Override
    public void run() {
        while(true){
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
```
정답:

    thread.setDaemon(true);