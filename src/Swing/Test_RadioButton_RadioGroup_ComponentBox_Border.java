package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Test_RadioButton_RadioGroup_ComponentBox_Border {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) {
        jFrame.add(jPanel);
        boolean b = true;
        jPanel.add(new JCheckBox("check box label"));
        JRadioButton jRadioButton1 = new JRadioButton("one");
        JRadioButton jRadioButton2 = new JRadioButton("two");
        jRadioButton2.setSelected(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        Border border = BorderFactory.createEtchedBorder();
        Border border1 = BorderFactory.createTitledBorder(border,"title");

        JComboBox<String> jComboBox = new JComboBox();
        jComboBox.addItem("one");
        jComboBox.addItem("two");
        jComboBox.addItem("three");
        jPanel.add(jComboBox);
        jPanel.setBorder(border1);
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
