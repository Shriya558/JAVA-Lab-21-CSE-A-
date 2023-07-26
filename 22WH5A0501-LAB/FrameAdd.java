import java.awt.*;
import java.awt.event.*;
public class FrameAdd extends Frame implements ActionListener{
    Button add,clr;
    TextField n1,n2,res;
    Label num1,num2,result;
    FrameAdd(){
        this.setLayout(null);
        add=new Button("ADD");
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
        add.setBounds(100,450,100,50);
        clr.setBounds(200,450,100,50);
        this.add(n1);
        this.add(n2);
        this.add(res);
        this.add(num1);
        this.add(num2);
        this.add(result);
        this.add(add);
        this.add(clr);
        n1.addActionListener(this);
        n2.addActionListener(this);
        res.addActionListener(this);
        add.addActionListener(this);
        clr.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str=="ADD"){
            int a=Integer.parseInt(n1.getText());
            int b=Integer.parseInt(n2.getText());
            int c=a+b;
            res.setText(String.valueOf(c));
        }
        if(str=="CLEAR"){
            n1.setText("");
            n2.setText("");
            res.setText("");
        }
    }
    public static void main(String[] args) {
        FrameAdd f=new FrameAdd();
        f.setTitle("ADDITION");
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}
