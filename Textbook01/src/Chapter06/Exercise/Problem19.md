### 19. 은행계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있습니다. balance 필드는 음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있습니다. 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고, 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성해보세요.

1. Setter와 Getter룰 이용
2. 0과 1,000,000은 MIN_BALANCE 와 MAX_BALANCE 상수를 선언해서 이용
3. Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance 값을 유지

```
Account account = new Account();

account.setBalance(10000);
System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

account.setBalance(-100);
System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

account.setBalance(20000000);
System.out.prtintln("현재 잔고: " + account.getBalance()); //현재 잔고: 10000

account.setBalance(300000);
System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 3000000
```

나의 답:

```
public class Account {

    int balance;

    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    
   //Integer.unsignedInt()
    
    boolean setBalance(int balance) {
        if (MIN_BALANCE<= balance && balance <= MAX_BALANCE) {
            this.balance = balance;
            return true;
        } else {
            return false;
        }

    }
    int getBalance() {
        if (setBalance(balance)) {
            return this.balance;
        } else {
            return this.balance;
        }
    }
}

```