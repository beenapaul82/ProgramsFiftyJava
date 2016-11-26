package com.wbl.fiftyprogramming;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string with paranthesis");
	String str=sc.nextLine();
	
	        Stack<Character> st=new Stack<Character>();  
	        for (int i=0;i<str.length();++i)
	        {
	            if((str.charAt(i)=='(')||(str.charAt(i)=='{')||(str.charAt(i)=='['))
	            {
	                st.push(str.charAt(i));
	            }
	            else if(st.isEmpty()==false)
	            {   
	            switch(str.charAt(i))
	            {
	            case']':
	                if(st.pop()!='[')
	                {
	                    System.out.println("unbalanced paranthesis");
	                    System.exit(0);
	                }
	                break;
	            case'}':
	                if(st.pop()!='{')
	                {
	                    System.out.println("unbalanced paranthesis");
	                    System.exit(0);
	                }
	                break;
	            case')':
	                if(st.pop()!='(')
	                {
	                    System.out.println("unbalanced paranthesis");
	                    System.exit(0);
	                }
	                break;
	            }
	            }
	        }           
	        if(st.isEmpty())
	        {
	            System.out.println("balanced paranthesis");
	        }
	        else 
	            System.out.println("unbalanced paranthesis");
	        sc.close();
	    }   
		
}

