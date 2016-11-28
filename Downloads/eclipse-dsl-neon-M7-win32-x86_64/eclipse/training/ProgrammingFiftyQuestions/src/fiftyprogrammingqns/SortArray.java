package fiftyprogrammingqns;

import java.util.Scanner;

public class SortArray {
public static void main(String args[]){
	SortArray sr=new SortArray();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int m= sc.nextInt();
	int[] arr=new int[m];
	System.out.println("enter the elements to be sorted");
	for(int i=0;i<m;i++)
	{
	arr[i]=sc.nextInt();
	}
	sr.sortArray(m,arr);
	sc.close();	
}


void sortArray(int m,int[] arr){
	int temp;
	for(int i=0;i<m;i++){
		for(int j=i+1;j<m;j++){
			if(arr[i]>arr[j]){
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
	}
		System.out.println("the sorted array");
		for(int i=0;i<m;i++){
			System.out.print(arr[i]+" ");
		}
}
}
