package Chapter12.Exercise;

public class Problem08 {
    public static void main(String[] args) {
        long beforeTime = System.nanoTime();

        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;
        long afterTime = System.nanoTime();

        System.out.println(avg);

        long runTime = afterTime - beforeTime;
        System.out.println("실행 시간: " + runTime + "나노초");
    }
}