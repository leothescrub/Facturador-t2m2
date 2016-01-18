package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.Facturador.vista.RegistrarCliente;
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
			if(this.cha.equals("GuardCliente")){ //No esta funcionando, revisar porque.
				
				if (q.clien.textClienApellido.getText().equals("")||q.clien.textClienCedu.getText().equals("")||q.clien.textClienDirec.getText().equals("")||q.clien.textClienNombre.getText().equals("")||q.clien.textClienTelf.getText().equals("")){
					JOptionPane.showMessageDialog(escu, "No puedes dejar espacios vacios", "Error", JOptionPane.ERROR_MESSAGE); //Agregada verificación
				}
				else{
					System.out.println("Comenzó el parseo");
					String temp = q.clien.textClienCedu.getText();
					int temp_cedu = Integer.parseInt(temp);
					String temp_nombre = q.clien.textClienNombre.getText();
					String temp_telf = q.clien.textClienTelf.getText(); //////////////HEYYYYYYYYYY. Hay que pasar el telefono a String.
					int temp_tel = Integer.parseInt(temp_telf);
					String temp_dir = q.clien.textClienDirec.getText();//Parseo de todas las variables a objeto, si conoces una forma mas rapida de hacerla implementala
					System.out.println("Lo parseo todo, comienza la vaina");
					Cliente cliente = new Cliente(temp_cedu, temp_nombre, temp_tel, temp_dir); //Instancia al nuevo cliente, con su cedula, nombre, telefono y dirección
					System.out.println("Instanceo");
					try{
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
						JOptionPane.showMessageDialog(escu, "El cliente fue registrado de forma exitosa", "Exito", JOptionPane.DEFAULT_OPTION);
					} //Las excepciones se explican solas con sus showMessageDialog
					catch(org.hibernate.exception.ConstraintViolationException lel){ 
						JOptionPane.showMessageDialog(escu, "Un cliente con la misma cedula ya habia sido registrado anteriormente", "Error", JOptionPane.ERROR_MESSAGE);
					}
					catch(org.hibernate.service.spi.ServiceException lel){
						JOptionPane.showMessageDialog(escu, "No se pudo establecer una conexión con la base de datos, verifiquelo e intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
					}
					catch(Exception lel){
						JOptionPane.showMessageDialog(escu, "Ha ocurrido un error no controlado: "+lel+"\nContacta a los desarrolladores", "Error", JOptionPane.ERROR_MESSAGE); 
					}
					finally{
						q.clien.textClienApellido.setText("");
						q.clien.textClienCedu.setText("");
						q.clien.textClienDirec.setText("");
						q.clien.textClienNombre.setText("");
						q.clien.textClienTelf.setText("");
					}
					
					
				}
			}	
			
			
			
		}
	    
	    
	
}
