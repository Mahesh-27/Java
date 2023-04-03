package javaudemy;
class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}
class re1{
	public int l;
	public int b;
	re1(int l,int b){
		this.l=l;
		this.b=b;
	}
	public void d() {
		
		System.out.println(" l "+l);
		System.out.println(" b "+b);
	}
}
class cubo extends re1{
	int h;
	cubo(int l,int b,int h){
		super(l,b);
		this.h=h;
	}
public void d() {
		System.out.println(" l "+l);
		System.out.println(" b "+b);
		System.out.println(" h "+h);
	}
	
}
public class par_con_inheri {

	public static void main(String[] args) {
		//Child c=new Child();
        //Child c=new Child(11,20);
		re1 r=new re1(1,2);
		//r.d();
		cubo c=new cubo(4,5,3);
		c.d();
	}

}
