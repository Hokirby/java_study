### 4, Map 컬렉션에 대한 설명 중 틀린 것은 무엇입니까?

1. 대표적인 구현 클래스로는 HashMap, Hashtable, TreeMap, Properties 가 있다.
2. HashMap 과 Hashtable 은 hashCode() 외 equals() 메소드를 이용해서 중복 키를 판별한다.
3. 멀티 스레드 환경에서는 Hashtable 보다는 HashMap 이 스레드에 안전하다.
4. Properties 는 키와 값이 모두 String 타입이다.

나의 답: 2번

---
내 생각 :

Map 컬렉션의 중복 키와 중복 값은 compareTo() 메소드를 사용해 판별한다. 