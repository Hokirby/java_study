package Chapter12.Exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem16 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        String strDate = sdf.format(new Date());
        System.out.println(strDate);
    }
}
