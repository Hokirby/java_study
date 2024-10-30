package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem013 {
    public static String getRole(int age) {
        if ( age < 6) {
            return  "유아";
        } else if (6<= age && age <13) {
            return "어린이";
        } else if (13 <= age && age <18) {
            return "청소년";
        } else if (18<= age) {
            return "성인";
        }else {
            return "잘못입력하셨습니다.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 나이를 입력하세요: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("당신은 " + getRole(age) + "입니다.");
    }
}
