package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class CommonNumber {
	public static void main(String args[]){
		CommonNumber mn=new CommonNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the  array of elements");
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
		System.out.println("Second array");
		System.out.println("Enter the size of array");
		int m=sc.nextInt();
		System.out.println("enter the  array of elements");
		int arr[]= new int[m];
		for(int i=0;i<m;i++)
		{
		arr[i]=sc.nextInt();	
		}
		System.out.println("The array is");
		for(int i=0;i<m;i++)
		{
		System.out.println(arr[i]);	
		}
    	sc.close();
    	mn.commonNumber(n,m,intArray,arr);
	}

	void commonNumber(int n,int m,int []intArray,int [] arr){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(intArray[i]==arr[j]){
					System.out.println("Common number in array");
					System.out.println(intArray[i]);
				}
			}
		}
	}
}
