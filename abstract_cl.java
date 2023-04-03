package javaudemy;
abstract class sup{
	void m1() {System.out.println("method 1");}
	void m2() {System.out.println("method 2");}
	abstract void m3();
}
class sub extends sup{
	void m2() {System.out.println("sub method 2");}
	void m3() {System.out.println("sub method 3");}
}
abstract class shape{
	abstract double are();
	abstract double per();
}
class r extends shape{
	double le;
	double br;
	double are() {return le*br;}
	double per() {return 2*(le+br);}
}
class c extends shape{
	double r;
	c(double r){this.r=r;}
	double are() {return Math.PI*r*r;}
	double per() {return 2*Math.PI*r;}
}
public class abstract_cl {

	public static void main(String[] args) {
		/*sub q1=new sub();
		q1.m1();
		q1.m2();
		q1.m3();*/
		shape s1=new c(2);
		r r1=new r();
		r1.le=10;r1.br=5;System.out.println(r1.are());System.out.println(r1.per());
		System.out.println(s1.are());System.out.println(s1.per());

	}

}
