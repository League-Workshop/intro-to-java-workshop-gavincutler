package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		int rn = new Random().nextInt(4);
		System.out.println(rn);
		JOptionPane.showInputDialog("what do you think is awesome");
		if(rn== 0 ){
			JOptionPane.showMessageDialog(null, "I think thats awesome too");
		}
	if(rn== 1) {
		JOptionPane.showMessageDialog(null,"i think thats is kind of cool");
	}
	if(rn== 2) {
		JOptionPane.showMessageDialog(null,"that is ok");
	}
	if(rn== 3) {
		JOptionPane.showMessageDialog(null, "thats boring");
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	// 3. Print out this variable
	// 4. Get the user to enter something that they think is awesome
	// 5. If the random number is 0
	// -- tell the user whatever they entered is awesome!
	// 6. If the random number is 1
	// -- tell the user whatever they entered is ok.
	// 7. If the random number is 2
	// -- tell the user whatever they entered is boring.
	// 8. If the random number is 3
	// -- write your own answer
	}
}


