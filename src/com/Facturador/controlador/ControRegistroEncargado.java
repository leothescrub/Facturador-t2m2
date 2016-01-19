package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Facturador.modelo.Encargado;
import com.Facturador.modelo.Mysql;
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
				q.encar.textCeduEncar.setText("");
				
			}	
			
			if(this.cha.equals("GuardRegis")){
				if(q.encar.textApeEncargado.getText().equals("")||q.encar.textNomEncargado.getText().equals("")||q.encar.textUser.getText().equals("")||q.encar.textCeduEncar.getText().equals("")||q.encar.textPass.getText().equals("")){
					JOptionPane.showMessageDialog(escu, "No puedes dejar espacios vacios", "Error", JOptionPane.ERROR_MESSAGE); 
				}
				else{
					System.out.println("Comenzó el parseo");
					String Nombre = q.encar.textNomEncargado.getText() +" "+ q.encar.textApeEncargado.getText();
					String User = q.encar.textUser.getText();
					String Pass = q.encar.textPass.getText();
					int Ced_id = Integer.parseInt(q.encar.textCeduEncar.getText()); 
					System.out.println("Lo parseo todo, comienza la vaina");
					Encargado encargado = new Encargado(Ced_id,Nombre,User,Pass);
					System.out.println("Instanceo");
					try{
						Session session = Mysql.getSession();  
						System.out.println("Creo la sesion");
						Transaction tx = session.beginTransaction(); 
						System.out.println("Creo la transacción");
						
						session.save(encargado); 
						System.out.println("Salvo a cliente");
						
						tx.commit();
						System.out.println("Hizo commit en la transaccion");
						
						session.close(); 
						System.out.println("Cerro la sesion y todo terminó bien");
						JOptionPane.showMessageDialog(escu, "El usuario fue registrado de forma exitosa", "Exito", JOptionPane.DEFAULT_OPTION);
					} //Las excepciones se explican solas con sus showMessageDialog
					catch(org.hibernate.exception.ConstraintViolationException lel){ 
						JOptionPane.showMessageDialog(escu, "Un usuario con la misma cedula ya habia sido registrado anteriormente", "Error", JOptionPane.ERROR_MESSAGE);
					}
					catch(org.hibernate.service.spi.ServiceException lel){
						JOptionPane.showMessageDialog(escu, "No se pudo establecer una conexión con la base de datos, verifiquelo e intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
					}
					catch(Exception lel){
						JOptionPane.showMessageDialog(escu, "Ha ocurrido un error no controlado: "+lel+"\nContacta a los desarrolladores", "Error", JOptionPane.ERROR_MESSAGE); 
					}
					finally{
						q.encar.textApeEncargado.setText("");
						q.encar.textNomEncargado.setText("");
						q.encar.textPass.setText("");
						q.encar.textUser.setText("");
						q.encar.textCeduEncar.setText("");
					}
				}
			}	
		
			
		}
	    
	    
}
