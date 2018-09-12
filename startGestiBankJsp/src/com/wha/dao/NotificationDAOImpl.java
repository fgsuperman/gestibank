package com.wha.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.wha.model.Notification;
@Repository
public class NotificationDAOImpl implements NotificationDAO {

	@Autowired
    private SessionFactory sessionFactory;
 
    public void addNotification(Notification notification) {
        sessionFactory.getCurrentSession().saveOrUpdate(notification);
 
    }
 
    @SuppressWarnings("unchecked")
    public List<Notification> getAllNotifications() {
 
        return sessionFactory.getCurrentSession().createQuery("from Notification")
                .list();
    }
 
    @Override
    public void deleteNotification(Integer notificationId) {
        Notification notification = (Notification) sessionFactory.getCurrentSession().load(
                Notification.class, notificationId);
        if (null != notification) {
            this.sessionFactory.getCurrentSession().delete(notification);
        }
 
    }
 
    public Notification getNotification(int notificationId) {
        return (Notification) sessionFactory.getCurrentSession().get(
                Notification.class, notificationId);
    }
 
    @Override
    public Notification updateNotification(Notification notification) {
        sessionFactory.getCurrentSession().update(notification);
        return notification;
    }
}
