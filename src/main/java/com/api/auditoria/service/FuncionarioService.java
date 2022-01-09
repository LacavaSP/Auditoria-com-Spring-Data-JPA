package com.api.auditoria.service;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.auditoria.mapper.FuncionarioMapper;
import com.api.auditoria.models.dtos.FuncionarioDTO;
import com.api.auditoria.repository.FuncionarioRepository;

@Service
@Transactional
public class FuncionarioService {

	private final FuncionarioMapper mapper;
	private final FuncionarioRepository repository;

	public FuncionarioService(FuncionarioMapper mapper, FuncionarioRepository repository) {
		this.mapper = mapper;
		this.repository = repository;
	}

	public FuncionarioDTO save(FuncionarioDTO funcionarioDto) {
		return mapper.toDTO(repository.saveAndFlush(mapper.toEntity(funcionarioDto)));
	}
	
	public List<FuncionarioDTO> getAllFuncionarios(){
	
		return repository.findAll().stream().map(a -> mapper.toDTO(a)).collect(Collectors.toList());
	}

}
