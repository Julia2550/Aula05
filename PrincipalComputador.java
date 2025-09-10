package ExercicioAula05;

public class PrincipalComputador {


		public static void main(String[] args) {
			
			Game gamer = new Game();
			Home home = new Home();
			
			gamer.ligar();
			gamer.desligar();
			gamer.reiniciar();
			gamer.carregandoSistema();
			
			System.out.println("-----------------------");
			
			home.ligar();
			home.desligar();
			home.reiniciar();
			home.carregandoSistema();
	}
}
