package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the demandecreationcpt database table.
 * 
 */
@Entity
@NamedQuery(name="Demandecreationcpt.findAll", query="SELECT d FROM Demandecreationcpt d")
public class Demandecreationcpt implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_demande")
	private String idDemande;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDemande;

	private int id_Client;

	private String statut;

	public Demandecreationcpt() {
	}

	public String getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(String idDemande) {
		this.idDemande = idDemande;
	}

	public Date getDateDemande() {
		return this.dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public int getId_Client() {
		return this.id_Client;
	}

	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}