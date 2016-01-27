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
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	public static JTextField textUser;
	public static JTextField textPass;
	private JPasswordField passwordField;

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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/com/Facturador/images/login7.png")));
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 390);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Head = new JLabel("");
		Head.setIcon(new ImageIcon(Login.class.getResource("/com/Facturador/images/Login.png")));
		Head.setBounds(122, 24, 348, 94);
		contentPane.add(Head);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setForeground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 22));
		lblNewLabel.setBounds(142, 185, 116, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("UserName");
		lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(142, 142, 116, 27);
		contentPane.add(lblNewLabel_1);
		
		textPass = new JPasswordField();
		textPass.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textPass.setBounds(309, 185, 124, 31);
		contentPane.add(textPass);
		textPass.setColumns(10);
		
		textUser = new JTextField();
		textUser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textUser.setBounds(309, 141, 124, 31);
		contentPane.add(textUser);
		textUser.setColumns(10);
		
		JButton btnBuss = new JButton("Buscar");
		btnBuss.addActionListener(new ControlLogin(this,"Buscar"));
		btnBuss.setBounds(212, 272, 110, 44);
		contentPane.add(btnBuss);
		
		JLabel background = new JLabel("");
		background.setIcon(new ImageIcon(Login.class.getResource("/com/Facturador/images/cbdef475a08645847520cd2576387880.jpg")));
		background.setBounds(0, 0, 559, 361);
		contentPane.add(background);
		
		
	}
}
