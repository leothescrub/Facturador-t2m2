package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Facturador.vista.RegistrarCliente;
import com.Facturador.vista.RegistrarProducto;

public class ControlRegistrarProducto implements ActionListener{

	private  RegistrarProducto escu; 
	private String cha;
	
	    public ControlRegistrarProducto(RegistrarProducto escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ClasePrincipal q = new ClasePrincipal();
			
			
			if(this.cha.equals("CanceProduc")){
				q.prudu.setVisible(false);
			
				q.prudu.textDescProd.setText("");
				q.prudu.textIdProd.setText("");
				q.prudu.textPreProd.setText("");
			}	

			if(this.cha.equals("GuarProduc")){
		
			
			
			}	
			
		}

	
}
