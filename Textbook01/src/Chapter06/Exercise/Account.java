package Chapter06.Exercise;

public class Account {
    String accountNum;
    String name;
    String money;

    Account(String accountNum, String name, String money) {
        this.accountNum = accountNum;
        this.name = name;
        this.money = money;
    }

    public static void accountManual () {
        System.out.println("-----------------------------");
        System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
        System.out.println("-----------------------------");
        System.out.print("선택> ");
    }

    public String[] accountMake() {
        String[] accountMade = new String[3];
        accountMade[0] = this.accountNum;
        accountMade[1] = this.name;
        accountMade[2] = String.valueOf(this.money);
        return accountMade;
    }

    public static void accountList(String[][] accountArray, int num) {
        System.out.println("-----------------------------");
        System.out.println("계좌목록");
        System.out.println("-----------------------------");
        for (int i = 0; i <= num-1; i++) {
            System.out.println(accountArray[i][0] + "\t" + accountArray[i][1] + "\t" + accountArray[i][2]);
        }
    }

    public static void depositWithdrawManual(String userInput) {
        switch(userInput) {
            case "3": {
            System.out.println("-----------------------------");
            System.out.println("예금");
            System.out.println("-----------------------------");
            System.out.print("계좌번호: ");
            break;
            }
            case "4": {
                System.out.println("-----------------------------");
                System.out.println("출금");
                System.out.println("-----------------------------");
                System.out.print("계좌번호: ");
            }
        }

    }

    public static int accountInfoMake(String[][] accountArray, String userAccount) {
        for (int i = 0; i <= accountArray.length; i++) {
            if (accountArray[i][0] == null && accountArray[i][0].isBlank()) {
                continue;
            }
            if (accountArray[i][0].equals(userAccount)) {
                return i;
            }else i++;
        }
        return -1;
    }

    public static String[][] depositWithdraw (String userInput, String[][] accountArray, int accountInfo, String money) {
        if(accountArray[0][0] == null || accountArray[0][0].isBlank()) {
            System.out.println("계좌정보가 존재하지 않습니다.");
            return accountArray;
        }
        int moneyInput = Integer.parseInt(money);
        switch (userInput) {
            case "3": {
                accountArray[accountInfo][2] = String.valueOf(Integer.parseInt(accountArray[accountInfo][2]) + moneyInput);
                System.out.println("예금이 성공되었습니다.");
                break;
            }
            case "4": {
                if (Integer.parseInt(accountArray[accountInfo][2]) < moneyInput) {
                    System.out.println("잔액이 부족합니다.");
                }
                accountArray[accountInfo][2] = String.valueOf(Integer.parseInt(accountArray[accountInfo][2]) - moneyInput);
                System.out.println("출금이 성공되었습니다.");
                break;
            }
        }
        return accountArray;
    }


}
