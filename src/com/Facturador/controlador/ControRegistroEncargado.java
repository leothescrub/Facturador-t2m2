package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Facturador.vista.RegistroDeEncargado;

public class ControRegistroEncargado implements ActionListener{
	private  RegistroDeEncargado escu; 
	private String cha;
	
	    public ControRegistroEncargado(RegistroDeEncargado escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }

		public void actionPerformed(ActionEvent e) {
			ClasePrincipal q = new ClasePrincipal();

			
			if(this.cha.equals("CanceEncar")){
				q.encar.setVisible(false);
				q.encar.textApeEncargado.setText("");
				q.encar.textNomEncargado.setText("");
				q.encar.textPass.setText("");
				q.encar.textUser.setText("");
				
			}	
			
			if(this.cha.equals("GuardRegis")){
				
			}	
		
			
		}
	    
	    
}
