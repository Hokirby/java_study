package Practice;

public class ToDoList {
    String[][] scheduleArray = new String[100][3];
    int scheduleNum = 0;

    public static void manual() {
        System.out.println("----------------------");
        System.out.println("1.일정 메모 작성|2.메모 목록 확인|3.일정 날짜 수정|4.일정 장소 수정|5.종료");
        System.out.println("----------------------");
        System.out.print("선택> ");
    }
    public static void memoWriteManual() {
        System.out.println("--------");
        System.out.println("1.일정 메모 작성");
        System.out.println("--------");
    }
    public static void memoRescheduleManual(String userInput) {
        switch(userInput) {
            case "3" : {
                System.out.println("--------");
                System.out.println("3.일정 날짜 수정");
                System.out.println("--------");
                System.out.print("수정하실 일정의 제목을 입력하세요: ");
                break;
            }
            case "4" : {
                System.out.println("--------");
                System.out.println("3.일정 장소 수정");
                System.out.println("--------");
                System.out.print("수정하실 일정의 제목을 입력하세요: ");
                break;
            }
        }

    }

    public void scheduleMemoAdd(String day, String where, String event) {
        String[] scheduleMemo = new String[3];
        if(Integer.parseInt(day.split("/")[0]) <= 12 && (Integer.parseInt(day.split("/")[1]) <= 31)) {
            scheduleMemo[0] = day;
            scheduleMemo[1] = where;
            scheduleMemo[2] = event;
            scheduleArray[scheduleNum] = scheduleMemo;
            scheduleNum += 1;
        } else {
            System.out.println("잘못된 날짜정보입니다.");
        }
    }

    public void memoList() {
        System.out.println("--------");
        System.out.println("2.메모 목록 확인");
        System.out.println("--------");
        for (int i =0; i <= scheduleNum-1; i ++) {
            if (scheduleArray[0][0] == null && scheduleArray[0][0].isBlank()) {
                System.out.println("메모가 존재하지 않습니다.");
            }
            System.out.printf("날짜: %s 장소: %s 제목: %s", scheduleArray[i][0],scheduleArray[i][1],scheduleArray[i][2]);
            System.out.println();
        }
    }
    public int memoRescheduleInfo(String rescheduleEvent) {
        System.out.println();
        for (int i= 0; i <= scheduleNum; i++) {
            if (scheduleArray[0][0] == null && scheduleArray[0][0].isBlank()) {
                System.out.println("메모가 존재하지 않습니다.");
            }
            if (scheduleArray[i][2].equals(rescheduleEvent)) {
                System.out.printf("날짜: %s 장소: %s 제목: %s", scheduleArray[i][0], scheduleArray[i][1], scheduleArray[i][2]);
                System.out.println();
                return i;
            }
        }
        return -1;
    }

    public void memoRescheduleDayWhere (String userInput, int memoInfo, String correction) {
        switch(userInput) {
            case "3": {
                scheduleArray[memoInfo][0] = correction;
                System.out.println("일정 날짜가 수정에 성공했습니다.");
                break;
            }
            case "4": {
                scheduleArray[memoInfo][1] = correction;
                System.out.println("일정 장소 수정에 성공했습니다.");
                break;
            }
        }
    }
}
