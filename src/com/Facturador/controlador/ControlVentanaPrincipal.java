package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Facturador.vista.VentanaPrincipal;

public class ControlVentanaPrincipal implements ActionListener {//se implementa el tipo de ventos que controlara esta clase luego se presiona en el bombillo se seleciona implementar metos inerentes
	private  VentanaPrincipal escu; //see creea un objeto vacio de la clase ventanaprincipal
	private String cha;
	
	    public ControlVentanaPrincipal(VentanaPrincipal escu, String cha) {//see creaa un constructor "escu" el cual recivira los datos de la clase 
	    																	// el "cha" resive la uvicacion del evento
	        this.escu = escu; // Con esto se maneja el objeto de forma global en
	                          // esta clase.
	        this.cha=cha;    //se tranfieren los datos a variables globales 
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			ClasePrincipal q = new ClasePrincipal();//se instancia la claseprincipal
			
			
			
			if(this.cha.equals("ItenCompra"))//se compara el texto que entro por el constructor esto da la ubicacion del evento
			{
			q.VentPrin.paneCompra.setVisible(true); // atraves del objeto "q" se llama el objeto "VentPrin" para poder acceder a paneCompra
			}										//por que hacerlo asi por que es mejor modificar una vista desde el mismo objeto de lo contrario arroja problemas 
			
			if(this.cha.equals("BotCancCompra"))
			{
			q.VentPrin.paneCompra.setVisible(false);
			}
			
			if(this.cha.equals("ItenVenta"))
			{
			q.VentPrin.paneVenta.setVisible(true);
			}
			
		}

}