package Chapter06.Exercise;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] accountArray = new String[100][3];
        int num = 0;
        int accountInfo;

        while(true) {
            System.out.println("-----------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println("-----------------------------");
                num += 1;
                System.out.print("계좌번호: ");
                String accountNum = scanner.nextLine();
                System.out.print("계좌주: ");
                String name = scanner.nextLine();
                System.out.print("초기입금액: ");
                int money = scanner.nextInt();
                Account account = new Account(accountNum, name, money);
                accountArray[num-1] = account.accountMake();
                System.out.println("결과: 계좌가 생성되었습니다.");
            } else if (userInput.equals("2")) {
                System.out.println("-----------------------------");
                System.out.println("계좌목록");
                System.out.println("-----------------------------");
                for (int i = 0; i <= num-1; i++) {
                    System.out.println(accountArray[i][0] + "\t" + accountArray[i][1] + "\t" + accountArray[i][2]);
                }
            } else if (userInput.equals("3")) {
                System.out.println("-----------------------------");
                System.out.println("예금");
                System.out.println("-----------------------------");
                System.out.print("계좌번호: ");
                String userAccount = scanner.nextLine();
                accountInfo = Account.accountInfoMake(accountArray, userAccount);
                System.out.print("예금액: ");
                int deposit = scanner.nextInt();
                accountArray[accountInfo][2] = String.valueOf(Integer.parseInt(accountArray[accountInfo][2]) + deposit);
            } else if (userInput.equals("4")) {
                System.out.println("-----------------------------");
                System.out.println("출금");
                System.out.println("-----------------------------");
                System.out.print("계좌번호: ");
                String userAccount = scanner.nextLine();
                System.out.print("출금액: ");
                int withdraw = scanner.nextInt();
                accountInfo = Account.accountInfoMake(accountArray, userAccount);
                accountArray[accountInfo][2] = String.valueOf(Integer.parseInt(accountArray[accountInfo][2]) - withdraw);
                System.out.println("출금이 성공되었습니다.");
            } else if (userInput.equals("5")) {
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
