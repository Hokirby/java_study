package Exercise.Exercise1000;

public class Problem005 {
    public static void main(String[] args) {
        int pork = 8000;
        int cal = 6000;
        int wang = 5000;

        System.out.printf("%s x%3d = %7d\n", "돈가스", 16, 16 * pork);
        System.out.printf("%s x%3d = %7d\n", "칼국수", 8, 8 * cal);
        System.out.printf("%s x%3d = %7d\n", "왕만두", 1, wang);
        System.out.println("========================================");
        System.out.printf("%s: %d", "총합", (16*pork) + (8*cal) + wang);

    }
}
