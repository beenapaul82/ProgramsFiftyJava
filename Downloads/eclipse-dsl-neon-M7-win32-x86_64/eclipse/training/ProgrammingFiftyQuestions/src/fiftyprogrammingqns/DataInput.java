package fiftyprogrammingqns;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataInput {
	
public static void main(String args[]) throws IOException{
	//DataInput di=new DataInput();
	System.out.println("Add");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the first no to add");
	int a=sc.nextInt();
	System.out.println("enter the second no to add");
	int b=sc.nextInt();
	int c=a+b;
	System.out.println("Sum is "+c);
	System.out.println("Subtract");
	InputStreamReader ir= new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(ir);
	System.out.print("enter the first no to subtract");
    int num1 = Integer.parseInt(br.readLine());
    System.out.print("enter the second no to subtract");
    int num2 = Integer.parseInt(br.readLine());
    System.out.println(num1);
	System.out.println(num2);
	int h=num1-num2;
	System.out.println("Difference is "+h);
	System.out.println("Multiplication");
	DataInputStream dis = new DataInputStream(System.in);
	System.out.println("enter the first no to multiply");
	//DataInputStream is for reading binary data. 
	//Using readInt on System.in does not parse an integer from the character 
	//data, it will instead reinterpret the unicode values 
    //int m =Integer.parseInt(dis.readLine());
	//int n =Integer.parseInt(dis.readLine());
	int i=dis.readInt();
	System.out.println((int)i);
	System.out.println("enter the second no to multiply");
	int j = dis.readInt();
    System.out.println((int)j);
    System.out.println("DataInputStream is for reading binary data");
    int q=i*j;
	System.out.println("Product is "+q);
    Console console = System.console();
    if (console == null) 
    {
	     System.out.println("No console: not in interactive mode!");
		 System.exit(0);
	}
	/*else
	{
       String s = console.readLine();
       int x = Integer.parseInt(console.readLine());
       int y = Integer.parseInt(console.readLine());
       System.out.println(x);
       System.out.println(y);
       int div=x/y;
       System.out.println("Quotient is "+q);
           }*/
    sc.close();
    br.close();
    dis.close();
    
	
}
}
