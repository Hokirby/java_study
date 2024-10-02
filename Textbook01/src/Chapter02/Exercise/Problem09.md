### 9. 연산식의 타입 변환 중에서 컴파일 에러가 발생하는 것을 선택하세요.

    byte byteValue = 18;
    float floatValue = 2.5F;
    double doubleValue = 2.5;

1. byte result = byteValue + byteValue;
2. int result = 5 + byteValue;
3. float result = 5 + floatValue;
4. double result = 5 + doubleValue;

나의 답 : 1번

---
내 생각:

정수 값의 변수의 연산이 이루어 질 떄 int 타입으로 자동 변환되며 byte 타입으로 변수를 지정하면 컴파일 에러가 발생한다.
따라서 다음과 같이 코드를 작성해야 한다.

int result = byteValue + byteValue;

해설:

int 타입 이하의 정수를 산술 연산 할 때, 모두 int 타입으로 변환된다.
그러나 result를 int 타입으로 설정했기 때문에 잘못되었다.
좌측 변은 1바이트, 우측 변은 4바이트이다.
