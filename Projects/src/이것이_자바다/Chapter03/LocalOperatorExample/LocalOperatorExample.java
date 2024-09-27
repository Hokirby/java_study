package java.이것이_자바다.Chapter03.LocalOperatorExample;

public class LocalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        //int charCode = 'a';
        //int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자입니다.");
        }

        if ((65 <= charCode) && (charCode <= 122) ) {
            System.out.println("소문자입니다.");
        }

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자입니다.");
        }

        //-----------------------------------------------

        int value = 6;
        //int value = 7;

        if ((value % 2 == 0) | (value % 3 == 0)) {
            System.out.println("2 또는 3의 배수입니다.");
        }

        boolean result = ((value % 2 == 0) || (value % 3 == 0));
        if (!result) {
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }
    }
}
