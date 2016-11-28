package fiftyprogrammingqns;

//before overriding
public class HashcodeEquals {
	
	
		public int age ;
		public int id;
		
		public HashcodeEquals( int age,int id )
		{
			this.age = age;
			this.id= id;
		}

	public static void main(String args[]){
		Integer i1=23;
		Integer i2=23;
		if(i1.equals(i2)){
			System.out.println("both i1 and i2 are equal");
 		}
		else{
			System.out.println("both i1 and i2 are not equal");
	 		}
		
		HashcodeEquals hc1=new HashcodeEquals(23,1);
		HashcodeEquals hc2=new HashcodeEquals(23,1);
		int x=hc1.hashCode();
		int y=hc2.hashCode();
		System.out.println("Hashcode before overriding is "+x);
		System.out.println("Hashcode before overriding is "+y);	
		
		if(hc1.equals(hc2)){
			System.out.println("both hc1 and hc2 are equal");
 		}
		else{
			System.out.println("both hc1 and hc2 are not equal");
	 		}
		
	}
}

