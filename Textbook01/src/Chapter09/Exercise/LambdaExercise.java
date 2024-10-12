package Chapter09.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExercise {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        List<Integer> even = list.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        List<Integer> odd = list.stream()
                .filter(i -> i % 2 != 0)
                .toList();

        List<Integer> evenJava = new ArrayList<>();
        List<Integer> oddJava = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                evenJava.add(list.get(i));
            } else {
                oddJava.add(list.get(i));
            }
        }

        System.out.println(even);
        System.out.println(evenJava);
        System.out.println(odd);
        System.out.println(oddJava);

        System.out.println(Arrays.toString(new Integer[] {1, 2, 3, 4, 5}));
    }
}
