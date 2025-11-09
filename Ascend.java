/*  the spacing around the if - else is very messy. thats how it should look:
if () {
	} else {
		}

it is very important to add those spacing separations to improve code readability 
Think about how we could improve the way we calculate the middle? */

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int minRange = 10;
		int maxRange = 20;


		int num1 = (int)(Math.random() * (maxRange - minRange + 1)) + minRange;
		int num2 =(int)(Math.random() * (maxRange - minRange + 1)) + minRange;
		int num3 = (int)(Math.random() * (maxRange - minRange + 1)) + minRange;

		System.err.println("The first random number: " + num1); // System.out.println should be used instead!
		System.err.println("The second random number: "+ num2) ;
		System.err.println("The third random number: "+ num3);

		int smallest;
		int middle;
		int biggest;

		if(num1 <= num2 && num1<= num3){
			smallest = num1;
			if(num2 <= num3){
				middle = num2;
				biggest = num3;
			}else{  
				middle = num3;
				biggest = num2;
			}
		}
		else if(num2<= num3){
			smallest = num2;
			if(num1 <= num3){
				middle = num1;
				biggest = num3;
			}else{
				middle = num3;
				biggest = num1;
			}
		}
		else{
			smallest = num3;
			if(num1 <= num2){
				middle = num1;
				biggest = num2;
			}else{
				middle = num2;
				biggest = num1;
			}
		}

		System.err.println("The Smallest number is: " + smallest);
		System.err.println("The middle number is: " + middle);
		System.err.println("The biggest number is: " + biggest);
	}
}

