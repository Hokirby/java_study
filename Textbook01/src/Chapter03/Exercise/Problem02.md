### 2. 다음 코드를 실행했을 떄 출력 결과를 작성해보세요.

```
int score = 85;
String result = (!(score > 90)) ? "가" : "나";
System.out.println(result);
```

나의 답:

1. score은 int 타입 변수로 85의 값을 갖는다.
2. result는 String 타입 변수로 우변의 값을 갖는다.
괄호 안의 연산이 우선되기 때문에 가장 먼저 score 변수의 값이 90보다 큰가를 연산하고, 그 값은 False이다.
밖의 괄호 연산이 실핻되고 !연산으로 값은 False가 아닌 값인 True를 갖는다.
? 연산은 True일 경우 : 앞을 수행하고 False일 경우 뒤를 수행한다.
위의 연산에서 True값을 가졌기 때문에 result는 "가"의 값을 갖는다.
3. 가 가 프린트된다.