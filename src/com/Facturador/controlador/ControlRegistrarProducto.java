package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Facturador.modelo.Mysql;
import com.Facturador.modelo.Producto;
import com.Facturador.modelo.Proveedor;
import com.Facturador.vista.RegistrarCliente;
import com.Facturador.vista.RegistrarProducto;

public class ControlRegistrarProducto implements ActionListener{

	private  RegistrarProducto escu; 
	private String cha;
	
	    public ControlRegistrarProducto(RegistrarProducto escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }
	    
	    public void clearFields(){ //Creado para ahorrar codigo repetido
	    	ClasePrincipal.prudu.textDescProd.setText("");
	    	ClasePrincipal.prudu.textIdProd.setText("");
	    	ClasePrincipal.prudu.textPreProd.setText("");
	    }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			ClasePrincipal q = new ClasePrincipal();
			
			
			if(this.cha.equals("CanceProduc")){
				q.prudu.setVisible(false);
				clearFields();
				
			}	

			if(this.cha.equals("GuarProduc")){
				if(q.prudu.textIdProd.equals("")||q.prudu.textDescProd.equals("")||q.prudu.textPreProd.equals("")){
					JOptionPane.showMessageDialog(escu, "No puedes dejar espacios vacios", "Error", JOptionPane.ERROR_MESSAGE); 
				}
				else{
					System.out.println("Comenzó el parseo");
					String temp = q.prudu.textDescProd.getText();
					String temp3 = q.prudu.textIdProd.getText();
					int temp_id = Integer.parseInt(temp3);
					int inv = 0;
					BigDecimal temp_pre = new BigDecimal(q.prudu.textPreProd.getText());
					System.out.println("Terminó el parseo, comienza la vaina");
					Producto producto = new Producto(temp_id, temp, temp_pre, inv);
					System.out.println("Instanceó");
					try{
						Session session = Mysql.getSession();
						System.out.println("Creo la sesion");
						Transaction tx = session.beginTransaction();
						System.out.println("Creo la transacción");
						session.save(producto);
						System.out.println("Salvo a proveedor");
						tx.commit(); 
						System.out.println("Hizo commit en la transaccion");
						session.close();
						System.out.println("Cerro la sesion y todo terminó bien");
						JOptionPane.showMessageDialog(escu, "El producto fue registrado de forma exitosa", "Exito", JOptionPane.DEFAULT_OPTION);
					}catch(org.hibernate.exception.ConstraintViolationException lel){
						JOptionPane.showMessageDialog(escu, "Un producto con el mismo id ya habia sido registrado anteriormente", "Error", JOptionPane.ERROR_MESSAGE);
					}catch(org.hibernate.service.spi.ServiceException lel){
						JOptionPane.showMessageDialog(escu, "No se pudo establecer una conexión con la base de datos, verifiquelo e intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
					}catch(Exception lel){
						JOptionPane.showMessageDialog(escu, "Ha ocurrido un error no controlado: "+lel+"\nContacta a los desarrolladores", "Error", JOptionPane.ERROR_MESSAGE); 
					}
					finally{
						clearFields();
					}
				}
			}	
			
		}

	
}
