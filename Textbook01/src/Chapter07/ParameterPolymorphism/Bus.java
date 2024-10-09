package Chapter07.ParameterPolymorphism;

public class Bus extends Vehicle{
    //메소드 재정의 (Overriding)
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
