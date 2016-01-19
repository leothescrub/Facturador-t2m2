package com.Facturador.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.Facturador.controlador.ControlInventario;
import com.Facturador.controlador.ControlVentanaPrincipal;
import com.Facturador.modelo.Mysql;
import com.Facturador.modelo.Producto;

import Atxy2k.CustomTextField.RestrictedTextField;

import org.hibernate.Query;
import org.hibernate.Session;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTable productosJtable;
	private JTextField texDescrBus;
	
		
	
	public Inventario() {
		setTitle("INVENTARIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 104, 387, 234);
		contentPane.add(scrollPane);
		
		
		
		
		productosJtable = new JTable();
		productosJtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IdProducto", "Descriccion", "Cantidad", "Precio"
			}
		));
		scrollPane.setViewportView(productosJtable);
		
		JLabel lblIdproducto = new JLabel("Descriccion:");
		lblIdproducto.setBounds(25, 65, 75, 14);
		contentPane.add(lblIdproducto);
		
		texDescrBus = new JTextField();
		RestrictedTextField restriDes = new RestrictedTextField(texDescrBus);
		restriDes.setOnlyText(true);
		restriDes.setLimit(20);
		texDescrBus.setBounds(98, 62, 86, 20);
		contentPane.add(texDescrBus);
		texDescrBus.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ControlInventario(this, "BusInve"));
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ControlInventario(this, "SALIR"));
		btnNewButton.setBounds(335, 28, 89, 51);
		contentPane.add(btnNewButton);
		btnBuscar.setBounds(212, 61, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel lblInventario = new JLabel("INVENTARIO");
		lblInventario.setForeground(new Color(0, 0, 255));
		lblInventario.setFont(new Font("Palatino Linotype", Font.BOLD, 18));
		lblInventario.setBounds(159, 12, 134, 39);
		contentPane.add(lblInventario);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Inventario.class.getResource("/com/Facturador/images/Inventario3.png")));
		lblNewLabel.setBounds(108, 0, 338, 216);
		contentPane.add(lblNewLabel);
	}
}
