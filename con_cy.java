package javaudemy;

class cy1{
	private int r;
	private int h;
	public cy1(){
		r=1;
		h=1;
	}
	public cy1(int i,int j){
		r=i;
		h=j;
	}
	public void setr1(int x) {
		if(r>0)
			r=x;
		else
			r=0;
	}
	public int getr1() {
		return r;
	}
	public void seth1(int y) {
		if(h>0)
			h=y;
		else
			h=0;
	}
	public int geth1() {
		return h;
	}
	public double larea() {
		return Math.PI*getr1()*getr1();
	}
	public double tarea() {
		return 2*Math.PI*getr1()*(r+h);
	}
	public double vol() {
		return Math.PI*r*r*h;
	}
}
public class con_cy {

	public static void main(String[] args) {
		cy1 a=new cy1();
		System.out.println(a.getr1());
		System.out.println(a.geth1());
		System.out.println(a.larea());
		System.out.println(a.tarea());
		System.out.println(a.vol());

	}

}
