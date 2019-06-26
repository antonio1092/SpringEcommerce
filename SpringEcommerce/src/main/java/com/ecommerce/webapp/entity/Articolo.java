package com.ecommerce.webapp.entity;

import java.util.Date;

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
	@JoinColumn(name="idIva", referencedColumnName="id")
	private Iva iva;
	
	@Column
	private Date dataCreazione;
	
	
	@ManyToOne
	@JoinColumn(name="idCategoria", referencedColumnName="id")
	private Categoria categoria;
	
	@OneToOne(fetch=FetchType.EAGER)
	private DettListino dettListno;

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

	public DettListino getDettListno() {
		return dettListno;
	}

	public void setDettListno(DettListino dettListno) {
		this.dettListno = dettListno;
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
