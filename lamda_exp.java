package javaudemy;

interface MyLambda
{
    //public void display(String str);
    //public int add(int x,int y);
	public int sub(int a, int b);
}
public class lamda_exp {

	public static void main(String[] args) {
//		MyLambda m=(s)->{System.out.println(s);};
//        m.display("Hello World");
//        MyLambda m=(a,b)->{return a+b;};
//        System.out.println(m.add(20,30));
		MyLambda m=(a,b)->{return Math.abs(a-b);};
		System.out.println(m.sub(20,30));
	}
}
