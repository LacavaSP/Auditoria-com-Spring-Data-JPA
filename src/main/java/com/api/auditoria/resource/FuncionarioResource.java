package com.api.auditoria.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.auditoria.models.dtos.FuncionarioDTO;
import com.api.auditoria.service.FuncionarioService;

@RestController
@RequestMapping("/api")
public class FuncionarioResource {

	private final FuncionarioService funcionarioService;

	public FuncionarioResource(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	@GetMapping("/funcionarios")
	public List<FuncionarioDTO> getAllFuncionarios() {
		return funcionarioService.getAllFuncionarios();
	}
	
	@PostMapping("/funcionarios")
	public FuncionarioDTO saveFuncionario(@RequestBody FuncionarioDTO funcionarioDto) {
		return funcionarioService.save(funcionarioDto);
	}
}
