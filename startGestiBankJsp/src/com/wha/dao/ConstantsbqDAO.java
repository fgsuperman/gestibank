package com.wha.dao;

import java.util.List;
import com.wha.model.Constantsbq;

public interface ConstantsbqDAO {

	public void addConstantsbq(Constantsbq constantsbq);

	public List<Constantsbq> getAllConstantsbqs();

	public void deleteConstantsbq(Integer constantsbqId);

	public Constantsbq updateConstantsbq(Constantsbq constantsbq);

	public Constantsbq getConstantsbq(int constantsbqid);
}
