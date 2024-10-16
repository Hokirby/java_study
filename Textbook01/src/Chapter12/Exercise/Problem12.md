### 12. 숫자 100과 300으로 각각 박싱된 Integer 객체를 == 연산자로 비교한 결과 100을 박싱한 Integer 객체는 true가 나오지만, 300을 박싱한 Integer 객체는 false가 나왔습니다. 그 이유를 설명하고 값만 비교할 수 있도록 코드를 수정해보세요.

```
public class IntegerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;
        
        System.out.println(obj1 == obj2);
        System.out.println(obj3 == obj4);
    }
}
```
나의 답 :

==연산자는 숫자 값의 비교에서 -128 ~ 128 사이의 값을 비교할 때는 값만을 비교할 수 있지만, 그 이상의 값은 값을 감싼 객체의 번지를 비교하기 때문에 의도한 숫자값의 비교는 어렵다.
따라서 범위 바깥의 숫자 값만 비교해야 할 때는 객체의 내부값을 비교하는 equals() 메소드를 사용하는 것이 좋다.

    System.out.println(obj3.equals(obj4));