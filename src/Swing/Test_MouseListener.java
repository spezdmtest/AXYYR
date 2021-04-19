package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test_MouseListener {
    static JFrame jFrame = getFrame();


    public static void main(String[] args) {
//    jFrame.add(jPanel);
//    jPanel.addMouseListener(new MouseAdapter() {
//        @Override
//        public void mouseClicked(MouseEvent e) {
//          jPanel.setBackground(Color.blue);
//        }
//    });
        MyComponent myComponent = new MyComponent();
        jFrame.add(myComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
             //   myComponent.repaint();
            }
        });
    }

    static class MyComponent extends JComponent  {
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x: " + xCoord + "Coordinates y: " + yCoord,50,50);
        }
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
