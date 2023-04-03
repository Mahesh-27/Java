package javaudemy;
class rec1{
	private double l;
	private double b;
	public rec1() {
		l=1;
		b=1;
	}
	public rec1(double x,double y) {
		setl(x);
		setb(y);
	}
	public rec1(double s) {
		l=b=s;
	}
	public void setl(double i) {
		if(i>0)
			l=i;
		else
			l=0;
	}
	public double getl() {
		return l;
	}
	public void setb(double i) {
		if(i>0)
			b=i;
		else
			b=0;
	}
	public double getb() {
		return b;
	}
	public double area() {
		return getl()*getb();
	}
	public double peri(){
		return 2*(getl()+getb());
	}
}
public class constructors_ {

	public static void main(String[] args) {
		rec1 r1=new rec1(-10,-5);
		System.out.println(r1.area());
		System.out.println(r1.peri());
	}

}
