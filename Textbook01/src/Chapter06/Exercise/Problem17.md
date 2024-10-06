### 17. 16번 문제에서는 Printer 객체를 생성하고 println() 메소드를 호출했습니다. 이번에는 Printer 객체를 생성하지 않고도 다음과 같이 호출할 수 있도록 Printer 클래스를 수정해보세요.

```
Printer.println(10);
printer.println(true);
Printerprintln(5.7);
printer.println("홍길동);
```

나의 답:

```
public class Printer {

    static void Println(int value) {
        System.out.println(value);
    }
    static void println(boolean value) {
        System.out.println(value);
    }
    static void println(double value) {
        System.out.println(value);
    }
    static void println(String value) {
        System.out.println(value);
    }
}

```