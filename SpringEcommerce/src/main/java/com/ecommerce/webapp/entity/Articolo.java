package com.ecommerce.webapp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="articoli")
public class Articolo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codArticolo;
	
	@Column
	private String descrizione;
		
	@ManyToOne
	@JoinColumn(name="idIva", referencedColumnName="id")
	private Iva iva;
	
	@Column
	private Date dataCreazione;
	
	
	@ManyToOne
	@JoinColumn(name="idCategoria", referencedColumnName="id")
	private Categoria categoria;
	
	@OneToMany(mappedBy="articolo", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<DettListino> dettListino = new ArrayList<DettListino>();

	public Iva getIva() {
		return iva;
	}

	public void setIva(Iva iva) {
		this.iva = iva;
	}

	public Date getDataCreazione() {
		return dataCreazione;
	}

	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}


	public List<DettListino> getDettListino() {
		return dettListino;
	}

	public void setDettListino(List<DettListino> dettListino) {
		this.dettListino = dettListino;
	}

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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
