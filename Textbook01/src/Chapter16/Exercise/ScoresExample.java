package Chapter16.Exercise;

public class ScoresExample {
    private static int[] scores = {10, 50, 3};

    public static int MaxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        //최대값 얻기
        int max = MaxOrMin(Math::max);
        System.out.println("최대값: " + max);

        //최솟값 얻기
        int min = MaxOrMin(Math::min);
        System.out.println("최솟값: " + min);
    }
}
