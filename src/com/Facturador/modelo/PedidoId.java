package com.Facturador.modelo;
// Generated 16-ene-2016 16:35:10 by Hibernate Tools 4.0.0

/**
 * PedidoId generated by hbm2java
 */
public class PedidoId implements java.io.Serializable {

	private int idPedido;
	private int clienteIdCedula;
	private int jefeIdjefe;

	public PedidoId() {
	}

	public PedidoId(int idPedido, int clienteIdCedula, int jefeIdjefe) {
		this.idPedido = idPedido;
		this.clienteIdCedula = clienteIdCedula;
		this.jefeIdjefe = jefeIdjefe;
	}

	public int getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getClienteIdCedula() {
		return this.clienteIdCedula;
	}

	public void setClienteIdCedula(int clienteIdCedula) {
		this.clienteIdCedula = clienteIdCedula;
	}

	public int getJefeIdjefe() {
		return this.jefeIdjefe;
	}

	public void setJefeIdjefe(int jefeIdjefe) {
		this.jefeIdjefe = jefeIdjefe;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PedidoId))
			return false;
		PedidoId castOther = (PedidoId) other;

		return (this.getIdPedido() == castOther.getIdPedido())
				&& (this.getClienteIdCedula() == castOther.getClienteIdCedula())
				&& (this.getJefeIdjefe() == castOther.getJefeIdjefe());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdPedido();
		result = 37 * result + this.getClienteIdCedula();
		result = 37 * result + this.getJefeIdjefe();
		return result;
	}

}
