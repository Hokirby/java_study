### 7. 다은은 % 연산을 수행한 결과값에 10을 더하는 코드입니다. NaN 값을 검사해서 올바른 결과가 출력될 수 있도록 ( )에 들어갈 알맞은 코드를 작성해보세요.

```
double x = 5.0;
double y = 0.0;
double z = 5 % y;
if ( ) {
    system out.println("0.0으로 나눌 수 없습니다.")
} else {
    double result = z + 10;
    System.out.println("결과: " + result);
}
```

나의 답:

z == NaN

정답:

Double.isNaN(z)

---

cf) Infinity 와 NaN을 확인하는 메소드

+ Double.isInfinite()
+ Double.isNaN()

사용예)

boolean result = Double.isInfinite(확인하고싶은값)


