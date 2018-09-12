package com.wha.service;

import java.util.List;

import com.wha.model.Demandecreationcpt;

public interface DemandecreationcptService {
	public void addDemandecreationcpt(Demandecreationcpt demandecreationcpt);

	public List<Demandecreationcpt> getAllDemandecreationcpts();

	public void deleteDemandecreationcpt(Integer demandecreationcptId);

	public Demandecreationcpt getDemandecreationcpt(int demandecreationcptid);

	public Demandecreationcpt updateDemandecreationcpt(Demandecreationcpt demandecreationcpt);
}
