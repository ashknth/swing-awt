package classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by ashoknath on 8/28/19.
 */
public class LoginFrame  {

    JFrame frame = new JFrame("Login Form");
    JTextField tf1 = new JTextField("Ncit");
    JPasswordField pf=new JPasswordField("Ncit");
    JLabel label1 = new JLabel("UserName");
    JLabel label2 = new JLabel("Password");
    JButton button1 = new JButton("Submit");
    String un = "Ncit";
    String pwd = "Ncit";
    String role[] = {"Admin", "User"};
    JComboBox jComboBox = new JComboBox<>(role);
    Onclick o=new Onclick();

    public void RunFrame() {
        frame.getContentPane().setBackground(Color.white);
        frame.setSize(600, 300);
        JTextField tf2 = new JTextField();
        tf1.setBounds(200, 60, 250, 30);
        pf.setBounds(200, 100, 250, 20);
        frame.add(label1);
        frame.add(label2);
        jComboBox.setBounds(130, 150, 100, 40);
        label1.setBounds(130, 60, 100, 20);
        label2.setBounds(130, 100, 100, 20);
        button1.setBounds(300, 150, 100, 40);
        frame.add(tf1);
        frame.add(pf);
        frame.add(jComboBox);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);
        button1.addActionListener(o);
        button1.setActionCommand("button1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

   public class Onclick extends Component implements ActionListener
    {

        public void actionPerformed (ActionEvent e){
        {
            String userName = tf1.getText();
            String passWord = String.valueOf(pf.getPassword());
           //String varName = (String)jComboBox.getSelectedItem();
            String roles = jComboBox.getSelectedItem().toString();


            if (userName.equals(un) && passWord.equals(pwd) && roles.equals("Admin")) {
                NextPage page = new NextPage();
                page.setVisible(true);
                JLabel label = new JLabel("Welcome :" + userName+"\nRole :" + roles);
                page.getContentPane().add(label);
                page.setLocationRelativeTo(null);
            }else if(roles.equals("User")){
                NextPage page = new NextPage();
                page.setVisible(true);
                JLabel label = new JLabel("Welcome :" + roles);
                page.getContentPane().add(label);
                page.setLocationRelativeTo(null);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect login or password",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }


        }
    }
    }



        public static void main(String[] args) {
            LoginFrame lf = new LoginFrame();
            lf.RunFrame();
        }

    }

