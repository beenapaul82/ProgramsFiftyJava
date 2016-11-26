package com.wbl.fiftyprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
public static void main(String[] args){
	File file = new File("hello.txt");
	File file1=new File("Destination.txt");
	try {
		FileReader fr = new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		FileWriter fw1 = new FileWriter(file1);
		BufferedWriter bw= new BufferedWriter(fw1);
		String dest=null;
		while((dest=br.readLine())!=null){
			bw.write(dest);
			bw.newLine();
		}
		br.close();
		bw.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
