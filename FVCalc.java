// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// System.err.println("Please enter the amount you want to invest: ");
		// int currentSum = Integer.parseInt(args[0]);
		// System.err.println("Please enter the yearly rate: ");
		// int rate = Integer.parseInt(args[1]);
		// System.err.println("Please enter the number of years: ");
		// int years = Integer.parseInt(args[2]);
		int currentSum = 10000;
		int rate = 10;
		int years = 5;
		for (int i = 0; i < years; i++) {
			currentSum += currentSum * rate /100;
		}

		System.err.println("the Amount in the end: " + currentSum);
	}
}