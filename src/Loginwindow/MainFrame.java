package LoginWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel loginpanel;
    private JLabel labellogin;
    private JLabel labeluser;
    private JLabel labelpass;


    public MainFrame(){
        setContentPane(loginpanel);
        setTitle("Loginwindow");
        setSize(450,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
        setBackground( new Color(33, 31, 31) );
        loginpanel.setBackground( new Color(33,33,33));
        labellogin.setForeground(Color.white);
        labellogin.setFont(new Font("Lexend", Font.PLAIN, 30));
        labeluser.setFont(new Font("Verdana", Font.PLAIN, 10));
        labelpass.setFont(new Font("Verdana", Font.PLAIN, 10));
        labeluser.setForeground(Color.white);
        labelpass.setForeground(Color.white);
        okButton.setForeground( new Color(255, 255, 255));
        cancelButton.setForeground( new Color(255, 255, 255));
        okButton.setBackground( new Color(31,31,31, 210));
        cancelButton.setBackground(new Color(31,31,31, 210));



        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Mainwindow.MainFrame myframe = new Mainwindow.MainFrame();

            }
        });
        cancelButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        MainFrame loginframe = new MainFrame();
    }
}
