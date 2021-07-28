package com.store.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="factura")

public class Factura implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name="id_factura")
	private Integer idFactura;
	
	@Column(name="datos")
	private String datos;
	
	@Column(name="telefono")
	private int telefono;
	
	@Column(name="drieccion")
	private String direccion;
	
	@OneToMany(mappedBy="factura", fetch = FetchType.LAZY)
	private List<Detalle> detalles; 

	@JoinColumn(name="id_cliente", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Cliente cliente;
	
	public Factura() {
		super();
	}
	
	public Factura(int id) {
		super();
		
		this.idFactura=id;
	}
	
	public Integer getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Detalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
	
}
