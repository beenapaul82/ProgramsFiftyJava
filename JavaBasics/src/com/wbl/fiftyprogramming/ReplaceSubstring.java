package com.wbl.fiftyprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceSubstring {
   public static void main(String [] args){
	   try {
		FileWriter fw=new FileWriter("welcome.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Hello Welcome to innovapath.  This is java class. ");
		bw.append("java is interesting class");
		bw.flush();
		
		FileReader fr= new FileReader("welcome.txt");
		BufferedReader br = new BufferedReader(fr);
		String str= br.readLine();
		System.out.println("The Contents of file are");
		System.out.println(str);
		System.out.println("Enter the substring to be replaced");
		Scanner sc = new Scanner(System.in);
		String substring =sc.next();
		System.out.println("Enter the string to be replaced with");
		String newstring =sc.next();
		
	   String replacedString=str.replaceAll(substring, newstring);

		System.out.println(str);
		System.out.println(replacedString);
		//FileWriter fw1=new FileWriter("welcome.txt");
		//BufferedWriter bw1= new BufferedWriter(fw1);
		bw.append(replacedString);
		bw.flush();
		bw.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	   
   }
}
