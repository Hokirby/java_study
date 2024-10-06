package Chapter06.MethodOverloading;

public class Caiculator1Example {
    public static void main(String[] args) {
        //객체 생성
        Calculator1 myCalcu = new Calculator1();

        //정사각형의 널비
        double result1 = myCalcu.areaRectangle(10);

        //직사각형의 널비
        double result2 = myCalcu.areaRectangle(10, 20);

        System.out.println("정사각형의 넓이: " + result1);
        System.out.println("직사각형의 넓이: " + result2);
    }
}
