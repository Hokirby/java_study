package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem009 {
    public static void main(String[] args) {
        double gravity = -9.81;
        double time;
        double initialPosition = 1000.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("떨어지는 시간을 입력하세요: ");
        time = Integer.parseInt(scanner.nextLine());
        double finalPosition = 0.5 * gravity * (time * time) + initialPosition;
        System.out.printf("%.2f초 후, 물체의 고도는 %.2f m", time, finalPosition);
    }
}
