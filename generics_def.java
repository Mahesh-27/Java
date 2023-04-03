package javaudemy;

class data1<t>{
	private t ob;
	public void setdata1(t ob) { this.ob=ob;}
	public t getdata1() { return ob;}
}
class myarray<t>{
	t a[]=(t[])new Object[10];
	int l=0;
	public void ap(t v) {a[l++]=v;}
	public void d() {
		for(int i=0;i<l;i++) {System.out.println(a[i]);
	}
}}
public class generics_def {
	static <e> void sh(e...list) {
		for (e x:list) {System.out.println(x);}
	}
	public static void main(String[] args) {
		data1<Integer> a=new data1<>();
		data1<String> b=new data1<>();
		a.setdata1(1);
		b.setdata1("null");
		System.out.println(a.getdata1());
		System.out.println(b.getdata1());
		
//		System.out.println("\n");
//		myarray <Integer> m=new myarray<>();
//		m.ap(10);
//		m.ap(20);
//		m.ap(34);
//		m.d();
		
		myarray  m1=new myarray();
		m1.ap("ro");
		m1.ap("hi");
		m1.ap(34);
		m1.d();
		
		sh(10,20,40,20);sh("s","o","s");
	}

}
