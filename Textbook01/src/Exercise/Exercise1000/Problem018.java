package Exercise.Exercise1000;

public class Problem018 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}