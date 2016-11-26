package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class PrimrOrNot {
	public static void main(String args[]){
		System.out.println("Enter the no to check");
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		PrimrOrNot pr=new PrimrOrNot();
		if(n==1){
			System.out.println("Number is not prime");
		}
		else if(n==2){
			System.out.println("Number is prime");
					}
		else {
			pr.checkPrime(n);
			}
		scanner.close();
		
	}
void checkPrime(int p){
	int flag=1;
	for(int i=2;i<p;i++){
		if((p%i)==0){
			flag=0;
			break;
			}
}
if(flag==0){
		System.out.println("Number is not prime");
	
	}
else{		
		System.out.println("Number is prime");
	}
}
}
