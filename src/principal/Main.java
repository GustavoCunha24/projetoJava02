package principal;

import controllers.FuncionarioController;

public class Main {

	public static void main(String[] args) {
	
		//Criando um objeto da classe controle
		var funcionarioController = new FuncionarioController();
		
		//Executando o cadastro de funcionário
		funcionarioController.cadastrarFuncionario();
		

	}

}
