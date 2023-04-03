package javaudemy;


public class array_2 {
	public static void disp(int b[]) {
		for(int i:b) {
			System.out.print(i+" ");
		}System.out.println();
	}
	public static void lr(int b[]) {
		int t=b[0];
		for(int i=0;i<b.length-1;i++){
			b[i]=b[i+1];	
		}
		b[b.length-1]=t;
	}
	public static void rr(int b[]) {
		int t=b[b.length-1];
		for(int i=b.length-1;i>0;i--){
			b[i]=b[i-1];	
		}
		b[0]=t;
	}
	public static void ins(int x,int ind,int b[],int n){
		for(int i=n;i>ind;i--){
			b[i]=b[i-1];
		}
		b[ind]=x;
	}
	public static void del(int ind,int b[]) {
		int t=b[ind];
		for(int i=ind;i<b.length-1;i++){
			b[i]=b[i+1];
		}System.out.println("the deleted element is "+t);
	}
	public static void asize() {
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[2*a.length];
		for(int i=0;i<a.length-1;i++) {
			b[i]=a[i];
		}
		a=b;
		for(int x:a) {
			System.out.print(x+" ");
		}
	}


	public static void main(String[] args) {
		int a[]= new int[10];
		a[0]=23;
		a[1]=7;
		a[2]=12;
		a[3]=9;
		a[4]=10;
		a[5]=11;
		java.util.Arrays.sort(a);
		disp(a);
		ins(99,2,a,6);
		disp(a);
		del(1,a);
		disp(a);
		asize();
		

	}

}
