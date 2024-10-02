### 6. 다음 강제 타입 변환에서 컴파일 에러가 발생하는 것을 선택하세요.

    int intValue = 10;
    char charValue = 'A';
    double doubleValue = 5.7;
    String strValue = "A";

1. double var = (double) intValue;
2. byte var = (byte) intValue;
3. int var = (int) doubleValue;
4. char var = (char) strValue;

나의 답: 4번 

---
내 생각:

1. 10.000
2. 10
3. 5
4. String 타입을 char형으로 바꿀 때는 다음과 같은 코드를 해야한다.

    char var = Char.parsechar(strValue);

해설:

String 타입은 char 타입으로 변환할 수 없다.