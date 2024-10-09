### 12. 다음과 같은 Example 클레스에서 action() 메소드를 호출할 때 매개값이 C 객체일 경우에만 method2()가 호출되도록 밑줄에 들어갈 코드를 작성해보세요.

```
public class {
    public void method1 () {
        System.out.println("A-method1()");
    }
}
```
```
public class B extends A {
    public void method1() {
        System.out.prtintln("b=B-method1()");
    }
}
```
```
public class C extends A {
    public void method1() {
        System.out.println("C-method1()");
    }
    public void method2() {
        System.out.printnln("C-method2()");
    }
}
```
```
public class Example {
    public static void action(A a) {
        a.method1();
        if(  빈칸  ) {
            c.method2();
        }
    }
    
    public static void mainn(String[] args) {
        action(new A());
        action(new B());
        action(new C());
    }
}
```

나의 답: 

a instanceof C