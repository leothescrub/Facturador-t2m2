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
import com.Facturador.modelo.Proveedor;

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
import java.math.BigDecimal;
import java.util.List;
import java.awt.event.ActionEvent;

public class Inventario extends JFrame {

	private JPanel contentPane;
	private JTable productosJtable;
	public JTextField texDescrBus;
	
	String[][]matriz={};
	String[]vector={"ID", "Descripción", "Precio", "Stock", "Proveedor"};
	public DefaultTableModel modelo = new DefaultTableModel(matriz,vector){
		@Override
		public boolean isCellEditable(int row, int column){
			return column ==0 || column==1 || column==2;
			
		}
	};
	
	public void getBase(){
    	Inventario inv = new Inventario();
		Session session = Mysql.getSession();
		String hql = "FROM Producto";
		Query query = session.createQuery(hql);
		List results = query.list();
		Producto producto = new Producto();
		for (int i=0;i<results.size();i++){
			producto = (Producto)results.get(i);
			int idproducto = producto.getIdproducto();
			String Nombre = producto.getNombre();
			BigDecimal Precio = producto.getPrecio();
			int Stock = producto.getStock();
			Proveedor Proveedor = producto.getProveedor();
			String id = Integer.toString(idproducto);
			String stk = Integer.toString(Stock);
			String prov = "lol"; //Proveedor está como objeto, mientras se solventa esto... 'lol'
			String[] ayy = {id, Nombre, Precio.toString(), stk, prov};
			modelo.addRow(new Object[]{id, Nombre, Precio.toString(), stk, prov});
			
		}
		session.close(); 
	}
	
	public void clearTable(){
		int rowCount = modelo.getRowCount();
		for (int i=rowCount-1;i>=0;i--){
			modelo.removeRow(i);
		}
	}
	
	public Inventario() {
		setTitle("INVENTARIO");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 744, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel head = new JLabel("");
		head.setIcon(new ImageIcon(Inventario.class.getResource("/com/Facturador/images/head_inv.png")));
		head.setBounds(207, 11, 266, 106);
		contentPane.add(head);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 221, 636, 234);
		contentPane.add(scrollPane);
		
		
		productosJtable = new JTable();
		productosJtable.setModel(modelo);
		scrollPane.setViewportView(productosJtable);
		
		JLabel lblIdproducto = new JLabel("Descripci\u00F3n:");
		lblIdproducto.setForeground(Color.LIGHT_GRAY);
		lblIdproducto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIdproducto.setBounds(335, 175, 110, 20);
		contentPane.add(lblIdproducto);
		
		texDescrBus = new JTextField();
		RestrictedTextField restriDes = new RestrictedTextField(texDescrBus);
		restriDes.setOnlyText(false);
		restriDes.setLimit(20);
		restriDes.setAcceptSpace(true);
		texDescrBus.setBounds(437, 178, 86, 20);
		contentPane.add(texDescrBus);
		texDescrBus.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ControlInventario(this, "BusInve"));
		
		JButton btnNewButton = new JButton("SALIR");
		btnNewButton.addActionListener(new ControlInventario(this, "SALIR"));
		btnNewButton.setBounds(583, 455, 89, 51);
		contentPane.add(btnNewButton);
		btnBuscar.setBounds(546, 177, 89, 23);
		contentPane.add(btnBuscar);
		
		JLabel background2 = new JLabel("");
		background2.setIcon(new ImageIcon(Inventario.class.getResource("/com/Facturador/images/8851BB494.jpg")));
		background2.setBounds(0, 0, 901, 517);
		contentPane.add(background2);
	}
}
