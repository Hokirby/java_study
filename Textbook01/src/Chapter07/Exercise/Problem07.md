### 7. Parent 클래스를 상속받아 Child 클래스를 다음과 같이 작성했습니다. ChildExample 클래스를 실행했을 때 호출되는 각 클래스의 생성자의 순서를 생각하면서 출력 결과를 작성해보세요.

```
public class Parent{
    public String nation;
    
    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }
    
    public Parent(String nation) {
    this.nation = nation;
    System.out.println("Parent(String nation) call");
}
```
```
public class Child extends Parent {
    public String name;
    
    public Child() {
        this("홍길동")
        System.out.println("Child() call");
    }
    
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call")
    }
}
```
```
public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
```
나의 답:

Parent()call
Parent(String nation) call
Child() call
Child(String name) call

출력된다.

정답:

Parent(String nation) call
Parent() call
Child(String name) call
Child() call

해설: 

this()는 같은 클래스의 다른 생성자를 호출할 때 사용한다.
1. main의 Child child = new Child() 에서 public Child()로 이동
2. this("홍길동") 실행 전에 자동으로 생성되는 기본 부모 생성자 호출 -> super()
3. public Parent()로 이동하여 this("대한민국")으로 public Parent(String nation)으로 이동
4. ①Parent(String nation) call 출력
5. 다시 public Parent()로 돌아온 후 ②Parent() call 출력
6. 다시 public Child()로 돌아온 후 this("홍길동")을 통해 public Child(String name)으로 이동
7. ③Child(String name) call 출력
8. 다시 public Child()로 돌아온 후 ④Child() call 출력