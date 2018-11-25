/*
1 2 3
4 5 6
7 8 9
 */
package com.jis.Pattern;

public class Number4 {

	public static void main(String[] args) {
		int j;
		for(j=1;j<=9;j++){
		if(j%3==0){
			System.out.println(j);
		}
		else
			System.out.print(j+" ");
		}
	}
}

