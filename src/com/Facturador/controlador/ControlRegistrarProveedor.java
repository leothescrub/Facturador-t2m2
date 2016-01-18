package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Facturador.vista.RegistrarProducto;
import com.Facturador.vista.RegistrarProveedor;
import com.Facturador.modelo.Mysql;
import com.Facturador.modelo.Proveedor;

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
			
			if (this.cha.equals("GuarProvee")){
				if(q.provee.textNomPro.getText().equals("")||q.provee.textApellPro.getText().equals("")||q.provee.textEmprPro.getText().equals("")||q.provee.textRifPro.getText().equals("")){
					JOptionPane.showMessageDialog(escu, "No puedes dejar espacios vacios", "Error", JOptionPane.ERROR_MESSAGE); 
				}
				else{
					System.out.println("Comenzó el parseo");
					String temp = q.provee.textNomPro.getText() + " " +q.provee.textApellPro.getText();
					String temp3 = q.provee.textEmprPro.getText();
					String temp4 = q.provee.textRifPro.getText();
					String telf = "04124526464"; //Hay que editar la ventana para agregar la opcion al proveedor a meter su numero
					System.out.println("Terminó el parseo, comienza la vaina");
					Proveedor proveedor = new Proveedor(temp4, temp, temp3, telf);
					System.out.println("Instanceó");
					try{
						Session session = Mysql.getSession();
						System.out.println("Creo la sesion");
						Transaction tx = session.beginTransaction();
						System.out.println("Creo la transacción");
						session.save(proveedor);
						System.out.println("Salvo a proveedor");
						tx.commit(); 
						System.out.println("Hizo commit en la transaccion");
						session.close();
						System.out.println("Cerro la sesion y todo terminó bien");
						JOptionPane.showMessageDialog(escu, "El proveedor fue registrado de forma exitosa", "Exito", JOptionPane.DEFAULT_OPTION);
					}catch(org.hibernate.exception.ConstraintViolationException lel){
						JOptionPane.showMessageDialog(escu, "Un proveedor con el mismo id/rif ya habia sido registrado anteriormente", "Error", JOptionPane.ERROR_MESSAGE);
					}catch(org.hibernate.service.spi.ServiceException lel){
						JOptionPane.showMessageDialog(escu, "No se pudo establecer una conexión con la base de datos, verifiquelo e intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
					}catch(Exception lel){
						JOptionPane.showMessageDialog(escu, "Ha ocurrido un error no controlado: "+lel+"\nContacta a los desarrolladores", "Error", JOptionPane.ERROR_MESSAGE); 
					}
					finally{
						q.provee.textApellPro.setText("");
						q.provee.textEmprPro.setText("");
						q.provee.textNomPro.setText("");
						q.provee.textRifPro.setText("");
					}
				}
			}
		}

	    
	
}
