package javaudemy;

public class variable_args {
	
    static void show(int ...x) {
    	for(int i:x) {
    		System.out.print(i+" ");
    	}System.out.println();
    }
    static void maxv(int ...x) {
    	if(x.length==0)
    		System.out.println("no numbers present");
    	else{
    		int a=x[0];
    		for(int i=1;i<x.length;i++) {
    			if(x[i]>a) {
    				a=x[i];
    			}
    		}System.out.println("max "+a);
    	}
    }
	static void sumv(int ...x) {
		int sum=0;
		for(int i :x) {
			sum+=i;
		}System.out.println("sum is "+sum);
	}
	static void dis(int ...x)
	public static void main(String[] args) {
		sumv(1,2,3,4,5,6,7,8,9);

	}

}
