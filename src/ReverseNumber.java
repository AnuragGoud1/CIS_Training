import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required number:");
        int inputValue = sc.nextInt();
        int reverse =0;
        while( inputValue != 0 ){
            int sum = inputValue %10;
            reverse = reverse * 10 + sum;
            inputValue= inputValue /10;
        }
        System.out.println("Reverse Value:"+ reverse);
    }

}
