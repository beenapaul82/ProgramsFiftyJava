package fiftyprogrammingqns;

public class Print1To10 {
   public static void recursionNum(int n){
	   if(n<=10){
		   System.out.println(n);
		   recursionNum(n+1);
	   }   
   }
   public static void main(String[] args){
	   recursionNum(1);
   }
}
