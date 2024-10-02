### 3. 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 떄 1인당 몇 개를 가질 수 있고, 마지막에 몇개가 남는지를 구하는 코드입니다. ( )에 들어갈 알맞은 코드를 차례대로 작성해보세요.

```
int pencils = 534;
int students = 30;

//학생 한 명이 가지는 연필 수 
int pencilsPerStudent = ( 1번 );
System.out.println(pencilsPerStudent);

//남은 연필 수 
int pencilsLeft = ( 2번 );
System.out.println(pencilsLeft); 
```

나의 답:

1. (int) 534 / 30
2. 534 % 30

정답:

1. pencils / students
   몫은 17.xx... 값이 나오지만 정수값인 17만 필요하기 때문에 소수점 밑 값은 생각하지 않아도 된다.

3. pencils % students
