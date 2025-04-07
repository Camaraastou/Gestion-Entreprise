package com.gestion.entrprise.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gestion.entrprise.Dto.EntrepriseDto;
import com.gestion.entrprise.entites.EntrepriseEntite;
import com.gestion.entrprise.mapping.EntrepriseMapper;
import com.gestion.entrprise.repositories.EntrepriseRepositorie;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EntrepriseServiceImpl implements EntrepriseService{
	
	private final EntrepriseRepositorie entrepriseRepository;
    private final EntrepriseMapper entrepriseMapper ;

    public EntrepriseServiceImpl (EntrepriseRepositorie entrepriseRepository,EntrepriseMapper entreprisemapper) {
		
    	this.entrepriseRepository = entrepriseRepository;
    	this.entrepriseMapper  =entreprisemapper;
    	
	}

	@Override
	public List<EntrepriseDto> obtenirListeEntreprise() {
		List<EntrepriseEntite> entreprises = entrepriseRepository.findAll();
		return entreprises.stream()
				.map(entrepriseMapper::convertirEnDto)
				.collect(Collectors.toList());
	}

	@Override
	public EntrepriseDto ajouterEntreprise(EntrepriseDto entrepriseDto) {

		EntrepriseEntite entrepriseEntite = entrepriseMapper.convertirEnEntite(entrepriseDto);

		EntrepriseEntite savedEntreprise = entrepriseRepository.save(entrepriseEntite);
		return entrepriseMapper.convertirEnDto(savedEntreprise);
	}

	@Override
	public EntrepriseDto modifierEntreprise(Long idEntreprise, EntrepriseDto entrepriseDto) {

		EntrepriseEntite entreprises =entrepriseRepository.findById(idEntreprise)
				.orElseThrow();
		entrepriseMapper.updateEntrepriseFromeDto(entrepriseDto,entreprises);

		EntrepriseEntite updateEntrepriseEntite= entrepriseRepository.save(entreprises);
		return entrepriseMapper.convertirEnDto(updateEntrepriseEntite);
	}

	@Override
	public String supprimerEntreprise(Long idEntreprise) {

		EntrepriseEntite entreprises =entrepriseRepository.findById(idEntreprise)
				.orElseThrow();
		entrepriseRepository.delete(entreprises);
		return "entreprise suprimer avec succés !";
	}

}
