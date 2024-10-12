### 5. 메소드가 다음과 같이 선언되어 있습니다. 잘못된 예외 처리를 선택하세요.

    public void method1() throws NumberFormatException, ClassNotFoundException {...}

1. try {method1();} catch (Exception e) {}
2. void method2() throws Exception {method1();}
3. try {method1();}
   catch (Exception e) {}
   catch (ClassNotFoundException e) {}
4. try {method1();}
   catch (ClassNotFoundException e) {}
   catch (NumberFormatException e) {}

나의 답: 3번

---

내 생각:

하위 클래스의 예외를 상위 클래스의 예외보다 아래에 써야한다.