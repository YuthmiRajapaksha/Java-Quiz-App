import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FourthFrame {
    public FourthFrame(){

        JFrame frame4 = new JFrame("Thank You");
        JButton buttonExit = new JButton("EXIT");
        JButton buttonBack = new JButton("Back");

        //Disable Maximize button
        frame4.setResizable(false);

        //Icon Image
        Image icon = Toolkit.getDefaultToolkit().getImage("../../../src/Image/icon.png");
        frame4.setIconImage(icon);


        //BackgroundImage
        frame4 .setContentPane(new JLabel(new ImageIcon("../../../src/Image/thank-you.png")));


        //Button
        buttonBack.setBounds(70,240,130,25);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ThirdFrame thirdFrame = new ThirdFrame();
                frame4.dispose();
            }
        });


        buttonExit.setBounds(250,240,130,25);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame4.dispose();
            }
        });


        frame4.setBounds(400, 250, 570, 350);
        frame4.setDefaultCloseOperation(frame4.EXIT_ON_CLOSE);
        frame4.setVisible(true);
        frame4.setLayout(null);
        frame4.add(buttonExit);
        frame4.add(buttonBack);
    }
}
