package javaudemy;
import java.awt.*;
import java.awt.event.*;
class myframe3 extends Frame implements TextListener,ActionListener{
	Label l1,l2;
	TextField tf;
	public myframe3() {
		l1=new Label("nothing is written");
		l2=new Label("enter key is not yet hit");
		tf=new TextField(30);
		tf.setEchoChar('*');//hides the typed data with that char.
		
		tf.addTextListener(this);
		tf.addActionListener(this);
		
		setLayout(new FlowLayout());
		add(l1);
		add(tf);
		add(l2);
	}
	public void textValueChanged(TextEvent e) {
		l1.setText(tf.getText());
	}
	public void actionPerformed(ActionEvent e) {
		l2.setText(tf.getText());
	}
	
	
	
}
public class awt_textfielddemo {

	public static void main(String[] args) {
		myframe3 f=new myframe3();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
