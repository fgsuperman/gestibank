package com.wha.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wha.model.Operation;
@Repository
public class OperationDAOImpl implements OperationDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addOperation(Operation operation) {
        sessionFactory.getCurrentSession().saveOrUpdate(operation);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Operation> getAllOperations() {
 
        return sessionFactory.getCurrentSession().createQuery("from Operation")
                .list();
    }
 
    @Override
    public void deleteOperation(Integer operationId) {
        Operation operation = (Operation) sessionFactory.getCurrentSession().load(
                Operation.class, operationId);
        if (null != operation) {
            this.sessionFactory.getCurrentSession().delete(operation);
        }
 
    }
 
    public Operation getOperation(int operationId) {
        return (Operation) sessionFactory.getCurrentSession().get(
                Operation.class, operationId);
    }
 
    @Override
    public Operation updateOperation(Operation operation) {
        sessionFactory.getCurrentSession().update(operation);
        return operation;
    }
}
