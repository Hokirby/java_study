package Exercise.Exercise1000;

public class Problem011 {
    public static void printSquare (int x) {
        System.out.println(x * x);
    }
    public static void printSquare (String str) {
        System.out.println(str + " " + str);
    }
    public static void printSquare (double dvl) {
        System.out.println(dvl * dvl);
    }

    public static void main(String[] args) {
        printSquare("hello");
        printSquare(5.5);
    }
}
