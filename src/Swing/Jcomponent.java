package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Jcomponent {
    public static void main(String[] args) {
         JFrame jFrame = getFrame();
//       Font font = new Font ("Consolas",Font.BOLD,20);
//      String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//      for(String s : fonts) {
//          System.out.println(s);  // выводим доступные шрифты
//      }
         jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font ("Consolas",Font.BOLD,20);
            Graphics2D g2 = (Graphics2D)g;
            g2.setFont(font);
            g2.drawString("Hello World !",20,20);
            Point2D p1 = new Point2D.Double(70,70);
            Point2D p2 = new Point2D.Double(190,190);
            Line2D line2D = new Line2D.Double(70,70,190,190);
            //Line2D line2D = new Line2D.Double(70,70,190,190);
            g2.draw(line2D);
            Ellipse2D ellipse2D = new Ellipse2D.Double(230,70,140,170);
           // g2.draw(ellipse2D);
            g2.setPaint(Color.blue);
            g2.fill(ellipse2D); // закрашиваем элипс
            Rectangle2D rectangle2D = new Rectangle2D.Double(230,70,140,170);
            g2.draw(rectangle2D);
            try {
                URL url = new URL("https://i0.wp.com/proselyte.net/wp-content/uploads/2016/02/java-oracle.png");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image,220,70,null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    static JFrame getFrame() {
        ImageIcon img = new ImageIcon("C:\\Users\\spezdm\\IdeaProjects\\AXYYR\\src\\Swing\\java.png");
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        //jFrame.setSize(500,300);
        //jFrame.setLocation(600,400);
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 200, 500, 400);
        jFrame.setTitle("this my app");
        jFrame.setIconImage(img.getImage());
        return jFrame;
    }
}