### 7. while 문과 Scanner 의 nextLine() 메소드를 이용해서 다음 실행 결과와 같이 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
```
    Scanner userNum = new Scanner(System.in);
    Scanner userDeposit = new Scanner(System.in);
    Scanner userWithdraw = new Scanner(System.in);

    while (true) {
        System.out.println("----------------------------------");
        System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
        System.out.print("----------------------------------");
        int num = Scanner.nextLine(userNum);
        if (num.equals(1)) {
            int deposit = (int) Scanner.nextLine.(userDeposit);
            System.out.println("선택> 1");
            System.out.printf("예금액>%s", userDeposit);
        } else if (num.equals(2)) {
            int withdraw = (int) Scanner.nextLine(userWithdraw);
            System.out.println("선택> 2");
            System.out.printf("출금액>%s", userWithdraw);
        } else if (num.equals(3)) {
            System.out.println("선택> 3");
            int money = (int) userDeposit - userWithdraw;
            System.out.printf("잔고>%s", money);
        } else if (num.equals(4)) {
            System.out.println("프로그램 종료");
            break;
        }
    }
```

정답:

```
boolean run = true;
int balance = 0;
Scanner scanner = new Scanner(System.in);

while(run) {
    System.out.println("--------------------------");
    System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
    System.out.println("--------------------------");
    System.out.println("선택>");
    
    int num = scanner.nextInt();
    int deposit = 0;
    int withdraw = 0;
    
    if (num == 1) {
        System.out.println("예금액");
        deposit = scanner.nextInt();
        balance += deposit;
    } else if (num == 2) {
        System.out.println("출금액");
        withdraw = scanner.nextInt();
        balance -= withdraw;
    } else if (num == 3) {
        System.out.println("잔고>" + balance);
    } else {
        run = false;
    }
}
