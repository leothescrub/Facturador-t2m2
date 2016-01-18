package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Facturador.controlador.ControlRegistrarProveedor;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarProveedor extends JFrame {

	private JPanel contentPane;
	public static JTextField textNomPro;
	public static JTextField textApellPro;
	public static JTextField textRifPro;
	public static JTextField textEmprPro;

	public RegistrarProveedor() {
		setTitle("REGISTRAR PROVEEDOR");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NOMBRE:");
		label.setForeground(new Color(0, 0, 128));
		label.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		label.setBounds(47, 75, 84, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("APELLIDO:");
		label_1.setForeground(new Color(0, 0, 128));
		label_1.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		label_1.setBounds(47, 110, 90, 14);
		contentPane.add(label_1);
		
		textNomPro = new JTextField();
		RestrictedTextField restriNom = new RestrictedTextField(textNomPro);
		restriNom.setOnlyText(true);
		restriNom.setLimit(20);
		textNomPro.setColumns(10);
		textNomPro.setBounds(142, 74, 124, 20);
		contentPane.add(textNomPro);
		
		textApellPro = new JTextField();
		RestrictedTextField restriApell = new RestrictedTextField(textApellPro);
		restriApell.setOnlyText(true);
		restriApell.setLimit(20);
		textApellPro.setColumns(10);
		textApellPro.setBounds(142, 109, 124, 20);
		contentPane.add(textApellPro);
		
		JLabel lblRif = new JLabel("RIF:");
		lblRif.setForeground(new Color(0, 0, 128));
		lblRif.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblRif.setBounds(47, 145, 43, 14);
		contentPane.add(lblRif);
		
		textRifPro = new JTextField();
		RestrictedTextField restriRif = new RestrictedTextField(textRifPro);
		restriRif.setAcceptSpace(false);
		restriRif.setLimit(15);
		textRifPro.setColumns(10);
		textRifPro.setBounds(142, 144, 124, 20);
		contentPane.add(textRifPro);
		
		JLabel lblEmpresa = new JLabel("EMPRESA:");
		lblEmpresa.setForeground(new Color(0, 0, 128));
		lblEmpresa.setFont(new Font("Leelawadee", Font.PLAIN, 16));
		lblEmpresa.setBounds(47, 181, 90, 14);
		contentPane.add(lblEmpresa);
		
		textEmprPro = new JTextField();
		RestrictedTextField restriEmpr = new RestrictedTextField(textEmprPro);
		restriEmpr.setLimit(20);
		restriEmpr.setAcceptSpace(true);
		textEmprPro.setColumns(10);
		textEmprPro.setBounds(142, 180, 124, 20);
		contentPane.add(textEmprPro);
		
		JButton butGuarPro = new JButton("GUARDAR");
		butGuarPro.setForeground(Color.RED);
		butGuarPro.addActionListener(new ControlRegistrarProveedor(this,"GuarProvee"));
		butGuarPro.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butGuarPro.setBounds(205, 223, 101, 36);
		contentPane.add(butGuarPro);
		
		JButton butCancPro = new JButton("SALIR");
		butCancPro.addActionListener(new ControlRegistrarProveedor(this,"CanceProvee"));
		butCancPro.setForeground(Color.RED);
		butCancPro.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butCancPro.setBounds(30, 223, 101, 36);
		contentPane.add(butCancPro);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(RegistrarProveedor.class.getResource("/com/Facturador/images/PROVEE.png")));
		label_2.setBounds(20, 11, 314, 53);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(RegistrarProveedor.class.getResource("/com/Facturador/images/fondoencar.png")));
		label_3.setBounds(0, 0, 334, 342);
		contentPane.add(label_3);
	}

}
