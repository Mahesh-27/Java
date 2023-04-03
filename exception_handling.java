package javaudemy;
import java.util.*;
public class exception_handling {

	public static void main(String[] args) {
		  int A[]={30,20,10,40,0};
		  try{
	            int c=A[0]/A[4];
	            //int c=A[0]/A[5];
	            System.out.println("Division is "+c);
	            }
		  catch(ArrayIndexOutOfBoundsException e){
			  System.out.println("Index is Invalid");
			  }
		  catch(ArithmeticException e){
			  System.out.println("Denominator should not be 0");
			  }
		  finally {
			  System.out.println("executed");
		  }
		
	}
}
