package com.gestion.entrprise.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gestion.entrprise.Dto.EmploieDto;
import com.gestion.entrprise.entites.EmploieEntite;
import com.gestion.entrprise.mapping.EmployeMapper;
import com.gestion.entrprise.repositories.EmployeRepositorie;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeServiceImpl implements EmployeService {

	private final EmployeRepositorie employeRepository;
	private final EmployeMapper employeMapper;
	
	public EmployeServiceImpl(EmployeRepositorie employeRepository ,EmployeMapper employeMapper) {
		
		this.employeRepository = employeRepository;
		this.employeMapper= employeMapper;
	}
	
	@Override
	public List<EmploieDto> obtenirListeEmploye() {

		List<EmploieEntite> employes = employeRepository.findAll();
		return employes.stream()
				.map(employeMapper::convertirEnDto)
				.collect(Collectors.toList());
		
		
	}

	@Override
	public EmploieDto ajouterEmploie(EmploieDto employeDto) {

		EmploieEntite employeEntite =employeMapper.convertirEnEntite(employeDto);
		
		EmploieEntite savedEmploye= employeRepository.save(employeEntite);
		
		return employeMapper.convertirEnDto(savedEmploye);
	}
           
	@Override
	public EmploieDto modifierEmploye(int idEmploye, EmploieDto employeDto) {

		EmploieEntite employes = employeRepository.findById(idEmploye)
				.orElseThrow();
		employeMapper.updateEmployeFromDto(employeDto, employes);
		
		EmploieEntite updateEmploieEntite = employeRepository.save(employes);
		return employeMapper.convertirEnDto(updateEmploieEntite);
	}

	@Override
	public String supprimerEmploye(int idEmploye) {

		EmploieEntite employes = employeRepository.findById(idEmploye)
				.orElseThrow();
		employeRepository.delete(employes);
		return "employe supprimer avec succés !";
		
	}

}
