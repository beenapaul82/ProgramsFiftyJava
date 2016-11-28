package fiftyprogrammingqns;

public class SwapNumbers {
	public static void main(String args[]){
		SwapNumbers sn= new SwapNumbers();
		int a=10;
		int b=20;
		System.out.println("Original numbers are a= "+a+" and b= "+b);
		sn.swapNumWithVariable(a,b);
		sn.swapNumWithoutVariable(a,b);
	}
	void swapNumWithVariable(int a,int b){
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers are swapped a= "+a+" and b="+b);
	}
	void swapNumWithoutVariable(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers are swapped a= "+a+" and b="+b);
	}

}
