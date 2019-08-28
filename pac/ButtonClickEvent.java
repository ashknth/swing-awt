package pac;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by ashoknath on 8/18/19.
 */
public class ButtonClickEvent {
    JFrame frame= new JFrame("Click Events");
    JTextField tf= new JTextField();
    JButton button1= new JButton("Print");
    JButton button2= new JButton("clear");
   Onclick o= new Onclick();

    public void runFrame()
    {
        frame.setSize(600,300);
        tf.setBounds(200,60,250,20);
        button1.setBounds(200, 150, 100, 40);
        button2.setBounds(400, 150, 100, 40);
        frame.add(tf);
        frame.add(button1);
        frame.add(button2);
        frame.setLayout(null);
        frame.setVisible(true);
        button1.addActionListener(o);
        button2.addActionListener(o);
        button1.setActionCommand("button1");
        button1.setActionCommand("button2");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }
    public class Onclick implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
          String comm1= e.getActionCommand();
            if(comm1=="button1")
            {
             tf.setText("NCIT");

            }else{
                tf.setText(" ");
            }

           // String comm2=e.getActionCommand();
            if(comm1=="button2")
            {
                tf.setText("NCIT ");
            }else{
                tf.setText(" ");
            }

        }

    }

    public static void main(String[] args) {
        ButtonClickEvent be= new ButtonClickEvent();
        be.runFrame();
    }


}
