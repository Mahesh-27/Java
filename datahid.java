package javaudemy;
class rect{
	private double l;
	private double b;
	public void setlength(double x) {
		l=x;
	}
	public double getlength() {
		return l;
	}
	public void setbreadth(double x) {
		b=x;
	}
	public double getbreadth() {
		return b;
	}
	public boolean issquare() {
		return l==b;
	}
	public double area() {
		return getlength()*getbreadth();
	}
	public double peri() {
		return 2*(l+b);
	}	
}

public class datahid {

	public static void main(String[] args) {
		rect r1=new rect();
		r1.setlength(10.25);
		r1.setbreadth(10.25);
		System.out.println("length is "+r1.getlength());
		System.out.println("breadth is "+r1.getbreadth());
		System.out.println("is it a square "+r1.issquare());
		System.out.println("perimeter is  "+r1.peri());
		System.out.println("area is  "+r1.area());

	}

}
