### 5. interrupt() 메소드를 호출한 효과에 대한 설명 중 틀린 것은 무엇입니까?

1. 일시 정지 상태에서 InterruptedException 을 발생시킨다.
2. 스레드를 즉시 종료한다.
3. 스레드가 일시 정지 상태가 될 때까지 InterruptedException 이 발생하지 않는다.
4. InterruptedException 이 발생하지 않았다면 isInterrupted() 메소드는 true 를 리턴한다.

나의 답; 4번 

정답: 2번

---
내 생각:

false 를 리턴한다.

해설:

interrupt() 메소드는 스레드가 일시 정지 상태에 있을 때 InterruptedException 예외를 발생시키는 역할을 한다.
Thread 가 일시정지가 될 때 InterruptedException 이 발생하여 예외처리 블록으로 이동한다.