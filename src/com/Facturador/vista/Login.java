package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Facturador.controlador.ControlLogin;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	public static JTextField textUser;
	public static JTextField textPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 222);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel.setBounds(26, 41, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(26, 88, 130, 14);
		contentPane.add(lblNewLabel_1);
		
		textPass = new JTextField();
		textPass.setBounds(126, 38, 101, 20);
		contentPane.add(textPass);
		textPass.setColumns(10);
		
		textUser = new JTextField();
		textUser.setBounds(126, 85, 101, 20);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		JButton btnBuss = new JButton("Buscar");
		btnBuss.addActionListener(new ControlLogin(this,"Buscar"));
		btnBuss.setBounds(71, 129, 110, 44);
		contentPane.add(btnBuss);
	}

}
