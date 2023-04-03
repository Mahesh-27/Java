package javaudemy;
import java.awt.*;

class myframe extends Frame{
	Label l;
	Button b;
	TextField tf;
	
	public myframe() {
		super("my app");//frame constructures are called
		
		setLayout(new FlowLayout());
		l=new Label("NAME ");
		tf=new TextField(20);
		b=new Button("OK");
		
		add(l);
		add(tf);
		add(b);
	}
}
public class awt_app_method2 {

	public static void main(String[] args) {
		
		myframe f=new myframe();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
