### 2. 왼쪽 switch문을 Expression(표현식)으로 변경해서 오른쪽에 작성해보세요.

```
String grade = "B";

int score1 = 0;
switch(grade) {
case "A":
    score1 = 100;
    break;
    case "B":
    int result = 100-20;
    score1 = result;
    break;
default:
    score1 = 60;
}
```

나의 답:
```
String grade = "B";

int score1 = 0;
Switch (grade) {
case "A" -> score1 = 100; break;
case "B" -> score1 = 100 - 20; break;
default -> score1 = 60;
}
```

정답:
```
String grade = "B";

int score = switch (grade) {
    case "A" -> 100;
    case "B" -> 100 - 20;
    default -> 60;
}; // 이곳에 세미콜론 넣는 이유는 뭘까
System.out.println(score1);
```
