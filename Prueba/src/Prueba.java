import utilidades.Entrada;

public class Prueba {

	public static void main(String[] args) {
		
		
		int operando1,operando2;
		double resultado;
		
		
		System.out.println("Introduce operando 1");
		operando1 = Entrada.entero();

		System.out.println("Introduce operando 2");
		operando2 = Entrada.entero();

		if (operando2 == 0) {
			do {
				System.out.println("Has introducido un denominador 0");
				System.out.println("Introduce operando 2");
				operando2 = Entrada.entero();
			} while (operando2 == 0);
		}

		resultado = operando1 % operando2;
		 System.out.println(resultado);
	}
}