package com.wha.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wha.model.Demandesaprcrea;
@Repository
public class DemandesaprcreaDAOImpl implements DemandesaprcreaDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addDemandesaprcrea(Demandesaprcrea demandesaprcrea) {
        sessionFactory.getCurrentSession().saveOrUpdate(demandesaprcrea);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Demandesaprcrea> getAllDemandesaprcreas() {
 
        return sessionFactory.getCurrentSession().createQuery("from Demandesaprcrea")
                .list();
    }
 
    @Override
    public void deleteDemandesaprcrea(Integer demandesaprcreaId) {
        Demandesaprcrea demandesaprcrea = (Demandesaprcrea) sessionFactory.getCurrentSession().load(
                Demandesaprcrea.class, demandesaprcreaId);
        if (null != demandesaprcrea) {
            this.sessionFactory.getCurrentSession().delete(demandesaprcrea);
        }
 
    }
 
    public Demandesaprcrea getDemandesaprcrea(int demandesaprcreaId) {
        return (Demandesaprcrea) sessionFactory.getCurrentSession().get(
                Demandesaprcrea.class, demandesaprcreaId);
    }
 
    @Override
    public Demandesaprcrea updateDemandesaprcrea(Demandesaprcrea demandesaprcrea) {
        sessionFactory.getCurrentSession().update(demandesaprcrea);
        return demandesaprcrea;
    }
}
