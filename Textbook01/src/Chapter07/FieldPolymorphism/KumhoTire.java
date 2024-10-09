package Chapter07.FieldPolymorphism;

public class KumhoTire extends Tire{
    //메소드 재정의 (Overriding)
    @Override
    public void roll() {
        System.out.println("금호 타이어가 회전합니다.");
    }
}
