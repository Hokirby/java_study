### 5. 중첩 for문을 사용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x, y)형태로 출력하는 코드를 작성해보세요. 단, x와 y는 10 이하의 자연수 입니다.

나의 답:

```
for (int x = 1; x <= 10; x++) {
    for (int y = 1; y <= 10; y++) {
        int xySum = 4 * x + 5 * y;
        if (xySum == 60) System.out.printf("(%s, %s)\n", x, y);
    }
}
```
