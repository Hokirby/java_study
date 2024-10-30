package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("아래에 해당하는 값을 입력하세요");
        System.out.print("시급: ");
        int payPerHour= Integer.parseInt(scanner.nextLine());
        System.out.print("일한 시간: ");
        int time = Integer.parseInt(scanner.nextLine());
        int pay = payPerHour * time;
        System.out.println(pay);
    }
}
