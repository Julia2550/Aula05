package ExercicioAula05;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		 
		Funcionario f1 = new Jornada(1, "Carlos", "123456789", 101, "Rua A", 50.0, 160);
		Funcionario f2 = new Horista(2, "Maria", "987654321", 102, "Rua B", 40.0, 120);
	    Funcionario f3 = new PessoaJuridica(3, "Empresa X", "555444333", 103, "Rua C", 10000.0, 2000.0);

		 f1.calculaSalario();
	     f2.calculaSalario();
		 f3.calculaSalario();
	}
}

			