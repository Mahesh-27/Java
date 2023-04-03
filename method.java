package javaudemy;

public class method {
	
	static int max(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	static int min(int a,int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	static void prime(int a) {
		for(int i=2;i<a/2;i++) {
			if((a%i==0)) {
				System.out.println("it is not prime number");
				}
			else{
				System.out.println("it is prime number");
				}
			}
		}
	static void gcd(int a,int b) {
		int c;
		int m=0;
		int p=0;
		if(a<b)
			c=a;
		else
			c=b;
		for(int i=1;i<=c;i++) {
			if(a%i==0 && b%i==0) {
				m=p;
				p=i;
				if(m<p)
					m=p;
				else
					m=m;	
			}
		}
		System.out.println("gcd "+m);
	}
	static void hcf(int a,int b) {
		while(a!=b) {
			if(a<b)a=a-b;
			else b=b-a;
		}
		System.out.println(a);
	}
    static void maxa(int a[]) {
    	int m=a[0];
    	for(int i=1;i<a.length-1;i++){
    		if(a[i]>m)
    			m=a[i];
    	}
    	System.out.println("max of array  "+m);
    }
	public static void main(String[] args) {
		int a[]={1,3,7,5,0,1};
		maxa(a);
	}

}
