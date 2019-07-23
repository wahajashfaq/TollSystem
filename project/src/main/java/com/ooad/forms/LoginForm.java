package com.ooad.forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField passwordField;


	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username:");
		lblNewLabel.setBounds(152, 101, 105, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("password:");
		lblNewLabel_1.setBounds(152, 130, 81, 16);
		contentPane.add(lblNewLabel_1);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(269, 95, 142, 22);
		contentPane.add(textPane);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(269, 127, 142, 27);
		contentPane.add(passwordField);
		
		JLabel lblRegisteredUser = new JLabel("Registered User");
		lblRegisteredUser.setBounds(269, 42, 170, 27);
		contentPane.add(lblRegisteredUser);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(this); 
		btnLogin.setBounds(269, 171, 147, 25);
		contentPane.add(btnLogin);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		HomeForm hForm = new HomeForm();
		hForm.setVisible(true);
		this.dispose();
	}
}
