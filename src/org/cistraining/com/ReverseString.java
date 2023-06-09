package org.cistraining.com;

import java.util.Scanner;


public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            output.append(reversedWord).append(" ");
        }

        System.out.println("Output:");
        System.out.println(output.toString().trim());
    }
}
