package java.src.이것이_자바다.Chapter04.ForGrammarExample.ForGrammarExample.MultiplicationTableEample;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int m = 2; m <= 9; m++) {
            System.out.println("*** " + m + "단 ***");
            for (int n = 1; n <= 9; n ++) {
                System.out.println(m + "x" + n + "=" + (m*n));
            }
        }
    }
}
