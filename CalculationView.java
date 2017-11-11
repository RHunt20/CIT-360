import java.awt.event.ActionListener;

import javaz.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
	
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	
	}
	
	public int getFirstNumber(){
	
		return Interger.parseInt(firstNumber.getText());
	
	}
	
	public int getSecondNumber(){
	
		return Interger.parseInt(secondNumber.getText());
	
	}
	
	public int getCalcSolution(){
	
		return Interger.parseInt(calcSolution.getText());
	
	}
	
	public void setCalcSolution(int solution){
	
		calcSolution.setText(Interger.toString(solution));
	
	}
	
	void addCalculationListener(ActionListener ListenerForCalcButton){
	
		calculateButton.addActionListener(listenerForCalcButton);
	
	}
	
	void displayErrorMessage(String errorMessage){
	 
	 JOptionPane.showMessageDialog(this, errorMessage);
	
	}
	
}