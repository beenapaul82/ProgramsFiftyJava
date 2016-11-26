package com.wbl.fiftyprogramming;

import java.io.File;

public class FilesInFolder { 
	public static void main(String a[]){
        File file = new File("C:/DELL/");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println("Folders  "+f.getName());
        }
    }
}
