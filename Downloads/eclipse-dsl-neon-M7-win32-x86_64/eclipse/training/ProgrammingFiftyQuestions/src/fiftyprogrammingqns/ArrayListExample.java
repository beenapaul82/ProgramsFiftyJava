package fiftyprogrammingqns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	List<String>listObj= new ArrayList<String>();
	 public void addList(){
			listObj.add("hello");
			listObj.add("world");
			listObj.add("welcome");
			listObj.add("everyone");
						
		}
	 public void printList(){
		/* for(int i=0;i<listObj.size();i++){
		        System.out.println(listObj.get(i));
			}*/
		 //enhanced for loop
		/* for(String str:listObj){
			 System.out.println(str);
		 }*/
		 //Iterator
		 Iterator<String> itr=listObj.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());
		 }
		 
	 }
	 public void searchList(){
		 for(int i=0;i<listObj.size();i++){
			    if (listObj.get(i)=="world"){
			    	System.out.println("Element "+listObj.get(i)+" is found in the list");
		      }
			}
	 }
	 //ListIterator
	 public void printReverse(){
		 ListIterator<String> itr=listObj.listIterator(listObj.size());
		 while(itr.hasPrevious()){
			 System.out.println(itr.previous());
		 }
	 }
		public static void main(String args[]){
			ArrayListExample ar=new ArrayListExample();
			ar.addList();
			System.out.println("Printing the elements of list");
			ar.printList();
			System.out.println("Searching an element in a list");
			ar.searchList();
			System.out.println("Printing in Reverse order");
			ar.printReverse();
		}
}
