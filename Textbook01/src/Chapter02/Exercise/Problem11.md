### 11. 다음 코드에서 컴파일 에러가 발생하는 라인을 모두 적어보세요.


    int v1 = 1;
    System.out.println("v1: " + v1);
    if(true) {
        int v2 = 2;
        if(true) {
            int v3 = 2;
            System.out.println("v1: " + v1);
            System.out.println("v2: " + v2);
            System.out.println("v3: " + v3);
        }
        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v3: " + v3);
    }
    System.out.println("v1: " + v1);
    System.out.println("v2: " + v2);

---

내 생각:

해설:

13, 16 번째 줄
중괄호 안에서 선언된 변수만 그 값을 갖는다.(지역변수)
값이 초기화(지정)되지 않은 변수는 읽을 수 없다.

