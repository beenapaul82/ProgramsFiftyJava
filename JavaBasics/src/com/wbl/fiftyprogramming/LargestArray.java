package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class LargestArray {
public static void main(String args[]){
	LargestArray la=new LargestArray();
	System.out.println("Enter the size of array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("enter the elements");
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
	la.largestArray(n,intArray);
	
}
public void largestArray(int n,int [] intArray){
	int la =intArray[0];
	for(int i=0;i<n;i++)
	{		
		if(intArray[i]> la){
			la=intArray[i];
		}
	}
	System.out.println("largest no of array is "+la);
}
}
