import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input Value");
        int givenInputValue = sc.nextInt();
        int first =0;
        int second =1;
        int third;
                System.out.print(first+" "+second);

            for(int i =2;i< givenInputValue;i++){
               third  = first + second;
               first = second;
               second = third;
                System.out.print(" "+third);
                }
            }
    }

