package java.Chapter03.OverflowUnderflowExample;

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
    }
}
