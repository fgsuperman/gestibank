package com.wha.service;

import java.util.List;

import com.wha.model.Administrateur;
import com.wha.model.Employee;

public interface AdministrateurService {
	public void addAdministrateur(Administrateur administrateur);

	public List<Administrateur> getAllAdministrateur();

	public void deleteAdministrateur(Integer administrateurId);

	public Administrateur getAdministrateur(int administrateurid);

	public Administrateur updateAdministrateur(Administrateur administrateur);
}
