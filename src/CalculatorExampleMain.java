
public class CalculatorExampleMain {

	public static void main(String[] args) {
		int firstNumber = 1;
		int secondNumber = 2;
		if (firstNumber == 0) {
			System.out.println(secondNumber);
		}
		if (secondNumber == 0) {
			System.out.println(firstNumber);
		}
		boolean condition = true;
		if (condition == true) {
		int additionResult = CalculatorExample.add(firstNumber,secondNumber,true);
		System.out.println(additionResult);
		}
		else {
		int multiplicationResult = CalculatorExample.multiply(firstNumber,secondNumber,false);
		System.out.println(multiplicationResult);
		}
	}
}
