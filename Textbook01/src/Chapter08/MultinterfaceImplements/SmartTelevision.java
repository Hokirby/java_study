package Chapter08.MultinterfaceImplements;

public class SmartTelevision implements RemoteControl, Searchable{
    //turnOn() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    //turnOff() 추상 메소드 오버라이딩
    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    //search() 추상 메소드 오버라이딩
    @Override
    public void search(String url) {
        System.out.println(url + "을 겁색합니다.");
    }
}
