package com.wha.dao;

import java.util.List;
import com.wha.model.Client;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addClient(Client client) {
        sessionFactory.getCurrentSession().saveOrUpdate(client);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Client> getAllClients() {
 
        return sessionFactory.getCurrentSession().createQuery("from Client")
                .list();
    }
 
    @Override
    public void deleteClient(Integer clientId) {
        Client client = (Client) sessionFactory.getCurrentSession().load(
                Client.class, clientId);
        if (null != client) {
            this.sessionFactory.getCurrentSession().delete(client);
        }
 
    }
 
    public Client getClient(int clientId) {
        return (Client) sessionFactory.getCurrentSession().get(
                Client.class, clientId);
    }
 
    @Override
    public Client updateClient(Client client) {
        sessionFactory.getCurrentSession().update(client);
        return client;
    }
}
