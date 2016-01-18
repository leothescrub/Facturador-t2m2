package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
					/*
					 * 
					 * Aqui pones la busquedaaaa
					 * 
					 */
				 
				 
				}
			 if(this.cha.equals("SALIR")){
					
				 q.Invet.setVisible(false);
				 
				 
				}
			 
			
		}	
	    
	    
}
