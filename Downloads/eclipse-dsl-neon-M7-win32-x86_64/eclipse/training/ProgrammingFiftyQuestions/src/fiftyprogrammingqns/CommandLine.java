package fiftyprogrammingqns;

import java.util.Scanner;

public class CommandLine {
public static void main(String args[]){
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter your name");
	String n= scanner.nextLine();
	System.out.println("Enter ur sex");
	char ch = scanner.next().charAt(0);
	System.out.println("Enter ur zipcode");
	int m= scanner.nextInt();
	scanner.close();
	System.out.println("Name is "+n+" Sex is "+ch+" and zipcode is "+m);
	
}
}
