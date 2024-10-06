package Chapter06.AccessModifier.AB;

public class B1 {
    //필드 선언
    A1 a1 = new A1(true); //o
    A1 a2 = new A1(1); //o
    //A1 a3 = new A1("문자열"); //x private 생성자 접근 불가
}
