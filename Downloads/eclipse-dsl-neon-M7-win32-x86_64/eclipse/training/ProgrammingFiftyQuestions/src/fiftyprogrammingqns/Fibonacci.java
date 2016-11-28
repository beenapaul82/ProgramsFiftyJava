package fiftyprogrammingqns;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of series");
		int n=scanner.nextInt();
		int i;
		int a[] = new int[25];
		a[0]=0;
		a[1]=1;
		System.out.println("Fibonacci Series:");
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(i=2;i<n;i++){
		  a[i]=a[i-1]+a[i-2];
		  System.out.println(a[i]);
		}
		scanner.close(); 
	}

}
