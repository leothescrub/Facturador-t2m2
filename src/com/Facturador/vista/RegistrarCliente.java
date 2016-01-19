package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Facturador.controlador.ControlRegistrarCliente;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarCliente extends JFrame {

	private JPanel contentPane;
	public static JTextField textClienApellido;
	public static JTextField textClienNombre;
	public static JTextField textClienCedu;
	public static JTextField textClienTelf;
	public static JTextField textClienDirec;
	public static JButton butGuarClien;

	public RegistrarCliente() {
		setTitle("REGISTRAR CLIENTE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 330, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/com/Facturador/images/REGISTRARCLIENTE.png")));
		lblNewLabel.setBounds(10, 0, 294, 52);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("NOMBRE:");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		label_1.setBounds(42, 59, 84, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("APELLIDO:");
		label_2.setForeground(new Color(0, 0, 128));
		label_2.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		label_2.setBounds(42, 94, 90, 14);
		contentPane.add(label_2);
		
		JLabel lblCedula = new JLabel("CEDULA:");
		lblCedula.setForeground(new Color(0, 0, 128));
		lblCedula.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblCedula.setBounds(42, 132, 90, 14);
		contentPane.add(lblCedula);
		
		JLabel lblT = new JLabel("TELEFONO:");
		lblT.setForeground(new Color(0, 0, 128));
		lblT.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblT.setBounds(42, 172, 90, 14);
		contentPane.add(lblT);
		
		JLabel lblDireccion = new JLabel("DIRECCION:");
		lblDireccion.setForeground(new Color(0, 0, 128));
		lblDireccion.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblDireccion.setBounds(42, 213, 90, 14);
		contentPane.add(lblDireccion);
		
		JButton butCanClien = new JButton("SALIR");
		butCanClien.addActionListener(new ControlRegistrarCliente (this,"CancelCliente"));
		butCanClien.setForeground(Color.RED);
		butCanClien.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butCanClien.setBounds(29, 252, 101, 36);
		contentPane.add(butCanClien);
		
		butGuarClien = new JButton("GUARDAR");
		butGuarClien.addActionListener(new ControlRegistrarCliente (this,"GuardCliente"));
		butGuarClien.setForeground(Color.RED);
		butGuarClien.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butGuarClien.setBounds(178, 252, 101, 36);
		contentPane.add(butGuarClien);
		
		textClienApellido = new JTextField();
		RestrictedTextField restriApell = new RestrictedTextField(textClienApellido);
		restriApell.setOnlyText(true);
		restriApell.setLimit(20);
		textClienApellido.setColumns(10);
		textClienApellido.setBounds(137, 93, 124, 20);
		contentPane.add(textClienApellido);
		
		textClienNombre = new JTextField();
		RestrictedTextField restriNom = new RestrictedTextField(textClienNombre);
		restriNom.setOnlyText(true);
		restriNom.setLimit(20);
		textClienNombre.setColumns(10);
		textClienNombre.setBounds(137, 58, 124, 20);
		contentPane.add(textClienNombre);
		
		textClienCedu = new JTextField();
		RestrictedTextField restriCed = new RestrictedTextField(textClienCedu);
		restriCed.setOnlyNums(true);
		restriCed.setLimit(8);
		textClienCedu.setColumns(10);
		textClienCedu.setBounds(137, 131, 124, 20);
		contentPane.add(textClienCedu);
		
		textClienTelf = new JTextField();
		RestrictedTextField restriTel = new RestrictedTextField(textClienTelf);
		restriTel.setOnlyNums(true);
		restriTel.setLimit(12);
		textClienTelf.setColumns(10);
		textClienTelf.setBounds(137, 171, 124, 20);
		contentPane.add(textClienTelf);
		
		textClienDirec = new JTextField();
		RestrictedTextField restriDirecc = new RestrictedTextField(textClienDirec);
		restriDirecc.setOnlyText(true);
		restriDirecc.setAcceptSpace(true);
		restriDirecc.setLimit(40);
		textClienDirec.setColumns(10);
		textClienDirec.setBounds(137, 212, 172, 20);
		contentPane.add(textClienDirec);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/com/Facturador/images/fondoencar.png")));
		label.setBounds(0, 0, 309, 322);
		contentPane.add(label);
	}
}
