package fiftyprogrammingqns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[]args)throws IOException
    {
    	BufferedReaderExample math1 = new BufferedReaderExample();

        System.out.print("Enter 1st Number :");
        Integer num1 = Integer.parseInt(br.readLine());
        System.out.println(" ");

        System.out.print("Enter 2nd Number :");
        Integer num2 = Integer.parseInt(br.readLine());
        System.out.println(" ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        math1.sub(num1,num2);

}
    void sub(Integer num1,Integer num2){
    	Integer num3=num1-num2;
    	System.out.println("Subtraction "+num3);
    }
}