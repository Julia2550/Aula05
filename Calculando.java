package ExercicioAula05;

 public class Calculando implements Calculos {
	 public static void main(String[] args) {
	 }
    public double somar(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    public int exp(int base, int expoente) {
        return (int) Math.pow(base, expoente);
    }
{
  }
}