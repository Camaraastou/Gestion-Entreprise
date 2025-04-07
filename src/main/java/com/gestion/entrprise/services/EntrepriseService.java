package com.gestion.entrprise.services;

import java.util.List;
import com.gestion.entrprise.Dto.EntrepriseDto;


public interface EntrepriseService {
	
	List<EntrepriseDto> obtenirListeEntreprise();
	
	EntrepriseDto ajouterEntreprise(EntrepriseDto entrepriseDto);

	EntrepriseDto modifierEntreprise(Long id , EntrepriseDto entrepriseDto);

	String supprimerEntreprise(Long id);
	


}
