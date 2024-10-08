package Chapter07.ProtectedAccessModifier.AB;

public class B {
    //메소드 선언
    public void method() {
        A a = new A();
        a.field = "value";
        a.method();
    }
}
