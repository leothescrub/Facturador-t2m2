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

public class RegistrarProducto extends JFrame {

	private JPanel contentPane;
	private JTextField textDescProd;
	private JTextField textPreProd;
	private JTextField textIdProd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrarProducto frame = new RegistrarProducto();
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
	public RegistrarProducto() {
		setTitle("REGISTRAR PRODUCTO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripción = new JLabel("DESCRIPCI\u00D3N:");
		lblDescripción.setForeground(new Color(0, 0, 128));
		lblDescripción.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDescripción.setBounds(43, 84, 109, 14);
		contentPane.add(lblDescripción);
		
		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setForeground(new Color(0, 0, 128));
		lblPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblPrecio.setBounds(43, 119, 90, 14);
		contentPane.add(lblPrecio);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(RegistrarProducto.class.getResource("/com/Facturador/images/REGISTRAR PRODUCTO.png")));
		label.setBounds(18, 11, 306, 51);
		contentPane.add(label);
		
		JLabel lblCodigoDeProducto = new JLabel("ID PRODUCTO:");
		lblCodigoDeProducto.setForeground(new Color(0, 0, 128));
		lblCodigoDeProducto.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblCodigoDeProducto.setBounds(43, 158, 198, 14);
		contentPane.add(lblCodigoDeProducto);
		
		textDescProd = new JTextField();
		textDescProd.setColumns(10);
		textDescProd.setBounds(162, 83, 124, 20);
		contentPane.add(textDescProd);
		
		textPreProd = new JTextField();
		textPreProd.setColumns(10);
		textPreProd.setBounds(162, 118, 124, 20);
		contentPane.add(textPreProd);
		
		textIdProd = new JTextField();
		textIdProd.setColumns(10);
		textIdProd.setBounds(162, 157, 124, 20);
		contentPane.add(textIdProd);
		
		JButton butCancProd = new JButton("CANCELAR");
		butCancProd.setForeground(Color.RED);
		butCancProd.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butCancProd.setBounds(51, 219, 101, 36);
		contentPane.add(butCancProd);
		
		JButton butGuarProd = new JButton("GUARDAR");
		butGuarProd.setForeground(Color.RED);
		butGuarProd.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butGuarProd.setBounds(185, 219, 101, 36);
		contentPane.add(butGuarProd);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RegistrarProducto.class.getResource("/com/Facturador/images/fondoencar.png")));
		lblNewLabel.setBounds(0, 0, 334, 352);
		contentPane.add(lblNewLabel);
	}

}
