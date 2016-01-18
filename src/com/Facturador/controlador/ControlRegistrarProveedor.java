package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Facturador.vista.RegistrarProducto;
import com.Facturador.vista.RegistrarProveedor;

public class ControlRegistrarProveedor implements ActionListener{

	private  RegistrarProveedor escu; 
	private String cha;
	
	    public ControlRegistrarProveedor(RegistrarProveedor escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			ClasePrincipal q = new ClasePrincipal();
			if(this.cha.equals("CanceProvee")){
				q.provee.setVisible(false);
				
				q.provee.textApellPro.setText("");
				q.provee.textEmprPro.setText("");
				q.provee.textNomPro.setText("");
				q.provee.textRifPro.setText("");
				
			}	
		
		}

	    
	
}
