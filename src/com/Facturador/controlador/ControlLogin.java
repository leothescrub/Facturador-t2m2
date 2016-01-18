package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Facturador.vista.Login;
import com.Facturador.vista.RegistrarCliente;

public class ControlLogin implements ActionListener{
	private  Login escu; 
	private String cha;
	
	
	    public ControlLogin(Login escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }


		@Override
		public void actionPerformed(ActionEvent e) {
			
			ClasePrincipal q = new ClasePrincipal();
			
			if(this.cha.equals("Buscar")){
				
				if(q.Log.textPass.getText().equals("admin") & q.Log.textUser.getText().equals("admin")){
					q.Log.setVisible(false);
					q.VentPrin.setVisible(true);
					
				}
				else{
					System.out.println("usuario y contraseña incorrecto");
					System.out.println("usuario= admin");
					System.out.println("contraseña= admin");
				}
				
			}	
		}
	    
	    
	    
}
