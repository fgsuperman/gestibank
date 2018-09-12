package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the constantsbq database table.
 * 
 */
@Entity
@NamedQuery(name="Constantsbq.findAll", query="SELECT c FROM Constantsbq c")
public class Constantsbq implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_const")
	private int idConst;

	@Column(name="TAUX_AGIOS")
	private float tauxAgios;

	@Column(name="TAUX_INTERET_CPT_REM")
	private float tauxInteretCptRem;

	public Constantsbq() {
	}

	public int getIdConst() {
		return this.idConst;
	}

	public void setIdConst(int idConst) {
		this.idConst = idConst;
	}

	public float getTauxAgios() {
		return this.tauxAgios;
	}

	public void setTauxAgios(float tauxAgios) {
		this.tauxAgios = tauxAgios;
	}

	public float getTauxInteretCptRem() {
		return this.tauxInteretCptRem;
	}

	public void setTauxInteretCptRem(float tauxInteretCptRem) {
		this.tauxInteretCptRem = tauxInteretCptRem;
	}

}