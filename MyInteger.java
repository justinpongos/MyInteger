
public class MyInteger {
	private int num;
	
	public MyInteger(int num) {
		this.num = num;
	}//end one argument constructor
	
	public String toString() {
		String output;
		output = "The value of the Integer is: " + num;
		return output;
	}//end toString
	
	public int calculateSum(int num) {
		int sum = 0;
		
		while (num != 0) {
		sum = sum + num % 10;
		num = num /10;
		}//end while
		
		return sum;
	}//end CalculateSum method

}//end Class
