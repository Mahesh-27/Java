package javaudemy;
import java.util.*;

public class scan 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		//int a,b,c;
		System.out.println("enter the first number\t");
		int a=s.nextInt();
		System.out.println("enter the second number\t");
		int b=s.nextInt();
		int c=a+b;
		System.out.println("sum is "+c);
	}

}
