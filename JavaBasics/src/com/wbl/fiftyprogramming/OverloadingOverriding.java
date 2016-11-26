package com.wbl.fiftyprogramming;

public class OverloadingOverriding {
	 int sum;
	 float num1;
	 float num2;
	 float num3;
	 
	 public void display(){
		 System.out.println("@Parentclass.We are in OverloadingOverriding class");
	 }
	 public int add(int num1,int num2){
			int  sum = num1+num2;
			return sum;
		 }
	 public double add(double num1,double num2){
		double  sum = num1+num2;
		return sum;
	 }
	 public double add(double num1,int num2,double num3){
		 double sum = num1+num2+num3;
		 return sum;
	 }
	 public double add(float num1,int num2,float num3){
		 double sum = num1+num2+num3;
		 return sum;
	 }
	 public void printSum(double sum){
		 System.out.println("Sum is "+sum);
	 }
    public static void main(String args[]){
    	OverloadingOverriding oo= new OverloadingOverriding();
    	oo.display();
    	int q =oo.add(2,4);
    	oo.printSum(q);
    	double s =oo.add(23.0,45.0);
    	oo.printSum(s);
    	double g=oo.add(4,56,10);
    	oo.printSum(g);
    	double f=oo.add(23.0, 24,56.0);
    	oo.printSum(f);
    }
}
