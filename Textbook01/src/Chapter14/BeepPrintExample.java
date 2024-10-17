package Chapter14;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep(); //비프음 발생
                    try {
                        Thread.sleep(500); //0.5초간 일시 정지
                    } catch (Exception e) {}
                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
        }
        try {
            Thread.sleep(500);
        } catch (Exception e){}
    }
}