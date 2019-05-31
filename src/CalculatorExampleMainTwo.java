
public class CalculatorExampleMainTwo {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		myArray[0] = 5;
		myArray[1] = 18;
		myArray[2] = 0;
		myArray[3] = 3;
		myArray[4] = 0;
		myArray[5] = 0;
		myArray[6] = 7;
		myArray[7] = 14;
		myArray[8] = 9;
		myArray[9] = 2;
		for (int i = 0; i < 10; i++ ) {
			System.out.println(myArray[i]);
		}
		int firstNumber = myArray[0];
		int secondNumber = myArray[4];
		if (firstNumber == 0) {
			System.out.println(secondNumber);
		}
		if (secondNumber == 0) {
			System.out.println(firstNumber);
			
		}
	}
}
