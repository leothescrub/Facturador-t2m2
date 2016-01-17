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

public class RegistrarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textClienApellido;
	private JTextField textClienNombre;
	private JTextField textClienCedu;
	private JTextField textClienTelf;
	private JTextField textClienDirec;
	private JButton butGuarClien;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarCliente frame = new RegistrarCliente();
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
	public RegistrarCliente() {
		setTitle("REGISTRAR CLIENTE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JButton butCanClien = new JButton("CANCELAR");
		butCanClien.setForeground(Color.RED);
		butCanClien.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butCanClien.setBounds(29, 252, 101, 36);
		contentPane.add(butCanClien);
		
		butGuarClien = new JButton("GUARDAR");
		butGuarClien.setForeground(Color.RED);
		butGuarClien.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butGuarClien.setBounds(178, 252, 101, 36);
		contentPane.add(butGuarClien);
		
		textClienApellido = new JTextField();
		textClienApellido.setColumns(10);
		textClienApellido.setBounds(137, 93, 124, 20);
		contentPane.add(textClienApellido);
		
		textClienNombre = new JTextField();
		textClienNombre.setColumns(10);
		textClienNombre.setBounds(137, 58, 124, 20);
		contentPane.add(textClienNombre);
		
		textClienCedu = new JTextField();
		textClienCedu.setColumns(10);
		textClienCedu.setBounds(137, 131, 124, 20);
		contentPane.add(textClienCedu);
		
		textClienTelf = new JTextField();
		textClienTelf.setColumns(10);
		textClienTelf.setBounds(137, 171, 124, 20);
		contentPane.add(textClienTelf);
		
		textClienDirec = new JTextField();
		textClienDirec.setColumns(10);
		textClienDirec.setBounds(137, 212, 172, 20);
		contentPane.add(textClienDirec);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegistrarCliente.class.getResource("/com/Facturador/images/fondoencar.png")));
		label.setBounds(0, 0, 309, 322);
		contentPane.add(label);
	}
}
