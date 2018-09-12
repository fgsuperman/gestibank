package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.AffectationDAO;
import com.wha.model.Affectation;

@Service
@Transactional
public class AffectationServiceImpl implements AffectationService {

	@Autowired
    private AffectationDAO affectationDAO;
 
    @Override
    @Transactional
    public void addAffectation(Affectation affectation) {
        affectationDAO.addAffectation(affectation);
    }
 
    @Override
    @Transactional
    public List<Affectation> getAllAffectations() {
        return affectationDAO.getAllAffectations();
    }
 
    @Override
    @Transactional
    public void deleteAffectation(Integer affectationId) {
        affectationDAO.deleteAffectation(affectationId);
    }
 
    public Affectation getAffectation(int affectid) {
        return affectationDAO.getAffectation(affectid);
    }
 
    public Affectation updateAffectation(Affectation affectation) {
        // TODO Auto-generated method stub
        return affectationDAO.updateAffectation(affectation);
    }
 
    public void setAffectationDAO(AffectationDAO affectationDAO) {
        this.affectationDAO = affectationDAO;
    }

}
