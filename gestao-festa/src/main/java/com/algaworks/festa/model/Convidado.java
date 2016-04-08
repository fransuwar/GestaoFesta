package com.algaworks.festa.model;

public class Convidado {

	private Long id;
	private String nome;
	private Integer quantidadeAcompanhantes;
	
	public Convidado() {
	}

	public Convidado(Long id, String nome, Integer quantidadeAcompanhantes) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

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

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((quantidadeAcompanhantes == null) ? 0 : quantidadeAcompanhantes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quantidadeAcompanhantes == null) {
			if (other.quantidadeAcompanhantes != null)
				return false;
		} else if (!quantidadeAcompanhantes.equals(other.quantidadeAcompanhantes))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder retorno = new StringBuilder();
		retorno.append("ID:" + id);
		retorno.append("-Nome:" + nome);
		retorno.append("-Acompanhantes:" + quantidadeAcompanhantes);
		return retorno.toString();
	}
}
