package com.jis;

import java.util.Scanner;

public class Fibonacci {
	public static int fibonacci(int number){
		if(number == 1 || number == 2)
			return 1;
		else if(number==0)
			return 0;
		
		return fibonacci(number-1) + fibonacci(number -2);  //using recursion
	}


	public static void main(String[] args) {
		
		System.out.println("Enter number upto which Fibonacci series to print: ");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		
		System.out.println("Fibonacci series upto " + number +" numbers : "); 
		 for(int i=0; i<=number; i++){
			 System.out.print(fibonacci(i) +" "); 
		}
		 sc.close();
	}
}
