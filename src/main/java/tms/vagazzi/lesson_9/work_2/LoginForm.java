package tms.vagazzi.lesson_9.work_2;

import tms.vagazzi.lesson_8.extrawork.ExampleLayout;

import javax.swing.*;

public class LoginForm extends JFrame {
    private JTextField loginInputField;
    private JButton loginButton;
    private JTextArea enterTheValueTextArea;
    private JPanel loginForm;

    private HelloForm helloForm;
    private String loginValue;

    public LoginForm() {
        loginButton.addActionListener(e -> {
                    loginValue = loginInputField.getText();
                    if(loginValue.equals("Vadim")){
                        JOptionPane.showMessageDialog(loginButton, "Vadim blyat ");
                        System.out.println("Hahaha my stupid neighbour vadim just sucked lol");
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(loginButton, "Hello " + loginValue + ". Have a nice day blin");
                        LoginForm.super.setVisible(false);
                        helloForm = new HelloForm(LoginForm.this, "heh");
                    }

                }

        );
    }

    public static void main(String[] args) {

        LoginForm form = new LoginForm();
        form.setSize(300, 200);
        form.setTitle("Leather stuff");
        form.setContentPane(form.loginForm);
        form.setResizable(false);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setVisible(true);
    }


}
