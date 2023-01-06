import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JPanel panel;
    JTextField textField;

    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");

    JButton badd = new JButton("+");
    JButton bmul = new JButton("x");
    JButton bdiv = new JButton("/");
    JButton bsub = new JButton("-");
    JButton beq = new JButton("=");
    JButton bclr = new JButton("C");

    Calculator(){
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,600);
        frame.setLayout(null);
        frame.setResizable(false);

        textField = new JTextField();
        textField.setBounds(50,25,300,50);
        textField.setEditable(false);
        frame.add(textField);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4,1,1));
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bdiv);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bmul);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(bsub);
        panel.add(b0);
        panel.add(bclr);
        panel.add(badd);
        panel.add(beq);
        panel.setBounds(50,100,300,300);
        frame.add(panel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);

        frame.setVisible(true);
    }
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==b1)
            {
                textField.setText(textField.getText().concat("1"));
            }
            if(e.getSource()==b2)
            {
                textField.setText(textField.getText().concat("2"));
            }
            if(e.getSource()==b3)
            {
                textField.setText(textField.getText().concat("3"));
            }
            if(e.getSource()==b4)
            {
                textField.setText(textField.getText().concat("4"));
            }
            if(e.getSource()==b5)
            {
                textField.setText(textField.getText().concat("5"));
            }
            if(e.getSource()==b6)
            {
                textField.setText(textField.getText().concat("6"));
            }
            if(e.getSource()==b7)
            {
                textField.setText(textField.getText().concat("7"));
            }
            if(e.getSource()==b8)
            {
                textField.setText(textField.getText().concat("8"));
            }
            if(e.getSource()==b9)
            {
                textField.setText(textField.getText().concat("9"));
            }
            if(e.getSource()==b0)
            {
                textField.setText(textField.getText().concat("0"));
            }

            if(e.getSource()==badd)
            {
                    if(!(textField.getText().equals("") || 
                    textField.getText().endsWith("+")|| 
                    textField.getText().endsWith("-")||
                    textField.getText().endsWith("*")||
                    textField.getText().endsWith("/"))){
                        textField.setText(textField.getText().concat(" ").concat("+").concat(" "));
                    }
            }
            if(e.getSource()==bsub)
            {
                    if(!(textField.getText().equals("") || 
                    textField.getText().endsWith("+")|| 
                    textField.getText().endsWith("-")||
                    textField.getText().endsWith("*")||
                    textField.getText().endsWith("/"))){
                        textField.setText(textField.getText().concat(" ").concat("-").concat(" "));
                    }
            }
            if(e.getSource()==bmul)
            {
                    if(!(textField.getText().equals("") || 
                    textField.getText().endsWith("+")|| 
                    textField.getText().endsWith("-")||
                    textField.getText().endsWith("*")||
                    textField.getText().endsWith("/"))){
                        textField.setText(textField.getText().concat(" ").concat("x").concat(" "));
                    }
            }
            if(e.getSource()==bdiv)
            {
                    if(!(textField.getText().equals("") || 
                    textField.getText().endsWith("+")|| 
                    textField.getText().endsWith("-")||
                    textField.getText().endsWith("*")||
                    textField.getText().endsWith("/"))){
                        textField.setText(textField.getText().concat(" ").concat("/").concat(" "));
                    }
            }
            if(e.getSource()==bclr)
            {
                textField.setText("");
            }
            if(e.getSource()==beq)
            {
                try
                {
                    double result =0;
                    
                    StringTokenizer exp = new StringTokenizer(textField.getText()," ");
                    while(exp.hasMoreTokens())
                    {
                        double x = Double.parseDouble(exp.nextToken());
                        String op = exp.nextToken();
                        double y = Double.parseDouble(exp.nextToken());
                        switch(op)
                        {
                            case "+":
                                result = x+y;
                                break;
                            case "-":
                                result = x-y;
                                break;
                            case "x":
                                    result = x*y;
                                    break;
                            case "/":
                                if(y==0)
                                {
                                    throw new ArithmeticException("Divide by zero");
                                }
                                result = x/y;
                                break;
                        }
                    }
                    textField.setText(Double.toString(result));
                }
                catch(Exception er)
                {
                    System.err.println("Error "+er.getMessage());
                }
            }
        }
    public static void main(String args[])
    {
        new Calculator();
    }
}