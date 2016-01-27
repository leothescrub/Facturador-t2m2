package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Facturador.modelo.Mysql;
import com.Facturador.modelo.Producto;
import com.Facturador.vista.Inventario;
import com.Facturador.vista.RegistrarCliente;

public class ControlInventario implements ActionListener{
	private  Inventario escu; 
	private String cha;
	
	
	    public ControlInventario(Inventario escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }
	   
	    public void query(){
	    	ClasePrincipal q = new ClasePrincipal();
	    	if(q.Invet.texDescrBus.getText().equals("")){
	    		JOptionPane.showMessageDialog(null, "No has ingresado nada...");
	    	}else{
	    		Session session = Mysql.getSession();
	    		String hql = "FROM Producto E WHERE E.nombre = :descr";
	    		Query query = session.createQuery(hql);
	    		query.setParameter("descr", q.Invet.texDescrBus.getText());
				List results = query.list();
				Producto producto = new Producto();
				if (results.size()==0){
		    		JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias");
				}else{
					q.Invet.clearTable();
					for (int i=0;i<results.size();i++){
						producto = (Producto)results.get(i);
						int id = producto.getIdproducto();
						String nombre = producto.getNombre();
						BigDecimal Precio = producto.getPrecio();
						int stock = producto.getStock();
						String ID = Integer.toString(id);
						String STOCK = Integer.toString(stock);
						String prov = "lol";
						String[] ayy = {ID, nombre, Precio.toString(), STOCK, prov};
						q.Invet.modelo.addRow(ayy);
					}
					session.close();
				}
	    	}
	    }
	    

		@Override
		public void actionPerformed(ActionEvent e) {
			
			ClasePrincipal q = new ClasePrincipal();
			
			 if(this.cha.equals("BusInve")){ 
					query();
				}
			 
			 if(this.cha.equals("SALIR")){
					
				 q.Invet.setVisible(false);
				 
				 
				}
			
		}	
	    
	    
}
