package com.wbl.fiftyprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String > arr=new ArrayList<String>();
        System.out.println("enter the values");
        //inserting element
        arr.add(sc.next());
        arr.add(sc.next());
        arr.add(sc.next());
        arr.add(sc.next());
        arr.add(sc.next());
         //to print element
         System.out.println(arr);
         for(String a:arr){
			 System.out.println(a);
         }
        //converting arraylist to stringarray
         String []a= new String[arr.size()];
         arr.toArray(a);
          for(String s:a){
           System.out.print(s+" ");
          }
  }

}
