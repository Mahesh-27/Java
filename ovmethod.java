package javaudemy;

public class ovmethod {
	static void area (int r) {
		System.out.println("area of circle"+ Math.PI*r*r);
	}
	static void area(int l, int b) {
		System.out.println("area of rec  "+ l*b);
	}
	static void rev(int a){
		String c=a+"";
		String d="";
		for(int i=c.length()-1;i>=0;i--){
			d=d+c.charAt(i);
		}
		System.out.println(d);
	}
	static void rev(int a[]) {
		int n=a.length;
		int b[]=new int[n];int i,j;
		for(i=0,j=a.length-1;j>=0;i++,j--){
			b[i]=a[j];
		}a=b;
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		area(2);
		area(2,4);
		rev(289);
		rev(a);
	}

}
