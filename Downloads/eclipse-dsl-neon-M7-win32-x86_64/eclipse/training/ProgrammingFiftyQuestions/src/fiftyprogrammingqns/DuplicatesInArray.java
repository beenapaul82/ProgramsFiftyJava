package fiftyprogrammingqns;

import java.util.HashSet;

public class DuplicatesInArray {
	 public static void main(String[] args) 
	    {
	        String[] strArray = {"Beena", "Mino", "Beena", "Aparna", "Susan", "Maria", "Susan"};
	 
	        HashSet<String> set1 = new HashSet<String>();
	 
	        for (String arr : strArray)
	        {
	            if(!set1.add(arr))
	            {
	                System.out.println("Duplicate Element is : "+arr);
	            }
	        }
	    }    

}
