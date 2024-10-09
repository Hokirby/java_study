package Chapter07.ClassMethodOverriding;

public class Computer extends Calculator{
    //메소드 오버라이딩
    //@Override
    public double areCircle (double r) {
        System.out.println("Computer 객체의 areCircle() 실행");
        return Math.PI * r * r;
    }
}
