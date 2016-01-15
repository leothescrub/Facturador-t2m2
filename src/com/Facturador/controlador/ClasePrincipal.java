/**
 * @author Jorge - Antony
 * Creación de la clase principal, solo contiene un "Hola Mundo" por ahora.
 */

package com.Facturador.controlador;
import com.Facturador.vista.*;

public class ClasePrincipal  {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		VentanaPrincipal Inicio = new VentanaPrincipal(); //Se inicializa la ventana principal
		Inicio.setVisible(true); 
	}

}
