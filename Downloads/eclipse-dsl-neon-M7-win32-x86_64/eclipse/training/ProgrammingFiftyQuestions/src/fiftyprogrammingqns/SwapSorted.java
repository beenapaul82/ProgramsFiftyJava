package fiftyprogrammingqns;

import java.util.Scanner;

public class SwapSorted {
	public static void main(String args[]){
		SortArray sr=new SortArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int m= sc.nextInt();
		int[] arr=new int[m];
		System.out.println("enter the array");
		for(int i=0;i<m;i++)
		{
		arr[i]=sc.nextInt();
		}
		sr.sortArray(m,arr);
		sc.close();	
	}


	void sortArray(int m,int[] arr){
		 // Traverse the given array from rightmost side
	    for (int i = m-1; i > 0; i--)
	    {
	        // Check if arr[i] is not in order
	        if (arr[i] < arr[i-1])
	        {
	            // Find the other element to be swapped with arr[i]
	           int j = i-1;
	            while (j>=0 && arr[i] < arr[j])
	                j--;
	 
	            // Swap the pairs arr[i] and arr[j+1]
	            int temp;
	           temp=arr[i];
	           arr[i]=arr[j+1];
	           arr[j+1]=temp;
	            break;
	        }
	    }
	System.out.println("the sorted array");
	for(int i=0;i<m;i++){
		System.out.print(arr[i]+" ");
	}
	}

}
