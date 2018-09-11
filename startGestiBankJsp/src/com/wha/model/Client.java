package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_client")
	private int idClient;

	private String adresse;

	private String email;

	@Column(name="id_conseiller")
	private int idConseiller;

	private String motDePasse;

	private int nbrEnfants;

	private String nom;

	private String prenom;

	private String pseudo;

	private float revenuMoyenMens;

	private String statusMatrinomial;

	private String tel;

	public Client() {
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdConseiller() {
		return this.idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public int getNbrEnfants() {
		return this.nbrEnfants;
	}

	public void setNbrEnfants(int nbrEnfants) {
		this.nbrEnfants = nbrEnfants;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPseudo() {
		return this.pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public float getRevenuMoyenMens() {
		return this.revenuMoyenMens;
	}

	public void setRevenuMoyenMens(float revenuMoyenMens) {
		this.revenuMoyenMens = revenuMoyenMens;
	}

	public String getStatusMatrinomial() {
		return this.statusMatrinomial;
	}

	public void setStatusMatrinomial(String statusMatrinomial) {
		this.statusMatrinomial = statusMatrinomial;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}