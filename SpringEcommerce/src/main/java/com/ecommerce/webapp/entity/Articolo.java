package com.ecommerce.webapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ARTICOLI")
public class Articolo {

	@Id
	@Column(name="CODARTICOLO")
	private int codArticolo;
	
	@Column(name="DESCRIZIONE")
	private String Descrizione;
	
	@Column(name="PREZZO")
	private Double prezzo;

	public int getCodArticolo() {
		return codArticolo;
	}

	public void setCodArticolo(int codArticolo) {
		this.codArticolo = codArticolo;
	}

	public String getDescrizione() {
		return Descrizione;
	}

	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	public Double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}

	public Articolo(int codArticolo, String descrizione, Double prezzo) {
		super();
		this.codArticolo = codArticolo;
		Descrizione = descrizione;
		this.prezzo = prezzo;
	}

	public Articolo() {
		super();
		
	}
	
	
	
}
