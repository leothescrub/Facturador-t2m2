package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.Facturador.controlador.ControlRegistrarProducto;
import com.Facturador.controlador.ControlVentanaPrincipal;

import Atxy2k.CustomTextField.RestrictedTextField;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarProducto extends JFrame {

	private JPanel contentPane;
	public static JTextField textDescProd;
	public static JTextField textPreProd;
	public static JTextField textIdProd;

	/**
	 * Launch the application.
	
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
 */
	/**
	 * Create the frame.
	 */
	public RegistrarProducto() {
		setTitle("REGISTRAR PRODUCTO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripci�n = new JLabel("DESCRIPCI\u00D3N:");
		lblDescripci�n.setForeground(new Color(0, 0, 128));
		lblDescripci�n.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		lblDescripci�n.setBounds(43, 84, 109, 14);
		contentPane.add(lblDescripci�n);
		
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
		RestrictedTextField restridesc = new RestrictedTextField(textDescProd);
		restridesc.setOnlyText(true);
		restridesc.setAcceptSpace(true);
		restridesc.setLimit(25);
		textDescProd.setColumns(10);
		textDescProd.setBounds(162, 83, 124, 20);
		contentPane.add(textDescProd);
		
		textPreProd = new JTextField();
		RestrictedTextField restriProd = new RestrictedTextField(textPreProd, "1234567890.,"); //El precio debe poder contener decimales
		restriProd.setOnlyCustomCharacters(true);
		restriProd.setLimit(8);
		textPreProd.setColumns(10);
		textPreProd.setBounds(162, 118, 124, 20);
		contentPane.add(textPreProd);
		
		textIdProd = new JTextField();
		RestrictedTextField restriId = new RestrictedTextField(textIdProd);
		restriId.setOnlyNums(true);
		restriId.setLimit(18);
		textIdProd.setColumns(10);
		textIdProd.setBounds(162, 157, 124, 20);
		contentPane.add(textIdProd);
		
		JButton butCancProd = new JButton("SALIR");
		butCancProd.addActionListener(new ControlRegistrarProducto(this, "CanceProduc"));
		butCancProd.setForeground(Color.RED);
		butCancProd.setFont(new Font("Baskerville Old Face", Font.PLAIN, 12));
		butCancProd.setBounds(51, 219, 101, 36);
		contentPane.add(butCancProd);
		
		JButton butGuarProd = new JButton("GUARDAR");
		butGuarProd.addActionListener(new ControlRegistrarProducto(this, "GuarProduc"));
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
