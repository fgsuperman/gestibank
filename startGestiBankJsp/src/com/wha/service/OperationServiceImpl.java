package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.OperationDAO;
import com.wha.model.Operation;

@Service
@Transactional
public class OperationServiceImpl implements OperationService {

	@Autowired
    private OperationDAO OperationDAO;
 
    @Override
    @Transactional
    public void addOperation(Operation Operation) {
        OperationDAO.addOperation(Operation);
    }
 
    @Override
    @Transactional
    public List<Operation> getAllOperations() {
        return OperationDAO.getAllOperations();
    }
 
    @Override
    @Transactional
    public void deleteOperation(Integer OperationId) {
        OperationDAO.deleteOperation(OperationId);
    }
 
    public Operation getOperation(int opid) {
        return OperationDAO.getOperation(opid);
    }
 
    public Operation updateOperation(Operation Operation) {
        // TODO Auto-generated method stub
        return OperationDAO.updateOperation(Operation);
    }
 
    public void setOperationDAO(OperationDAO OperationDAO) {
        this.OperationDAO = OperationDAO;
    }

}
