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
					JOptionPane.showMessageDialog(null, "La cedula que ingresó no existe en nuestra base de datos");
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
	    
	    public void queryProductoVenta(){
	    	ClasePrincipal q = new ClasePrincipal();
	    	if (q.VentPrin.textIdProVenta.getText().equals("")){
	    		JOptionPane.showMessageDialog(null, "Debes ingresar algun id de producto");
	    	}else{
	    		Session session = Mysql.getSession();
	    		String hql = "FROM Producto E WHERE E.idproducto = :Id";
	    		Query query = session.createQuery(hql);
	    		int id = Integer.parseInt(q.VentPrin.textIdProVenta.getText());
	    		query.setParameter("Id", id);
	    		List results = query.list();
	    		Producto producto = new Producto();
	    		if (results.size()==0){
	    			JOptionPane.showMessageDialog(null, "El ID de producto que ingresó no existe en nuestra base de datos");
	    		}else{
	    			for (int i=0;i<results.size();i++){
	    				producto = (Producto)results.get(i);
	    				q.VentPrin.textDirecVenta.setText(producto.getNombre());
	    				q.VentPrin.textPrecVenta.setText(producto.getPrecio().toString());	
	    			}
	    			q.VentPrin.textCantVenta.setEditable(true);
	    			session.close();
	    		}
	    	}
	    }
	    
	    public void addProducto(){
	    	ClasePrincipal q = new ClasePrincipal();
	    	if (q.VentPrin.textDirecVenta.getText().equals("") || q.VentPrin.textCantVenta.getText().equals("")){
	    		JOptionPane.showMessageDialog(null, "Hay campos en blanco o con información incorrecta");
	    	}else{
	    		String[] ayy ={q.VentPrin.textIdProVenta.getText(), q.VentPrin.textDirecVenta.getText(), q.VentPrin.textCantVenta.getText(), q.VentPrin.textPrecVenta.getText(), q.VentPrin.textTotalxProducto.getText()};
	    		q.VentPrin.venta.addRow(ayy);
	    		q.VentPrin.textIdProVenta.setText("");
	    		q.VentPrin.textDirecVenta.setText("");
	    		q.VentPrin.textPrecVenta.setText("");
	    		q.VentPrin.textTotalxProducto.setText("");
	    		String prueba = "0";
	    		for (int i=0;i<q.VentPrin.venta.getRowCount();i++){
	    			String temp = (String) q.VentPrin.venta.getValueAt(i, 4);
	    			System.out.println("Se imprime temp "+temp);
	    			BigDecimal zero = new BigDecimal(prueba);
	    			BigDecimal income = new BigDecimal(temp);
	    			System.out.println("Se imprime income "+income);
	    			BigDecimal total = zero.add(income);
	    			System.out.println("Se imprime total "+total);
	    			q.VentPrin.textTotalFactura.setText(total.toString());
	    			prueba = total.toString();
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
			
			if (this.cha.equals("btnBuscarId")){
				queryProductoVenta();
			}
			if (this.cha.equals("butCargarVenta")){
				addProducto();
			}
			
		}

}
