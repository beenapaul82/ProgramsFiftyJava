package fiftyprogrammingqns;

public class GarbageCollect {
   private String color;
   
   public GarbageCollect(String color){
	   this.color=color;
   }
   @Override
   protected void finalize() throws Throwable {
	   super.finalize();
	   System.out.println("Finalize method");
	   System.out.println(this.color + " cleaned");
   }
   public static void main(String [] args){
	   GarbageCollect gc= new GarbageCollect("red");
	   gc=null;
	   //System.gc() method provides just a "hint" to the JVM 
	   //that garbage collection should run.
	   //It is not guaranteed
	   //Runtime.getRuntime().runFinalization()for
	   //Making finalize() method to execute forcefully
	   //Use System.gc() instead of Runtime.getRuntime().gc()
	   Runtime.getRuntime().gc();
	   GarbageCollect gc1= new GarbageCollect("green");
	   GarbageCollect gc2= new GarbageCollect("blue");
	   gc1=gc2;
	   gc2=gc1;
	   gc2=gc;
	  //Now both gc1 and gc2 will be pointing to same object 
	  //An object earlier referred by gc1 will become abandoned
       System.out.println("done copying both objects");

   }
}
