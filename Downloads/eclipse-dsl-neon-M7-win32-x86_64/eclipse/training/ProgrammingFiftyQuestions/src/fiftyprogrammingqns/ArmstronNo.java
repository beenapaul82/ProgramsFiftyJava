package fiftyprogrammingqns;

import java.util.Scanner;

public class ArmstronNo {
  public static void main (String args[]){
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the no to be checked");
	  int n=scanner.nextInt();
	  checkArmstrong(n);
	  scanner.close();
	   }
  
  static void checkArmstrong(int n){
	 float i=0;
	  int p=n;
	  float c;
	  while(n!=0){
		  i++;
		  n=n/10;
		}
	  System.out.println("No of digits is "+i);
	  n=p;
	 float s=0;
	  while(n!=0){
		  c=n%10;
		  s=(float) (s+Math.pow(c,i));
		  n=n/10;
	  }
	  System.out.println("Sum is "+s);
	  if(p==s){
		  System.out.println("Number "+p+" is Armstrong");
	  }
	  else{
		  System.out.println("Number "+p+" is not Armstrong");
		 
	  }
	  }
 	  
  }

