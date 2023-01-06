import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Trafficlight
{
    JFrame frame;
    JPanel panel;

    JButton redButton = new JButton("Red");
    JButton yellowButton = new JButton("Yellow");
    JButton greenButton = new JButton("Green");

    Color redColor = Color.black;
    Color yellowColor = Color.black;
    Color greenColor = Color.black;
    Color whiteColor = Color.white;

    JComponent lights =new JComponent() 
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(whiteColor);
            g.fillRect(0,0,300,400);
            g.setColor(redColor);
            g.fillOval(100,50,100,100);
            g.setColor(greenColor);
            g.fillOval(100,150,100,100);
            g.setColor(yellowColor);
            g.fillOval(100,250,100,100);
        }
    };

    Trafficlight()
    {
        frame = new JFrame("Trafficlight");
        panel =new JPanel();
        frame.setSize(300,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        redButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                redColor = Color.red;
                greenColor = Color.black;
                yellowColor = Color.black;
                lights.repaint();
            }
        });
        panel.add(redButton);

        greenButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                greenColor = Color.green;
                redColor = Color.black;
                yellowColor = Color.black;
                lights.repaint();
            }
        });
        panel.add(greenButton);

        yellowButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                yellowColor = Color.yellow;
                redColor = Color.black;
                greenColor = Color.black;
                lights.repaint();
            }
        });
        panel.add(yellowButton);

        lights.setPreferredSize(new Dimension(300,400));
        panel.add(lights);
    }
    public static void main(String[] args) {
        new Trafficlight();
    }
}