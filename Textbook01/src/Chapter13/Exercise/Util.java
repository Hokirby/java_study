package Chapter13.Exercise;

public class Util<T extends Pair> {
    public static Integer getValue(Pair pair, String str) {
        if (pair.getKey().equals(str)) {
            return (Integer) pair.getValue();
        } else {
            return null;
        }
    }
}
