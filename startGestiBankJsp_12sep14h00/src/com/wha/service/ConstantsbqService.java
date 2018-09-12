package com.wha.service;

import java.util.List;

import com.wha.model.Constantsbq;

public interface ConstantsbqService {
	public void addConstantsbq(Constantsbq constantsbq);

	public List<Constantsbq> getAllConstantsbqs();

	public void deleteConstantsbq(Integer constantsbqId);

	public Constantsbq getConstantsbq(int constantsbqid);

	public Constantsbq updateConstantsbq(Constantsbq constantsbq);
}
