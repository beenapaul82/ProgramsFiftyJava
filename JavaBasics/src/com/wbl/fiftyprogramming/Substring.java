package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class Substring {
  public static void main(String args[]){
	Substring sb=new Substring();
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String input=s.nextLine();
	System.out.println("enter string to be replaced");
	String rep=s.nextLine();
	System.out.println("enter substring");
	String sub=s.nextLine();
	sb.substring(input,rep,sub);
	s.close();
}
  void substring(String input,String rep,String sub){
	  String output=" ";
	  if (input.contains(sub)) {
		    output = input.replaceFirst(sub, rep);
		    System.out.println(output);


		}else{
		    System.out.println("not found!");
		}

	    }
}
