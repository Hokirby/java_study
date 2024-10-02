### 6. for 문을 사용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.

나의 답:

```
String str = "*";
String str1 = "";

for (int i = 1; i <= 5; i++) {
    str1 += str;
    System.out.println(str1);
    }
}
```
정답:

```
for (int i = 1; i <= 5; i++) {
    for (int j =1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println()
}
```