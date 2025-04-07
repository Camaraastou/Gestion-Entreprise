package com.gestion.entrprise.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.gestion.entrprise.Dto.EntrepriseDto;
import com.gestion.entrprise.entites.EntrepriseEntite;

@Mapper(componentModel = "spring")
public interface EntrepriseMapper {

	@Mapping(source ="id", target = "idEntreprise", qualifiedByName = "convertirId")
	
	 EntrepriseDto convertirEnDto(EntrepriseEntite entrepriseEntite);

	    EntrepriseEntite convertirEnEntite(EntrepriseDto entrepriseDto);

		void updateEntrepriseFromeDto(EntrepriseDto entrepriseDto,@MappingTarget EntrepriseEntite entreprises);

}
