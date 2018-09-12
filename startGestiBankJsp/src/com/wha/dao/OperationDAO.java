package com.wha.dao;

import java.util.List;
import com.wha.model.Operation;

public interface OperationDAO {

	public void addOperation(Operation operation);

	public List<Operation> getAllOperations();

	public void deleteOperation(Integer operationId);

	public Operation updateOperation(Operation operation);

	public Operation getOperation(int operationid);
}
