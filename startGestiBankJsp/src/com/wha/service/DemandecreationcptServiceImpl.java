package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.DemandecreationcptDAO;
import com.wha.model.Demandecreationcpt;

@Service
@Transactional
public class DemandecreationcptServiceImpl implements DemandecreationcptService {

	@Autowired
    private DemandecreationcptDAO demandecreationcptDAO;
 
    @Override
    @Transactional
    public void addDemandecreationcpt(Demandecreationcpt demandecreationcpt) {
        demandecreationcptDAO.addDemandecreationcpt(demandecreationcpt);
    }
 
    @Override
    @Transactional
    public List<Demandecreationcpt> getAllDemandecreationcpts() {
        return demandecreationcptDAO.getAllDemandecreationcpts();
    }
 
    @Override
    @Transactional
    public void deleteDemandecreationcpt(Integer demandecreationcptId) {
        demandecreationcptDAO.deleteDemandecreationcpt(demandecreationcptId);
    }
 
    public Demandecreationcpt getDemandecreationcpt(int dmdid) {
        return demandecreationcptDAO.getDemandecreationcpt(dmdid);
    }
 
    public Demandecreationcpt updateDemandecreationcpt(Demandecreationcpt demandecreationcpt) {
        // TODO Auto-generated method stub
        return demandecreationcptDAO.updateDemandecreationcpt(demandecreationcpt);
    }
 
    public void setDemandecreationcptDAO(DemandecreationcptDAO demandecreationcptDAO) {
        this.demandecreationcptDAO = demandecreationcptDAO;
    }

}
