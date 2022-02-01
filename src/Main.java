import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Welcome to the Quiz App");
        JLabel labelTopic = new JLabel("  QUIZ APP");
        JLabel labelTrypanel = new JLabel("TRY IT.");
        JButton buttonStart = new JButton("Start");


        //Disable Maximize button
        frame.setResizable(false);

        //Label Area
        labelTopic.setBounds(200,30,120,25);
        labelTrypanel.setBounds(210,130,200,25);


        //Line
        Border blackline = BorderFactory.createLineBorder(Color.black);
        labelTopic.setBorder(blackline);


        //font style and size
        labelTopic.setFont(new Font("",Font.BOLD,20));
        labelTrypanel.setFont(new Font("",Font.BOLD,19));


        //Icon Image
        Image icon = Toolkit.getDefaultToolkit().getImage("src/Image/icon.png");
        frame.setIconImage(icon);


        //BackgroundImage
        frame .setContentPane(new JLabel(new ImageIcon("src/Image/pho1.jpg")));


        //Button
        buttonStart.setBounds(200,220,100,25);
        buttonStart.setBorder(blackline);
        buttonStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FirstFrame firFrame = new FirstFrame();
                frame.dispose();
            }
        });


        //Frame Area
        frame.setBounds(400,250,570,350);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(labelTopic);
        frame.add(buttonStart);
        frame.add(labelTrypanel);

    }
}
