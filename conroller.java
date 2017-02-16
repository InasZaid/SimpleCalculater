
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class conroller {
	private modle m;
	private view v;
	
	public conroller(modle m , view v){
		
		this.m=m;
		this.v=v;
		
		/*this.v.addcalcolationListener(new caculationListener ());
		this.v.subcalcolationListener(new caculationListener ());
		this.v.mulcalcolationListener(new caculationListener ());
		this.v.divcalcolationListener(new caculationListener ());*/
		
		
		  v. add.addActionListener(calculator);
	       v. sub.addActionListener(calculator);
	       v. mul.addActionListener(calculator);
	       v. div.addActionListener(calculator);
		
	}

	//class caculationListener implements ActionListener{
	 ActionListener calculator = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg) {
			
			try{
				
				 if (v.num1.getText().length() == 0 || v.num2.getText().length() == 0) {
                     throw new Exception();}}
				 catch (Exception ex){
		                v.displayerror("error");
					 
		             
					 }
                     
                	 if (arg.getSource() == v.add) {
             			m.add(v.getFirstNumber(), v.getSecondNumber());
             			v.setResult(m.getResult());
             			
             			 }
             			 
             			 else if(arg.getSource()==v.sub){
             				 m.sub(v.getFirstNumber(), v.getSecondNumber());
             				 v.setResult(m.getResult());
             			 }
             			
             			 else if(arg.getSource()==v.mul){
             				 m.mult(v.getFirstNumber(), v.getSecondNumber());
             				 v.setResult(m.getResult());
             			 }
             			 
             			 else if(arg.getSource()==v.div){
             				 m.div(v.getFirstNumber(), v.getSecondNumber());
             				 v.setResult(m.getResult());
             			 }
               
	
		}};
	  
}
