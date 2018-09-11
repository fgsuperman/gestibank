package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the compte database table.
 * 
 */
@Entity
@NamedQuery(name="Compte.findAll", query="SELECT c FROM Compte c")
public class Compte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_compte")
	private String idCompte;

	private byte autorisDecouvert;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	@Column(name="id_client")
	private int idClient;

	private float montantDecouvert;

	private float soldeCompte;

	private String statut;

	private String typeCompte;

	//bi-directional many-to-one association to Operation
	@OneToMany(mappedBy="compte")
	private List<Operation> operations;

	public Compte() {
	}

	public String getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}

	public byte getAutorisDecouvert() {
		return this.autorisDecouvert;
	}

	public void setAutorisDecouvert(byte autorisDecouvert) {
		this.autorisDecouvert = autorisDecouvert;
	}

	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public float getMontantDecouvert() {
		return this.montantDecouvert;
	}

	public void setMontantDecouvert(float montantDecouvert) {
		this.montantDecouvert = montantDecouvert;
	}

	public float getSoldeCompte() {
		return this.soldeCompte;
	}

	public void setSoldeCompte(float soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getTypeCompte() {
		return this.typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public List<Operation> getOperations() {
		return this.operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Operation addOperation(Operation operation) {
		getOperations().add(operation);
		operation.setCompte(this);

		return operation;
	}

	public Operation removeOperation(Operation operation) {
		getOperations().remove(operation);
		operation.setCompte(null);

		return operation;
	}

}