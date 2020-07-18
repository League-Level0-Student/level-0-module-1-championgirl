package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String a = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (a.equals("stamp")) {
			score++;

			JOptionPane.showMessageDialog(null, "correct! ");
			JOptionPane.showMessageDialog(null, score);
		} else {
			System.out.println("wrong! The answer is STAMP!");

			JOptionPane.showMessageDialog(null, score);
		}
		String q = JOptionPane.showInputDialog("What has many keys but can't open a single lock?");

		if (q.equals("A piano")) {
			score++;

			JOptionPane.showMessageDialog(null, "correct! ");
			JOptionPane.showMessageDialog(null, score);
		} else {
			System.out.println("wrong! The answer is A piano!");

			JOptionPane.showMessageDialog(null, score);
		}
		String answer = JOptionPane.showInputDialog("What has hands but can not clap ");

		if (answer.equals("A clock")) {
			score++;

			JOptionPane.showMessageDialog(null, "correct! ");
			JOptionPane.showMessageDialog(null, score);
		} else {
			System.out.println("wrong! The answer is A clock!");

			JOptionPane.showMessageDialog(null, score);
		}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.

	}
}
