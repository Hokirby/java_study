### 6. ObjectInputStream, ObjectOutputStream 에 대한 설명으로 틀린 것은 무엇입니까?

1. 객체를 직렬화해서 출력하고 역직렬화해서 복원시킨다.
2. Serializable 인터페이스를 구현한 객체만 입출력할 수 있다.
3. 클래스의 serialVersionUID 는 입출력할 때 달라도 상관없다.
4. transient 필드는 출력에서 제외된다.

나의 답: 3번

---
내 생각:

ObjectOutputStream 은 같은 클래스만 출력할 수 있는데, serialVersionUID 를 같게 설정하면 같은 클래스의 다른 부분이나, 다른 클래스도 출력할 수 있다.