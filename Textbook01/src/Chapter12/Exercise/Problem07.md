### 7. System 클래스에 대한 설명 중 틀린 것은 무엇입니까?

1. System 클래스는 정적 필드와 정적 메소드만 제공한다.
2. System.out 은 콘솔에 출력할 때, System.in은 키보드에서 입력받을 때 사용한다.
3. milisTime()과 nanoTime 메소드는 현재 시간에 대한 long 값을 리턴한다.
4. exit() 메소드는 프로세스(JVM)을 종료시킨다.

나의 답: 1번

정답: 3번

---
내 생각 :

모든 필드와 메소드가 정적이 아닐 수 있다.

해설:

milisTime() 과 nanoTime() 메소드는 진행된 시간에 대한 겂을 리턴한다.
현재 시간에 대한 long 값 리턴하는 메소드는 currentTimeMills() 메서드 이다.