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


import com.Facturador.controlador.ControlVentanaPrincipal;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame { //Se crea la clase ventana principal
	private JPanel PanePrincipal;
	private JMenuItem mntmNewMenuItem;
	private JTextField textEncarCompra;
	private JTextField textFechCompr;
	private JTextField textIdProvCompra;
	private JTextField textNomCompra;
	private JTextField textRifCompra;
	private JTextField textEmpreCompra;
	private JTextField textIdProduCompra;
	private JTextField textDescriCompra;
	private JTextField textPresioCompra;
	private JTextField textCantiCompra;
	private JTable table;
	private JTextField textEncarVenta;
	private JTextField textFechVenta;
	private JTextField textCeduVenta;
	private JTextField textNombVenta;
	private JTextField textTlfVenta;
	private JTextField textDireccVenta;
	private JTextField textIdProVenta;
	private JTextField textDirecVenta;
	private JTextField textPrecVenta;
	private JTextField textCantVenta;
    private JTable tableVenta;
	public static  JPanel paneVenta;
	public static JPanel paneCompra; // se coloca como public static para poder ser modificado desde cualquier clase
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/com/Facturador/images/cash4.png")));
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
		
		JMenuItem itenCompra = new JMenuItem("Compra");
		itenCompra.addActionListener(new ControlVentanaPrincipal(this, "ItenCompra"));
		mnNewMenu_1.add(itenCompra);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Venta");
		mntmNewMenuItem_4.addActionListener(new ControlVentanaPrincipal(this, "ItemVenta"));
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
		PanePrincipal = new JPanel();
		PanePrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanePrincipal);
		PanePrincipal.setLayout(null);
		
		paneCompra = new JPanel();
		paneCompra.setVisible(false);
		paneCompra.setBounds(0, 0, 794, 535);
		PanePrincipal.add(paneCompra);
		paneCompra.setLayout(null);
		
		JLabel lblEncargado = new JLabel("Encargado:");
		lblEncargado.setBounds(210, 69, 68, 14);
		paneCompra.add(lblEncargado);
		
		textEncarCompra = new JTextField();
		textEncarCompra.setEditable(false);
		textEncarCompra.setBounds(278, 67, 119, 17);
		paneCompra.add(textEncarCompra);
		textEncarCompra.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(436, 69, 36, 14);
		paneCompra.add(lblFecha);
		
		textFechCompr = new JTextField();
		textFechCompr.setEditable(false);
		textFechCompr.setColumns(10);
		textFechCompr.setBounds(482, 66, 74, 17);
		paneCompra.add(textFechCompr);
		
		JLabel lblIdDeProveedor = new JLabel("Id de proveedor:");
		lblIdDeProveedor.setBounds(181, 152, 90, 14);
		paneCompra.add(lblIdDeProveedor);
		
		textIdProvCompra = new JTextField();
		textIdProvCompra.setColumns(10);
		textIdProvCompra.setBounds(278, 149, 74, 17);
		paneCompra.add(textIdProvCompra);
		
		JLabel lblDatosDelProveedor = new JLabel("DATOS DEL PROVEEDOR");
		lblDatosDelProveedor.setFont(new Font("Vijaya", Font.PLAIN, 18));
		lblDatosDelProveedor.setBounds(301, 114, 175, 14);
		paneCompra.add(lblDatosDelProveedor);
		
		JLabel lblNombreYApellido = new JLabel("Nombre y Apellido:");
		lblNombreYApellido.setBounds(380, 152, 90, 14);
		paneCompra.add(lblNombreYApellido);
		
		textNomCompra = new JTextField();
		textNomCompra.setEditable(false);
		textNomCompra.setColumns(10);
		textNomCompra.setBounds(488, 149, 119, 17);
		paneCompra.add(textNomCompra);
		
		JLabel lblRift = new JLabel("Rif:");
		lblRift.setBounds(245, 192, 46, 14);
		paneCompra.add(lblRift);
		
		textRifCompra = new JTextField();
		textRifCompra.setEditable(false);
		textRifCompra.setColumns(10);
		textRifCompra.setBounds(278, 189, 74, 17);
		paneCompra.add(textRifCompra);
		
		JLabel lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setBounds(380, 192, 46, 14);
		paneCompra.add(lblEmpresa);
		
		textEmpreCompra = new JTextField();
		textEmpreCompra.setEditable(false);
		textEmpreCompra.setColumns(10);
		textEmpreCompra.setBounds(436, 189, 90, 17);
		paneCompra.add(textEmpreCompra);
		
		JLabel lblDatosDelProducto = new JLabel("DATOS DEL PRODUCTO");
		lblDatosDelProducto.setFont(new Font("Vijaya", Font.PLAIN, 18));
		lblDatosDelProducto.setBounds(310, 230, 162, 14);
		paneCompra.add(lblDatosDelProducto);
		
		JLabel lblIdDeProducto = new JLabel("Id de producto:");
		lblIdDeProducto.setBounds(195, 258, 90, 14);
		paneCompra.add(lblIdDeProducto);
		
		textIdProduCompra = new JTextField();
		textIdProduCompra.setColumns(10);
		textIdProduCompra.setBounds(281, 255, 59, 17);
		paneCompra.add(textIdProduCompra);
		
		JLabel lblDescriccion = new JLabel("Descriccion:");
		lblDescriccion.setBounds(350, 258, 76, 14);
		paneCompra.add(lblDescriccion);
		
		textDescriCompra = new JTextField();
		textDescriCompra.setEditable(false);
		textDescriCompra.setColumns(10);
		textDescriCompra.setBounds(416, 255, 59, 17);
		paneCompra.add(textDescriCompra);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(485, 258, 46, 14);
		paneCompra.add(lblPrecio);
		
		textPresioCompra = new JTextField();
		textPresioCompra.setEditable(false);
		textPresioCompra.setColumns(10);
		textPresioCompra.setBounds(527, 255, 59, 17);
		paneCompra.add(textPresioCompra);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(245, 297, 65, 14);
		paneCompra.add(lblCantidad);
		
		textCantiCompra = new JTextField();
		textCantiCompra.setColumns(10);
		textCantiCompra.setBounds(308, 295, 59, 17);
		paneCompra.add(textCantiCompra);
		
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
		paneCompra.add(table);
		
		JButton btnFacturarCompra = new JButton("Facturar");
		btnFacturarCompra.setBounds(482, 487, 89, 23);
		paneCompra.add(btnFacturarCompra);
		
		JButton btnCancelarCompra = new JButton("Cancelar");
		btnCancelarCompra.addActionListener(new ControlVentanaPrincipal(this, "btnCancelarCompra"));
		btnCancelarCompra.setBounds(220, 487, 89, 23);
		paneCompra.add(btnCancelarCompra);
		
		JButton btnCargarCompra = new JButton("Cargar Compra");
		btnCargarCompra.setBounds(411, 293, 130, 23);
		paneCompra.add(btnCargarCompra);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(226, 0, 300, 60);
		paneCompra.add(label_1);
		label_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/compra0.png")));
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondd.png")));
		label.setBounds(0, 0, 794, 535);
		paneCompra.add(label);
		
		paneVenta = new JPanel();
		paneVenta.setVisible(false);
		paneVenta.setBounds(0, 0, 794, 545);
		PanePrincipal.add(paneVenta);
		paneVenta.setLayout(null);
		
		JLabel label_2 = new JLabel("Encargado:");
		label_2.setBounds(229, 64, 68, 14);
		paneVenta.add(label_2);
		
		textEncarVenta = new JTextField();
		textEncarVenta.setEditable(false);
		textEncarVenta.setColumns(10);
		textEncarVenta.setBounds(297, 62, 119, 17);
		paneVenta.add(textEncarVenta);
		
		JLabel label_3 = new JLabel("Fecha:");
		label_3.setBounds(455, 64, 36, 14);
		paneVenta.add(label_3);
		
		textFechVenta = new JTextField();
		textFechVenta.setEditable(false);
		textFechVenta.setColumns(10);
		textFechVenta.setBounds(501, 61, 74, 17);
		paneVenta.add(textFechVenta);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(200, 147, 90, 14);
		paneVenta.add(lblCedula);
		
		textCeduVenta = new JTextField();
		textCeduVenta.setColumns(10);
		textCeduVenta.setBounds(252, 144, 99, 17);
		paneVenta.add(textCeduVenta);
		
		JLabel lblDatosDelCliente = new JLabel("DATOS DEL CLIENTE");
		lblDatosDelCliente.setFont(new Font("Vijaya", Font.PLAIN, 18));
		lblDatosDelCliente.setBounds(355, 106, 152, 14);
		paneVenta.add(lblDatosDelCliente);
		
		JLabel label_6 = new JLabel("Nombre y Apellido:");
		label_6.setBounds(399, 147, 90, 14);
		paneVenta.add(label_6);
		
		textNombVenta = new JTextField();
		textNombVenta.setEditable(false);
		textNombVenta.setColumns(10);
		textNombVenta.setBounds(507, 144, 119, 17);
		paneVenta.add(textNombVenta);
		
		JLabel lblTlf = new JLabel("Tlf:");
		lblTlf.setBounds(200, 188, 46, 14);
		paneVenta.add(lblTlf);
		
		textTlfVenta = new JTextField();
		textTlfVenta.setEditable(false);
		textTlfVenta.setColumns(10);
		textTlfVenta.setBounds(233, 185, 74, 17);
		paneVenta.add(textTlfVenta);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(336, 188, 59, 14);
		paneVenta.add(lblDireccion);
		
		textDireccVenta = new JTextField();
		textDireccVenta.setEditable(false);
		textDireccVenta.setColumns(10);
		textDireccVenta.setBounds(394, 186, 232, 17);
		paneVenta.add(textDireccVenta);
		
		JLabel label_9 = new JLabel("DATOS DEL PRODUCTO");
		label_9.setFont(new Font("Vijaya", Font.PLAIN, 18));
		label_9.setBounds(345, 225, 162, 14);
		paneVenta.add(label_9);
		
		JLabel label_10 = new JLabel("Id de producto:");
		label_10.setBounds(214, 253, 90, 14);
		paneVenta.add(label_10);
		
		textIdProVenta = new JTextField();
		textIdProVenta.setColumns(10);
		textIdProVenta.setBounds(300, 250, 59, 17);
		paneVenta.add(textIdProVenta);
		
		JLabel label_11 = new JLabel("Descriccion:");
		label_11.setBounds(369, 253, 76, 14);
		paneVenta.add(label_11);
		
		textDirecVenta = new JTextField();
		textDirecVenta.setEditable(false);
		textDirecVenta.setColumns(10);
		textDirecVenta.setBounds(435, 250, 59, 17);
		paneVenta.add(textDirecVenta);
		
		JLabel label_12 = new JLabel("Precio:");
		label_12.setBounds(504, 253, 46, 14);
		paneVenta.add(label_12);
		
		textPrecVenta = new JTextField();
		textPrecVenta.setEditable(false);
		textPrecVenta.setColumns(10);
		textPrecVenta.setBounds(546, 250, 59, 17);
		paneVenta.add(textPrecVenta);
		
		JLabel label_13 = new JLabel("Cantidad:");
		label_13.setBounds(264, 292, 65, 14);
		paneVenta.add(label_13);
		
		textCantVenta = new JTextField();
		textCantVenta.setColumns(10);
		textCantVenta.setBounds(327, 290, 59, 17);
		paneVenta.add(textCantVenta);
		
		tableVenta = new JTable();
		tableVenta.setSurrendersFocusOnKeystroke(true);
		tableVenta.setBounds(200, 348, 426, 123);
		paneVenta.add(tableVenta);
		
		JButton butFactVenta = new JButton("Facturar");
		butFactVenta.setBounds(501, 482, 89, 23);
		paneVenta.add(butFactVenta);
		
		JButton butCancVenta = new JButton("Cancelar");
		butCancVenta.addActionListener(new ControlVentanaPrincipal(this, "butCancVenta"));
		butCancVenta.setBounds(239, 482, 89, 23);
		paneVenta.add(butCancVenta);
		
		JButton butCargarVenta = new JButton("Cargar Venta");
		butCargarVenta.setBounds(430, 288, 130, 23);
		paneVenta.add(butCargarVenta);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/VENTA.png")));
		lblNewLabel_1.setBounds(264, 0, 238, 62);
		paneVenta.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondd.png")));
		lblNewLabel.setBounds(0, 0, 794, 534);
		paneVenta.add(lblNewLabel);
		JLabel lblFondo = new JLabel(""); //Fondo de Ventana principal
		lblFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondo.png")));
		lblFondo.setBounds(0, -115, 1018, 707);
		PanePrincipal.add(lblFondo);
	}
}
