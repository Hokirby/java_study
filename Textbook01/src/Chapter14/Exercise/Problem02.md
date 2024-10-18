### 2. 동영상과 음악을 재생하기 위해 두가지 스레드를 실행하려고 합니다. 밑줄 친 부분에 적당한 코드를 작성해보세요.

```
public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new MovieThread();
        thread1.start();
        
        Thread thread2 = new Thread(       빈칸1      );
        thread2.start();
    }
}
```
```
public class MovieThread (        빈칸2       ) {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
```
```
public class MusicRunnable (         빈칸3        ) {
    @Override
    public void run() {
        for(int i = 0; i < 3; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
```
나의 답:

빈칸 1:

    new MusicRunnable()

빈칸 2:

    extends Thread

빈칸 3:

    implements Runnable