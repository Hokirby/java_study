package Chapter03.LocalOperatorExample;

public class LocalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        //int charCode = 'a';
        //int charCode = '5';

        if ((65 <= charCode) & (charCode <= 90)) { //AND(논리곱): &
            System.out.println("대문자입니다.");
        }

        if ((65 <= charCode) && (charCode <= 122) ) { //AND(논리곱): &&
            System.out.println("소문자입니다.");
        }

        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0~9 숫자입니다.");
        }

        //-----------------------------------------------

        int value = 6;
        //int value = 7;

        if ((value % 2 == 0) | (value % 3 == 0)) {//OR(논리합): |
            System.out.println("2 또는 3의 배수입니다.");
        }

        boolean result = ((value % 2 == 0) || (value % 3 == 0));//OR(논리합): ||
        if (!result) {
            System.out.println("2 또는 3의 배수가 아닙니다.");
        }

        // 논리연산자 추가
        //XOR(배타적 논리합): ^ (피연산자가 하나는 true이고 하나가 false일 경우에만 연산 결과가 true)
        //NOT(논리부정): ! (피연산자의 논리값을 바꿈, true일 경우 연산결과: false, false일 경우 연산결과: true)
    }
}
