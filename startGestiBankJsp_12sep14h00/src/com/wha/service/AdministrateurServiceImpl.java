package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AdministrateurDAO;
import com.wha.dao.EmployeeDAO;
import com.wha.model.Administrateur;


@Service
@Transactional
public class AdministrateurServiceImpl implements AdministrateurService {

	@Autowired
    private AdministrateurDAO administrateurDAO;
 
    @Override
    @Transactional
	
	public void deleteAdministrateur(Integer administrateurId) {
    	administrateurDAO.deleteAdministrateur( administrateurId);
	}

	@Override
	public void addAdministrateur(Administrateur administrateur) {
		administrateurDAO.addAdministrateur(administrateur);
		
	}

	@Override
	public List<Administrateur> getAllAdministrateur() {
		 return administrateurDAO.getAllAdministrateur();
		
	}

	@Override
	public Administrateur getAdministrateur(int administrateurid) {
		return administrateurDAO.getAdministrateur(administrateurid);
		
	}

	@Override
	public Administrateur updateAdministrateur(Administrateur administrateur) {
		return  administrateurDAO.updateAdministrateur(administrateur);
	}

	
	
	public void setAdministrateurDAO(AdministrateurDAO administrateurDAO) {
		this.administrateurDAO = administrateurDAO;
	}

}
