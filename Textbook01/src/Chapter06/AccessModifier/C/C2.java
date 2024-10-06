package Chapter06.AccessModifier.C;

import Chapter06.AccessModifier.AB.*;

public class C2 {
    public C2() {
        //객체 생성
        A2 a = new A2();

        //필드값 변경
        a.field1 = 1; //o
        //a.field2 = 1; //x default 필드 접근 불가(컴파일 에러)
        //a.field3 = 1; //x private 필드 접근 불가(컴파일 에러)

        //메소드 호출
        a.method1(); //o
        //a.method2(); //x default 메소드 접근 불가(컴파일 에러)
        //a.method3(); //x private 메소드 접근 불가(컴파일 에러)
    }
}
