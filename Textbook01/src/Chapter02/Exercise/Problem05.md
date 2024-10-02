### 5. 다음 자동 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.

    byte byteValue = 10;
    char charValue = 'A';

1. int intValue = byteValue;
2. int intValue = charValue;
3. short shortValue = charValue;
4. double doubleValue = byteValue;

나의 답: 3번

---
내생각: 

short타입이 가질 수 있는 범위 값보다 큰 것 같다.

해설:

char 타입은 양수만 저장 가능하다. short 타입으로 변환할 수 없다.