### 7. 다음은 배열 항목 중에 최대값 또는 최소값을 찾는 코드입니다. maxOrMin() 메소드를 호출할 때  빈 곳에 람다식을 작성해보세요.

```
@FunctionalInterface
public interface Operator {
    public int apply(int x, int y);
}
```
```
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
        int max = MaxOrMin(   빈칸1  );
        System.out.println("최대값: " + max);

        //최솟값 얻기
        int min = MaxOrMin(   빈칸2   );
        System.out.println("최솟값: " + min);
    }
}
```
나의 답:

빈칸1:

    Math::max

빈칸2:

    Math::min