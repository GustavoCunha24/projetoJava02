package controllers;

import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.swing.JOptionPane;

import entities.Funcionario;
import enums.TipoContratacao;
import repositories.FuncionarioRepository;

/*
 * Classe de controle para realizar a entrada
 * dos dados do funcionário informado pelo usuário.
 */
public class FuncionarioController {

	/*
	 * Método para capturar os dados do funcionário e realizar o seu cadastro no
	 * sistema.
	 */

	public void cadastrarFuncionario() {

		// criando um objeto para o funcionário
		var funcionario = new Funcionario();

		try {
			funcionario.setId(UUID.randomUUID());
			funcionario.setNome(JOptionPane.showInputDialog("Nome do Funcionário:"));
			funcionario.setMatricula(JOptionPane.showInputDialog("Matrícula do Funcionário:"));
			funcionario.setDataAdmissao(
					new SimpleDateFormat("dd/MM/yyyy").parse(JOptionPane.showInputDialog("Data de Admissão:")));

			var opcao = JOptionPane.showInputDialog("Informe (1)Estágio, (2)CLT ou (3)Terceirizado:");

			switch (opcao) {
			case "1": funcionario.setTipoContratacao(TipoContratacao.ESTAGIO); break;
			case "2": funcionario.setTipoContratacao(TipoContratacao.CLT); break;
			case "3": funcionario.setTipoContratacao(TipoContratacao.TERCEIRIZADO); break;

			}
			
			//Enviar dados do funcionário para gravação em arquivo
			var funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarDados(funcionario);
		}

		catch (Exception e) {
			System.out.println("\nFalha ao capturar os dados:" + e.getMessage());

		}

	}

	
	
	}

