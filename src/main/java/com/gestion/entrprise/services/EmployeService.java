package com.gestion.entrprise.services;

import java.util.List;

import com.gestion.entrprise.Dto.EmploieDto;

public interface EmployeService {
	
	List<EmploieDto> obtenirListeEmploye();
	
	EmploieDto ajouterEmploie(EmploieDto employeDto);
	
	EmploieDto modifierEmploye(int id , EmploieDto  employeDto);
	
	String supprimerEmploye(int id);

}
