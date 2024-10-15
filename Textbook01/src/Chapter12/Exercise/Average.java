package Chapter12.Exercise;

public class Average {
    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        int[] scores = new int[1000];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = i;
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double avg = sum / scores.length;
        System.out.println(avg);

        long afterTime = System.currentTimeMillis();
        long runTime = (afterTime - beforeTime) / 1000;
        System.out.println("시간차이: " + runTime + "분");
    }
}