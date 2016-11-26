package com.wbl.fiftyprogramming;

public class StaticClassExample {
   static int i;
   int j;
   StaticClassExample(int j){
	  this.j=j; 
   }
   
   StaticClassExample(){
	   System.out.println("Inside Constructor");
   }
   public static void display(){
	   System.out.println(" This is a static method called display");
	   System.out.println("Value of i is "+i);
	      }
   public  void show(){
	   System.out.println(" This is a non static  method without keyword static");
	   System.out.println("Value of i is "+i);
	   System.out.println("Value of i is "+j);
	      }
   static{
	   i=10;
	   System.out.println("this is static block.this is executed first");
	   System.out.println("Static block is executed only once when the class is created");
	   }
   public static void main(String [] args){
	   StaticClassExample sc1= new StaticClassExample();
	   StaticClassExample sc2= new StaticClassExample();
	   StaticClassExample sc3= new StaticClassExample(23);
	   display();
	   i=3;
	   display();
	   sc1.j=3;
	   sc2.j=9;
	   sc2.show();
	   sc3.show();
   }
   
}
