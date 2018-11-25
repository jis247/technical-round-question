package com.jis;

import java.util.Scanner;

public class Palindrome_no {
	public static void isPalindrome(int number) {
		
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of a number is equal then
        // number is palindrome
        if (number == reverse) 
        	System.out.println("Number is Palmindrome");
        else
        System.out.println("Number is not Palmindrome");
    }


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  
	       System.out.print("Enter a number : ");  
	       int n = s.nextInt();
	       isPalindrome(n);
	       s.close();
	}

}
