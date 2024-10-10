package Chapter08.InterfaceFieldPolymorphism;

public class Car {
    //필드
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    //메소드
    void run() {
        tire1.roll(); //인터페이스에 선언된 추상 메소드 호출
        tire2.roll(); //구현 객체의 roll() 메소드를 실행시킨다.
    }
}
