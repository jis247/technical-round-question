package com.jis;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
	     System.out.print("Enter 2 number : ");  
	     int a=s.nextInt();
	     int b = s.nextInt();
	     System.out.println("a= " + a + " b= "+b);
	     a=a+b;
	     b=a-b;
	     a=a-b;
	     System.out.println("a= " + a + " b= "+b);
	     s.close();
	}

}
