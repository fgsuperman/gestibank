package com.wha.dao;

import java.util.List;
import com.wha.model.Demandesaprcrea;

public interface DemandesaprcreaDAO {

	public void addDemandesaprcrea(Demandesaprcrea demandesaprcrea);

	public List<Demandesaprcrea> getAllDemandesaprcreas();

	public void deleteDemandesaprcrea(Integer demandesaprcreaId);

	public Demandesaprcrea updateDemandesaprcrea(Demandesaprcrea demandesaprcrea);

	public Demandesaprcrea getDemandesaprcrea(int demandesaprcreaid);
}
