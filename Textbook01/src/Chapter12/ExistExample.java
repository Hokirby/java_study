package Chapter12;

public class ExistExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //i 값 추력
            System.out.println(i);
            if (i == 5) {
                //JVM 프로세스 종료
                System.out.println("프로세스 강제 종료");
                System.exit(0);
            }
        }
    }
}
