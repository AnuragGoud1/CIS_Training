import java.util.Scanner;

public class AgeExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter person's age:");
        int age = sc.nextInt();
        if(age < 13 && age >0){
            System.out.println(" Kid ");
        } else if( age >=13 && age <=19){
            System.out.println("Teen");
        } else {
            System.out.println("Adult");
        }
    }
}
