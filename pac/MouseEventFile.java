package pac;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by ashoknath on 8/18/19.
 */
public class MouseEventFile  implements MouseListener,MouseMotionListener
{
    JFrame frame= new JFrame("Mouse Events");
    JTextField tf= new JTextField();

    public void runFrame()
    {
        frame.setSize(600,300);
        tf.setBounds(200,60,250,20);
        frame.add(tf);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addMouseListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
tf.setText("In");
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        tf.setText("Out");
    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }

    public static void main(String[] args) {
        MouseEventFile msf=new MouseEventFile();
        msf.runFrame();
    }
}
