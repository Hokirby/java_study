### 6. 다음 코드를 보고, Function 함수형 인터페이스를 작성해보세요.

```
public class CalcExample {
    public static double calc(Function fun) {
        double x = 10;
        double y = 4;
        return fun.apply(x, y);
    }

    public static void main(String[] args) {
        double result = calc((x, y) -> (x / y));
        System.out.println("result: " + result);
    }
}
```
나의 답:
```
@FunctionalInterface
public interface Function {
    double apply(double x, double y);
}
```