package java.Chapter04.ForGrammarExample.FloatCounterExample;

public class FloatCounterExample {
    public static void main(String[] args) {
        for(float x = 0.1f; x < 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }
}