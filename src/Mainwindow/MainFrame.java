package Mainwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JPanel Mainpanel;
    private JTabbedPane tabbedPane1;
    private JRadioButton closeRadioButton;

    public MainFrame() {
        setContentPane(Mainpanel);
        setTitle("Loginwindow");
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
        setBackground(new Color(33, 31, 31));
        Mainpanel.setBackground(new Color(33, 33, 33));

        tabbedPane1.setBackground(new Color(33, 33, 33));
        tabbedPane1.setForeground(new Color(255,255,255));


        closeRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }




}
