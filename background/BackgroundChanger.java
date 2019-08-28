package background;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BackgroundChanger implements ActionListener {
        JFrame frame= new JFrame("Background Changer");

    JButton button1= new JButton("Change Color");
    JButton button2= new JButton("close");

        public void runFrame() {
            frame.setSize(600, 300);
            button1.setBounds(200, 150, 100, 40);
            frame.add(button1);
            frame.add(button2);
            frame.setLayout(null);
            frame.setVisible(true);

            button1.addActionListener(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
        }


    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1)
        {
            frame.getContentPane().setBackground(Color.red);
        }
        else{
            frame.getContentPane().setBackground(Color.white);
        }


    }


        public static void main(String[] args) {
     BackgroundChanger bg= new BackgroundChanger();
            bg.runFrame();
        }


    }

