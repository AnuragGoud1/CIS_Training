public class Account {

    private String AccountHolderName;
    private int AccountNo;
    private String AccountBank;
    private String AccountType;
    private int Balance;
    private String City;




    public Account(String accountHolderName, int accountNo, String accountBank, String accountType, int balance, String city) {
        AccountHolderName = accountHolderName;
        AccountNo = accountNo;
        AccountBank = accountBank;
        AccountType = accountType;
        Balance = balance;
        City = city;
    }
    public String getAccountHolderName() {
        return AccountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        AccountHolderName = accountHolderName;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public String getAccountBank() {
        return AccountBank;
    }

    public void setAccountBank(String accountBank) {
        AccountBank = accountBank;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }
    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

}
