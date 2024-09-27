package java.Chapter03.OperaterExample.IncreaseDecreaseOperatorExample;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x= " + x); //12

        System.out.println("-----------------");
        y--;
        --y;
        System.out.println("y = " + y); //8

        System.out.println("_______________-__");
        z = x++;
        System.out.println("z = " + z); //12 결과값에는 x+1 포함 안됨
        System.out.println("x= " + x); //13 연산 후 x의 값에는 +1

        System.out.println("_______________-__");
        z = ++x + y++;
        System.out.println("z= " + z); //22
        System.out.println("x= " + x); //14
        System.out.println("y= " + y); //9

    }
}
