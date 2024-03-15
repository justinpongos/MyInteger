import javax.swing.JOptionPane;

public class MyIntegerDriver {
	public static void main (String[]args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("enter a number value"));
		
		if (num < 0) {
			System.out.println("enter a positive number not negative");
		}//end if
		
		else {
			MyInteger numOutput = new MyInteger(num);
			System.out.println(numOutput + "\n" + "The sum of all numbers is " + numOutput.calculateSum(num));
		}//end else
	}//end main
}//end class
