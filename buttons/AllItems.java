package buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ashoknath on 8/26/19.
 */
public class AllItems implements ActionListener {
        JFrame frame= new JFrame("Background Changer");
        JButton button1= new JButton("Change Color");
        JButton button2= new JButton("Remove Color");
    JTextField tf=new JTextField();
    JLabel label=new JLabel("Choose your gender below:");
    JRadioButton rb= new JRadioButton("Male");
    JRadioButton rb2= new JRadioButton("Female");
    JCheckBox cb= new JCheckBox("Iam Student");

        public void runFrame() {
            frame.setSize(600, 300);
            button1.setBounds(200, 95, 100, 40);
            button2.setBounds(300, 95, 100, 40);
            label.setBounds(200, 125, 180, 40);
            rb.setBounds(200, 150, 100, 40);
            rb2.setBounds(200, 180, 100, 40);
            tf.setBounds(200,60,250,20);
            cb.setBounds(200, 200, 120, 40);
            frame.getContentPane().setBackground(Color.red);
            frame.add(tf);
            frame.add(rb);
            frame.add(rb2);
            frame.add(button1);
            frame.add(button2);
            frame.add(label);
            frame.add(cb);
            frame.setLayout(null);
            frame.setVisible(true);
            button1.addActionListener(this);
            button2.addActionListener(this);
            rb.addActionListener(this);
            rb2.addActionListener(this);
            cb.addActionListener(this);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
        }


        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                frame.getContentPane().setBackground(Color.green);
            } else if (e.getSource() == button2) {
                frame.getContentPane().setBackground(Color.white);
            }
            Object obj= e.getSource();
            if(obj==rb)
            {
                tf.setText(" You are Male.");


            }else{
                tf.setText(" ");
                rb.setSelected(false);
            }
            if(obj==rb2)
            {
               tf.setText("You are Female.");
            }else{
                rb2.setSelected(false);
            }
            if(obj==cb){
                tf.setText(" You choosed student");
            }else{
                cb.setSelected(false);
            }

        }

        public static void main(String[] args) {
         AllItems bg= new AllItems();
            bg.runFrame();
        }

    }



