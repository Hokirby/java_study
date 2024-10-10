package Chapter08.InterfaceFieldPolymorphism;

public class HankookTire implements Tire{
    //추상 메소드 재정의
    @Override
    public void roll() {
        System.out.println("한국 타이어가 굴러립니다.");
    }
}
