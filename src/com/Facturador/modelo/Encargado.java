package com.Facturador.modelo;
// Generated 16-ene-2016 16:35:10 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

/**
 * Encargado generated by hbm2java
 */
public class Encargado implements java.io.Serializable {

	private int id;
	private String nombre;
	private String username;
	private String pass;
	private Set<Pedido> pedidos = new HashSet<Pedido>(0);
	private Set<Producto> productos = new HashSet<Producto>(0);

	public Encargado() {
	}

	public Encargado(int id, String nombre, String username, String pass) {
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.pass = pass;
	}

	public Encargado(int id, String nombre, String username, String pass, Set<Pedido> pedidos,
			Set<Producto> productos) {
		this.id = id;
		this.nombre = nombre;
		this.username = username;
		this.pass = pass;
		this.pedidos = pedidos;
		this.productos = productos;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Set<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}

}