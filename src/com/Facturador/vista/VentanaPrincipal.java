package com.Facturador.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame { //Se crea la clase ventana principal

	private JPanel contentPane;
	public VentanaPrincipal() { //Se crea el objeto
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHolaMundo = new JLabel("Hola Mundo");
		lblHolaMundo.setBounds(169, 107, 75, 14);
		contentPane.add(lblHolaMundo);
	}
}
