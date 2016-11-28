package fiftyprogrammingqns;

import java.util.Scanner;

public class ReverseString {
   public static void main(String args[]){
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter the string");
	   String  input= s.nextLine();
	   ReverseString rs=new ReverseString();
	   String output=rs.reverse(input);	
	   System.out.println("Reversed string is "+output);
	   s.close();
   }
   String  reverse(String input){
	  String output=" ";
      char[] temp= new char[input.length()];
      int j=0;
      for(int i=input.length()-1;i>=0;i--){
    	 temp[j]=input.charAt(i) ;
    	 j++;
      }
      //converting character array to string 
     output=new String(temp);
     return output;
   }
  }
