package java.이것이_자바다.Chapter03.BitShiftExample;

public class BitShiftExample2 {
    static void main(String[] args) {
        // a >>> b : a를 b만큼 비트 이동 한후 빈 왼쪽 값을 0으로 채움
        int value = 772; //[00000000] [00000000] [00000011] [00000100]

        //우측으로 3byte(24bit) 이동하고 끝 1마이트만 읽음 : [00000000]
        byte byte1 = (byte) (value >>> 24);
        int int1 = byte1 & 255;
        System.out.println("첫 번째 바이트 부호 없는 값: " + int1);

        //우측으로 2byte(16bit) 이동하고 끝 1바이트만 읽음: [00000000]
        byte byte2 = (byte) (value >>> 16);
        int int2 = Byte.toUnsignedInt(byte2);
        System.out.println("두 번쨰 바이트 부호 없는 값: " + int2);

        //우측으로 1byte(8bit) 이동하고 끝 1바이트만 읽음: [00000011] (모든 수의 0제곱은 1이다.)
        byte byte3 = (byte) (value >>> 8);
        int int3 = byte3 & 255;
        System.out.println("세 번째 바이트 부호 없는 값 " + int3);

        //끝 1바이트만 읽음: [00000100]
        byte byte4 = (byte) value;
        int int4 = Byte.toUnsignedInt(byte4);
        System.out.println("네 번째 바이트 부호 없는 값 = " + int4);
    }
}
