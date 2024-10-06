package Chapter06.Exercise;

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
