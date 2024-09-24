package chapter02.VariableExample;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        System.out.println("x:" + x + ", y:" + y);

        int temp = x;
        x = y;
        y = temp;
        System.out.println("x:" + x + ", y:" + y);
    }
}
