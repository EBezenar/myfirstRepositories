import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class XZ  extends JFrame{
	JButton b1 ,b2;
	JLabel l1,  l2, l3,l4,l5;
	JTextField t1,t2;
	JButton c1;
	int i,k;
	String a,b,n;
 eHandler hendler	= new eHandler();
	public XZ (String s){
	super (s);
	setLayout(new FlowLayout());
	c1 = new  JButton (" –ÓÌ‡Î‰Û ¡Ó√ Ã≈——» ÎÓı!!!!!!!!! ");
	b1 = new JButton("ochistit");
	b2 = new JButton("poschitat");
	l1 = new JLabel("vvedite 1-e chislo");
	l2 = new JLabel ("vvedite 2-e chislo");
	l3 = new JLabel("");
	l4 = new JLabel("");
	l5=  new JLabel("");
	t1 = new JTextField(30);
	t2 = new JTextField(15); 
	add (b2);
	add (b1);
	add (l2);
	add (t2);
	add (l1);
	add (t1);
	add (l3);
	add (l4);
	add (c1);
	add (l5);
	b2.addActionListener(hendler);
	b1.addActionListener(hendler);
	c1.addActionListener(hendler);
	
	}
public class eHandler implements  ActionListener {
	public void actionPerformed(ActionEvent e){
		if(e.getSource ()==b2 ){
		i=Integer.parseInt(t1.getText());
		k=Integer.parseInt(t2.getText());
		i++;
		k++;
		a= "1-e chislo = " +i;
		b= "2-E CHISLO ="  +k;
		l3.setText(a);
		l4.setText(b);
		
				
		}
		if (e.getSource()==c1){
			
			
			JOptionPane.showMessageDialog(null, "’”… Õ¿!!!!!");
			
			
		}
	}

	
		
	}
	
}

