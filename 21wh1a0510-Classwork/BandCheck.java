import java.awt.*;
import java.awt.event.*;
public class BandCheck extends Frame implements ActionListener,ItemListener{
Button b1;
Checkbox cb1;
BandCheck(){
	this.setLayout(new FlowLayout());
	b1 = new Button("RED");
	
	this.add(b1);
	b1.addActionListener(this);
	this.setBackground(Color.BLACK);
	cb1 = new Checkbox("GREEN");
	b1.setBackground(Color.DARK_GRAY);
	b1.setForeground(Color.WHITE);
	cb1.setBackground(Color.DARK_GRAY);
	cb1.setForeground(Color.WHITE);
	add(cb1);
	cb1.addItemListener(this);	
}
public void itemStateChanged(ItemEvent ie) {
	if (cb1.getState()) {
        
        setBackground(Color.GREEN);
    }
	repaint();
}


public void actionPerformed(ActionEvent ae) {
	String str = ae.getActionCommand();
	if(str == "RED")
			this.setBackground(Color.RED);
	
}
public static void main(String[] args) {
	BandCheck bc = new BandCheck();
	bc.setTitle("Test");
	bc.setSize(400, 400);
	bc.setVisible(true);
	bc.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent we) {
			System.exit(0);
		}
	});
}
}
