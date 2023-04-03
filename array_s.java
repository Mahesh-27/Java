package javaudemy;


public class array_s {
	public static void s(int b[]) {
		int count=0;
		for(int i :b) {
			count+=i;
		}
		System.out.println("the sum = "+count);
	}
	public static void f(int x,int b[]) {
		for(int i :b) {
			if(x==i) {
				System.out.println("the key "+x+" is present");
			    break;
			}
			else {
				System.out.println("the key "+x+" is not present");
			    break;
			}
		}
	}
	public static void m(int b[]) {
		int max=0;
		for(int i=0;i<b.length;i++){
			if(b[i]>max){
				max=b[i];
			}
		}System.out.println("the maximum number is "+max);
	}
	public static void sl(int b[]) {
		int m1,m2;
		m1=m2=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]>m1) {
				m2=m1;
				m1=b[i];
			}
			else if(b[i]>m2){
				m2=b[i];
			}
		}System.out.println("second largest number is  "+m2);
	}

	public static void main(String[] args) {
		int a[]={1,3,4,5,6,8,9,12,21};
		for(int i : a) {
			System.out.print(" "+i);
		}System.out.println("");
		for(int i=a.length-1;i>=0;i--){
			System.out.print(" "+a[i]);
		}System.out.println("");
		s(a);
		f(1,a);
		m(a);
		sl(a);
	}
}
