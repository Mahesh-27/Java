package javaudemy;
import java.awt.*;
import java.awt.event.*;

class myframe6 extends Frame implements AdjustmentListener{
	TextField tf;
	Scrollbar red;
	Scrollbar blue;
	Scrollbar green;
	myframe6(){
		super("scrollbar demo");
		tf=new TextField(20);
		red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		 tf.setBounds(50,50,300,50);
	     red.setBounds(50,150,300,30);
	     blue.setBounds(50,200,300,30);
	     green.setBounds(50,250,300,30);
	     
	     setLayout(null);
	     add(tf);
	     add(red);
	     add(green);
	     add(blue);
	}
	public void adjustmentValueChanged(AdjustmentEvent e) {
		
		tf.setBackground(new Color(red.getValue(),green.getValue(),blue.getValue()));
	}
	
}
public class awt_scrollbardemo {

	public static void main(String[] args) {
		myframe6 f=new myframe6();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
