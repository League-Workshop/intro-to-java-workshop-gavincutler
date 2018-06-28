package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String question1 = JOptionPane.showInputDialog("what is 3 + 9");
		// 3.  Use an if statement to check if their answer is correct
		if(question1.equals("12") || question1.equals("twelve")) {
			JOptionPane.showMessageDialog(null, "you are correct!");
			score++;
		}
		String question2 = JOptionPane.showInputDialog("what is 4 + 7");
		if(question2.equals("11") || question2.equals("elleven")) {
			JOptionPane.showMessageDialog(null,"you are correct");
			score++;
		}
		String question3 = JOptionPane.showInputDialog("what is 4 + 6");
		if(question3.equals("10") || question2.equals("10")) {
			JOptionPane.showMessageDialog(null,"you are correct");
			score++;

			JOptionPane.showMessageDialog(null, "your score is " + score);
		}
			// 4.  if the user's answer is correct
		// -- add one to their score 
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
