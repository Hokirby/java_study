package StringConcatExample;

public class StringConcatExample {
    public static void main(String[] args) {
        //숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        //결합 연산
        //왼쪽에서 오른쪽으로 연산, 숫자끼리 연산가능, 숫자 + 문자 = 문자열
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);
        System.out.println("result5: " + result5);
    }
}
