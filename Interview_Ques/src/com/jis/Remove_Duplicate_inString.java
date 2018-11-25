package com.jis;

import java.util.LinkedHashSet;
import java.util.Scanner;
//I have used Hashing.This method can remove duplicate values from a number too
	public class Remove_Duplicate_inString {
	 /* Function removes duplicate characters from the string 
    This function work in-place */
    void removeDuplicates(String str){ 
        LinkedHashSet<Character> lhs = new LinkedHashSet<>(); 
        for(int i=0;i<str.length();i++) 
            lhs.add(str.charAt(i)); 
          
        // print string after deleting duplicate elements 
        for(Character ch : lhs) 
            System.out.print(ch); 
    } 
    
	public static void main(String[] args) {		 
			System.out.println("Enter a string");
	        Scanner read = new Scanner(System.in);
	        String str = read.nextLine(); 
	        Remove_Duplicate_inString r = new Remove_Duplicate_inString(); 
	        r.removeDuplicates(str); 
	        read.close();
	}
}
