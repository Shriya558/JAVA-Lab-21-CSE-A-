import java.awt.*;
import java.awt.event.*;
public class FrameDivisionOperation extends Frame implements ActionListener{
    Button div,clr;
    TextField n1,n2,res;
    Label num1,num2,result;
    FrameDivisionOperation(){
        this.setLayout(null);
        div=new Button("DIV");
        clr=new Button("CLEAR");
        num1=new Label("Number 1");
        num2=new Label("Number 2");
        result=new Label("Result");
        n1=new TextField();
        n2=new TextField();
        res=new TextField();
        num1.setBounds(100, 150, 100, 50);
        n1.setBounds(200, 150, 100, 50);
        num2.setBounds(100,250,100,50);
        n2.setBounds(200,250,100,50);
        result.setBounds(100,350,100,50);
        res.setBounds(200,350,100,50);
        div.setBounds(100,450,100,50);
        clr.setBounds(200,450,100,50);
        this.add(n1);
        this.add(n2);
        this.add(res);
        this.add(num1);
        this.add(num2);
        this.add(result);
        this.add(div);
        this.add(clr);
        n1.addActionListener(this);
        n2.addActionListener(this);
        res.addActionListener(this);
        div.addActionListener(this);
        clr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str=="DIV"){
            try{
                int a=Integer.parseInt(n1.getText());
                int b=Integer.parseInt(n2.getText());
                int c=a/b;
                res.setText(String.valueOf(c));
            }
            catch(NumberFormatException nme){
                res.setText("Invalid input");
            }
            catch(ArithmeticException e){
                res.setText("Cannot divide by 0");
            }
        }
        if(str=="CLEAR"){
            n1.setText("");
            n2.setText("");
            res.setText("");
        }
    }
    public static void main(String[] args) {
        FrameDivisionOperation f=new FrameDivisionOperation();
        f.setTitle("DIVISION");
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}