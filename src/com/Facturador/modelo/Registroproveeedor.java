package com.Facturador.modelo;
// Generated 16-ene-2016 0:13:21 by Hibernate Tools 3.4.0.CR1

/**
 * Registroproveeedor generated by hbm2java
 */
public class Registroproveeedor implements java.io.Serializable {

	private int rut;
	private String razonSoc;
	private String direccion;
	private String email;
	private String estado;
	private String ciudad;
	private int telefono;
	private int fax;

	public Registroproveeedor() {
	}

	public Registroproveeedor(int rut, String razonSoc, String direccion, String email, String estado, String ciudad,
			int telefono, int fax) {
		this.rut = rut;
		this.razonSoc = razonSoc;
		this.direccion = direccion;
		this.email = email;
		this.estado = estado;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.fax = fax;
	}

	public int getRut() {
		return this.rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getRazonSoc() {
		return this.razonSoc;
	}

	public void setRazonSoc(String razonSoc) {
		this.razonSoc = razonSoc;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getFax() {
		return this.fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

}