### 3. Object 클래스에 대한 설명 중 틀린 것은 무엇입니까?

1. 모든 자바 클래스의 최상위 부모 클래스이다.
2. Object 의 equals() 메소드는 ==연산자와 동일하게 번지를 비교한다.
3. Object 의 hasCode() 메소드는 동등 비교시 활용된다.
4. Object 의 toString() 메소드는 객체의 필드 값을 문자열로 리턴한다.

나의 답: 2번

정답: 4번

---
내 생긱:

'==' 연산자는 -128~127 사이의 숫자값은 내용만을 비교 가능 하지만 그 이상의 값은 equals() 메소드와 같이 번지, 객체를 비교한다. 따라서 같은 숫자값을  가지는 다른 변수의 값을 같지 않다고 리턴한다.

해설:

Object 의 toString() 메소드는 객체를 문자열로 표현한 값을 리턴한다.