### 16. println() 메소드는 매개값을 콘솔에 출력합니다. println() 메소드의 호출값으로는 int, boolean, String 타입 값을 줄 수 있습니다. 다음 조건과 예제 코드를 보고 Printer 클래스에서 println() 메소드를 오버로딩하여 선언해보세요.

리턴 타입|메소드 이름|매개변수(타입)
----|----|----|
void|println|value(int, boolean, double, String)

```
Printer printer = new Printer();
printer.println(10);
printer.prrintln(true);
printer.println(5.7);
printer.println("홍길동");
```

나의 답:

```
public class Printer {
    void Println(int value) {
        System.out.println(value);
    }
    void println(boolean value) {
        System.out.println(value);
    }
    void println(double value) {
        System.out.println(value);
    }
    void println(String value) {
        System.out.println(value);
    }
}

```
