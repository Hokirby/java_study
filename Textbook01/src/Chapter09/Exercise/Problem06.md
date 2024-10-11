### 6. AnonymousExample 클래스의 실행 결과을 보고, Vehicle 인터페이스의 익명 구현 객체를 필드와 로컬변수의 초기값 그리고 메소드의 매개값으로 대입해 보세요.

```
public interface Vehicle {
    public void run();
}
```
```
public class Anonymous {
    vehicle field = (           빈칸            )
    void method1() {
        Vehicle localVar = (          빈칸          )
        localVar.run();
    }
    
    void method2(Vehicle v) {
        v.run();
    }
}
```
```
public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method1();
        anony method2(
            (         빈칸           )
        );
    }
}
```
실행 결과:

자전거가 달립니다.
승용차가 달립니다.
트럭이 달립니다.

---
나의 답:

빈칸 1번: 
```
new Vehicle() {
    @Override
    public void run() {
        System.out.println("자전거가 달립니다.");
    }
};
```
빈칸 2번
```
new Vehicle() {
    @Override
    public void run() {
        System.out.println("승용차가 달립니다.");
    }
};
```
빈칸 3번
```
new Vehicle() {
    @Override
    public void run() {
        System.out.println("트럭이 달립니다.");
    }

```