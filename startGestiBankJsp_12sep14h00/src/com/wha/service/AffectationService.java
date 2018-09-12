package com.wha.service;

import java.util.List;

import com.wha.model.Affectation;

public interface AffectationService {
	public void addAffectation(Affectation affectation);

	public List<Affectation> getAllAffectations();

	public void deleteAffectation(Integer affectationId);

	public Affectation getAffectation(int affectationid);

	public Affectation updateAffectation(Affectation affectation);
}
