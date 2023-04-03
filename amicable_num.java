package javaudemy;

public class amicable_num {

	public static int div(int a) {
		int c1=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				c1=c1+i;
			}
		}return c1;
	}
	public static void main(String[] args) {
		int a=220;int b=284;
		int c1=div(a);
		int c2=div(b);
		if(c1==b && c2==a) {System.out.println("amicable number");}
		else {System.out.println("not a amicable number");}
	}
}
