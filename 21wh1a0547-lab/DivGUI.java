package java_lab;
import java.awt.*;
import java.awt.event.*;
public class DivGUI extends Frame implements ActionListener{
	Button b1,b2;
	TextField n1,n2,res;
	Label num1,num2,result;
	DivGUI(){
		this.setLayout(null);
		b1 = new Button("Div");
		b2 = new Button("Clear");
		num1 = new Label("Number 1");
		num2 = new Label("Number 2");
		result = new Label("Result");
		n1 = new TextField();
		n2 = new TextField();
		res = new TextField();
		num1.setBounds(100, 150, 100, 50);
		n1.setBounds(200, 150, 100, 50);
		
		num2.setBounds(100, 250, 100, 50);
		n2.setBounds(200, 250, 100, 50);
		
		result.setBounds(100, 350, 100, 50);
		res.setBounds(200, 350, 100, 50);
		b1.setBounds(150, 450, 100, 50);
		b2.setBounds(150,550,100,50);
		this.add(b1);
		this.add(b2);
		this.add(num1);
		this.add(num2);
		this.add(result);
		this.add(n1);
		this.add(n2);
		this.add(res);
		b1.addActionListener(this);
		b2.addActionListener(this);
		n1.addActionListener(this);
		n2.addActionListener(this);
		res.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String str = ae.getActionCommand();
		if(str == "Div") {
			try {
			int a = Integer.parseInt(n1.getText());
			int b = Integer.parseInt(n2.getText());
			if(b==0) 
		        res.setText("Arithmetic Exception");
			else {
				int c=a/b;
			    res.setText(String.valueOf(c));
			}
			}
			catch(ArithmeticException e) {
				res.setText("Arithmetic Exception");
			}
			catch(NumberFormatException n) {
				res.setText("Number Format Exception");
			}
		}
		if(str == "Clear") {
			n1.setText("");
			n2.setText("");
			res.setText("");
		}
		}
	

public static void main(String[] args) {
	DivGUI d = new DivGUI();
	d.setTitle("Test");
	d.setSize(400, 400);
	d.setVisible(true);
	d.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}

}
