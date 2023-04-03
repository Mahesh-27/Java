package javaudemy;

class circle{
	public double r;
    public double area() {
    	return Math.PI*r*r;
    }
    public double peri() {
    	return 2*Math.PI*r;
    }
    public double circum() {
    	return peri();
    }
}
class cyl{
	public double r;
	public double h;
    public double larea() {
    	return Math.PI*r*r;
    }
    public double tarea() {
    	return 2*Math.PI*r*(r+h);
    }
    public double vol() {
    	return Math.PI*r*r*h;
    }
}
class rec{
	public double l;
	public double b;
	public boolean issquare() {
		return l==b;
	}
	public double area() {
		return l*b;
	}
	public double peri() {
		return 2*(l+b);
	}	
}
class stu{
	public double roll;
	public String name;
	public String course;
	int m1,m2,m3;
	public String details() {
		return "roll no : "+roll+"\n"+"name : "+name+"\n"+"course name : "+course+"\n";
	}
	public double total() {
		return m1+m2+m3;
	}
	public float avg() {
		return (float)total()/3;
	}
	public String grade() {
		if(avg()>=60)
			return "A";
		else
			return "B";
		
	}
}
public class circle1 {

	public static void main(String[] args) {
		
		/*circle c1=new circle();
		circle c2=new circle();
		c1.r=10;
		c2.r=2;
		System.out.println("1 ");
		System.out.println("area is  "+c1.area());
		System.out.println("perimeter is  "+c1.peri());
		System.out.println("circumference is  "+c1.circum());
		System.out.println("2 ");
		System.out.println("area is  "+c2.area());
		System.out.println("perimeter is  "+c2.peri());
		System.out.println("circumference is  "+c2.circum());*/
		/*cyl cy1=new cyl();
		cy1.r=7;
		cy1.h=10;
		System.out.println("lateral area is  "+cy1.larea());
		System.out.println("total area is  "+cy1.tarea());
		System.out.println("volume is  "+cy1.vol());*/
		
		/*rec r1=new rec();
		r1.l=10.25;
		r1.b=10.25;
		System.out.println("is it a square "+r1.issquare());
		System.out.println("perimeter is  "+r1.peri());
		System.out.println("area is  "+r1.area());*/
		
		stu s1=new stu();
		s1.name="mahesh";
		s1.roll=01;
		s1.course="java";
		s1.m1=80;
		s1.m2=65;
		s1.m3=60;
		System.out.println(s1.details());
		System.out.println("total is "+s1.total());
		System.out.println("average is "+s1.avg());
		System.out.println("the grade is "+s1.grade());
	}

}
