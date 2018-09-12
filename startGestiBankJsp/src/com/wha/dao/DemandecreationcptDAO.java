package com.wha.dao;

import java.util.List;
import com.wha.model.Demandecreationcpt;

public interface DemandecreationcptDAO {

	public void addDemandecreationcpt(Demandecreationcpt demandecreationcpt);

	public List<Demandecreationcpt> getAllDemandecreationcpts();

	public void deleteDemandecreationcpt(Integer demandecreationcptId);

	public Demandecreationcpt updateDemandecreationcpt(Demandecreationcpt demandecreationcpt);

	public Demandecreationcpt getDemandecreationcpt(int demandecreationcptid);
}
