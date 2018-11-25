/*
1
2 3
4 5 6
7 8 9 10
 */
package com.jis.Pattern;

public class Number {
	public static void main(String[] args){
		int no=1;
		for (int i =0; i<=3; i++){
			for (int j =0; j <=i; j++){
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}
}
