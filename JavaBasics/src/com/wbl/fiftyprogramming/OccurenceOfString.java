package com.wbl.fiftyprogramming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OccurenceOfString {
public static void main(String[] args){
	
	try {
		FileReader fr;
		int count=0;
		fr = new FileReader("hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String str= br.readLine();
		System.out.println("Content in file");
		System.out.println(str);
		System.out.println("enter the substring");
		Scanner scanner = new Scanner(System.in);
		String substring = scanner.next();
		while (str.contains(substring)){
		    str = str.replaceFirst(substring, "-");
		    count++;		
		}
		 System.out.println("String is found! "+count+" times");
		
		br.close();
	}
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
