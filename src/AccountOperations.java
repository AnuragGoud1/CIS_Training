import java.util.ArrayList;

public class AccountOperations {
    ArrayList<Account> accountList = new ArrayList<>();

    // Add account details
    public void addAccountDetails(Account account) {
        accountList.add(account);
        if (accountList.size() == 1) {
            System.out.println("Account added Successfully....");
        }else {
            System.out.println("Accounts added Successfully....");
        }
    }

    public void deleteAccount( Account account){
        accountList.remove(account);
        System.out.println("Account is deleted...");
    }

    public void listAccounts(){
        for(Account ac : accountList){
            System.out.println(ac);
        }
    }

    
    // check balance of the account holder
    public void getAccountBalance(int accountNo){
        for (Account ac : accountList) {
            if(accountNo==ac.getAccountNo())
            {
                if(ac.getBalance() < 0)
                {
                    System.out.println("***** Insufficient Balance *****");
                } else  {
                    System.out.println(" Available Balance: "+ ac.getBalance());
                }
            }
            else{
                System.out.println("You have entered the wrong account number");
            }
        }
    }
    
    // check Accounts in same city
      public void getAccountsInSameCity(String city){
        for( Account ac: accountList){
            if(city == ac.getCity()){
                System.out.println(ac.getAccountHolderName());
            }else {
                System.out.println(" No Account found in this "+ city);
            }
        }
      }
    
    // check add balance
    public void addBalance(int accountno, int amount){
        for(Account ac: accountList){
            if(accountno== ac.getAccountNo()){
                int totalAmount = ac.getBalance();
                totalAmount+=amount;
                ac.setBalance(totalAmount);
                System.out.println(" Amount of"+ amount+ " added and updated total balance:"+ totalAmount);
            }
        }
    }
    
    // check deduct balance
    public void deductBalance(int accno, int amount){
        for(Account ac: accountList){
            if(accno== ac.getAccountNo()){
                int totalAmount = ac.getBalance();
                totalAmount= totalAmount - amount;
                ac.setBalance(totalAmount);
                System.out.println(" Amount of"+ amount+ " is deducted and updated total balance:"+ totalAmount);
            }
        }
    }
    
    // give account details of specific record

    public void getAccountDetails(long accountNo) {
        String details = null;
        for (Account ac : accountList) {
            if (accountNo == ac.getAccountNo()) {
//            details = ac.toString();
            System.out.println(ac);
            }
        }

    }
    }


