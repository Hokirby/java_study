package Exercise.Exercise1000;

import java.util.InputMismatchException;

public class Problem015 {
    public static void printPay (double basePay, int hours) {
        try {
            double pay = hours * basePay;
            if (40 < hours) {
                int overHours = hours - 40;
                double overPay = overHours * basePay * 1.5;
            }
            if (basePay < 8.00) {
                throw new IndexOutOfBoundsException() ;
            }
            if (60 <  hours) {
                throw new InputMismatchException();
            }
            System.out.println("주급: " + pay + "$");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR: 기본시급이 최저시급보다 작습니다.");
        } catch (InputMismatchException e) {
            System.out.println("ERROR: 주당 근무시간이 60시간을 초과합니다.");
        }
    }

    public static void main(String[] args) {
        printPay(7.50, 35);
        printPay(8.20, 47);
        printPay(10.00, 73);
    }
}
