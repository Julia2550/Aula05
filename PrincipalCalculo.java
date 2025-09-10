package ExercicioAula05;

public class PrincipalCalculo {

	public static void main(String[] args) {
		
		   Calculando calc = new Calculando();

	        System.out.println("Soma: " + calc.somar(10.5, 5.3));
	        System.out.println("Subtração: " + calc.sub(10.5, 5.3));
	        System.out.println("Multiplicação: " + calc.mult(2.5, 4));
	        System.out.println("Divisão: " + calc.div(10, 2));
	        System.out.println("Exponenciação: " + calc.exp(2, 3));
	    }
}