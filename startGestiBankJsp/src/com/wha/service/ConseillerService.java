package com.wha.service;

import java.util.List;

import com.wha.model.Conseiller;

public interface ConseillerService {
	public void addConseiller(Conseiller conseiller);

	public List<Conseiller> getAllConseillers();

	public void deleteConseiller(Integer conseillerId);

	public Conseiller getConseiller(int conseillerid);

	public Conseiller updateConseiller(Conseiller conseiller);
}
