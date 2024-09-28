package Chapter03.OverflowUnderflowExample;

public class OverflowUnderflowExample {
    public static void main(String[] args) {
        byte var1 = 125;
        for(int i=0; i<5; i++) { // {}를 5번 실행
            var1++;              // ++연산은 var1의 값을 1 증가시킴
            System.out.println("var1: " + var1);
        }

        System.out.println("________________________");

        byte var2 = -125;
        for(int i=0; i<5; i++) { // {}를 5번 실행
            var2--;              // --연산은 var1의 값을 1 감소시킴
            System.out.println("var2: " + var2);
        }

        /**
        * 1000
        * 1001
        * 1010
        * 1100
        * 1101
        * 1110
        * 1111 1 0000 꽉차면 버리기 -> 표현 가능한 가장 작은수
         *
        */

    }
}
