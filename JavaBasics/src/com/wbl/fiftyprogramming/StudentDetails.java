package com.wbl.fiftyprogramming;

public class StudentDetails {
	
    public int id;
    String name;
    protected char gender;
    private String dept;
    
    public void getGender(){
    	System.out.println("Gender is "+gender);
        }
    private void getDept(){
    	System.out.println("Department is "+dept);
    }
    protected void getID(){
    	System.out.println("ID is "+id);
    }
    public void getName(){
    	System.out.println("Name is "+name);
    }

    public static void main(String [] args){    
    	StudentDetails sd= new StudentDetails();
    	sd.id=23;
    	sd.name="Beena Paul";
    	sd.gender='F';
    	sd.dept="Engineeering";
     	sd.getID();
     	sd.getName();
     	sd.getGender();
    	sd.getDept();
    	CourseContent cc=new CourseContent(567,"Python");
    	cc.course ="Embedded";
    	cc.getCourse();
    	cc.getCourseId();
    	
     }
}
    	
    	
   
