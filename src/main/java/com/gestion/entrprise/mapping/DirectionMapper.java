package com.gestion.entrprise.mapping;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.gestion.entrprise.Dto.DirectionDto;
import com.gestion.entrprise.entites.DirectionEntite;

@Mapper(componentModel = "spring", uses = {EntrepriseMapper.class})
public interface DirectionMapper {
	
	@Mapping(source = "id", target = "idDirection", qualifiedByName = "convertirId")
	DirectionDto convertirEnDto(DirectionEntite employeEntite);
	
	@InheritInverseConfiguration
	DirectionEntite convertirEnEntite(DirectionDto employeDto);
	
	@Mapping(target = "idDirecteur" , ignore = true)
	void updateDirectionFromDto(DirectionDto directionDto, @MappingTarget DirectionEntite directions);
	
	

}
