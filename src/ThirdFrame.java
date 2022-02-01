import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ThirdFrame {

        public ThirdFrame(){

                JFrame frame3 = new JFrame("Questions 3");
                JLabel labelNum2 = new JLabel("Question no.3");
                JLabel labelQuestion3 = new JLabel(" What is the initial quantity of the ArrayList list?");
                JLabel labelIQ2 = new JLabel("ArrayList list = new ArrayList(); ");
                JRadioButton buttonAnswer1 = new JRadioButton("5");
                JRadioButton buttonAnswer2 = new JRadioButton("10");
                JRadioButton buttonAnswer3 = new JRadioButton("0");
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
                labelQuestion3.setBounds(30, 40, 490, 40);
                labelIQ2.setBounds(80, 60, 300, 40);

                //Font style and Font size
                labelQuestion3.setFont(new Font("", Font.BOLD, 14));
                labelIQ2.setFont(new Font("", Font.ITALIC, 14));

                //Disable Maximize button
                frame3.setResizable(false);

                //Icon Image
                Image icon = Toolkit.getDefaultToolkit().getImage("src/Image/icon.png");
                frame3.setIconImage(icon);

                //Check Box
                buttonAnswer1.setBounds(20, 100, 100, 25);
                buttonAnswer2.setBounds(20, 130, 100, 25);
                buttonAnswer3.setBounds(20, 160, 100, 25);


                //Button
                buttonSubmit.setBounds(70, 200, 150, 25);
                buttonSubmit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                if (buttonAnswer2.isSelected()) {
                                        JOptionPane.showMessageDialog(frame3, "Answer is correct");
                                } else {
                                        JOptionPane.showMessageDialog(frame3, "Answer is wrong");
                                }
                        }
                });

                buttonExpl.setBounds(250, 200, 150, 25);
                buttonExpl.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(frame3,"Correct answer is : 10\nThe initial or default quantity of an ArrayList is 10.\n It means when we create an ArrayList without specifying any quantity,\n it will be created with the default capacity, i.e., 10.\n "+"Hence, an ArrayList with the default capacity can hold ten (10) values.");
                        }
                });


                buttonNext.setBounds(250, 240, 150, 25);
                buttonNext.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                FourthFrame fourthFrame = new FourthFrame();

                                frame3.dispose();
                        }
                });


                buttonBack.setBounds(70,240,150,25);
                buttonBack.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                SecondFrame frmaekk = new SecondFrame();

                                frame3.dispose();
                        }
                });


                //Frame Area
                frame3.setBounds(400,250,570,350);
                frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
                frame3.setVisible(true);
                frame3.setLayout(null);
                frame3.add(labelNum2);
                frame3.add(labelQuestion3);
                frame3.add(labelIQ2);
                frame3.add(buttonAnswer1);
                frame3.add(buttonAnswer2);
                frame3.add(buttonAnswer3);
                frame3.add(buttonSubmit);
                frame3.add(buttonExpl);
                frame3.add(buttonNext);
                frame3.add(buttonBack);






        }
}
