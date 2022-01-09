package com.api.auditoria.models.dtos;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

public class FuncionarioDTO {

	@NotNull
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String setor;

	@NotNull
	private String cargo;

	@NotNull
	private int salario;

	private boolean ativo;

	private ZonedDateTime dataAlteracao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public ZonedDateTime getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(ZonedDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
}
