package Chapter06.Exercise;

public class Account {
    String accountNum;
    String name;
    int money;
    String[] accountArray;

    Account(String accountNum, String name, int money) {
        this.accountNum = accountNum;
        this.name = name;
        this.money = money;
    }

    public String[] accountMake() {
        String[] accountMade = new String[3];
        accountMade[0] = this.accountNum;
        accountMade[1] = this.name;
        accountMade[2] = String.valueOf(this.money);
        return accountMade;
    }

    public static int accountInfoMake(String[][] accountArray, String userAccount) {
        int i = 0;
        int accountInfo;
        while (i <= accountArray.length) {
            if (accountArray[i][0].equals(userAccount)) {
                accountInfo = i;
                break;
            }else i++;
        }
        return i;
    }


}
