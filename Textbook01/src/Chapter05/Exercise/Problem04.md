### 4. 배열을 생성하는 방법으로 틀린 것은 무엇입니까?

1. int[] array = {1, 2, 3};
2. int[] array; array = {1, 2, 3};
3. int[] array = new int[3];
4. int[][] array = new int[3][2];

나의 답: 2번

---
내 생각:

2. 이미 선언된 베열에 새로운 겂을 대입하고 싶다면 아래와 같이 해야함.
```
int[] array;
int[] array = new int[] {1, 2, 3};
```

3. 배열을 초기화하는 방법이다. 3은 만들고 싶은 인덱스값-1을 의미한다.
4. 다차원 배열을 초기화하는 방법이다.[]을 차원을 만들고 싶은 만큼 적고 다른 방법은 1차원 배열과 같다.