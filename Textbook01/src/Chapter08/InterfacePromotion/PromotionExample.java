package Chapter08.InterfacePromotion;

public class PromotionExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        //인터페으스 변수 선언
        A a;

        //변수에 구현 객체 대입
          a = b; //A <- 자동 타입 변환
          a = c;
          a = d;
          a = e;
    }
}
