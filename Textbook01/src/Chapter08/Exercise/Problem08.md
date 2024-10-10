### 8. 다음과 같이 인터페이스와 클래스가 선언되어 있습니다. action() 메소드를 호출할 떄 매개값이 C 객체일 경우에만 method2()가 호출되도록 밑줄에 들어갈 코드를 작성해보세요.

```
public interface A {
    public void method1();
}
```
```
public class B implement A {
    @Override
    public void method1() {
        System.out.println("B - method1()");
    }
}
```
```
public class C implemnts A {
    @Override
    public void method1() {
        System.out.println("C - method1()");
    }
    
    public void method2() {
        System.out.println("C - method2()");
    }
}
```
```
public class Example {
    public static void action(A a) {
        a.method1();
        if (    밑줄    ) {
            c.method2();
        }
    }
    
    public static void main(String[] args) {
        action(new B());
        action(new C());
    }
}
```
나의 답:

a instanceof C c