package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.ConstantsbqDAO;
import com.wha.model.Constantsbq;
//fhgh5555555gfghfghffh
//hfhf
@Service
@Transactional
public class ConstantsbqServiceImpl implements ConstantsbqService {

	@Autowired
    private ConstantsbqDAO constantsbqDAO;
 
    @Override
    @Transactional
    public void addConstantsbq(Constantsbq constantsbq) {
        constantsbqDAO.addConstantsbq(constantsbq);
    }
 
    @Override
    @Transactional
    public List<Constantsbq> getAllConstantsbqs() {
        return constantsbqDAO.getAllConstantsbqs();
    }
 
    @Override
    @Transactional
    public void deleteConstantsbq(Integer constantsbqId) {
        constantsbqDAO.deleteConstantsbq(constantsbqId);
    }
 
    public Constantsbq getConstantsbq(int cstid) {
        return constantsbqDAO.getConstantsbq(cstid);
    }
 
    public Constantsbq updateConstantsbq(Constantsbq constantsbq) {
        // TODO Auto-generated method stub
        return constantsbqDAO.updateConstantsbq(constantsbq);
    }
 
    public void setConstantsbqDAO(ConstantsbqDAO constantsbqDAO) {
        this.constantsbqDAO = constantsbqDAO;
    }

}
