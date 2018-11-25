package com.jis;

import java.util.Scanner;

public class Factorial {
	
	 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1)); //using recursion
		  
	 }
	 
	public static void main(String[] args) {
		
		 int fact=1; 
		 Scanner s = new Scanner(System.in);  
	     System.out.print("Enter a number : ");  
	     int n = s.nextInt();
	     
		 fact = factorial(n);   
		 System.out.println("Factorial of "+n+" is: "+fact);  
		 s.close();
	}

}
