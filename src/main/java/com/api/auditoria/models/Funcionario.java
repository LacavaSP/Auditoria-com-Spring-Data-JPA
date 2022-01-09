package com.api.auditoria.models;

import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.auditoria.service.trackable.TrackableEntity;
import com.api.auditoria.service.trackable.TrackableEntityListener;
import com.sun.istack.NotNull;

@Entity
@Table(name = "funcionario")
@EntityListeners(TrackableEntityListener.class)
public class Funcionario implements TrackableEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String setor;

	@NotNull
	private String cargo;
	
	@Column(name = "salário")
	@NotNull
	private int salario;

	private boolean ativo;

	@Column(name = "dt_alteracao")
	private ZonedDateTime dataAlteracao;

	public Funcionario() {}
	
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

	@Override
	public void setDataAlteracao(ZonedDateTime dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ativo, cargo, dataAlteracao, id, nome, salario, setor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		return ativo == other.ativo && Objects.equals(cargo, other.cargo)
				&& Objects.equals(dataAlteracao, other.dataAlteracao) && Objects.equals(id, other.id)
				&& salario == other.salario && Objects.equals(setor, other.setor);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", nacionalidade=" + ", setor=" + setor
				+ ", cargo=" + cargo + ", salario=" + salario + ", ativo=" + ativo + ", dataAlteracao=" + dataAlteracao
				+ "]";
	}

	
}
