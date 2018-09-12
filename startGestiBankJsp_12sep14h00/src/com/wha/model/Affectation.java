package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the affectation database table.
 * 
 */
@Entity
@NamedQuery(name="Affectation.findAll", query="SELECT a FROM Affectation a")
public class Affectation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_affect")
	private String idAffect;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_affect")
	private Date dateAffect;

	@Column(name="id_admin")
	private int idAdmin;

	@Column(name="id_conseiller")
	private int idConseiller;

	@Column(name="id_dmnd_creation")
	private int idDmndCreation;

	public Affectation() {
	}

	public String getIdAffect() {
		return this.idAffect;
	}

	public void setIdAffect(String idAffect) {
		this.idAffect = idAffect;
	}

	public Date getDateAffect() {
		return this.dateAffect;
	}

	public void setDateAffect(Date dateAffect) {
		this.dateAffect = dateAffect;
	}

	public int getIdAdmin() {
		return this.idAdmin;
	}

	public void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}

	public int getIdConseiller() {
		return this.idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public int getIdDmndCreation() {
		return this.idDmndCreation;
	}

	public void setIdDmndCreation(int idDmndCreation) {
		this.idDmndCreation = idDmndCreation;
	}

}