package com.gestion.entrprise.services;

import java.util.List;

import com.gestion.entrprise.Dto.DirectionDto;

public interface DirectionService {
	
	List<DirectionDto> obtenirListeDirection();
	
	DirectionDto ajouterDirection(DirectionDto directionDto);
	
	DirectionDto modifierDirection(long id, DirectionDto directionDto);
	
	String supprimerDirection(long id);

}
