package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the operation database table.
 * 
 */
@Entity
@NamedQuery(name="Operation.findAll", query="SELECT o FROM Operation o")
public class Operation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_operation")
	private int idOperation;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOperation;

	@Column(name="libelle_operation")
	private String libelleOperation;

	private float montantOperation;

	private String ribDestinataire;

	//bi-directional many-to-one association to Compte
	@ManyToOne
	@JoinColumn(name="id_compte")
	private Compte compte;

	public Operation() {
	}

	public int getIdOperation() {
		return this.idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public Date getDateOperation() {
		return this.dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getLibelleOperation() {
		return this.libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public float getMontantOperation() {
		return this.montantOperation;
	}

	public void setMontantOperation(float montantOperation) {
		this.montantOperation = montantOperation;
	}

	public String getRibDestinataire() {
		return this.ribDestinataire;
	}

	public void setRibDestinataire(String ribDestinataire) {
		this.ribDestinataire = ribDestinataire;
	}

	public Compte getCompte() {
		return this.compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

}