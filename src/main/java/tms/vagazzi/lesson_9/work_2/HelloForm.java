package tms.vagazzi.lesson_9.work_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloForm extends JFrame {
    private JPanel panel1;
    private JButton button1;

    public HelloForm(LoginForm loginForm, String text){
        this.setSize(300, 200);
        this.setTitle("Leather stuff");
        this.setContentPane(this.panel1);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
