package javaudemy;

import java.awt.*;

public class awt_app_method1 {

	public static void main(String[] args) {
		
		//creating a frame and setting the layout
		Frame f=new Frame("my app");
		f.setLayout(new FlowLayout());
		
		//assigning essential things to the frame
		Button b=new Button("OK");
		Label l=new Label("NAME  ");
		TextField tf=new TextField(20);
		
		//add all to the frame 
		f.add(l);
		f.add(tf);
		f.add(b);
		
		
		
		//seting the size and making the frame visible
		f.setSize(300,300);
		f.setVisible(true);

	}

}
