package com.wha.dao;




import java.util.List;

import com.wha.model.Conseiller;

public interface ConseillerDAO {

	public void addConseiller(Conseiller conseiller);

	public List<Conseiller> getAllConseillers();

	public void deleteConseiller(Integer conseillerId);

	public Conseiller updateConseiller(Conseiller conseiller);

	public Conseiller getConseiller(int conseillerid);
}

