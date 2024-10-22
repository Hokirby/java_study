package Chapter17.Exercise.Problem05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "This is java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .filter(str -> {
                    if (str.contains("java") || str.contains("Java"))
                        return true;
                    else {
                        return false;
                    }
                })
                .forEach(str -> System.out.println(str));
    }
}
