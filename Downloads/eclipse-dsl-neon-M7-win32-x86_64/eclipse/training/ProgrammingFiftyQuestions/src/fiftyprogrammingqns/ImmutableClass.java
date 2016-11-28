package fiftyprogrammingqns;

public class ImmutableClass {
	final int idNumber;  
	final String name;
	public ImmutableClass(int idNumber,String name){  
	this.idNumber=idNumber;  
	this.name=name;
	}  
	public int getidNumber(){  
	return idNumber;  
	} 
	public String getName(){  
		return name;  
		}
	public static void main(String args[]){
		ImmutableClass ie= new ImmutableClass(231456,"BEENA");
		System.out.println("ID is "+ie.getidNumber()+" and name is "+ie.getName());
	}
}
