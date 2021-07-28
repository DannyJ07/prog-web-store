package com.store.backend.models.entities;


import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table(name="detalles")


public class Detalle implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name="id_detalles")
	private Integer idDetalles;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@JoinColumn(name="id_detalle", referencedColumnName="id_factura")
	@ManyToOne
	private Factura factura;
	
	@JoinColumn(name="id_producto", nullable = false)
	@OneToOne(fetch = FetchType.LAZY)
	private Producto producto;
	
	public Detalle() {
		super();
	}

	public Detalle(int id) {
		super();
		this.idDetalles=id;
	}

	public Integer getIdDetalles() {
		return idDetalles;
	}

	public void setIdDetalles(Integer idDetalles) {
		this.idDetalles = idDetalles;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	
	
}