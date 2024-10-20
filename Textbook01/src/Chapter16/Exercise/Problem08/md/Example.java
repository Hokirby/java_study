package Chapter16.Exercise.Problem08.md;

public class Example {
    private static Student[] students = {
            new Student("홍길동", 90, 96),
            new Student("신용권", 95, 93)
    };
   public static double avg(Fuction<Student> fuction) {
       int sSum = 0;
       for (Student s : students) {
           sSum += fuction.apply(s);
       }
       double avg = (double) sSum / students.length;
       return avg;
   }

    public static void main(String[] args) {
        double englishAvg = avg((s -> s.getEnglishScore()));
        System.out.println("영어 평균: " + englishAvg);

        double mathAvg = avg((s -> s.getMathScore()));
        System.out.println("수학 평균: " + mathAvg);
    }
}
