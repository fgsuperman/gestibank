package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.DemandesaprcreaDAO;
import com.wha.model.Demandesaprcrea;

@Service
@Transactional
public class DemandesaprcreaServiceImpl implements DemandesaprcreaService {

	@Autowired
    private DemandesaprcreaDAO demandesaprcreaDAO;
 
    @Override
    @Transactional
    public void addDemandesaprcrea(Demandesaprcrea demandesaprcrea) {
        demandesaprcreaDAO.addDemandesaprcrea(demandesaprcrea);
    }
 
    @Override
    @Transactional
    public List<Demandesaprcrea> getAllDemandesaprcreas() {
        return demandesaprcreaDAO.getAllDemandesaprcreas();
    }
 
    @Override
    @Transactional
    public void deleteDemandesaprcrea(Integer demandesaprcreaId) {
        demandesaprcreaDAO.deleteDemandesaprcrea(demandesaprcreaId);
    }
 
    public Demandesaprcrea getDemandesaprcrea(int empid) {
        return demandesaprcreaDAO.getDemandesaprcrea(empid);
    }
 
    public Demandesaprcrea updateDemandesaprcrea(Demandesaprcrea demandesaprcrea) {
        // TODO Auto-generated method stub
        return demandesaprcreaDAO.updateDemandesaprcrea(demandesaprcrea);
    }
 
    public void setDemandesaprcreaDAO(DemandesaprcreaDAO demandesaprcreaDAO) {
        this.demandesaprcreaDAO = demandesaprcreaDAO;
    }

}
