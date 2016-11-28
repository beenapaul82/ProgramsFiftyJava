package fiftyprogrammingqns;
import java.util.Scanner;

public class missingNumber {
	public static void main(String args[]){
		missingNumber mn=new missingNumber();
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the series of sorted array of elements");
		int intArray[]= new int[n];
		for(int i=0;i<n;i++)
		{
		intArray[i]=sc.nextInt();	
		}
		System.out.println("The array is");
		for(int i=0;i<n;i++)
		{
		System.out.println(intArray[i]);	
		}
    	sc.close();
    	mn.missingArray(n,intArray);
	}
	void missingArray(int n,int[] intArray){
		int sum=0;
		sum= ((n+1)*(n+2)/2);
		for(int i=0;i<n;i++){
			sum =sum-intArray[i];
		}
		System.out.println("Missing no in the array is "+sum);
	}
}
