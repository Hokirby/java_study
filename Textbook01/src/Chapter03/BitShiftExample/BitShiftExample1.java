package java.Chapter03.BitShiftExample;

public class BitShiftExample1 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; //비트이동(shift) a << b = a * (2**b)
        int result2 = num1 * (int) Math.pow(2, 3); //Math.pow(a,b) = result; double result = a ** b;
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        int result3 = num2 >> 3;//비트이동(shift) a >> b = a / (2**b)
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);

    }
}
