

import java.text.DecimalFormat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class view extends JFrame {

	 // Fields for input and output
    JTextField result = new JTextField(10);
    JTextField num1 = new JTextField(5);
    JTextField num2 = new JTextField(5);
    DecimalFormat f = new DecimalFormat("##.00");

    // Buttons for operations
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");
	
	view (String name) {
    super(name);

    setLayout(new FlowLayout());

   result.setVisible(true);
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 100);
    setLocationRelativeTo(null);
    setVisible(true);
    
    add(new JLabel("First Number"));
    add(num1);
    add(new JLabel("Second Number"));
    add(num2);
    add(new JLabel("Result"));
    add(result);
    add(add);
    add(sub);
    add(mul);
    add(div);}
	
	public double getFirstNumber(){
		return  Double.parseDouble(num1.getText());
	}

	public double getSecondNumber(){
		return  Double.parseDouble(num2.getText());
	}
	
	/*public double getResult(){
		 result.setText(f.format(result.getText()).toString());
		return  Double.parseDouble();
	}*/
	
	public void setResult(double solution){
		 //result.setText(f.format(result.getText()).toString());
		result.setText(Double.toString(solution));
		
	}
	
	
	
	/*void addcalcolationListener(ActionListener e){
		result.addActionListener(e);
	}
	void subcalcolationListener(ActionListener e){
		result.addActionListener(e);
	}
	void mulcalcolationListener(ActionListener e){
		result.addActionListener(e);
	}
	void divcalcolationListener(ActionListener e){
		result.addActionListener(e);
	}*/
	
	void displayerror(String errorMassage){
		 JOptionPane.showMessageDialog(this,errorMassage);
	}
	
	
	
}
