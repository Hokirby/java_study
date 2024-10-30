package Exercise.Exercise1000;

import java.util.Scanner;

public class Problem014 {
    public static double calcBmi (double height, double weight) {
        double h = height / 100;
        double bmi =  weight / (h*h);
        return bmi;
    }

    public static String getBmiStatus (double bmi) {
        String status;
        if (bmi < 18.5) {
            return status = "저체중";
        } else if (18.5 <= bmi && bmi < 25) {
            return status = "정상";
        } else if (25 <= bmi && bmi <30) {
            return status = "과체중";
        } else if (30 <= bmi) {
            return status ="비만";
        } else if (bmi < 0) {
            return status = "잘못입력하셨습니다.";
        }
        return status = "값이 없습니다.";
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 키를 입력하세요(cm): ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("당신의 몸무게를 입력하세요(kg): ");
        double weight = Double.parseDouble(scanner.nextLine());
        double bmi = -calcBmi(height,weight);
        String status = getBmiStatus(bmi);
        System.out.printf("당신의 BMI 지수는 %.2f 이며, 당신은 %s입니다.", bmi, status);
    }
}
