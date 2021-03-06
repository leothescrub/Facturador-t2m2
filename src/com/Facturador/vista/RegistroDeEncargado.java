package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Facturador.controlador.ControRegistroEncargado;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class RegistroDeEncargado extends JFrame {

	private JPanel contentPane;
	public static JTextField textNomEncargado;
	public static JTextField textApeEncargado;
	public static JTextField textUser;
	public static JTextField textPass;
	public static JTextField textCeduEncar;

	public RegistroDeEncargado() {
		setTitle("REGISTRO DE ENCARGADO");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("USERNAME:");
		lblUsername.setForeground(new Color(0, 0, 128));
		lblUsername.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblUsername.setBounds(47, 178, 101, 14);
		contentPane.add(lblUsername);
		
		textUser = new JTextField();
		RestrictedTextField restriUser = new RestrictedTextField(textUser);
		restriUser.setOnlyText(true);
		restriUser.setLimit(15);
		textUser.setColumns(10);
		textUser.setBounds(142, 177, 124, 20);
		contentPane.add(textUser);
		
		textApeEncargado = new JTextField();
		RestrictedTextField restriApell = new RestrictedTextField(textApeEncargado);
		restriApell.setOnlyText(true);
		restriApell.setLimit(20);
		textApeEncargado.setBounds(142, 107, 124, 20);
		textApeEncargado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char keyChar = arg0.getKeyChar();
				    if (Character.isLowerCase(keyChar)) {
				      arg0.setKeyChar(Character.toUpperCase(keyChar));
				    }
			}
		});
		contentPane.add(textApeEncargado);
		textApeEncargado.setColumns(10);
		
		textPass = new JTextField();
		RestrictedTextField restriPass = new RestrictedTextField(textPass);
		restriPass.setLimit(18);
		textPass.setColumns(10);
		textPass.setBounds(142, 210, 124, 20);
		contentPane.add(textPass);
		
		JButton btnEncarCancel = new JButton("CANCELAR");
		btnEncarCancel.addActionListener(new ControRegistroEncargado(this,"CanceEncar"));
		btnEncarCancel.setForeground(new Color(255, 0, 0));
		btnEncarCancel.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		btnEncarCancel.setBounds(10, 273, 101, 36);
		contentPane.add(btnEncarCancel);
		
		JButton btnEncarGuardar = new JButton("GUARDAR");
		btnEncarGuardar.addActionListener(new ControRegistroEncargado(this,"GuardRegis"));
		btnEncarGuardar.setForeground(new Color(255, 0, 0));
		btnEncarGuardar.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		btnEncarGuardar.setBounds(208, 273, 101, 36);
		contentPane.add(btnEncarGuardar);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(RegistroDeEncargado.class.getResource("/com/Facturador/images/encarga111.png")));
		label_1.setBounds(97, 229, 156, 177);
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
		lblPasswer.setBounds(47, 211, 101, 14);
		contentPane.add(lblPasswer);
		
		textNomEncargado = new JTextField();
		RestrictedTextField restriNom = new RestrictedTextField(textNomEncargado);
		restriNom.setOnlyText(true);
		restriNom.setLimit(20);
		textNomEncargado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				char keyChar = arg0.getKeyChar();
				    if (Character.isLowerCase(keyChar)) {
				      arg0.setKeyChar(Character.toUpperCase(keyChar));
				    }
			}
		});
		
		JLabel lblCedula = new JLabel("CEDULA:");
		lblCedula.setForeground(new Color(0, 0, 128));
		lblCedula.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblCedula.setBounds(47, 144, 90, 14);
		contentPane.add(lblCedula);
		
		textCeduEncar = new JTextField();
		RestrictedTextField restriCedu = new RestrictedTextField(textCeduEncar);
		restriCedu.setOnlyNums(true);
		restriCedu.setLimit(8);
		textCeduEncar.setColumns(10);
		textCeduEncar.setBounds(142, 143, 124, 20);
		contentPane.add(textCeduEncar);
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
