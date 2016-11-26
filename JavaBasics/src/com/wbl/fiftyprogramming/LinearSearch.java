package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[]){
		LinearSearch ls= new LinearSearch();
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int k=sc.nextInt();
		ls.linSearch(n,arr,k);
		sc.close();
	}
	void linSearch(int n,int[] arr,int k ){
		for(int i=0;i<n;i++){
			if (arr[i]==k){
				System.out.println("element "+k+" is found in position "+(i+1));
			}
		}
			
			
		
	}

}
