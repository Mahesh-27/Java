package javaudemy;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class jframe0 extends JFrame implements ActionListener{
	JButton b;
	JLabel l;
	int count=0;
	jframe0(){
		super("swing demo");
		
		setLayout(new FlowLayout());
		l=new JLabel("clicked "+ count +"times");
		b=new JButton("click");
		b.addActionListener(this);
		add(l);
		add(b);
		add(new JButton("cancel"));
		getRootPane().setDefaultButton(b);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l.setText("clicked  "+count+" times");
		
	}
	
	
}
public class jswing_app1 {

	public static void main(String[] args) {
		jframe0 f= new jframe0();
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
