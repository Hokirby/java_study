package Chapter12.Exercise;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Problem15 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");

        LocalDateTime nowDateTime = LocalDateTime.of(2024, 10, 16, 0, 0, 0);
        System.out.println("오늘 " + nowDateTime.format(dtf));
        LocalDateTime endDateTime = LocalDateTime.of(2024, 12,31,0,0,0);
        System.out.println("올해의 종료일 " + endDateTime.format(dtf));

        long remainY = nowDateTime.until(endDateTime, ChronoUnit.YEARS);
        long remainM = nowDateTime.until(endDateTime, ChronoUnit.MONTHS);
        long remainD = nowDateTime.until(endDateTime, ChronoUnit.DAYS);
        long remainH = nowDateTime.until(endDateTime, ChronoUnit.HOURS);
        long remainMin = nowDateTime.until(endDateTime, ChronoUnit.MINUTES);
        long remainS = nowDateTime.until(endDateTime, ChronoUnit.SECONDS);

        System.out.println("남은 해: " + remainY);
        System.out.println("남은 월: " + remainM);
        System.out.println("남은 날: " + remainD);
        System.out.println("남은 시간: " + remainH);
        System.out.println("남은 분: " + remainMin);
        System.out.println("남은 초 " + remainS);

    }
}
