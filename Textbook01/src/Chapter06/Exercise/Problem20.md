### 20. 다음은 키보드로부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램입니다. 계좌는 Account 객체로 생성되고 BankApplication 에서 길이 100인 Account[] 배열로 관리됩니다. 실행 결과를 보고, Account와 BankApplication 클래스를 작성해보세요 (키보드로 입력받을 때는 Scanner 의 nextLine() 메소드를 사용).

나의 답:

```
public class Account {
    String accountNum;
    String name;
    int money;

    public String[] accountMake (String accountNum, String name, int money) {
        this.accountNum = accountNum;
        this.name = name;
        this.money = money;
        String[] accountMade = new String[3];
        accountMade[0]= accountNum;
        accountMade[1] = name;
        accountMade[2] = String.valueOf(money);
        return accountMade;
    }
}

```

```
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] accountArray = new String[100][3];
        int num = 0;

        while(true) {
            System.out.println("-----------------------------");
            System.out.println("1.계좌생성| 2.계좌목록|3.예금|4.출금|5.종료");
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

                Account account = new Account();
                String[] accountMade = new String[3];
                accountMade = account.accountMake(accountNum, name, money);
                System.arraycopy(accountArray[num-1],num-1, accountMade, 0,  accountMade.length);
                System.out.println("결과: 계좌가 생성되었습니다.");
            } else if (userInput.equals("2")) {
                System.out.println("-----------------------------");
                System.out.println("계좌목록");
                System.out.println("-----------------------------");
                for (int i = 0; i <= num; i++) {
                    System.out.println(accountArray[i][0] + "\t" + accountArray[i][1] + "\t"+ accountArray[i][2]);
                }
            } else if (userInput.equals("3")) {
                System.out.println("-----------------------------");
                System.out.println("예금");
                System.out.println("-----------------------------");
                System.out.print("계좌번호: ");
                String userAccount = scanner.nextLine();
                System.out.println("예금액: ");
                int deposit = scanner.nextInt();
                
            } else if (userInput.equals("4")) {
                System.out.println("-----------------------------");
                System.out.println("출금");
                System.out.println("-----------------------------");
                System.out.print("계좌번호: ");
                String userAccount = scanner.nextLine();
                System.out.println("출금액: ");
                int withdraw = scanner.nextInt();
                System.out.println("출금이 성공되었습니다.");
                
            } else if (userInput.equals("5")) {
                System.out.println("프로그램 종료");
            }

        }
    }
}

```