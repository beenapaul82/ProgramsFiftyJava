package com.wbl.fiftyprogramming;

public class NullPointerExcep  {
	static void arithmeticExpression() throws ArithmeticException{
		System.out.println ("Inside throwMethod");
		int num1=23;
		int num2=0;
		int div=num1/num2;
		System.out.println(div);
		throw new ArithmeticException ("Demo");
		
		
	}
	static void arithmeticException(){
		try{
			arithmeticExpression();
		}
		catch(ArithmeticException a){
			System.out.println("The exception got caught "+a);
		}
	}
public static void main(String[] args){
	arithmeticException();
}
}
