package com.Facturador.vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends JFrame { //Se crea la clase ventana principal
	private JPanel contentPane;
	private JMenuItem mntmNewMenuItem;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table;
	public VentanaPrincipal() {
		setResizable(false);
		setTitle("Facturador A.R.R.E.C.H.O"); //Se crea el objeto
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.CYAN);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registro");
		mnNewMenu.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/Icono_Registro333.png")));
		mnNewMenu.setForeground(Color.RED);
		mnNewMenu.setFont(new Font("Goudy Old Style", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmRegistrarProbedor = new JMenuItem("Registrar proveedor");
		mnNewMenu.add(mntmRegistrarProbedor);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registrar Cliente");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Registrar producto");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("Operaciones");
		mnNewMenu_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/Operaciones-icono22.png")));
		mnNewMenu_1.setForeground(Color.RED);
		mnNewMenu_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 14));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Compra");
		mnNewMenu_1.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Venta");
		mnNewMenu_1.add(mntmNewMenuItem_4);
		
		JMenuItem mntmInventario = new JMenuItem("Inventario");
		mnNewMenu_1.add(mntmInventario);
		
		JMenu mnOpcionesDeAdministrador = new JMenu("Opciones de administrador");
		mnOpcionesDeAdministrador.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/avatar2.png")));
		mnOpcionesDeAdministrador.setForeground(Color.RED);
		mnOpcionesDeAdministrador.setFont(new Font("Goudy Old Style", Font.PLAIN, 14));
		menuBar.add(mnOpcionesDeAdministrador);
		
		mntmNewMenuItem = new JMenuItem("Registrar Encargado");
		mnOpcionesDeAdministrador.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnOpcionesDeAdministrador.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnOpcionesDeAdministrador.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBounds(0, 0, 794, 535);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEncargado = new JLabel("Encargado:");
		lblEncargado.setBounds(210, 69, 68, 14);
		panel.add(lblEncargado);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(278, 67, 119, 17);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(436, 69, 36, 14);
		panel.add(lblFecha);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(482, 66, 74, 17);
		panel.add(textField_1);
		
		JLabel lblIdDeProveedor = new JLabel("Id de proveedor:");
		lblIdDeProveedor.setBounds(181, 152, 90, 14);
		panel.add(lblIdDeProveedor);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(278, 149, 74, 17);
		panel.add(textField_2);
		
		JLabel lblDatosDelProveedor = new JLabel("DATOS DEL PROVEEDOR");
		lblDatosDelProveedor.setFont(new Font("Vijaya", Font.PLAIN, 18));
		lblDatosDelProveedor.setBounds(301, 114, 175, 14);
		panel.add(lblDatosDelProveedor);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido:");
		lblNombreYApellido.setBounds(380, 152, 90, 14);
		panel.add(lblNombreYApellido);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(488, 149, 119, 17);
		panel.add(textField_3);
		
		JLabel lblRift = new JLabel("Rif:");
		lblRift.setBounds(245, 192, 46, 14);
		panel.add(lblRift);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(278, 189, 74, 17);
		panel.add(textField_4);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(380, 192, 46, 14);
		panel.add(lblEmpresa);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(436, 189, 90, 17);
		panel.add(textField_5);
		
		JLabel lblDatosDelProducto = new JLabel("DATOS DEL PRODUCTO");
		lblDatosDelProducto.setFont(new Font("Vijaya", Font.PLAIN, 18));
		lblDatosDelProducto.setBounds(310, 230, 162, 14);
		panel.add(lblDatosDelProducto);
		
		JLabel lblIdDeProducto = new JLabel("Id de producto:");
		lblIdDeProducto.setBounds(195, 258, 90, 14);
		panel.add(lblIdDeProducto);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(281, 255, 59, 17);
		panel.add(textField_6);
		
		JLabel lblDescriccion = new JLabel("Descriccion:");
		lblDescriccion.setBounds(350, 258, 76, 14);
		panel.add(lblDescriccion);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(416, 255, 59, 17);
		panel.add(textField_7);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(485, 258, 46, 14);
		panel.add(lblPrecio);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(527, 255, 59, 17);
		panel.add(textField_8);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(245, 297, 65, 14);
		panel.add(lblCantidad);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(308, 295, 59, 17);
		panel.add(textField_9);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Id", "Descriccion", "Cantidad", "Precio", "Total"
			}
		));
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setMinWidth(17);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.setBounds(181, 353, 426, 123);
		panel.add(table);
		
		JButton btnNewButton = new JButton("Facturar");
		btnNewButton.setBounds(482, 487, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(220, 487, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cargar Compra");
		btnNewButton_2.setBounds(411, 293, 130, 23);
		panel.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondd.png")));
		label.setBounds(0, 0, 794, 535);
		panel.add(label);
		//sapoooooooooooooooooooooo  jhj
		JLabel lblFondo = new JLabel(""); //Fondo de Ventana principal
		lblFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondo.png")));
		lblFondo.setBounds(0, -115, 1018, 707);
		contentPane.add(lblFondo);
	}
}
