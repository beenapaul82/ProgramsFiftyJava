package fiftyprogrammingqns;
//hashCode after overriding
public class HashCodeAfterOverriding {
	public int age ;
	public int id;
	
	public HashCodeAfterOverriding( int age,int id )
	{
		this.age = age;
		this.id= id;
	}
	@Override
	public int hashCode(){
		return age;
	}
	@Override
	public boolean equals(Object O){
		boolean isequal=false;
		if(O instanceof HashCodeAfterOverriding){
			HashCodeAfterOverriding hc2=(HashCodeAfterOverriding)O;
			if((this.id==hc2.id)&&(this.age==hc2.age)){
				isequal=true;
			}
		}
		return isequal;
	}

public static void main(String args[]){
	
	HashCodeAfterOverriding hc1=new HashCodeAfterOverriding(23,1);
	HashCodeAfterOverriding hc2=new HashCodeAfterOverriding(23,1);
	int x=hc1.hashCode();
	int y=hc2.hashCode();
	System.out.println("Hashcode after overriding is "+x);
	System.out.println("Hashcode after overriding is "+y);	
	
	if(hc1.equals(hc2)){
		System.out.println("both hc1 and hc2 are equal");
		}
	else{
		System.out.println("both hc1 and hc2 are not equal");
 		}
	
}
}
