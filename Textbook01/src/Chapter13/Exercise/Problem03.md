### 3. ContainerExample 클래스의 main 메소드는 Container 제네릭 타입을 사용하고 있습니다. main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

```
public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String>container1 = new Container<String, String>();
        container1.set("홍길동", "도적");
        String name1 = container.getKey();
        String job = container1.getValue();
        
        Container<String, Integer> container2 = new Container<String, integer>();
        container2.set("홍길동", 35);
        String name2 = container.getKey();
        int age = container2.getValue();
    }
}
```
나의 답:

```
public class Container<T, M> {
    private T t1;
    private M m1;

    public Container() {
    }

    public void set(T t1, M m1) {
        this.t1 = t1;
        this.m1 = m1;
    }

    public T getKey() {
        return this.t1;
    }

    public M getValue() {
        return this.m1;
    }

}
```