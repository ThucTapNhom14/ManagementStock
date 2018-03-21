package managestock.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

import managestock.actionlistener.LoginListener;
import managestock.entity.Product;
import managestock.logic.impl.TblProductLogicImpl;

import javax.swing.JPasswordField;

public class LoginView {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel jLabel;
	private LoginListener loginListener = new LoginListener(textField,passwordField,jLabel,frame);


	

	/**
	 * Create the application.
	 */
	public LoginView() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setBounds(87, 113, 67, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLogIn = new JLabel("LOGIN");
		lblLogIn.setForeground(Color.BLUE);
		lblLogIn.setBackground(Color.BLUE);
		lblLogIn.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLogIn.setBounds(190, 36, 67, 27);
		frame.getContentPane().add(lblLogIn);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(87, 146, 67, 17);
		frame.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.setBounds(104, 189, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(245, 189, 89, 23);
		frame.getContentPane().add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(182, 113, 117, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 144, 115, 20);
		frame.getContentPane().add(passwordField);
		
		jLabel = new JLabel("");
		jLabel.setForeground(Color.RED);
		jLabel.setBounds(87, 60, 315, 52);
		frame.getContentPane().add(jLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnLogin.addActionListener(new LoginListener(textField,passwordField, jLabel,frame ));
		
		
		
	}
}
