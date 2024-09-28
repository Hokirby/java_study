package Chapter03.AccuracyExample;

public class AccuracyExample {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;

        double result1 = apple - number*pieceUnit;
        System.out.println("사과 1개에서 남은 양 = " + result1); //부동 소수점 방식: 0.29999999999999993

        System.out.println("-------------------------------");

        int totalPieces = apple * 10;
        int result2 = totalPieces - number;
        System.out.println("10조각에서 남은 조각: " + result2);
        System.out.println("사과 1개에서 남은 양: " + result2/10.0);
    }
}
