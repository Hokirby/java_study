### 6. Parent 클래스를 상속해서 Child 클래스를 다음과 같이 작성했는데, Child 생성자에서 컴파일 에러가 발생했습니다. 그 이유와 해결 방법을 설명해보세요.

```
public class Parent {
    public String name;
    
    public Parent(String name) {
        this.name = name;
    }
}
```

```
public class Shild extends Parent {
    public int studentNo;
    public Child(String name, int studentNo) {
        this.name = name;
         this.studentNo = studentNo;
    }     
}
```

나의 답:

```
public class Shild extends Parent {
    public String name;
    
    public Child(String name, int studentNo) {
        super(name);
         this.studentNo = studentNo;
    }     
}
```