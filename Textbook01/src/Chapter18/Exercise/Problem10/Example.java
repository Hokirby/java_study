package Chapter18.Exercise.Problem10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws Exception {
        File dir1 = new File("C:/Temp/dir1");
        File dir2 = new File("C:/Temp/dir2");

        if (!dir1.exists()) {
            dir1.mkdirs();
        }
        if (!dir2.exists()) {
            dir2.mkdirs();
        }

        System.out.println("원본 파일 경로: " + dir1 + "/photo1.jpg");
        System.out.println("복사 파일 경로: " + dir2 + "/photo2.jpg");

        byte[] data = new byte[1024];
        try {
            File file1 = new File("C:/Temp/dir1/photo1.jpg");
            File file2 = new File("C:/Temp/dir2/photo2.jpg");
            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            while (true) {
                int num = fis.read(data);
                if (num == -1) {
                    break;
                }
            }
            fos.flush();
            fos.close();
            fis.close();
            System.out.println("복사가 성공되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println("원본 파일이 존재하지 않습니다.");
        }

    }
}
