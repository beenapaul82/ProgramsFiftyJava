package com.wbl.fiftyprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WordsInFile {
	 public static void main(String[]args) throws FileNotFoundException        
	    { 
	        
		 File file=new File("binaryFile.txt");
		 try{
			 FileWriter fr= new FileWriter(file);
			 fr.write("Hello I am Beena\n I am a student\n I am learning java ");
			 fr.flush();
			 fr.close();
			 FileReader fr1= new FileReader(file);
			 Scanner in=new Scanner(file);
			 
			    int word = 0;
	            while (in.hasNextLine()) {
	              // read a line from the input file
	              String lines = in.nextLine();

	              // split line into words and increment word count
	              String str [] = lines.split((" "));
	              for ( int i = 0; i <str.length ; i ++) {
	                if (str [i].length() > 0) {
	                  word ++; 
	                }
	              }
	            }
	            fr1.close();
	            System.out.println("Word count is "+word);
	            in.close();
		 }
		 catch(IOException e){
			 e.printStackTrace();
		 }

	           
	    }
}
