package javaudemy;
import java.util.*;
public class operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int choice;
		System.out.println("enter the option whether it is a cuboid or triangle");
		System.out.println("option 1 :cuboid\noption 2 :triangle");
		choice=s.nextInt();
		if(choice==1) {
			int l,be,h;
			double tol_area,vol;
			System.out.println("enter the lenghth breadth and height of the cuboid");
			l=s.nextInt();
			be=s.nextInt();
			h=s.nextInt();
			tol_area=2*(l*be+be*h+h*l);
			vol=l*be*h;
			System.out.println("total area of the given cuboid is "+tol_area+" cm^2");
			System.out.println("volume of the given cuboid is "+vol+" cm^3");	
		}
		else if(choice==2){
			int opt,a,b,c,h;
			double area;
			float x;
			System.out.println("select an option to find the area");
			System.out.println("option 1:with height and side\noption 2:with 3 sides");
		    opt=s.nextInt();
		    if(opt==1){
		    	System.out.println("enter the side length");
		    	a=s.nextInt();
		    	System.out.println("enter the side height");
		    	h=s.nextInt();
		    	area=(a*h)/2;
		    	System.out.println("area of the given triangle is "+area+" cm^2");	
		    }
		    else if(opt==2){
		    	System.out.println("enter the side length of 1st side");
		    	a=s.nextInt();
		    	System.out.println("enter the side length of 2nd side");
		    	b=s.nextInt();
		    	System.out.println("enter the side length of 3rd side");
		    	c=s.nextInt();
	            x=(a+b+c)/2f;
	            area=Math.sqrt(x*(x-a)*(x-b)*(x-c));
		    	System.out.println("area of the given triangle is "+area+" cm^2");
		    }
		    else {
		    	System.out.println("plz enter the vaild option");
		    }
		    }
		 else {
		    	System.out.println("Invalid choice please check what you have entered");
		    }

		}
		
}
