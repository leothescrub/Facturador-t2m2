/**
 * @author Jorge - Antony
 * Creación de la clase principal, solo contiene un "Hola Mundo" por ahora.
 */

package com.Facturador.controlador;
import com.Facturador.vista.*;

public class ClasePrincipal  {
	
	public static RegistrarCliente clien = new RegistrarCliente();
	public static RegistrarProducto prudu = new RegistrarProducto();  //public static permite modificar el objeto desde cualquier clase
	public static RegistrarProveedor provee = new RegistrarProveedor();   //se instancia todas las vistas 
	public static RegistroDeEncargado encar = new RegistroDeEncargado(); //para que siempre se modifique la misma instancia
	public static VentanaPrincipal VentPrin = new VentanaPrincipal();    // desde cualquier parte de este paquete
	
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		
		VentPrin.setVisible(true); // se inicia la ventana principal
	}

}
