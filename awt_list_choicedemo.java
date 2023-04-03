package javaudemy;
import java.awt.*;
import java.awt.event.*;

class myframe5 extends Frame implements ItemListener,ActionListener{
	TextArea ta;
	Choice c;
	List l;
	public myframe5() {
		super("list and choice demo");
		ta=new TextArea(20,30);
		c=new Choice();
		l=new List(4,true);
		l.add("monday");l.add("tuesday");l.add("wednesday");l.add("thrusday");l.add("friday");l.add("saturday");l.add("sunday");
		c.add("jan");c.add("feb");c.add("mar");c.add("apr");
		
		l.addItemListener(this);
		c.addItemListener(this);
		l.addActionListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);	
	
	}
	  public void itemStateChanged(ItemEvent ie)
	    {
	        if(ie.getSource()==l)
	            ta.setText(l.getSelectedItem());
	        else
	            ta.setText(c.getSelectedItem());
	    }
	  public void actionPerformed(ActionEvent ae)
	    {
	        String list[]=l.getSelectedItems();
	        
	        String txt="";
	        
	        for(String x:list)
	            txt+=x+"\n";
	        
	        ta.setText(txt);
	        
	    }
	
}
public class awt_list_choicedemo {

	public static void main(String[] args) {
		myframe5 f=new myframe5();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
