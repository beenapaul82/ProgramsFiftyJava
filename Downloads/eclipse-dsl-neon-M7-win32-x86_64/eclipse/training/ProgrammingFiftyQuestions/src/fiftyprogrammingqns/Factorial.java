package fiftyprogrammingqns;

import java.util.Scanner;

public class Factorial {
public static void main(String args[])
{   
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the number to find the factorial");
	int n=scanner.nextInt();
	Factorial fl=new Factorial();
	Factorial f2=new Factorial();
	int p=fl.factorialWithoutRecursion(n);
	System.out.println("factorial without using recursion is "+p);
	int m=f2.factorialWithRecursion(n);
	System.out.println("factorial using recursion is "+m);
	scanner.close();
}
 int factorialWithoutRecursion(int n){
	   int f;
		f=1;
	for(int i=1;i<=n;i++){
		f=f*i;
		}
	    return f;
	}
 int factorialWithRecursion(int n){
	   	if(n==1)
			{return 1;
			}
		else{
			n=factorialWithRecursion(n-1)*n;
			return n;
			}
	
	}
}

	
