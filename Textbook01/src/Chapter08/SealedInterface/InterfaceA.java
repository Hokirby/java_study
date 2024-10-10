package Chapter08.SealedInterface;

public sealed interface InterfaceA permits interfaceB {
    void methodA();
}
