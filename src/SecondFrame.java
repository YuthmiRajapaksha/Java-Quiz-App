import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SecondFrame {

    //Create Constructor
    public SecondFrame() {

        JFrame frame2 = new JFrame("Questions 2");
        JLabel labelNum2 = new JLabel("Question no.2");
        JLabel labelQuestion2 = new JLabel(" Evaluate the following Java expression, if x=3, y=5, and z=10:");
        JLabel labelQ = new JLabel("++z + y - y + z + x++");
        JRadioButton buttonAnswer1 = new JRadioButton("24");
        JRadioButton buttonAnswer2 = new JRadioButton("23");
        JRadioButton buttonAnswer3 = new JRadioButton("25");
        JButton buttonSubmit = new JButton("Submit");
        JButton buttonExpl = new JButton("Explanation");
        JButton buttonNext = new JButton("Next");
        JButton buttonBack = new JButton("Back");
        ButtonGroup g2 = new ButtonGroup();
        g2.add(buttonAnswer1);
        g2.add(buttonAnswer2);
        g2.add(buttonAnswer3);


        //Label Area
        labelNum2.setBounds(18, 9, 300, 40);
        labelQuestion2.setBounds(30, 40, 490, 40);
        labelQ.setBounds(80, 60, 300, 40);

        //Font style and Font size
        labelQuestion2.setFont(new Font("", Font.BOLD, 14));
        labelQ.setFont(new Font("", Font.ITALIC, 14));

        //Disable Maximize button
        frame2.setResizable(false);

        //Icon Image
        Image icon = Toolkit.getDefaultToolkit().getImage("../src/Image/icon.png");
        frame2.setIconImage(icon);

        //Check Box
        buttonAnswer1.setBounds(20, 100, 100, 25);
        buttonAnswer2.setBounds(20, 130, 100, 25);
        buttonAnswer3.setBounds(20, 160, 100, 25);


        //Button
        buttonSubmit.setBounds(70, 200, 150, 25);
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (buttonAnswer3.isSelected()) {
                    JOptionPane.showMessageDialog(frame2, "Answer is correct");
                } else {
                    JOptionPane.showMessageDialog(frame2, "Answer is wrong");
                }
            }
        });


        buttonExpl.setBounds(250, 200, 150, 25);
        buttonExpl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame2, "Correct answer is : 25\n ++z +y -y +z + x++\n" +
                        "11 + 5 - 5 + 11 + 3 = 25\n ++z means that the value will first increment by 1.");
            }
        });


        buttonNext.setBounds(250, 240, 150, 25);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThirdFrame thirdFrame = new ThirdFrame();
                frame2.dispose();
            }
        });


        buttonBack.setBounds(70,240,150,25);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstFrame firFrame = new FirstFrame();
                frame2.dispose();
            }
        });


          //background color
//        frame.getContentPane().setBackground(Color.gray);


        //Frame
        frame2.setBounds(400, 250, 570, 350);
        frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
        frame2.setVisible(true);
        frame2.setLayout(null);
        frame2.add(labelNum2);
        frame2.add(labelQ);
        frame2.add(labelQuestion2);
        frame2.add(buttonAnswer1);
        frame2.add(buttonAnswer2);
        frame2.add(buttonAnswer3);
        frame2.add(buttonSubmit);
        frame2.add(buttonExpl);
        frame2.add(buttonNext);
        frame2.add(buttonBack);


    }

}


