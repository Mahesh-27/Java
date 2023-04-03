package javaudemy;
class cir{
	private double r;
	cir(){
		r=0;
	}
	public void setr(int a){ r=a;}
	public double getr(){ return r;}
	public double ar() {
		return Math.PI*r*r;
	}
	public double peri() {
		return 2*Math.PI*r;
	}
}
class cyli extends cir{
	private double h;
	cyli(){
		h=0;
	}
	public void seth(int a){ h=a;}
	public double geth(){ return h;}
	public double v() {
		return ar()*h;
	}
}
public class inherit {

	public static void main(String[] args) {
		cyli c1=new cyli();
		c1.setr(5);c1.seth(7);
		System.out.println("radius "+c1.getr());System.out.println("height "+c1.geth());
		System.out.println("area "+c1.ar());
		System.out.println("perimeter "+c1.peri());
		System.out.println("volume "+c1.v());

	}

}
