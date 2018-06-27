package section3;

import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String yes = JOptionPane.showInputDialog("Do you want to want a two pack of \"free\" movie tickets?(put yes or no)");
		if (yes.equals("yes")) {
		String name = JOptionPane.showInputDialog("insert first and last name");
		String age = JOptionPane.showInputDialog("insert your age");
		String number = JOptionPane.showInputDialog("insert credit card number");
		String adress =	JOptionPane.showInputDialog("adress");
		JOptionPane.showMessageDialog(null,"i have your info i know that you are " + name + "and your " + age + "years old" + "and your credit card number is " + number + "and you live at " + adress);
		}
		JOptionPane.showMessageDialog(null, "Goodbye!");
		
		
		
	}
}
