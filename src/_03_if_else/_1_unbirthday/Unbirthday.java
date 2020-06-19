package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog("When is your birthday!");	
	if( a.equals("6/19/2020") ) {
		
		JOptionPane.showMessageDialog(null,"Happy Birthday! ");
	}
		else JOptionPane.showMessageDialog(null,"Happy UNbirthday! ");
}
}

