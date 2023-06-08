package org.cistraining.com;

import java.util.Scanner;

public class AnagramExample {

    public boolean checkValue1WithValue2(char[] a1, char[] a2){
        boolean flag = false;
        if(a1.length==a2.length){
            for(int i=0; i< a1.length;i++){
                for(int j=0;j< a2.length;j++){
                    if(a1[i]==a2[j]){
                        flag =true;
                        break;
                    }else{
                        flag =false;
                    }
                }
            }
        }
        return flag;
    }

    public boolean checkValue2WithValue1(char[] a1, char[] a2){
        boolean flag = false;
        if(a1.length==a2.length){
            for(int i=0; i< a1.length;i++){
                for(int j=0;j< a2.length;j++){
                    if(a1[i]==a2[j]){
                        flag =true;
                        break;
                    }else{
                        flag =false;
                    }
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        AnagramExample ae = new AnagramExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1:");
        String value1 = sc.next();
        System.out.println("Enter word2:");
        String value2 = sc.next();
        char[] v1 = value1.toCharArray();
        char[] v2 = value2.toCharArray();

        boolean result =false;
        if(ae.checkValue1WithValue2(v1,v2)&&ae.checkValue2WithValue1(v2,v1)){
            result= true;
        } else {
            result = false;
        }
        if(result){
            System.out.println(" Words are Anagram");
        } else{
            System.out.println(" Words are not Anagram");
        }
    }
}
