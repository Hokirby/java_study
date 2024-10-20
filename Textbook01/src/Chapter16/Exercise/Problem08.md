### 8. 다음은 학생의 영어 평균 점수와 수학 편균 점수를 께산하는 코드입니다. 빈 곳에 avg() 메소드를 작성해 보세요.

```
@FunctionalInterface
public interface Fuction <T>{
    public double apply(T t);
}
```
```
public class Student {
    private String name;
    private int englishScore;
    private int mathScore;

    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }
    public String getName() {
        return name;
    }
    public int getEnglishScore() {
        return englishScore;
    }
    public int getMathScore() {
        return mathScore;
    }
}
```
```
public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };
    
    //avg() 메소드 작성

    public static void main(String[] args) {
        double englishAvg = avg((s -> s.getEnglishScore()));
        System.out.println("영어 평균: " + englishAvg);

        double mathAvg = avg((s -> s.getMathScore()));
        System.out.println("수학 평균: " + mathAvg);
    }
}
```
나의 답:
```
   public static double avg(Fuction<Student> fuction) {
       int sSum = 0;
       for (Student s : students) {
           sSum += fuction.apply(s);
       }
       double avg = (double) sSum / students.length;
       return avg;
   }
```