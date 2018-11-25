package com.jis.Search;

public class Linear {
	static int search(int arr[], int n, int x) 
    { 
        for (int i = 0; i <= n; i++) 
        { 
            // Return the index of the element if the element 
            // is found 
            if (arr[i] == x) 
                return i; 
        } 
   
        // return -1 if the element is not found 
        return -1; 
    } 
	public static void main(String[] args) {
		int arr[]= {5,4,25,1,16};
		int n=arr.length;
		int x=16;
		int z=search(arr,n-1,x);
		if(z==-1)
		System.out.println("Element not found");
		else
			System.out.println("Element found at index "+z);
		
	}

}
