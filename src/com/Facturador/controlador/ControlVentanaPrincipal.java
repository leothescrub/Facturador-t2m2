package com.Facturador.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Facturador.vista.Inventario;
import com.Facturador.vista.VentanaPrincipal;
import com.Facturador.modelo.Cliente;
import com.Facturador.modelo.Mysql;
import com.Facturador.modelo.Producto;
import com.Facturador.modelo.Proveedor;

public class ControlVentanaPrincipal implements ActionListener {//se implementa el tipo de ventos que controlara esta clase luego se presiona en el bombillo se seleciona implementar metos inerentes
	private  VentanaPrincipal escu; //see creea un objeto vacio de la clase ventanaprincipal
	private String cha;
	
	    public ControlVentanaPrincipal(VentanaPrincipal escu, String cha) {//see creaa un constructor "escu" el cual recivira los datos de la clase 
	    																	// el "cha" resive la uvicacion del evento
	        this.escu = escu; // Con esto se maneja el objeto de forma global en
	                          // esta clase.
	        this.cha=cha;    //se tranfieren los datos a variables globales 
	    }
	    
	    public void queryClienteVenta(){
	    	ClasePrincipal q = new ClasePrincipal();
	    	if (q.VentPrin.textCeduVenta.getText().equals("")){
	    		JOptionPane.showMessageDialog(null, "Debes ingresar una cedula");
	    	}else{
	    		Session session = Mysql.getSession();
	    		String hql = "FROM Cliente E WHERE E.idCedula = :Ced";
	    		Query query = session.createQuery(hql);
	    		int cedula = Integer.parseInt(q.VentPrin.textCeduVenta.getText());
	    		query.setParameter("Ced", cedula);
				List results = query.list();
				Cliente cliente = new Cliente();
				if (results.size()==0){
					JOptionPane.showMessageDialog(null, "La cedula que ingres� no existe en nuestra base de datos");
				}else{
					for (int i=0;i<results.size();i++){
						cliente = (Cliente)results.get(i);
						q.VentPrin.textNombVenta.setText(cliente.getNombre());
						q.VentPrin.textTlfVenta.setText(cliente.getTelf());
						q.VentPrin.textDireccVenta.setText(cliente.getDir());
					}
					q.VentPrin.textIdProVenta.setEditable(true);
					session.close();
				}
	    	}
	    }

		@Override
		public void actionPerformed(ActionEvent e) {
			ClasePrincipal q = new ClasePrincipal(); //se instancia la claseprincipal
			
			
			               //COMPRA
			
			if(this.cha.equals("ItenCompra")){//se compara el texto que entro por el constructor esto da la ubicacion del evento
				q.VentPrin.paneVenta.setVisible(false);
				q.VentPrin.paneCompra.setVisible(true); // atraves del objeto "q" se llama el objeto "VentPrin" para poder acceder a paneCompra
			}										//por que hacerlo asi por que es mejor modificar una vista desde el mismo objeto de lo contrario arroja problemas 
			
			if(this.cha.equals("btnCancelarCompra")){ //Haz que los botones se llamen igual a los listeners
				q.VentPrin.paneCompra.setVisible(false);
			}
			
							//VENTA
			
			if(this.cha.equals("butCancVenta")){ //Agregado listener para cancelar venta
				q.VentPrin.paneVenta.setVisible(false);
			}
			
			if(this.cha.equals("ItemVenta")){
				q.VentPrin.paneVenta.setVisible(true);
				q.VentPrin.paneCompra.setVisible(false);
			}
			
					//REGISTRO DE ENCARGADO
			
			if(this.cha.equals("RegisEncar")){
				q.encar.setVisible(true);
				//q.VentPrin.setVisible(false);
			}		
			
					//REGISTRO DE CLIENTE
			if(this.cha.equals("RegisClien")){
				q.clien.setVisible(true);
				//q.VentPrin.setVisible(false);
			}	
				
				//REGISTRO DE PRODUCTO
			
			if(this.cha.equals("RegisProduc")){
				q.prudu.setVisible(true);
			
			}	
			if(this.cha.equals("RegisProveed")){
				q.provee.setVisible(true);
			
			}
			//INVENTARIO
			if(this.cha.equals("Inventario")){
				
				q.Invet.setVisible(true);
				q.Invet.clearTable(); //Limpia la tabla por si tenia datos
				q.Invet.getBase(); //Llena la tabla con datos actualizados
			}
			
			if(this.cha.equals("btnBuscar")){
				queryClienteVenta();
			}
			
		}

}
