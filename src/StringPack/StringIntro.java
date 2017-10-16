package StringPack;

import javax.swing.JOptionPane;

public class StringIntro {

	public static void main(String[] args) {

		String msg = "";
		String tstWord = "";
		Boolean again = true; // George Boole invented math that goes with bianary, booleans only work with
								// TRUE OR FALSE
		String cont = "";
		Boolean error = false;

		while (again == true) {

			msg = "Welcome! Please enter a word to test.";
			tstWord = JOptionPane.showInputDialog(msg);

			LearnStrings getIt = new LearnStrings(tstWord);
			msg = "First char is: " + getIt.getFirstLetter();
			JOptionPane.showMessageDialog(null, msg);

			int lengthTest = getIt.getLength();
			msg = "Length = " + lengthTest;
			JOptionPane.showMessageDialog(null, msg);

			char lastLetter = getIt.getLastLetter();
			msg = "Last letter is " + lastLetter;
			JOptionPane.showMessageDialog(null, msg);

			String bodyLtr = getIt.getMiddle();
			msg = "The middle letters are " + bodyLtr;
			JOptionPane.showMessageDialog(null, msg);

			do {

				msg = "Do you want to try again, y or n?";
				cont = JOptionPane.showInputDialog(null, msg);

				if (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes")) {

					msg = "Restarting";
					JOptionPane.showMessageDialog(null, msg);
					error = false;
				} else if (cont.equalsIgnoreCase("n") || cont.equalsIgnoreCase("no")) {

					again = false;
					error = false;

				} else {

					msg = "Sorry, I don't understand your input, please try again";
					JOptionPane.showMessageDialog(null, msg);
					error = true;

				} // end of else
			} while (error == true); // end of do while
		} // end of while

		msg = "Thank you, please play again soon";
		JOptionPane.showMessageDialog(null, msg);

	}// end of main

	/*
	 * thinking, taking notes
	 * 
	 * index=1 that will be the 2nd char (remember index starts at 0) end:
	 * .substring(1, word.length()-2) WAIT! REMEMBER "INCLUSIVE, EXCLUSIVE"
	 * .substring(1, word.length()-1) is the right way to do it
	 * 
	 * int indexOf(int ch) Returns the index within this string of the first
	 * occurrence of the specified character.
	 * 
	 * int indexOf(String str) Returns the index within this string of the first
	 * occurrence of the specified substring.
	 * 
	 * String toLowerCase() Converts all of the characters in this String to lower
	 * case using the rules of the default locale.
	 * 
	 * String toUpperCase() Converts all of the characters in this String to upper
	 * case using the rules of the default locale.
	 * 
	 * boolean equals(Object anObject) Compares this string to the specified object.
	 * 
	 * boolean equalsIgnoreCase(String anotherString) Compares this String to
	 * another String, ignoring case considerations.
	 * 
	 */
}// end of class
