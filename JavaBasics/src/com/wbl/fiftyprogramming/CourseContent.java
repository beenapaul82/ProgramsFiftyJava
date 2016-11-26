package com.wbl.fiftyprogramming;

public class CourseContent extends StudentDetails{
   
	private int courseID;
    String course;
    
    public CourseContent(int courseID,String coutse){
    	this.courseID=courseID;
    	this.course=course;
    }
    
    public void getCourseId(){
    	System.out.println("CourseID is "+courseID);	
    }
    public void getCourse(){
    	System.out.println("Course is "+course);
    }
    
    public static void main(String[] args){
    	CourseContent cc= new CourseContent(231,"Java");
    	cc.getCourseId();
    	cc.getCourse();
       	StudentDetails sd=new StudentDetails();
       	sd.id=234;
       	sd.name="Kiran";
       	sd.gender='M';
       	sd.getID();
       	sd.getName();
       	sd.getGender();
       	
    }
    
    
	

}
