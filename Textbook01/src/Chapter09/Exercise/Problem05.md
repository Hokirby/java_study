### 5. Action 인터페이스는 다움과 같이 work() 추상 메소드를 가지고 있습니다. ActionExample 클래스의 main() 메소드에서 Action의 익명 구현 객체를 만들어 실행 결과와 동일하게 나오도록 빈칸에 들어갈 코드를 작성해보세요.

```
public interface Action {
    public void work();
} 
```
```
public class ActionExample {
    pub;ic static void main(String[] args) {
        Action action = (      빈칸        )
        action.work()
    }
}
```
나의 답: 

new implements Action();
@Override
public void work() { 
    System.out.println("복사를 합니다.");
}

정답:

Action action = new Action(){
    @Override
    public void work() {
    System.out.println("복사를 합니다.");
    }
};