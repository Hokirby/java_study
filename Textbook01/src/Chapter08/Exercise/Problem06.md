### 6. Soundable 인터페이스는 다음과 같은 sound() 추상 메소드를 가지고 있습니다.
SoundableExample 클래스의 printSound() 호출할 떄 Cat과 Dog 객체를 주고 실행하면 각각 "야옹 "멍멍"이 출력되도록 Cat과 Dog 클래스를 작성해주세요.

```
public interface Soundable {
    public String sound(); 
}
```
```
public class SoundableExample {
    public static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {
        printSound(new Cat());
        printSound(new Dog());
    }
}
```
나의 답:
```
public class Dog implements Soundable {
    @Override
    public String sound() {
        return "멍멍";
    }
}

```
```
public class Cat implements Soundable {
    @Override
    public String sound() {
        return "야옹";
    }
}

```