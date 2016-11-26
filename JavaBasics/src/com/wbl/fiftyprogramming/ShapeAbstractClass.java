package com.wbl.fiftyprogramming;

public abstract class ShapeAbstractClass {
	int noOfSides;
	double area;
	double perimeter;
	
	public  abstract double calculataArea();
    public abstract double calculatePerimeter();
    public  void setSides(){ 
    	System.out.println("to set sides of the required shape");
    }
	}
