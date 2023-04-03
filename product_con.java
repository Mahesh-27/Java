package javaudemy;
class product{
	private String pid;
	private String pname;
	private int qty;
	private int price;
	public product(String i,String j) {pid=i;pname=j;}
	public product(String i,String j,int k,int l) {pid=i;pname=j;setqty(k);setprice(l);}
	public void setqty(int b){qty=b;}
	public void setprice(int a){price=a;}
	public String getpid(){return pid;}
	public String getpname(){return pname;}
	public int getqty(){return qty;}
	public int getprice(){return price;}
	public String details(){
		return "\n"+pid+"\n"+pname+"\n"+qty+"\n"+price;
	}
	
}
public class product_con {

	public static void main(String[] args) {
		product p1=new product("10sjbd","nyyka");
		p1.setprice(100);
		p1.setqty(10);
		System.out.print(p1.details());

	}

}
