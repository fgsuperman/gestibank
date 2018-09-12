package com.wha.dao;

import java.util.List;
import com.wha.model.Affectation;

public interface AffectationDAO {

	public void addAffectation(Affectation affectation);

	public List<Affectation> getAllAffectations();

	public void deleteAffectation(Integer affectationId);

	public Affectation updateAffectation(Affectation affectation);

	public Affectation getAffectation(int affectationid);
}
