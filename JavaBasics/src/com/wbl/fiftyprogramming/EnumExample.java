package com.wbl.fiftyprogramming;

public class EnumExample {
public enum Month{
	Januray,
	February,
	March,
	April,
	May,
	June,
	July,
	August,
	September,
	October,
	November,
	December
}
public static void main(String args[]){
int i=1;
for (Month m: Month.values()){
	System.out.println("MONTH "+m+" VALUE "+i++);
}
}
}

