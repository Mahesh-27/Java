package javaudemy;

import java.lang.annotation.Annotation;

@interface myanno{
	String name();
	String date() default "today"; //if this is not made default u have to pass date too.
}
@FunctionalInterface
interface va{
	public void pri(){
		System.out.println("hello world");
		}
}
class qw{
	@myanno(name="mahesh") //date is made as default.
	public void show() {
		System.out.println("hi");
	}
}
class we extends qw{
	@Override
	public void show() {
		System.out.println("hello");
	}
	@Deprecated
	public void sh() {
		System.out.println("h r u");
	}
}
public class annotations_1 {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		we q=new we();
		q.show();
		
		q.sh();

	}

}
