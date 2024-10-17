### 2. ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용학고 있습니다. main() 메소드애서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.

```
public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<String>();
        container1.set("홍길동");
        String str = container1.get();
        
        Container<String> container2 = new Container<String>();
        container2.set(6);
        int value = container1.get();
    }
}
```

```
public class Container<T> {
    private T t;
    
    public Container() {
    }
    
    public void set(T t) {
        this.t = t;
    }
    public T get() {
        return this.t;
    }
}

```