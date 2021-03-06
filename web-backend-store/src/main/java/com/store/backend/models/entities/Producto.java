package com.store.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity 
@Table(name="producto")
public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name="id_producto")
	private Integer idProducto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private float precio;
	
	@JoinColumn(name="id_categoria",referencedColumnName="id_categoria")
	@ManyToOne
	private Categoria categoria;
	
	@OneToOne(mappedBy="producto")
	private Detalle detalle; 
	

	public Producto() {
		super();
	}

	public Producto(Integer idProducto) {
		super();
		this.idProducto = idProducto;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	} 
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Detalle getDetalle() {
		return detalle;
	}

	public void setDetalle(Detalle detalle) {
		this.detalle = detalle;
	}
	
	
	
}
