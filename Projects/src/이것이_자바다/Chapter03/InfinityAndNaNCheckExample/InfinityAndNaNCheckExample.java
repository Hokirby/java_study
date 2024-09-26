package Chapter03.InfinityAndNaNCheckExample;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x % y;
        //System.out.println("z: " + z); //NaN

        if(Double.isInfinite(z) || Double.isNaN(z)) { // if 괄호안의 내용이 만족하면 True
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
