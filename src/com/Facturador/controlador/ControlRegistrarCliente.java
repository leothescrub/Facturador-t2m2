package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.Facturador.vista.RegistrarCliente;
import com.Facturador.vista.RegistroDeEncargado;
import com.Facturador.modelo.Cliente;
import com.Facturador.modelo.Mysql;

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
				
				// se setea vacio a todos los campos por si estan llenos
				q.clien.textClienApellido.setText("");
				q.clien.textClienCedu.setText("");
				q.clien.textClienDirec.setText("");
				q.clien.textClienNombre.setText("");
				q.clien.textClienTelf.setText("");
				
			}	
			if(this.cha.equals("GuardCliente")){
				System.out.println("Comenzó el parseo");
				String temp = q.clien.textClienCedu.getText();
				int temp_cedu = Integer.parseInt(temp);
				String temp_nombre = q.clien.textClienNombre.getText();
				String temp_telf = q.clien.textClienTelf.getText();
				Integer temp_tel = Integer.parseInt(temp_telf);
				String temp_dir = q.clien.textClienDirec.getText();//Parseo de todas las variables a objeto, si conoces una forma mas rapida de hacerla implementala
				System.out.println("Lo parseo todo, comienza la vaina");
				
				Cliente cliente = new Cliente(temp_cedu, temp_nombre, temp_tel, temp_dir); //Instancia al nuevo cliente, con su cedula, nombre, telefono y dirección
				System.out.println("Instanceo");
				
				Session session = Mysql.getSession();  //Crea el objeto Session usando la funcion getSEssion de la clase Mysql
				System.out.println("Creo la sesion");
				
				Transaction tx = session.beginTransaction(); //Crea o comienza la transacción, similar a git init
				System.out.println("Creo la transacción");
				
				session.save(cliente); //Salva a cliente, similar a git add .
				System.out.println("Salvo a cliente");
				
				tx.commit(); // Hace commit a la nueva entrada, similar a git commit -m "xyz"
				System.out.println("Hizo commit en la transaccion");
				
				session.close(); //Cierra la sesión (Abre la puerta y luego la cierra)
				System.out.println("Cerro la sesion y todo terminó bien");
				//Se agregaron los System.out.println(arg0); a medida de comprobar que las cosas fuesen sucediendo, se removeran mas adelante
				//Eventualmente la idea es hacer esto con Try y Catch
			}	
			
			
			
		}
	    
	    
	
}
