package com.wbl.fiftyprogramming;

public class NullExceptionExample {
	public void display() {
		System.out.println("This is an example");
      }
	public void arithException(){
		try{
			  int num1=10;
			  int num2=0;
			  int res=num1/num2;
			  System.out.println(res);
		  }
		  catch(ArithmeticException a){
			  a.printStackTrace();
			  System.out.println("Division by zero");
		  }
	}
		public void arraException(){
			try{
				  int arr[] ={1,2,3,4,5};
				  System.out.println(arr[7]);
			  }
			  catch (ArrayIndexOutOfBoundsException i){
				  System.out.println("Specified index does not exist");
			  }
		}
	
  public static void main(String args[]){
	  NullExceptionExample ne= new NullExceptionExample();
	  NullExceptionExample ne1= new NullExceptionExample();
	  try{
	  Object obj= null;
	  obj.hashCode();
	  }
	  catch(NullPointerException n){
		  n.printStackTrace();
		  System.out.println("Object has a null reference");
	  }
	  finally{
			System.out.println("Finally block is executed always");
		}
	  ne.arithException();
	  ne1.arraException();
  }
	}

