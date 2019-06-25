package com.ecommerce.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articoli")
public class Articolo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codArticolo;
	
	@Column
	private String descrizione;
	
	@Column
	private Double prezzo;
	
	@ManyToOne
	@JoinColumn(name="idCategoria", referencedColumnName="id")
	private Categoria categoria;

	public int getCodArticolo() {
		return codArticolo;
	}

	public void setCodArticolo(int codArticolo) {
		this.codArticolo = codArticolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
