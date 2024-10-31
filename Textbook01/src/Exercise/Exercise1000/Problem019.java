package Exercise.Exercise1000;

public class Problem019 {
    public static int sum (int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
        System.out.printf("총합: %d\n", sum(arr));
    }
}
