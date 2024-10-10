package Chapter08.SealedInterface;

public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}
