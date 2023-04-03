package javaudemy;
import java.awt.*;
import java.awt.event.*;

class myframe2 extends Frame implements ItemListener{
	Label l;
	Checkbox c1,c2,c3;
	//before making the checkboxes as radiobuttons we can select more than 1,,now only one thing is selected.
	CheckboxGroup cbg;//for creating radio buttons checkboxgroup is used,
	public myframe2() {
		l=new Label("nothing is selected ");
		cbg=new CheckboxGroup();
		c1=new Checkbox("java",false,cbg);//making false it is not selected defaultly.
		c2=new Checkbox("c++",false,cbg);
		c3=new Checkbox("python",false,cbg);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}
	public void itemStateChanged(ItemEvent e) {
		String str="";
		if(c1.getState()){ str+=" "+c1.getLabel();}
		if(c2.getState()){ str+=" "+c2.getLabel();}
		if(c3.getState()){ str+=" "+c3.getLabel();}
		if(str.isEmpty()){ str="nothing is selected";}
		l.setText(str);
	}
}

public class awt_checkboxdemo {

	public static void main(String[] args) {
		myframe2 f=new myframe2();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
