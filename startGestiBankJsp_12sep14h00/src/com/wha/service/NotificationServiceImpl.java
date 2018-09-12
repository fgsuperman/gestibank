package com.wha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wha.dao.NotificationDAO;
import com.wha.model.Notification;

@Service
@Transactional
public class NotificationServiceImpl implements NotificationService {

	@Autowired
    private NotificationDAO notificationDAO;
 
    @Override
    @Transactional
    public void addNotification(Notification notification) {
        notificationDAO.addNotification(notification);
    }
 
    @Override
    @Transactional
    public List<Notification> getAllNotifications() {
        return notificationDAO.getAllNotifications();
    }
 
    @Override
    @Transactional
    public void deleteNotification(Integer notificationId) {
        notificationDAO.deleteNotification(notificationId);
    }
 
    public Notification getNotification(int empid) {
        return notificationDAO.getNotification(empid);
    }
 
    public Notification updateNotification(Notification notification) {
        // TODO Auto-generated method stub
        return notificationDAO.updateNotification(notification);
    }
 
    public void setNotificationDAO(NotificationDAO notificationDAO) {
        this.notificationDAO = notificationDAO;
    }

}
