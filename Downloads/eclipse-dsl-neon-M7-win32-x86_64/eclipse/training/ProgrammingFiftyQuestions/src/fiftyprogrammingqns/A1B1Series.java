package fiftyprogrammingqns;

public class A1B1Series {
	public static void main(String[] args) {
        int[] num={1,2,3,4,11,22,33,44};   
        int[] newa=new int[num.length];
        int count=0;
        for(int i=0;i<num.length/2;i++){
            newa[count]=num[i];
            count=count+2;
            newa[count-1]=num[num.length/2+i];
        }
        System.out.println("Original Series");
        for(int i=0;i<newa.length;i++)
        System.out.print(num[i]+" ");
        System.out.println();
        System.out.println("New Series");
        for(int i=0;i<newa.length;i++)
        System.out.print(newa[i]+" ");
    }

}
