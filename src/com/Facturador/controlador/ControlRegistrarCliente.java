package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Facturador.vista.RegistrarCliente;
import com.Facturador.vista.RegistroDeEncargado;

public class ControlRegistrarCliente implements ActionListener  {

	private  RegistrarCliente escu; 
	private String cha;
	
	    public ControlRegistrarCliente(RegistrarCliente escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }

		
		public void actionPerformed(ActionEvent e) {
		
			ClasePrincipal q = new ClasePrincipal();
			if(this.cha.equals("CancelCliente")){
				q.clien.setVisible(false);
				//q.VentPrin.setVisible(true);
				
				// se setea vacio atodos los campos por si estan llenos
				q.clien.textClienApellido.setText("");
				q.clien.textClienCedu.setText("");
				q.clien.textClienDirec.setText("");
				q.clien.textClienNombre.setText("");
				q.clien.textClienTelf.setText("");
			}	
			if(this.cha.equals("GuardCliente")){
				/*
				 * aca puede poner el codigo que quieras ya que se ejecutara cuando
				 * presionen el botton guardar
				 */
			}	
			
			
			
		}
	    
	    
	
}
