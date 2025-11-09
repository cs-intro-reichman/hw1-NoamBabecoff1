// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String[] args) {
		int num = Integer.parseInt("936"); 
		
		int hundreds = num /100;
		int tens = num%100/10;
		int units = num %10;
		
		System.err.println("hundreds: " + hundreds); // wrong function
		System.err.println("tens: " + tens);
		System.err.println("units: " + units);
	}
}
