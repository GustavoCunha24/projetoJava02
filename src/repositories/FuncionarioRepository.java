package repositories;

import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import entities.Funcionario;

public class FuncionarioRepository {

	public void exportarDados(Funcionario funcionario) {

		try {
			
			//Criando um arquivo txt para a gravação em modo 'append'
			//append -> o arquivo nunca será substituido, mas sim terá o conteúdo adicionado.
			var fileWriter = new FileWriter("c:\\temp\\funcionario.txt", true);
			var printWriter = new PrintWriter(fileWriter);
			
			//escrevendo os dados do funcionário no arquivo
			printWriter.write("\nId do funcionário.........:" + funcionario.getId());
			printWriter.write("\nNome......................:" + funcionario.getNome());
			printWriter.write("\nMatrícula.................:" + funcionario.getMatricula());
			printWriter.write("\nData de Admissão..........:" + funcionario.getDataAdmissao());
			printWriter.write("\nTipo de Contratação.......:" + funcionario.getTipoContratacao());
			
			//fechando o arquivo
			printWriter.close();
			
			JOptionPane.showInputDialog(null, "Dados gravados com sucesso!");
			
			

		} catch (Exception e) {
			System.out.println("\nFalha ao gravar o arquivo!" + e.getMessage());

		}

	}

	
	

}
