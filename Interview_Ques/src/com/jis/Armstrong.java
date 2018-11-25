package com.jis;
//153 is armstrong because 153 = 1^3 + 5^3 + 3^3

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		  int c=0,a,temp;
		  Scanner s = new Scanner(System.in);  
		  System.out.print("Enter a number : ");  
		  int n = s.nextInt();
		  
		  temp=n;  
		  while(n>0){  
		    a=n%10;  //stores last digit in a
		    n=n/10;  //removes last digit from n
		    c=c+(a*a*a);  //cube of each digit 
		    }
		  
		  if(temp==c)  
		    System.out.println("armstrong number");   
		  else  
		    System.out.println("Not armstrong number");
		  
		  s.close();
	}
}

