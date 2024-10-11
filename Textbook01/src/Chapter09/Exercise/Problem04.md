### 4. 다음과 같이 Car 클래스 내부에 Tire 와 Engine 클래스가 멤버로 선언되어 있습니다. Car 클래스에서 Tire 와 Engine 객체를 생성하는 코드를 작성해보세요.

```
public class Car {
    class Tire {}
    static class Engine{}
}
```
```
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Tire tire = (        빈칸        );
        Car.Engine engine = (          빈칸          );
    }
}
```

나의 답:

빈칸 1: new Car.Tire()

빈칸 2: Engine()

정답:

빈칸 1: 

myCar.new Tire()

빈칸 2:

new Car.Engine()