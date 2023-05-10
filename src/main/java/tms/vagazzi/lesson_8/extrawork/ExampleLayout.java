package tms.vagazzi.lesson_8.extrawork;

import javax.swing.*;

public class ExampleLayout extends JFrame{
    private JButton gachiScreamButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel defaultLayout;

    public ExampleLayout() {
        gachiScreamButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(gachiScreamButton,"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaahhhh!");
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        ExampleLayout form = new ExampleLayout();
        form.setSize(300,200);
        form.setTitle("Leather stuff");
        form.setContentPane(form.defaultLayout);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }
}
