package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("세자리 정수를 입력하세요: ");
        int num = Integer.parseInt(scanner.nextLine());
        int first = num / 100;
        int second = num / 10 - first * 10;
        int third = num - first * 100 - second * 10;
        int sum = first + second + third;
        System.out.println("각 자릿수의 합: " + sum);
    }
}
