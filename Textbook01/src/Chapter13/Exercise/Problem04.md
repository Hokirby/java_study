### 4. 다음 Util 클래스의 정적 getValue() 메소드는 첫 번째 매개값으로 pair 타입과 하위 타입만 받고, 두 번째 매개값으로 키값을 받습니다. 리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고, 일치하지 않은면 null을 리턴하도록 Util 클래스와 getValue() 제네릭 메소드를 작성해보세요.

```
public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = Util.getValue(pair, "홍길동");
        System.out.println(age);
        
        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = Util.getValue(childPair, "홍삼순");
        System.out.println(childAge);
        
        /*
        OtherPair<String, Integer> otherPair<>("홍삼원", 20);
        //OtherPair는 Pair 를 상속하지 않으므로 컴파일 에러가 발생
        int otherAge = Util.getValue(otherPair, "홍삼원");
        System.out.println(otherAge):
        */
    }
}
```
```
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
```
```
public class ChildPair <K, V> extends Pair<K, V>{
    public ChildPair(K k, V v) {
        super(k, v);
    }
}
```
```
public class OtherPair<K, V> {
    private K key;
    private V value;

    public OtherPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
```

나의 답:

```
public class Util<T extends Pair> {
    public static Integer getValue(Pair pair, String str) {
        if (pair.getKey().equals(str)) {
            return (Integer) pair.getValue();
        } else {
            return null;
        }
    }
}

```