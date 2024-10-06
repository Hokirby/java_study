package Chapter06.Instance;

public class Car3 {
    //필드 선언
    String model;
    int speed;

    //생성자 선언
    Car3(String model) {
        this.model = model;
    }
    //메소드 선언
    void setSpeed (int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(this.model + "가 달랍니다. (시속: " + this.speed + "km/h)");
    }
}
