package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;

public class RegistroDeEncargado extends JFrame {

	private JPanel contentPane;
	private JTextField textNomEncargado;
	private JTextField textApeEncargado;
	private JTextField textUser;
	private JTextField textPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroDeEncargado frame = new RegistroDeEncargado();
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
	public RegistroDeEncargado() {
		setTitle("REGISTRO DE ENCARGADO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 325, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setForeground(new Color(0, 0, 128));
		lblUsername.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblUsername.setBounds(47, 144, 101, 14);
		contentPane.add(lblUsername);
		
		textUser = new JTextField();
		textUser.setColumns(10);
		textUser.setBounds(142, 143, 124, 20);
		contentPane.add(textUser);
		
		textApeEncargado = new JTextField();
		textApeEncargado.setBounds(142, 107, 124, 20);
		contentPane.add(textApeEncargado);
		textApeEncargado.setColumns(10);
		
		textPass = new JTextField();
		textPass.setColumns(10);
		textPass.setBounds(142, 176, 124, 20);
		contentPane.add(textPass);
		
		JButton btnEncarCancel = new JButton("CANCELAR");
		btnEncarCancel.setForeground(new Color(255, 0, 0));
		btnEncarCancel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		btnEncarCancel.setBounds(10, 231, 101, 36);
		contentPane.add(btnEncarCancel);
		
		JButton btnEncarGuardar = new JButton("GUARDAR");
		btnEncarGuardar.setForeground(new Color(255, 0, 0));
		btnEncarGuardar.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		btnEncarGuardar.setBounds(208, 231, 101, 36);
		contentPane.add(btnEncarGuardar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(RegistroDeEncargado.class.getResource("/com/Facturador/images/encarga111.png")));
		label_1.setBounds(98, 190, 156, 177);
		contentPane.add(label_1);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setForeground(new Color(0, 0, 128));
		lblNombre.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblNombre.setBounds(47, 73, 84, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(RegistroDeEncargado.class.getResource("/com/Facturador/images/ENCARGADO.png")));
		lblNewLabel.setBounds(10, 11, 299, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblPasswer = new JLabel("PASSWORD:");
		lblPasswer.setForeground(new Color(0, 0, 128));
		lblPasswer.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblPasswer.setBounds(47, 177, 101, 14);
		contentPane.add(lblPasswer);
		
		textNomEncargado = new JTextField();
		textNomEncargado.setBounds(142, 72, 124, 20);
		contentPane.add(textNomEncargado);
		textNomEncargado.setColumns(10);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setForeground(new Color(0, 0, 128));
		lblApellido.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblApellido.setBounds(47, 108, 90, 14);
		contentPane.add(lblApellido);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegistroDeEncargado.class.getResource("/com/Facturador/images/fondoencar.png")));
		label.setBounds(0, 0, 319, 322);
		contentPane.add(label);
	}
}
