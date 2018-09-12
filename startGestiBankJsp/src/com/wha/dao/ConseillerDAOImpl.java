package com.wha.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wha.model.Conseiller;
import com.wha.model.Employee;
@Repository
public class ConseillerDAOImpl implements ConseillerDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	
	public void addConseiller(Conseiller conseiller) {
		sessionFactory.getCurrentSession().saveOrUpdate(conseiller);

	}

	@SuppressWarnings("unchecked")
	public List<Conseiller> getAllConseillers() {
		return sessionFactory.getCurrentSession().createQuery("from Conseiller")
                .list();
	}

	@Override
	public void deleteConseiller(Integer conseillerId) {
		Conseiller conseiller = (Conseiller) sessionFactory.getCurrentSession().load(
				Conseiller.class, conseillerId);
        if (null != conseiller) {
            this.sessionFactory.getCurrentSession().delete(conseiller);
        }

	}

	@Override
	public Conseiller updateConseiller(Conseiller conseiller) {
		 sessionFactory.getCurrentSession().update(conseiller);
		return conseiller;
	}

	
	public Conseiller getConseiller(int conseillerid) {
		return (Conseiller) sessionFactory.getCurrentSession().get(
                Conseiller.class, conseillerid);
	}

}
