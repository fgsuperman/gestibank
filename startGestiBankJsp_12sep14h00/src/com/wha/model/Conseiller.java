package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conseiller database table.
 * 
 */
@Entity
@NamedQuery(name="Conseiller.findAll", query="SELECT c FROM Conseiller c")
public class Conseiller implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="matricule_cnsi")
	private int matriculeCnsi;

	private String adresse;

	private String email;

	private String motDePasse;

	private String nom;

	private String prenom;

	private String pseudo;

	private String tel;

	public Conseiller() {
	}

	public int getMatriculeCnsi() {
		return this.matriculeCnsi;
	}

	public void setMatriculeCnsi(int matriculeCnsi) {
		this.matriculeCnsi = matriculeCnsi;
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

	public String getMotDePasse() {
		return this.motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
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

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}