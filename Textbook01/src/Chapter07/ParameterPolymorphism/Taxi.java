package Chapter07.ParameterPolymorphism;

public class Taxi extends Vehicle{
    //메소드 재정의(Overrriding)
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
