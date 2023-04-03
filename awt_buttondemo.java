package javaudemy;
import java.awt.*;
import java.awt.event.*;

class myframe1 extends Frame implements ActionListener{
	int count=0;
	Label l;
	Button b;
	public myframe1() {
		super("button demo");
		l=new Label("  "+count);
		b=new Button("click");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(b);
	}
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText("   "+count);
	}
}

public class awt_buttondemo {

	public static void main(String[] args) {
		
		myframe1 f=new myframe1();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
