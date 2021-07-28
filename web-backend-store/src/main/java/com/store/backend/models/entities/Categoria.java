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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name="categoria")
public class Categoria  implements Serializable {
	
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Basic(optional = false)
	
		@Column(name="id_categoria")
		private Integer IdCategoria;
		
		@Column(name="tipo")
		private String tipo;
		
		@OneToMany(mappedBy="categoria", fetch = FetchType.LAZY)
		private List <Producto> productos;
		
		public Categoria() {
			super();
		}

		public Categoria(Integer idCategoria) {
			super();
			IdCategoria = idCategoria;
		}

		public Integer getIdCategoria() {
			return IdCategoria;
		}

		public void setIdCategoria(Integer idCategoria) {
			IdCategoria = idCategoria;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public List<Producto> getProductos() {
			return productos;
		}

		public void setProductos(List<Producto> productos) {
			this.productos = productos;
		}
		
		
}
