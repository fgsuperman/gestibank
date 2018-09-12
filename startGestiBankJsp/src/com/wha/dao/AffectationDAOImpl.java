package com.wha.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wha.model.Affectation;
@Repository
public class AffectationDAOImpl implements AffectationDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addAffectation(Affectation affectation) {
        sessionFactory.getCurrentSession().saveOrUpdate(affectation);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Affectation> getAllAffectations() {
 
        return sessionFactory.getCurrentSession().createQuery("from Affectation")
                .list();
    }
 
    @Override
    public void deleteAffectation(Integer affectationId) {
        Affectation affectation = (Affectation) sessionFactory.getCurrentSession().load(
                Affectation.class, affectationId);
        if (null != affectation) {
            this.sessionFactory.getCurrentSession().delete(affectation);
        }
 
    }
 
    public Affectation getAffectation(int affectationId) {
        return (Affectation) sessionFactory.getCurrentSession().get(
                Affectation.class, affectationId);
    }
 
    @Override
    public Affectation updateAffectation(Affectation affectation) {
        sessionFactory.getCurrentSession().update(affectation);
        return affectation;
    }
}
