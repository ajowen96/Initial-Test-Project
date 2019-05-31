
public class CalculatorMain {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int additionResult = Calculator.add(10,5);
		System.out.println(additionResult);
		
		int subtractionResult = Calculator.subtract(10,5);
		System.out.println(subtractionResult);
		
		int multiplicationResult = Calculator.multiply(10,5);
		System.out.println(multiplicationResult);
		
		int divisionResult = Calculator.divide(10,5);
		System.out.println(divisionResult);
	}
}
