package com.wha.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notifications database table.
 * 
 */
@Entity
@Table(name="notifications")
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_notif")
	private String idNotif;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_gene_notif")
	private Date dateGeneNotif;

	@Column(name="id_operation")
	private int idOperation;

	@Column(name="msg_notif")
	private String msgNotif;

	@Column(name="statut_notif")
	private byte statutNotif;

	public Notification() {
	}

	public String getIdNotif() {
		return this.idNotif;
	}

	public void setIdNotif(String idNotif) {
		this.idNotif = idNotif;
	}

	public Date getDateGeneNotif() {
		return this.dateGeneNotif;
	}

	public void setDateGeneNotif(Date dateGeneNotif) {
		this.dateGeneNotif = dateGeneNotif;
	}

	public int getIdOperation() {
		return this.idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public String getMsgNotif() {
		return this.msgNotif;
	}

	public void setMsgNotif(String msgNotif) {
		this.msgNotif = msgNotif;
	}

	public byte getStatutNotif() {
		return this.statutNotif;
	}

	public void setStatutNotif(byte statutNotif) {
		this.statutNotif = statutNotif;
	}

}