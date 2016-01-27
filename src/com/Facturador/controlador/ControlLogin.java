package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Query;
import org.hibernate.Session;
import com.Facturador.modelo.Mysql;
import com.Facturador.vista.Login;

public class ControlLogin implements ActionListener{
	private  Login escu; 
	private String cha;
	
	ClasePrincipal q = new ClasePrincipal();
	public void Login(){
		JOptionPane.showMessageDialog(escu, "Si es tu primera vez usando el programa, debes saber que las cuentas estan guardadas en la entidad 'Encargado' de la BD");
		//En otras palabras, registra un usuario/contraseña de forma manual por PHPMyAdmin
		if(q.Log.textUser.getText().equals("")||q.Log.textPass.getText().equals("")){
			JOptionPane.showMessageDialog(escu, "Tienes campos vacios", "Imposible iniciar sesión", JOptionPane.ERROR_MESSAGE);
		}else{
			Session session = Mysql.getSession();
			String hql = "FROM Encargado E WHERE E.username = :Usr";
			Query query = session.createQuery(hql);
			query.setParameter("Usr", q.Log.textUser.getText());
			List results = query.list();
			System.out.println(results.size());
			if(results.size()==1){
				String pass = q.Log.textPass.getText();
				hql = "FROM Encargado E WHERE E.pass = :Pass";
				query = session.createQuery(hql);
				query.setParameter("Pass", q.Log.textPass.getText());
				results = query.list();
				System.out.println(results.size());
				if (results.size()==1){
					JOptionPane.showMessageDialog(escu, "Bienvenido "+q.Log.textUser.getText(), "Datos correctos", JOptionPane.DEFAULT_OPTION);
					q.Log.setVisible(false);
					q.VentPrin.setVisible(true);
				}else{
					JOptionPane.showMessageDialog(escu, "Verifique su contraseña e intente de nuevo", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
				}
			}else{
				JOptionPane.showMessageDialog(escu, "No existe ese usuario en el registro", "Datos incorrectos", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	    public ControlLogin(Login escu, String cha) { 
	    																	
	        this.escu = escu; 
	                          
	        this.cha=cha;    
	    }


		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			
			if(this.cha.equals("Buscar")){
				Login();
			}	
		}
	    
	    
	    
}
