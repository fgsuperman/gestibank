package com.wha.service;

import java.util.List;

import com.wha.model.Demandesaprcrea;

public interface DemandesaprcreaService {
	public void addDemandesaprcrea(Demandesaprcrea demandesaprcrea);

	public List<Demandesaprcrea> getAllDemandesaprcreas();

	public void deleteDemandesaprcrea(Integer demandesaprcreaId);

	public Demandesaprcrea getDemandesaprcrea(int demandesaprcreaid);

	public Demandesaprcrea updateDemandesaprcrea(Demandesaprcrea demandesaprcrea);
}
