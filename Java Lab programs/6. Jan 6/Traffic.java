import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Traffic extends JFrame implements ActionListener
{
    JFrame frame;
    JPanel panel;

    JButton redButton = new JButton("RED");
    JButton yellowButton = new JButton("YELLOw");
    JButton greenButton = new JButton("GREEN");

    Color redColor = Color.black;
    Color yellowColor = Color.black;
    Color greenColor = Color.black;
    Color whiteColor = Color.white;

    JComponent lights = new JComponent() 
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(whiteColor);
            g.fillRect(0,0,300,400);
            g.setColor(redColor);
            g.fillOval(100,50,100,100);
            g.setColor(yellowColor);
            g.fillOval(100,150,100,100);
            g.setColor(greenColor);
            g.fillOval(100,250,100,100);
        }
    };

    Traffic()
    {
        frame = new JFrame("frame");
        panel = new JPanel();
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
        panel.add(redButton);
        panel.add(yellowButton);
        panel.add(greenButton);
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        panel.add(lights);
        lights.setPreferredSize(new Dimension(300,400));
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==greenButton)
        {
            greenColor = Color.green;
            redColor = Color.black;
            yellowColor = Color.black;
            lights.repaint();
        }
        else if(e.getSource()==yellowButton)
        {
            greenColor = Color.black;
            redColor = Color.black;
            yellowColor = Color.yellow;
            lights.repaint();
        }
        else if(e.getSource()==redButton)
        {
            greenColor = Color.black;
            redColor = Color.red;
            yellowColor = Color.black;
            lights.repaint();
        }
    }

    public static void main(String[] args) {
        new Traffic();
    }
}
