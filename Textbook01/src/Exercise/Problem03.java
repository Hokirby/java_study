package Exercise;

import java.util.Scanner;
import static java.lang.Math.*;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수갑 2개을 입력하세요");
        System.out.print("정수 값1: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("정수 값2: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int n1 = min(num1, num2);
        int n2 = max(num1, num2);
        for (int i = n1; i <= n2; i++) {
                sum += i;
        }
        System.out.println(n1 + "과 " + n2 + " 사이값의 총합: " + sum);
    }
}
