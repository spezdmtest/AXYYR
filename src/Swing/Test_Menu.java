package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test_Menu {
    static JFrame jFrame = getFrame();

    public static void main(String[] args) {
    JMenuBar jMenuBar = new JMenuBar();

    JMenu file = new JMenu("File");
    JMenu edit = new JMenu("Edit");

    jMenuBar.add(file);
    jMenuBar.add(edit);

    file.add(new JMenuItem("Open",'O'));
    JMenuItem save = file.add(new JMenuItem("Save"));
    save.setEnabled(false);
    file.addSeparator();
    JMenuItem exit = file.add(new JMenuItem("Exit"));
    exit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));

    edit.add(new JMenuItem("Cut"));
    edit.add(new JMenuItem("Copy"));
    JMenu options = new JMenu("Options");
    edit.add(options);
    options.add("one");
    options.add("two");

    edit.add(new JCheckBoxMenuItem("checkBox"));

    ButtonGroup buttonGroup = new ButtonGroup();
    JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("radio1");
    JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("radio2");
    buttonGroup.add(radio1);
    buttonGroup.add(radio2);
    edit.add(radio1);
    edit.add(radio2);

        jFrame.setJMenuBar(jMenuBar);
    jFrame.revalidate();
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
