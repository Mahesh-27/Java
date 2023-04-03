package javaudemy;
import java.util.*;
public class loops {

	public static void main(String[] args) {
		/*int i =5;
		for(i=1;i<=10;i++) {
			int c=5*i;
			System.out.println("5*"+i+"="+c);
		}
		int n;
		Scanner s =new Scanner(System.in);
		System.out.println("enter");
		n=s.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=i*sum;
			
		}
		System.out.println(sum);*/
	int n=102;
	int r;
	int rev=0;
    while(n>0) {
    	r=n%10;
    	rev=rev*10+r;
    	n=n/10;
    }
    System.out.println(rev);
    if(rev==n) {
    	System.out.println("yes");
    }
    else
    	System.out.println("not");
	
	}
	

}
