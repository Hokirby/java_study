### 3. String 타입에 대한 설명으로 틀린 것은 무엇입니까?

1. String은 클래스이므로 참조 타입이다.
2. String 타입의 문자열 비교는 ==을 사용해야 한다.
3. 동일한 문자열 리터럴을 저장하는 변수는 동일한 String 객체를 참조한다.
4. new String ("문자열")은 문자열이 동일하더라고 다른 객체를 생성한다.

나의 답: 2번

----

2. String 타입에서 == 또는 != 비교는 힙의 위치, 참조하는 부분이 같은지 비교한다. 따라서 다른 메모리 위치임에도 같은 문자열을 지닐 수 있으므로 eequals()메소드를 사용하면 문자열 자제만 같은지 비교할 수 있다.