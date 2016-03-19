package application;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Random1 {
	
	@FXML
	Label l;  
	@FXML
	Button b;
	
	public void random( ActionEvent f){
		
		Random r = new Random();
		int a = r.nextInt(100);
		System.out.println(a);
		l.setText(Integer.toString(a));
		
	}

}
