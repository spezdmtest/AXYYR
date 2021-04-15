package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test_Action {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jButton.setText("submit");
        jPanel.add(jButton);
    }

    static class MyAction extends AbstractAction {
        MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION,"my small action");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.blue);
        }
    }

    static JFrame getFrame () {
        ImageIcon img = new ImageIcon("C:\\Users\\spezdm\\IdeaProjects\\AXYYR\\src\\Swing\\java.png");
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        //jFrame.setSize(500,300);
        //jFrame.setLocation(600,400);
        jFrame.setBounds(dimension.width/2-250,dimension.height/2-200,500,400);
        jFrame.setTitle("this my app");
        jFrame.setIconImage(img.getImage());
        return jFrame;
    }
}
