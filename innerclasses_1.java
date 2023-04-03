import java.
package javaudemy;
class outer{
	int x=10;
	class inner{
		int y=120;
		public void idisp() {
			System.out.println("this is "+x);
			System.out.println("this is "+y);
		}
	}public void odisp() {
		inner i=new inner();
		i.idisp();
	}
}
public class innerclasses_1 {

	public static void main(String[] args) {
		outer q=new outer();
		q.odisp();

	}

}
