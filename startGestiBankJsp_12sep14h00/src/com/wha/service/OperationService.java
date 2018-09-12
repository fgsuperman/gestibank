package com.wha.service;

import java.util.List;

import com.wha.model.Operation;

public interface OperationService {
	public void addOperation(Operation operation);

	public List<Operation> getAllOperations();

	public void deleteOperation(Integer operationId);

	public Operation getOperation(int operationid);

	public Operation updateOperation(Operation operation);
}
