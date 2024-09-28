package Chapter03.BitLogicExample;

public class BitLogicExample {
    public static void main(String[] args) {

        //비트 논리 연산: 2진수로 바뀌어 계산, 비트연산자
        System.out.println("45 & 25 = " +(45 & 25)); //AND(논리곱): &
        System.out.println("45 | 25 = " +(45 | 25)); //OR(논리합): |
        System.out.println("45 ^ 25 = " + (45 ^ 25));//XOR(배타적 논리합): ^
        System.out.println("~45 = " + (~45)); //NOT(논리 부정); ~
        System.out.println("----------------------------");

        byte receiveData = -120;

        //방법1: 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        //방법2: 자바 API를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 = Byte.toUnsignedInt(receiveData); //Byte.toUnsignedInt(Data) = Data & 255
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
