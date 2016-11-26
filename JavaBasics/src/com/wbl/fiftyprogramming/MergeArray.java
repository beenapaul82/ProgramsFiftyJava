package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class MergeArray {
public static void main(String args[]){
	MergeArray mg=new MergeArray();
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the size of array1");
	int m= sc.nextInt();
	System.out.println("enter the elements of array1");
	int[] arr1=new int[m];
	for(int i=0;i<m;i++){
		arr1[i]=sc.nextInt();
	}
	System.out.println("enter the size of array2");
	int n= sc.nextInt();
	System.out.println("enter the elements of array2");
	int[] arr2=new int[n];
	for(int i=0;i<n;i++){
		arr2[i]=sc.nextInt();
	}
	System.out.println("Merged Array");
	int [] arr3=mg.mergeArray(m,n,arr1,arr2);
	System.out.println("the elements of merged array");
	for(int i=0;i<(m+n);i++){
		System.out.println(arr3[i]);
	}
	sc.close();
		
}
int[] mergeArray(int m,int n,int[] arr1,int[]arr2){
	int i,j;
	int [] arr3=new int[m+n];
	for(i=0;i<m;i++){
		arr3[i]=arr1[i];
	}
	j=m;
	for(i=0;i<n;i++){
	arr3[j]=arr2[i];
	j++;
	}
	return arr3;
	
}
}
