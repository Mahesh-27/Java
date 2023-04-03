package javaudemy;
import java.util.*;

public class conditionalexp {

	public static void main(String[] args) 
	{
	
		String s="1419a";
		if(s.matches("[01]+")) {
			System.out.println("radix 2");	
		}
		else if(s.matches("[0-9]+")) {
			System.out.println("radix 10");	
		}
		else if(s.matches("[0-9 a-f]+")) {
			System.out.println("radix 16");	
		}
		
	}	

	

}
