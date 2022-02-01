import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstFrame {
   public FirstFrame(){


        JFrame frame1 = new JFrame("Questions 1");
        JLabel labelNum1 = new JLabel("Question no.1");
        JLabel labelQuestion = new JLabel("What is the return type of the hashCode() method in the Object class?");
        JLabel labelHint = new JLabel("(Hint : Choose only one answer)");
        JRadioButton boxInt = new JRadioButton("01.int" );
        JRadioButton boxLong = new JRadioButton("02.long" );
        JRadioButton boxVoid = new JRadioButton("03.void" );
        JButton buttonSubmit = new JButton("Submit");
        JButton buttonExpl = new JButton("Explanation");
        JButton buttonNext = new JButton("Next");
//        JButton ba = new JButton("B");
        ButtonGroup g1 = new ButtonGroup();
        g1.add(boxInt);
        g1.add(boxLong);
        g1.add(boxVoid);
        

        //Label Area
        labelNum1.setBounds(18,9,300,40);
        labelQuestion.setBounds(30,40,490,40);
        labelHint.setBounds(20,280,250,25);

        //Font style and Font size
        labelQuestion.setFont(new Font("",Font.BOLD,14));

        //Checkbox
        boxInt.setBounds(20,90,100,25);
        boxLong.setBounds(20,120,100,25);
        boxVoid.setBounds(20,150,100,25);



       //Icon Image
       Image icon = Toolkit.getDefaultToolkit().getImage("../src/Image/icon.png");
       frame1.setIconImage(icon);

        //Disable Maximize button
        frame1.setResizable(false);


        //Button
        buttonExpl.setBounds(250,200,150,25);
        buttonExpl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(frame1,"Correct answer is : int .\nIn Java, the return type of hashCode() method is an integer, as it returns a hash code value for the object.");
            }
        });


        buttonSubmit.setBounds(70,200,150,25);
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boxInt.isSelected()){
                    JOptionPane.showMessageDialog(frame1,"Answer is correct");
                }else{
                    JOptionPane.showMessageDialog(frame1,"Answer is wrong ");
                }

            }

        });

//       ba.setBounds(70,240,150,25);
//       ba.addActionListener(new ActionListener() {
//           @Override
//           public void actionPerformed(ActionEvent e) {
//               Main main = new Main();
//               frame1.dispose();
//           }
//       });


        buttonNext.setBounds(170,240,130,25);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SecondFrame frmaekk = new SecondFrame();

                //Close the current Frame
                frame1.dispose();


            }
        });


        // Frame
        frame1.setBounds(400,250,570,350);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.add(labelNum1);
        frame1.add(labelQuestion);
        frame1.add(boxInt);
        frame1.add(boxLong);
        frame1.add(boxVoid);
        frame1.add(buttonSubmit);
        frame1.add(buttonExpl);
        frame1.add(buttonNext);
        frame1.add(labelHint);
//        frame1.add(ba);



    }
}
