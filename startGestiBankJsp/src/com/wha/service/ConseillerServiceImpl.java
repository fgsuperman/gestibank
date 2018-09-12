package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.ConseillerDAO;
import com.wha.model.Conseiller;

@Service
@Transactional
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
    private ConseillerDAO conseillerDAO;
 
    @Override
    @Transactional
    public void addConseiller(Conseiller conseiller) {
        conseillerDAO.addConseiller(conseiller);
    }
 
    @Override
    @Transactional
    public List<Conseiller> getAllConseillers() {
        return conseillerDAO.getAllConseillers();
    }
 
    @Override
    @Transactional
    public void deleteConseiller(Integer conseillerId) {
        conseillerDAO.deleteConseiller(conseillerId);
    }
 
    public Conseiller getConseiller(int cnsid) {
        return conseillerDAO.getConseiller(cnsid);
    }
 
    public Conseiller updateConseiller(Conseiller conseiller) {
        // TODO Auto-generated method stub
        return conseillerDAO.updateConseiller(conseiller);
    }
 
    public void setConseillerDAO(ConseillerDAO conseillerDAO) {
        this.conseillerDAO = conseillerDAO;
    }

}
