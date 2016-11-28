package fiftyprogrammingqns;

import java.util.Scanner;

public class WordCount {
	public static void main(String args[])
	 {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("enter the string");
	  String input=sc.nextLine();
	  String output="";
	  sc.close();
	  String[] words = input.split(" ");
	  for(int i=0;i<words.length;i++)
	  {
		 for (i = 1; i <= words.length; i ++) {
		 output += words[i-1] + i + " ";
      }
	  }
	  System.out.println(output);
	  }
}

