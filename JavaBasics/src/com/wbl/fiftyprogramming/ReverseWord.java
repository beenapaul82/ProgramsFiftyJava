package com.wbl.fiftyprogramming;

import java.util.Scanner;

public class ReverseWord {
public static void main(String args[]){
	ReverseWord sb=new ReverseWord();
	Scanner s=new Scanner(System.in);
	System.out.println("enter string");
	String input=s.nextLine();
	sb.reverseWord(input);
	s.close();
}
void reverseWord(String input){
	String[] words = input.split(" ");
    String reverse = "";
    for (int i = 0; i < words.length; i++) {
        for (int j = words[i].length() - 1; j >= 0; j--) {
            reverse += words[i].charAt(j);
        }
        System.out.print(reverse + " ");
        reverse = "";
    }

	
}
}
