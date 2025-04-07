package com.gestion.entrprise.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gestion.entrprise.Dto.DirectionDto;
import com.gestion.entrprise.entites.DirectionEntite;
import com.gestion.entrprise.mapping.DirectionMapper;
import com.gestion.entrprise.repositories.DirectionRepositorie;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DirectionServiceImpl implements DirectionService {

	private final DirectionRepositorie directionRepository;
	private DirectionMapper directionMapper;
	
	public DirectionServiceImpl(DirectionRepositorie directionRepository , DirectionMapper directionMapper) {
		
		this.directionRepository=directionRepository;
		this.directionMapper=directionMapper;
	
	}
	
	@Override
	public List<DirectionDto> obtenirListeDirection() {

		List<DirectionEntite> directions = directionRepository.findAll();
		return directions.stream()
				.map(directionMapper::convertirEnDto)
				.collect(Collectors.toList());
	}

	@Override
	public DirectionDto ajouterDirection(DirectionDto directionDto) {
		
		DirectionEntite directionEntite = directionMapper.convertirEnEntite(directionDto);
		DirectionEntite savedDirection= directionRepository.save(directionEntite);
		return directionMapper.convertirEnDto(savedDirection);
	}

	@Override
	public DirectionDto modifierDirection(long id, DirectionDto directionDto) {

		DirectionEntite directions = directionRepository.findById(id)
				.orElseThrow();
		directionMapper.updateDirectionFromDto(directionDto, directions);
		
		DirectionEntite updDirectionEntite =directionRepository.save(directions);
		return directionMapper.convertirEnDto(updDirectionEntite);
	}

	@Override
	public String supprimerDirection(long id) {
		DirectionEntite directions = directionRepository.findById(id)
				.orElseThrow();
		directionRepository.delete(directions);
		return "direction supprimer avec succés !";
	}

}
