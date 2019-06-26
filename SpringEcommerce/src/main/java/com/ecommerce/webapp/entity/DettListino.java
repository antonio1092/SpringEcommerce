package com.ecommerce.webapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dettListini")
public class DettListino {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(fetch=FetchType.EAGER, mappedBy="codArticolo", cascade=CascadeType.ALL)
	private Articolo articolo;
	
	@OneToOne(fetch=FetchType.EAGER, mappedBy="id", cascade=CascadeType.ALL)
	private Listino listino;
	
	private double prezzo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Articolo getArticolo() {
		return articolo;
	}

	public void setArticolo(Articolo articolo) {
		this.articolo = articolo;
	}

	public Listino getListino() {
		return listino;
	}

	public void setListino(Listino listino) {
		this.listino = listino;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
	
}
