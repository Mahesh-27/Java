package javaudemy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.text.NumberFormatter;

class jswing1 extends JFrame{
	jswing1(){
		JTextField tf1=new JTextField(20);
		
        DateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");		
        
        JFormattedTextField tf2=new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);
        
        NumberFormat nf=NumberFormat.getInstance();
        NumberFormatter nft=new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);
        JFormattedTextField tf3=new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(0);
       
        
        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
        
  
	}
}
public class jswing_textfield {

	public static void main(String[] args) {
		jswing1 f=new jswing1();
		f.setSize(300,300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
