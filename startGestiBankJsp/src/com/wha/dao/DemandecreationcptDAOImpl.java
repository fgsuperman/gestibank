package com.wha.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wha.model.Demandecreationcpt;
@Repository
public class DemandecreationcptDAOImpl implements DemandecreationcptDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addDemandecreationcpt(Demandecreationcpt demandecreationcpt) {
        sessionFactory.getCurrentSession().saveOrUpdate(demandecreationcpt);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Demandecreationcpt> getAllDemandecreationcpts() {
 
        return sessionFactory.getCurrentSession().createQuery("from Demandecreationcpt")
                .list();
    }
 
    @Override
    public void deleteDemandecreationcpt(Integer demandecreationcptId) {
        Demandecreationcpt demandecreationcpt = (Demandecreationcpt) sessionFactory.getCurrentSession().load(
                Demandecreationcpt.class, demandecreationcptId);
        if (null != demandecreationcpt) {
            this.sessionFactory.getCurrentSession().delete(demandecreationcpt);
        }
 
    }
 
    public Demandecreationcpt getDemandecreationcpt(int demandecreationcptId) {
        return (Demandecreationcpt) sessionFactory.getCurrentSession().get(
                Demandecreationcpt.class, demandecreationcptId);
    }
 
    @Override
    public Demandecreationcpt updateDemandecreationcpt(Demandecreationcpt demandecreationcpt) {
        sessionFactory.getCurrentSession().update(demandecreationcpt);
        return demandecreationcpt;
    }
}
