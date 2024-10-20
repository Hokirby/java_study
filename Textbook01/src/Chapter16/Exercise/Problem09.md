### 9. 8번 문제에서 Example 클래스의 main() 메소드를 실행할 때, avg() 메소드의 매개값으로 람다식을 사용하지 않고 메소드 참조로 변경해보세요.

```
double englishAvg = avg((s -> s.getEnglishScore()));
double MathAvg = avg((s -> s.getMathScore()));
```
나의 답:
```
double englishAvg = avg(Student::getEnglishScore);
double MathAvg = avg(Student::getMathScore);
```