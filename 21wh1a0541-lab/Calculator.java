package javaprograms;

import java.awt.*;
import java.awt.event.*;
public class Calculator extends Frame implements ActionListener {
	
    TextField t;
    double num1, num2;
    char operator;
    
    Calculator() {
        this.setLayout(null);
        this.setBackground(Color.black);
        t = new TextField();
        t.setEditable(false);
        t.setFont(new Font("Arial", Font.BOLD, 30));
        t.setBounds(50, 100, 300, 50);
        this.add(t);

        Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("0");
        b11 = new Button("+");
        b12 = new Button("-");
        b13 = new Button("/");
        b14 = new Button("clear");
        b15 = new Button("*");
        b16 = new Button("=");

        b1.setBackground(Color.magenta);
        b2.setBackground(Color.magenta);
        b3.setBackground(Color.magenta);
        b4.setBackground(Color.magenta);
        b5.setBackground(Color.magenta);
        b6.setBackground(Color.magenta);
        b7.setBackground(Color.magenta);
        b8.setBackground(Color.magenta);
        b9.setBackground(Color.magenta);
        b10.setBackground(Color.magenta);
        b11.setBackground(Color.magenta);
        b12.setBackground(Color.magenta);
        b13.setBackground(Color.magenta);
        b14.setBackground(Color.magenta);
        b15.setBackground(Color.magenta);
        b16.setBackground(Color.magenta);

        b1.setBounds(50, 200, 50, 50);
        b2.setBounds(120, 200, 50, 50);
        b3.setBounds(190, 200, 50, 50);
        b11.setBounds(260, 200, 50, 50);
        b4.setBounds(50, 270, 50, 50);
        b5.setBounds(120, 270, 50, 50);
        b6.setBounds(190, 270, 50, 50);
        b12.setBounds(260, 270, 50, 50);
        b7.setBounds(50, 340, 50, 50);
        b8.setBounds(120, 340, 50, 50);
        b9.setBounds(190, 340, 50, 50);
        b10.setBounds(260, 340, 50, 50);
        b13.setBounds(50, 410, 50, 50);
        b14.setBounds(120, 410, 50, 50);
        b15.setBounds(190, 410, 50, 50);
        b16.setBounds(260, 410, 50, 50);

        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);
        this.add(b5);
        this.add(b6);
        this.add(b7);
        this.add(b8);
        this.add(b9);
        this.add(b10);
        this.add(b11);
        this.add(b12);
        this.add(b13);
        this.add(b14);
        this.add(b15);
        this.add(b16);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String operation = ae.getActionCommand();
        if (operation.equals("=")) {
            calculateResult();
        } 
        else if (operation.equals("clear")) {
            t.setText("");
            num1 = num2 = 0;
            operator = '\0';
        } 
        else if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            if (!t.getText().isEmpty()) {
                operator = operation.charAt(0);
                t.setText(t.getText() + " " + operation + " ");
            }
        } 
        else {
            t.setText(t.getText() + operation);
        }
    }

    public void calculateResult() {
        if(t.getText().isEmpty() || operator == '\0') {
            return;
        }
        String[] expression = t.getText().split(" ");
        if(expression.length != 3){
            t.setText("Error");
            return;
        }
        num1 = Double.parseDouble(expression[0]);
        operator = expression[1].charAt(0);
        num2 = Double.parseDouble(expression[2]);
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                }
                else {
                    t.setText("Error");
                    return;
                }
                break;
        }
        t.setText(String.valueOf(result));
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setSize(400,500);
        c.setTitle("CALCULATOR");
        c.setVisible(true);
    }
    }

