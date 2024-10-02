### 5. 다음 코드는 사다리꼴의 넓이를 구하는 코드입니다. 정확히 소수 자릿수가 나올 수 있도록 ( )에 들어갈 수 있는 코드를 모두 선택하세요.

```
int lengthTop = 5;
int lengthBottom = 10;
int height = 7;
double area = ( );
System.out.println(area);
```

1. (lengthTop + lengthBottom) * height / 2.0
2. (lengthTop + lengthBottom) * height * 1.0 / 2
3. (double) (lengthTop + lengthBottom) * height / 2
4. (double) ((lengthTop + lengthBottom) * height / 2)

나의 답: 1, 2, 3번

정답: 1, 2, 3, 4번

---
내 생각:

1,2 번은 실수를 곱하기 때문에 괄호 밖의 연산과정에서 실수로 계산될 것이다.
3번은 double 타입으로 변환해서 연산이 이루어지도록 코드를 작성해서 모든 값이 실수 값으로 변환되어 계산될 것이다.
4번은 괄호 안부터 계산이 이루어지고 이후에 double 타입으로 변환된다. 그런데 괄호 안의 값이 int 타입이기 때문에 계산과정에서 double로 자동으로 바뀌어 계산된다. 이때 부동 소수점으로 인해 정확한 값이 나오지 않을 수 있다.

해설:

(lengthTop + lengthBottom) * height / 2 에서 한 수만 실수로 바꾸면 된다.

ex) (lengthTop + lengthBottom) * height / 2.0