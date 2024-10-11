package Practice.ToDoListApplication;

import java.util.Scanner;

public class ListApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList list = new ToDoList();
        boolean run = true;

        while (true) {
            ToDoList.manual();
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                ToDoList.memoWriteManual();
                System.out.print("일정의 날짜를 입력하새요(예:10/13): ");
                String day = scanner.nextLine();
                System.out.print("일정의 장소를 입력하세요(예:고양시): ");
                String where = scanner.nextLine();
                System.out.print("일정의 제목을 입력하세요(예:생일): ");
                String event = scanner.nextLine();
                list.scheduleMemoAdd(day, where, event);
            } else if (userInput.equals("2")) {
                list.memoList();
            } else if (userInput.equals("3")) {
                ToDoList.memoRescheduleManual(userInput);
                String rescheduleEvent = scanner.nextLine();
                int memoInfo = list.memoRescheduleInfo(rescheduleEvent);
                if (memoInfo == -1) {
                    System.out.println("일정 정보가 존재하지 않습니다.");
                }
                System.out.print("수정하실 날짜 정보를 입력하세요(예:02/27): ");
                String correction = scanner.nextLine();
                list.memoRescheduleDayWhere(userInput, memoInfo, correction);
            } else if (userInput.equals("4")) {
                ToDoList.memoRescheduleManual(userInput);
                String rescheduleEvent = scanner.nextLine();
                int memoInfo = list.memoRescheduleInfo(rescheduleEvent);
                if (memoInfo == -1) {
                    System.out.println("일정 정보가 존재하지 않습니다.");
                }
                System.out.print("수정하실 장소 정보를 입력하세요(예:서울시): ");
                String correction = scanner.nextLine();
                list.memoRescheduleDayWhere(userInput, memoInfo, correction);
            } else if (userInput.equals("5")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("메뉴얼을 잘못입력하셨습니다.");
            }
        }

    }
}