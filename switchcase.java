package javaudemy;
import java.util.*;
import java.lang.Math;
public class switchcase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str;
		int a,b,c;
		double d;
		System.out.println("\nenter the opertaion to perform\n");
	    str=s.nextLine();
		System.out.println("\nenter the numbers");
		a=s.nextInt();
		b=s.nextInt();
		
        switch(str)
        {
            case "add": 
            	c=a+b;
            	System.out.println(c);
                break;
                    
            case "sub": 
            	c=a-b;
            	System.out.println(c);
                    break;
            case "mul": 
            	c=a*b;
            	System.out.println(c);
                    break;
            case "div":
            	c=a/b;
            	System.out.println(c);
            break;
            case "exp": 
            	d=Math.pow(a,b);
            	System.out.println(d);
            break;
            
            default : System.out.println("Invalid opertaion");
            break;
        }

	}

}
