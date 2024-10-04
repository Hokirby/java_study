### 주어진 배열의 항목에서 최대값을 출력한느 코드를 작성해보세요(for문 이용)

    int[] array = { 1, 5, 3, 8, 2};

나의 답:

```
int[] array = { 1, 5, 3, 8, 2 };
int highVal = 0;

for (int num : array) {
     if (num > highVal) {
        highVal = num;
    }
}
        System.out.println("가장 큰 값: " + highVal);
```