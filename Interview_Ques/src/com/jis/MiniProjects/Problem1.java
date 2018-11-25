/*Consider a 2D matrix of numbers from 0 to 9 with variable width and height.
  Find the square submatrix with the highest sum of boundary elements.
  Input width and height of matrix: 6 8
  Input Matrix with numbers from 0 to 9:

	2 0 6 1 2 5	
	1 0 5 0 1 3	
	3 0 1 2 4 1	
	0 1 3 1 1 9	
	4 1 0 8 5 2	
	0 1 0 1 2 3
	6 5 3 1 0 2
	0 0 1 6 0 4	
	
Input maximum width of square submatrix (for square submatrix height and width are same) : 3

Output : 

(calcute sum of boundary elements only 2,4,1,9,2,5,8,1),

	2 0 6 1 2 5	
	1 0 5 0 1 3	
	3 0 1       2 4 1	
	0 1 3       1 1 9	
	4 1 0       8 5 2	
	0 1 0 1 2 3
	6 5 3 1 0 2
	0 0 1 6 0 4	
 
Output should be :

	 2 4 1	
	 1 1 9	
	 8 5 2
*/

package com.jis.MiniProjects;

import java.util.Scanner;

class Point {
	int first,second;
	public Point(int first, int second) {
		this.first = first;
		this.second = second;
	}
}	

public class Problem1 {
	private static Point mat(int[][] arr, int k) {
		int m=arr.length;
		int n=arr[0].length;
		
		int sum[][]=new int[m][n];
		sum[0][0]=arr[0][0];
		
			for (int j = 1; j < n; j++) {
				sum[0][j] = arr[0][j] + sum[0][j - 1];
			}

			for (int i = 1; i < m; i++) {
				sum[i][0] = arr[i][0] + sum[i - 1][0];
			}
			
			for (int i = 1; i < m; i++) {
				for (int j = 1; j < n; j++) {
					sum[i][j] = arr[i][j] + sum[i - 1][j] + sum[i][j - 1]- sum[i - 1][j - 1];
				}
			}
			int total, max = Integer.MIN_VALUE;
			Point p = null;
			for (int i = k - 1; i < m; i++)
			{
				for (int j = k - 1; j < n; j++)
				{					
					total = sum[i][j];
					if (i - k >= 0) {
						total = total - sum[i - k][j];
					}

					if (j - k >= 0) {
						total = total - sum[i][j - k];
					}

					if (i - k >= 0 && j - k >= 0) {
						total = total + sum[i - k][j - k];
					}

					if (total > max) {
						max = total;
						p = new Point(i, j);
					}
				}
			}
			return p;
	}		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Input width and height of matrix");
		 int c=sc.nextInt();
		 int r=sc.nextInt();
		
		 System.out.println("Input Matrix with numbers from 0 to 9:");
		 int [][]arr=new int[r][c];
		 
		 for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	                arr[i][j]=sc.nextInt();
	            }
	        }
	      
		 for (int i = 0; i < r; i++) {
	            for (int j = 0; j < c; j++) {
	            	System.out.print(arr[i][j]);
	            }
	            System.out.println();
	        }
	        System.out.println("Input maximum width of square submatrix");
	        int k=sc.nextInt();
	        
	        Point p=mat(arr,k);
	        
	        for (int x = 0; x < k; x++)
			{
				for (int y = 0; y < k; y++)
				{
					int row = x + p.first - k + 1;
					int col = y + p.second - k + 1;
					System.out.printf("%3d", arr[row][col]);
				}

				System.out.println();
			sc.close();
			}	     
	}
}
