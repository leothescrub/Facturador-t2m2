package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

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
	   
	    

		@Override
		public void actionPerformed(ActionEvent e) {
			
			ClasePrincipal q = new ClasePrincipal();
			
			 if(this.cha.equals("BusInve")){
				 	Session session = Mysql.getSession();
					String hql = "from Producto";
					Query query = session.createQuery(hql);
					List results = query.list();
					for (int i=0;i<results.size();i++){
						System.out.println("Nombre"+i+":"+ results.get(i));
					}
					displayResult(results);
				}
			 
			 if(this.cha.equals("SALIR")){
					
				 q.Invet.setVisible(false);
				 
				 
				}
			 
			
		}	
	    
	    
}
