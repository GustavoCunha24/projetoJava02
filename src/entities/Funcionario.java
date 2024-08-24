package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import enums.TipoContratacao;

//Classe de modelo de classe de entidade
public class Funcionario extends Pessoa {

	// atributos
	private String matricula;
	private Date dataAdmissao;
	private TipoContratacao tipoContratacao;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date date) {
		this.dataAdmissao = date;
	}

	public TipoContratacao getTipoContratacao() {
		return tipoContratacao;
	}

	public void setTipoContratacao(TipoContratacao tipoContratacao) {
		this.tipoContratacao = tipoContratacao;
	}
	
	

}
