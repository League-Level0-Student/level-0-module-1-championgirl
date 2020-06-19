package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog("Enter your name!");	
		// 1. Save something remarkable about each person in a variable.
   
		// 2. Ask the user to enter a name. Store their answer in a variable.

if( a.equals("Tyler") ) {
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	 JOptionPane.showMessageDialog(null,"Tyler is REMARKABLE because he always helps me with my coding and explains stuff really well! ");
	}
}

}