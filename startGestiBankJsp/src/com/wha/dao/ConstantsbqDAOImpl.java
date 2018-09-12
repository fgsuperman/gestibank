package com.wha.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wha.model.Constantsbq;
@Repository
public class ConstantsbqDAOImpl implements ConstantsbqDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addConstantsbq(Constantsbq constantsbq) {
        sessionFactory.getCurrentSession().saveOrUpdate(constantsbq);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Constantsbq> getAllConstantsbqs() {
 
        return sessionFactory.getCurrentSession().createQuery("from Constantsbq")
                .list();
    }
 
    @Override
    public void deleteConstantsbq(Integer constantsbqId) {
        Constantsbq constantsbq = (Constantsbq) sessionFactory.getCurrentSession().load(
                Constantsbq.class, constantsbqId);
        if (null != constantsbq) {
            this.sessionFactory.getCurrentSession().delete(constantsbq);
        }
 
    }
 
    public Constantsbq getConstantsbq(int constantsbqId) {
        return (Constantsbq) sessionFactory.getCurrentSession().get(
                Constantsbq.class, constantsbqId);
    }
 
    @Override
    public Constantsbq updateConstantsbq(Constantsbq constantsbq) {
        sessionFactory.getCurrentSession().update(constantsbq);
        return constantsbq;
    }
}
