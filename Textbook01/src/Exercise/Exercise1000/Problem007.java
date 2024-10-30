package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem007 {
    public static void main(String[] args) {
        double oneEuro = 1320.48026;
        double oneDollar = 1063.82979;
        Scanner scanner = new Scanner(System.in);
        System.out.println("환전하고 싶은 금액을 아래에 입력하세요.");
        System.out.print("유로: ");
        int euro = Integer.parseInt(scanner.nextLine());
        System.out.print("달러: ");
        int dollar = Integer.parseInt(scanner.nextLine());
        int sum = (int) (oneEuro * euro + oneDollar * dollar);
        System.out.printf("%d유로 + %d달러 = %d 원", euro, dollar, sum);
    }
}
