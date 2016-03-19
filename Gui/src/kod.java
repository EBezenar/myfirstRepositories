import javax.swing.*;
import java.awt.*;



public class kod extends JFrame {
	 
	 int a,b;
	 JButton b1,b2;
	 JLabel l1,l2,l3,l4;
	 JTextField t1,t2;
	 String i,k;
	 
	 
	 public kod(String s){
		  
		  super(s);
		  setLayout(new FlowLayout ());
	
		  b1 = new JButton ("Poschitat`");
		  b2 = new JButton ("Ochistit`");
		  l1 = new JLabel ("Pervoe chislo : ");
		  l2 = new JLabel ("Vtoroe chislo : ");
		  l3 = new JLabel ("");
		  l3 = new JLabel ("");
	t1 = new JTextField(30);
	t2 = new JTextField(15); 
	  
	add(l1);
	  add(t1);
	  add(l2);
	  add(t2);
	  add(b2);
	  add(b1);
	  add(l3);
	  add(l4);
	
	}

}