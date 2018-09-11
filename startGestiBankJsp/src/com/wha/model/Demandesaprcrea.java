package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the demandesaprcrea database table.
 * 
 */
@Entity
@NamedQuery(name="Demandesaprcrea.findAll", query="SELECT d FROM Demandesaprcrea d")
public class Demandesaprcrea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_demande")
	private int idDemande;

	@Temporal(TemporalType.DATE)
	private Date dateDemande;

	@Column(name="id_compte")
	private int idCompte;

	@Column(name="objet_modif")
	private String objetModif;

	private String status;

	private String typeDemande;

	public Demandesaprcrea() {
	}

	public int getIdDemande() {
		return this.idDemande;
	}

	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}

	public Date getDateDemande() {
		return this.dateDemande;
	}

	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}

	public int getIdCompte() {
		return this.idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}

	public String getObjetModif() {
		return this.objetModif;
	}

	public void setObjetModif(String objetModif) {
		this.objetModif = objetModif;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTypeDemande() {
		return this.typeDemande;
	}

	public void setTypeDemande(String typeDemande) {
		this.typeDemande = typeDemande;
	}

}