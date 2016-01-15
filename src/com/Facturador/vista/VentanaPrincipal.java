package com.Facturador.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame { //Se crea la clase ventana principal
	private JPanel contentPane;
	public VentanaPrincipal() {
		setTitle("Facturador A.R.R.E.C.H.O"); //Se crea el objeto
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * Haz que este boton abra otra ventana, en otras palabras, completa el MVC menor
		 */
		
		JButton btnNewButton = new JButton("Este bot\u00F3n debe abrir otra ventana, pero no esta haciendo nada arreglame :)");
		btnNewButton.setBounds(209, 180, 550, 396);
		contentPane.add(btnNewButton);
		
		JLabel lblFondo = new JLabel(""); //Fondo de Ventana principal
		lblFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondo-degradado.jpg")));
		lblFondo.setBounds(0, 0, 1008, 729);
		contentPane.add(lblFondo);
	}
}
