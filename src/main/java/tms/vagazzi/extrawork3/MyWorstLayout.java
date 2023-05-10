package tms.vagazzi.extrawork3;

import javax.swing.*;

public class MyWorstLayout extends JFrame{
    private JTextField loginField1;
    private JPasswordField passwordField1;
    private JButton button1;

    public MyWorstLayout() {
        button1.addActionListener(
                (l) -> {
                    String ff = loginField1.getText();
                    JOptionPane.showMessageDialog(null, "ff" + ff);
                }

        );
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
    }

}
