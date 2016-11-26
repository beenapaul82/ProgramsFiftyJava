package com.wbl.fiftyprogramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class CreateHashMap {
	HashMap<String,String> set1 = new HashMap<String,String>();
	public void hashMapExample(){	
	set1.put("home","place to stay");
	set1.put("chair","furniture to sit");
	set1.put("boy", "gender");
	
	Set<String>keys=set1.keySet();
	for(String key:keys){
		System.out.println("KEY "+key+" VALUE "+set1.get(key));
	}
}
	public void searchKey(String k){
		Set<String>keys=set1.keySet();
		for(String key:keys){
			if (key=="chair"){
				System.out.println("Found element "+set1.get(key));
			}			
		}		
	}
	
	public static void main(String args[]){
		CreateHashMap ch=new CreateHashMap();
		ch.hashMapExample();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key");
		String k=sc.nextLine();
		ch.searchKey(k);
	}
	}


