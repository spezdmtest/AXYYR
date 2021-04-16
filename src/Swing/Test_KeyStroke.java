package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Test_KeyStroke {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("submit");
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke,"changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor",myAction);
    }

    static class MyAction extends AbstractAction {
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
