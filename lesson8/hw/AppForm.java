package ru.geekbrains.lesson8.hw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppForm extends JFrame {
    private int counter;
    public AppForm(){
        setTitle("My Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300, 300,120);

        Font font = new Font("Arial", Font.BOLD,32);

        JButton westButton = new JButton("<");
        add(westButton, BorderLayout.WEST);
        JButton eastButton = new JButton(">");
        add(eastButton, BorderLayout.EAST);

        JTextField textField = new JTextField("0");
        textField.setFont(font);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        add(textField, BorderLayout.CENTER);

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(textField.getText());
                counter = Integer.valueOf(textField.getText());
            }
        });

        /*JButton button = new JButton(String.valueOf(counter));
        add(button, BorderLayout.CENTER);*/

        eastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                textField.setText(String.valueOf(counter));
            }
        });

        westButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                textField.setText(String.valueOf(counter));
            }
        });

        /*button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                button.setText(String.valueOf(counter));
            }
        });*/

        setVisible(true);
    }
}
