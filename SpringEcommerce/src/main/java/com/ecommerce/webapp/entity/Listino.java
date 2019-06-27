package com.ecommerce.webapp.entity;

import java.util.ArrayList;
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

@Entity
@Table(name="listini")
public class Listino {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column
	private String descrizione;
	
	@Column
	private boolean obsoleto;
	
	@OneToMany(mappedBy="listino", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private List<DettListino> dettListino = new ArrayList<DettListino>();;
	

	public int getId() {
		return id;
	}

	public List<DettListino> getListini() {
		return dettListino;
	}

	public void setListini(List<DettListino> dettListino) {
		this.dettListino = dettListino;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public boolean isObsoleto() {
		return obsoleto;
	}

	public void setObsoleto(boolean obsoleto) {
		this.obsoleto = obsoleto;
	}
	
	
}
