import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value:");
        int value = sc.nextInt();
        for( int i=1; i<=100; i++){
            if( i%3 ==0 && i%5==0){
                System.out.print(" FizzBuzz");
            } else if (i % 5 ==0) {
                System.out.print(" Buzz");
            } else if (i % 3 ==0) {
                System.out.print(" Fizz");
            } else {
                System.out.print(" "+i+" ");
            }
        }
    }

}
