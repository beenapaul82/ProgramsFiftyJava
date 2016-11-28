package fiftyprogrammingqns;

import java.util.Scanner;

public class PingPong {
 public static void main(String[] args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number to check");
	int n= scanner.nextInt();
	if((n%3==0)&&(n%5==0)){
		System.out.println("PINGPONG");
		System.out.println("Number "+n+" is divisible by 3 and 5");
	}
	else if(n%3==0){
		System.out.println("PING");
		System.out.println("Number "+n+" is divisible by 3");
	}
	else if(n%5==0){
		System.out.println("PONG");
		System.out.println("Number "+n+" is divisible by 5");
	}
	else{
		System.out.println("Number is "+n);
	}
	scanner.close();
	
 }
}
