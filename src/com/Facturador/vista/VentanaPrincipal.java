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

public class VentanaPrincipal extends JFrame { //Se crea la clase ventana principal
	private JPanel contentPane;
	private JMenuItem mntmNewMenuItem;
	public VentanaPrincipal() {
		setTitle("Facturador A.R.R.E.C.H.O"); //Se crea el objeto
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(Color.CYAN);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Registro");
		mnNewMenu.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/Icono_Registro333.png")));
		mnNewMenu.setForeground(Color.RED);
		mnNewMenu.setFont(new Font("Goudy Old Style", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Registrar Encargado");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Registar Cliente");
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
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnOpcionesDeAdministrador.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnOpcionesDeAdministrador.add(mntmNewMenuItem_6);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/carrito-de-compra.gif")));
		lblNewLabel.setBounds(230, 104, 372, 276);
		contentPane.add(lblNewLabel);
		//sapoooooooooooooooooooooo  jhj
		JLabel lblFondo = new JLabel(""); //Fondo de Ventana principal
		lblFondo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/com/Facturador/images/fondo-degradado.jpg")));
		lblFondo.setBounds(0, 0, 1008, 693);
		contentPane.add(lblFondo);
	}
}
