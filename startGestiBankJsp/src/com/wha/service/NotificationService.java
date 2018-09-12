package com.wha.service;

import java.util.List;

import com.wha.model.Notification;

public interface NotificationService {
	public void addNotification(Notification notification);

	public List<Notification> getAllNotifications();

	public void deleteNotification(Integer notificationId);

	public Notification getNotification(int notificationid);

	public Notification updateNotification(Notification notification);
}
