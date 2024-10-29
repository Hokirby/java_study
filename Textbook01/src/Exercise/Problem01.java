package Exercise;

public class Problem01 {
    public static void main(String[] args) {
        int pear = 5;
        int apple = 6;
        int orange = 7;

        int oneDaySum = pear + apple + orange;
        float oneHourSum = (float) oneDaySum / 24;
        System.out.println("1. 하루에 생산되는 과일의 총 개수 " + oneDaySum);
        System.out.println("2. 시간당 과일 생산 개수: " + oneHourSum);
    }
}
