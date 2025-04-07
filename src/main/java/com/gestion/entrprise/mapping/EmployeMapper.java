package com.gestion.entrprise.mapping;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.gestion.entrprise.Dto.EmploieDto;
import com.gestion.entrprise.entites.EmploieEntite;


@Mapper(componentModel = "spring", uses = {EntrepriseMapper.class})
public interface EmployeMapper {
	
	@Mapping(source = "id" ,target = "idEmploye" , qualifiedByName = "convertirId")
	EmploieDto convertirEnDto(EmploieEntite employeEntite);
	
	@InheritInverseConfiguration
	EmploieEntite convertirEnEntite(EmploieDto employeDto);
	
	@Mapping(target = "idEmploye", ignore = true)
	void updateEmployeFromDto(EmploieDto employeDto, @MappingTarget EmploieEntite employe);
	
	

}
