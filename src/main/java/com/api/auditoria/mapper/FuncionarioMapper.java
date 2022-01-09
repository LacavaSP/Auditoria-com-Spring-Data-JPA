package com.api.auditoria.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import com.api.auditoria.models.Funcionario;
import com.api.auditoria.models.dtos.FuncionarioDTO;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN) 
public interface FuncionarioMapper {

	FuncionarioMapper INSTANCE = Mappers.getMapper( FuncionarioMapper.class );
	Funcionario toEntity (FuncionarioDTO funcionarioDto);
	
	@InheritInverseConfiguration
	FuncionarioDTO toDTO (Funcionario funcionario);
}
