package com.wha.dao;

import java.util.List;
import com.wha.model.Notification;

public interface NotificationDAO {

	public void addNotification(Notification notification);

	public List<Notification> getAllNotifications();

	public void deleteNotification(Integer notificationId);

	public Notification updateNotification(Notification notification);

	public Notification getNotification(int notificationid);
}
