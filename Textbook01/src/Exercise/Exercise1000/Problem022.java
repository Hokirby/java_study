package Exercise.Exercise1000;

import java.util.Arrays;

public class Problem022 {
    public static int topIndex(int[] scores) {
        int maxNum = 0;
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxNum < scores[i]) {
                maxNum = scores[i];
                index = i;
            }
        }
        return index;
        }

    public static void main(String[] args) {
        String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
        int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};
        int i = topIndex(scores);
        System.out.printf("1등: %s(%d)\n", names[i], scores[i]);
    }
}
