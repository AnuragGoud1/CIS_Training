import java.util.ArrayList;
import java.util.Scanner;

public class AccountController {


    public static void main(String[] args) {
        AccountOperations operations = new AccountOperations();

        Scanner sc = new Scanner(System.in);
        for (int i =1;i<=1;i++) {
            System.out.println("Enter Account Details: Record-------->"+i);
            System.out.println("Enter Account Holder Name: ");
             String AccountHolderName = sc.next();
             System.out.println("Enter Account Number:");
             int AccountNo= sc.nextInt();
             System.out.println("Enter Account Bank:");
             String AccountBank = sc.next();
             System.out.println("Enter Account Type:");
             String AccountType = sc.next();
             System.out.println("Enter Account Balance:");
             int Balance = sc.nextInt();
             System.out.println("Enter City");
             String City = sc.next();
             Account account = new Account(AccountHolderName,AccountNo,AccountBank,AccountType,Balance,City);
             operations.addAccountDetails(account);
        }

            System.out.println("Enter account number: ");
            int value = sc.nextInt();
            operations.getAccountBalance(value);
            operations.getAccountDetails(value);



    }
}
