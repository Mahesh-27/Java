package javaudemy;

import java.awt.*;
import java.awt.event.*;
class myframe4 extends Frame implements ActionListener{
	Label l;
	TextArea ta;
	TextField tf;
	Button b;
	public myframe4() {
		super("text area demo ");
		l=new Label("                                                               ");
		ta=new TextArea(10,20);
		tf=new TextField(20);
		b=new Button("CLICK");
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(ta);
		add(l);
		add(tf);
		add(b);		
	}
	public void actionPerformed(ActionEvent e) {
		l.setText(ta.getText()+" "+tf.getText());
		
	}
	
}
public class awt_textareademo {

	public static void main(String[] args) {
		myframe4 f=new myframe4();
		f.setSize(400,400);
		f.setVisible(true);
	}

}
