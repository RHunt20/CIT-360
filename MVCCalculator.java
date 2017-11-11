
public class MVCCalculator{

	public static void main(String[] args){

		CalculatiorView theView = new CalculatiorView();
		
		CalculatiorModel theModel = new CalculatiorModel();
		
		CalculatorController theController = new CalculatorController(theView, theModel);
		
		theView.setVisible(true);
		
	}

}