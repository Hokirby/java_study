### 3. for 문을  이용해서 1부터 100까지 정수 중에서 3의 배수의 총함을 츌력하는 코드를 작성해보세요.

나의 답:
```
int iSum = 0;

for (int i = 3; i <= 100; i += 3) {
    iSum += i;
}
System.out.println(iSum);
```