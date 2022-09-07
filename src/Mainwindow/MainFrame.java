package Mainwindow;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JButton HOMEButton;
    private JButton UPDATERButton;
    private JButton SETTINGSButton;
    private JPanel Mainpanel;

    public MainFrame() {
        setContentPane(Mainpanel);
        setTitle("Loginwindow");
        setSize(1600, 900);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setBackground(new Color(33, 31, 31));
        Mainpanel.setBackground(new Color(33, 33, 33));
        UPDATERButton.setBackground( new Color(31,31,31, 210));
        HOMEButton.setBackground( new Color(31,31,31, 210));
        SETTINGSButton.setBackground( new Color(31,31,31, 210));
        UPDATERButton.setForeground( new Color(255, 255, 255));
        HOMEButton.setForeground( new Color(255, 255, 255));
        SETTINGSButton.setForeground( new Color(255, 255, 255));




    }




}
