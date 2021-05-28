package Swing;

import javax.swing.*;
import java.awt.*;

public class Test_ToolBar {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JToolBar jToolBar = new JToolBar("title");
        JButton one = new JButton("one");
        one.setToolTipText("first");
        jToolBar.add(one);
        jToolBar.addSeparator();
        jToolBar.add(new JButton("two"));
        jToolBar.addSeparator();
        jToolBar.add(new JButton("three"));
        jPanel.add(jToolBar);
    }

    static JFrame getFrame() {
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
