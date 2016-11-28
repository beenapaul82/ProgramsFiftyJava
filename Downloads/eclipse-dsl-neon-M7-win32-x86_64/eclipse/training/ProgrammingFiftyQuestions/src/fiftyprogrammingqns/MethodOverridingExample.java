package fiftyprogrammingqns;

public class MethodOverridingExample extends OverloadingOverriding {
@Override	
	public void display(){
		//super used to access parent function
		super.display();
		System.out.println("@MethodOverridingExample class.Welcome to subclass");
	}
@Override
	public void printSum(double c){
		System.out.println("We are in subclass");
		System.out.println("Sum of two numbers is "+c);
	}
     public static void main(String[] args)
   {
    	 MethodOverridingExample mo= new MethodOverridingExample();
    	 mo.display();
    	 double c=mo.add(3, 4);
    	 mo.printSum(c);
    	
    }
}
