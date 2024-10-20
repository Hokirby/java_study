### 10. 스레드풀에 대한 설명 중 틀린 것은 무엇입니까?

1. 갑작스러운 작업의 증가로 스레드의 폭증을 막기 위해 사용된다.
2. ExecutorService 객체가 스레드풀이며 newFixedThreadPool() 메소드로 얻을 수 있다.
3. 작업은 Runnable 또는 Callable 인터페이스를 구현해서 정의한다.
4. execute() 메소드로 작업 처리 요청을 하면 작업이 완료될 떄까지 대기(블로킹) 된다.

나의 답: 2번

정답: 4번

---
내 생각: 

해설:

execute() 메소드로 작업처리 요청을 하면 Runnable 객체를 작업 큐에 저장하고 작업 처리 결과를 리턴하지 않는다. 즉, 작업 완료 여부를 확인하지 않고 Runnable 객체를 작업 큐에 저장하는 역할만 하기 때문에 블로킹되지 않는다.