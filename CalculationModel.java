public class CalculatorModel{

	private in calculationValue;
	
	public void addTwoNumbers(int firstNumber, int secondNumber){
	
		calculationValue = firstNumber + secondNumber;
		
	}
	
	public in getCalculationValue(){
	
		return calculationValue;
	
	}
}