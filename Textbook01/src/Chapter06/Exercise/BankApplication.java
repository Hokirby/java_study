package Chapter06.Exercise;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] accountArray = new String[100][3];
        int num = 0;
        int accountInfo;

        while(true) {
            Account.accountManual();
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println("-----------------------------");
                num += 1;
                System.out.print("계좌번호: ");
                String accountNum = scanner.nextLine();
                System.out.print("계좌주: ");
                String name = scanner.nextLine();
                System.out.print("초기입금액: ");
                String money = scanner.nextLine();
                Account account = new Account(accountNum, name, money);
                accountArray[num-1] = account.accountMake();
                System.out.println("결과: 계좌가 생성되었습니다.");
            } else if (userInput.equals("2")) {
                Account.accountList(accountArray, num);
            } else if (userInput.equals("3")) {
                Account.depositWithdrawManual(userInput);
                String userAccount = scanner.nextLine();
                accountInfo = Account.accountInfoMake(accountArray, userAccount);
                System.out.print("예금액: ");
                String deposit = scanner.nextLine();
                accountArray = Account.depositWithdraw(userInput, accountArray,accountInfo, deposit);
            } else if (userInput.equals("4")) {
                Account.depositWithdrawManual(userInput);
                String userAccount = scanner.nextLine();
                System.out.print("출금액: ");
                String withdraw = scanner.nextLine();
                accountInfo = Account.accountInfoMake(accountArray, userAccount);
                accountArray = Account.depositWithdraw(userInput, accountArray,accountInfo, withdraw);
            } else if (userInput.equals("5")) {
                System.out.println("프로그램 종료");
                break;
            }

        }
    }
}
