import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        int count =0;
        String input = scanner.next();
        char[] charArray = input.toCharArray();
        for(int i=0;i< charArray.length;i++){
            if(charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u'||
            charArray[i]=='A'||charArray[i]=='E'||charArray[i]=='I'||charArray[i]=='O'||charArray[i]=='U'){
                count++;
            }
        }
        System.out.println("No of Vowels: "+ count);
    }
}
