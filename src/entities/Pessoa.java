package entities;

import java.util.UUID;

//Classe de modelo de dados da entidade
public class Pessoa {

	// Atributos (campos/dados)
	private UUID id;
	private String nome;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
