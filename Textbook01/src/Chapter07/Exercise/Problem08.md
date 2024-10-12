### 8. Tire 클래스를 상속받아 SnowTire 클래스를 다음과 같이 작성했습니다. SnowTireExample 클래스를 실행했을 때 출력 결과를 작성해보세요.

```
public Tire {
    public void run() {
        system.out.println("일반 타이어가 굴러갑니다.");
    }
}
```
```
public class SnowTire extends Tire {
    @Override
    public void run() {
        System.out.println("스노우 타이어가 굴러갑니다.");
    }
}
```
```
public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        
        snowTire.run();
        tire.run();
    }
}
```
나의 답:

스노우 타이어가 굴러갑니다.
스노우 타이어가 굴러갑니다.

출력된다.